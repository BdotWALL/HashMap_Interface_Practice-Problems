import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {

        /**Nickname Problem
         * In the main-method create a new HashMap<String,String> object. 
         * Store the names and nicknames of the following people in this hashmap so, that the name is the key and the nickname is the value. 
         * Use only lower case letters.
         * matthew's nickname is matt
         * michael's nickname is mix
         * arthur's nickname is artie
         * Then get Matthew's nickname from the hashmap, and print it.*/
        
        HashMap<String, String> nicknames = new HashMap<>();

        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");

       System.out.println(nicknames.get("matthew"));

    }
}
