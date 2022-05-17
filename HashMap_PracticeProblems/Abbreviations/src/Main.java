public class Main {
    public static void main(String[] args) throws Exception {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("approx", "approximately");
        abbreviations.addAbbreviation("DIY", "do it yourself");
        abbreviations.addAbbreviation("ETA", "estimated time of arrival");

        System.out.println(abbreviations.hasAbbreviation("approx"));
        System.out.println(abbreviations.findExplanation("ETA"));



    }
}
