//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Iterator;
import java.util.List;

public enum Data {
    word1("!help ", List.of("PARAMETER HOW-TO, please enter:\n 1. A search key -then 2. An optional part of speech -then\n 3. An optional 'distinct' -then 4. An optional 'reverse )")),
    word2("arrow ", List.of("Arrow [noun] : Here is one arrow: <IMG> -=>> </IMG>")),
    word3("book ", List.of("Book [noun] : A set of pages.", "Book [noun] : A written work published in printed or electronic form.", "Book [verb] : To arrange for someone to have a seat on a plane.", "Book [verb] : To arrange something ojn a particular date.")),
    word4("distinct ", List.of("Distinct [adjective] : Familiar. Worked in Java", "Distinct [adjective] : Unique. No duplicates. Clearly different or of a different kind.", "Distinct [adverb] : Uniquely. Written \"distinctly\"", "Distinct [noun] : A keyword in this assignment.", "Distinct [noun] : A keyword in this assignment.", "Distinct [noun] : A keyword in this assignment.", "Distinct [noun] : An advanced search option.", "Distinct [noun] : Distinct is a parameter in this assignment.")),
    word5("placeholder ", List.of("Placeholder [adjective] : To be updated...", "Placeholder [adjective] : To be updated...", "Placeholder [adverb] : To be updated...", "Placeholder [conjunction] : To be updated...", "Placeholder [interjection] : To be updated...", "Placeholder [noun] : To be updated...", "Placeholder [noun] : To be updated...", "Placeholder [noun] : To be updated...", "Placeholder [preposition] : To be updated...", "Placeholder [pronoun] : To be updated...", "Placeholder [verb] : To be updated...")),
    word6("reverse ", List.of("Reverse [adjective] : On back side.", "Reverse [adjective] : Opposite to usual or previous arrangement.", "Reverse [noun] : A dictionary program's parameter", "Reverse [noun] : Change to opposite direction", "Reverse [noun] : The opposite.", "Reverse [noun] : To be updated...", "Reverse [noun] : To be updated...", "Reverse [noun] : To be updated...", "Reverse [noun] : To be updated...", "Reverse [verb] : Change something to opposite.", "Reverse [verb] : Go back", "Reverse [verb] : Revoke ruling.", "Reverse [verb] : To be updated...", "Reverse [verb] : To be updated...", "Reverse [verb] : Turn something inside out.")),
    word7("seven ", List.of("number 7")),
    word8("eight ", List.of("number 8")),
    word9("nine ", List.of("number 9")),
    word10("ten ", List.of("number 10")),
    word11("eleven ", List.of("number 11")),
    word12("twelve ", List.of("number 12")),
    word13("thirteen ", List.of("number 13")),
    word14("fourteen ", List.of("number 14")),
    word15("fifteen ", List.of("number 15")),
    word16("sixteen ", List.of("number 16")),
    word17("seventeen ", List.of("number 17")),
    word18("eighteen ", List.of("number 18")),
    word21("twentyone ", List.of("number 21", "To be updated...", "To be updated...", "To be updated...", "To be updated...", "To be updated...", "To be updated...", "To be updated...", "To be updated..."));

    private String keyword;
    private final List<String> definition;
    static int totalDefinition = 0;
    static int totalkeyword = 0;

    private Data(String keyword, List definition) {
        this.keyword = keyword;
        this.definition = definition;
    }

    public List<String> getDefinitionsArray() {
        return this.definition;
    }

    public String getKeywordArray() {
        return this.keyword;
    }

    public static int getTotalDefinition() {
        Data[] var0 = values();
        int var1 = var0.length;
        Data[] var2 = var0;
        int var3 = var0.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Data searchWord = var2[var4];
            totalDefinition += searchWord.getDefinitionsArray().size();
        }

        return totalDefinition;
    }

    public static int getTotalKeyword() {
        Data[] var0 = values();
        int var1 = var0.length;
        return totalkeyword;
    }

    public static Data search(String keyword) {
        Data[] var1 = values();
        int var2 = var1.length;
        Data[] var3 = var1;
        int var4 = var1.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Data searchWord = var3[var5];
            if (searchWord.keyword.trim().equalsIgnoreCase(keyword)) {
                return searchWord;
            }
        }

        return null;
    }

    public static Data search(String keyword, String stuff) {
        System.out.println(search(keyword));
        System.out.println("two parameters");
        return null;
    }

    public static Data search(String keyword, String stuff, String stuff2) {
        System.out.println("3 parameters");
        return null;
    }

    public static Data search(String keyword, String stuff, String stuff3, String stuff4) {
        System.out.println("4 parameters");
        return null;
    }

    public String toString() {
        StringBuilder word = new StringBuilder(this.keyword.replaceFirst(this.keyword, ""));
        Iterator var2 = this.definition.iterator();

        while(var2.hasNext()) {
            String definition = (String)var2.next();
            word.append(definition).append("\n");
        }

        return word.toString();
    }
}
