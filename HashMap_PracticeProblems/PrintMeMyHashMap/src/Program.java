import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Ferrari","Enzo");
        hashMap.put("Lamborghini", "Aventador");
        hashMap.put("Rolls Royce", "Cullinan");
        hashMap.put("Bentley", "Betayga");
        hashMap.put("Porsche", "911");

        printKeys(hashMap);
        System.out.println("---");
        printKeysWhere(hashMap, "Fer");
        System.out.println("---");
        printKeysWhere(hashMap, "ini");

    }

    public static void printKeys (HashMap<String, String> hashmap) {
        for(String key: hashmap.keySet()) {
            System.out.println(key);
        }

    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for(String key : hashmap.keySet()){
            if(!key.contains(text)){
               continue;
            }
            System.out.println(key);
        } 

    }

    public static void printValuesOfKeysWhere (HashMap<String, String> hashmap, String text) {
        for(String key : hashmap.keySet()) {
            if(!key.contains(text)){
                continue;
            }
            System.out.println(hashmap.get(key));
        }

    }




}
