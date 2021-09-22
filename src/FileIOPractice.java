import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOPractice {
	public void readFileAndOutput(Path pathToFile){
		List<String> lineInTheFile = new ArrayList<>();
		try{
			lineInTheFile = Files.readAllLines(pathToFile);
		} catch (IOException iox){
			iox.printStackTrace();
		}
		for (String item : lineInTheFile){
			System.out.println(item);
		}
	}


}
