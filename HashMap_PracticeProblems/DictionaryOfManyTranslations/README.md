Your assignment is to create the class DictionaryOfManyTranslations. In it can be stored one or more translations for each word. The class is to implement the following methods:


public void add(String word, String translation) adds the translation for the word and preserves the old translations.


public ArrayList<String> translate(String word) returns a list of the translations added for the word. If the word has no translations, the method should return an empty list.


public void remove(String word) removes the word and all its translations from the dictionary.


It's probably best to add the translations to an object variable that is of the type HashMap<String, ArrayList<String>>