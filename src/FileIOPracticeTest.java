import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileIOPracticeTest {
	public static void main(String[] args) {
		Path dirPath = Paths.get("src/test");
//		try {
//			Files.createDirectories(dirPath);
//		} catch (IOException iox){
//			iox.printStackTrace();
//		}
		Path filePath = Paths.get("src/test", "list.txt");
//		try {
//			if (Files.notExists(filePath)){
//				Files.createFile(filePath);
//			} else {
//				System.out.println("we made one already silly.");
//			}
//		} catch (IOException iox){
//			System.out.println("error error");
//			iox.printStackTrace();
//		}

		List<String> imperials = Arrays.asList("Augustus","Livia","Agrippina","Claudius");
//		try {
//			Files.write(filePath, imperials);
//		} catch (IOException iox){
//			iox.printStackTrace();
//		}

//		List<String> newList = new ArrayList<>();
//		try{
//			newList = Files.readAllLines(filePath);
//		} catch (IOException iox){
//			iox.printStackTrace();
//		}
//		for (String item : newList){
//			System.out.println(item);
//		}
		FileIOPractice practice = new FileIOPractice();
		practice.readFileAndOutput(filePath);
		try {
			Files.writeString(filePath, "Messalina\n", StandardOpenOption.APPEND);
		} catch (IOException iox){
			iox.printStackTrace();
		}
		practice.readFileAndOutput(filePath);
	}
}
