import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CollectionsTest {
    public static void omit2s(ArrayList<Integer> integer){
        integer.removeIf(i -> i == 2);
    }

    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(2);
//        numbers.add(4);
//        numbers.add(5);
//        numbers.add(2);
//        numbers.add(5);
//
//        System.out.println(numbers);
//        omit2s(numbers);
//        System.out.println(numbers);


	    List<String> keys = new ArrayList<>(Arrays.asList(
			    "first key",
			    "second key",
			    "third key",
			    "fourth key"
	    ));

	    List<String> values = new ArrayList<>(Arrays.asList(
			    "first value",
			    "second value",
			    "third value",
			    "fourth value"
	    ));

	    System.out.println(createMap(keys, values));
    }

    public static HashMap createMap(List<String> key, List<String> value){
	    HashMap<String, String> returnHashMap = new HashMap<>();
	    for(int i = 0; i < key.size(); i++) {
		    returnHashMap.put(key.get(i), value.get(i));
	    } return returnHashMap;
    }

    /*
    TODO: create a static method, createMap, that takes in two arraylists. The method should
      return a hashmap where the keys are the elements of the first passed arraylist and are
      connected to values of the second arraylist. Assume both input arraylists are lists of
      strings. Assume the lengths of both input arraylists are the same

      EXAMPLE:

        List<String> keys = new ArrayList<>(Arrays.asList(
            "first key",
            "second key",
            "third key",
            "fourth key"
        ));

        List<String> values = new ArrayList<>(Arrays.asList(
            "first value",
            "second value",
            "third value",
            "fourth value"
        ));

        {"first key": "first value", "second key": "second value"}

 */
}
