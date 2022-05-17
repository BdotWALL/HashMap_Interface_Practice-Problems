public class Main {
    public static void main(String[] args) {
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("help", "ayuda");
        dictionary.add("help","aide");

        dictionary.add("coding", "codificación");
        dictionary.add("coding", "codage");

        System.out.println(dictionary.translate(("help")));
        System.out.println(dictionary.translate("coding"));
        dictionary.remove("coding");
        System.out.println(dictionary.translate("coding"));




    }
}
