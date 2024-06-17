//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public enum Data {

    //ghost game
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
        return keyword;
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
        return var1;
    }

    //Param 1 = Keyword
    //Param 2 = PartOfSpeech/Distinct/Reverse
    //Param 3 = Distinct/Reverse
    //Param 4 = Reverse
    public static Data parameterCheck(String search){
        String[] holdsNull = new String[4];
        holdsNull = search.split(" ");
        Data printout = null;
        List<String> printout2 = null;
        if(holdsNull.length==1){
            System.out.println("param check 1");
            printout = Data.search(holdsNull[0]);
        }
        if(holdsNull.length==2){
            System.out.println("param check 2");
            printout2 = Data.search(holdsNull[0],holdsNull[1]);
            printArray(printout2);
            System.out.println("====-==----------=======");
        }
        if(holdsNull.length==3){
            System.out.println("param check 3");
            printout2 = Data.search(holdsNull[0],holdsNull[1],holdsNull[2]);
            printArray(printout2);
        }
        if(holdsNull.length==4){
            System.out.println("param check 4");
            printout2 = Data.search(holdsNull[0],holdsNull[1],holdsNull[2],holdsNull[3]);
            printArray(printout2);
        }
        return printout;
    }

    /***
     * PRINTS ARRAYLIST
     */
    public static void printArray(List<String> array){
        for(String i : array){
            System.out.println(i);
        }
    }

    /***
     * DISTINCT
     */
    public static <E> ArrayList<E> distinct(List<String> par){
        HashSet<E> hashSet = new HashSet<>();
        ArrayList<E> arrayList = new ArrayList<>();

        for(String loop: par){
            if(hashSet.add((E) loop)){
                arrayList.add((E) loop);
            }
        }
        return arrayList;
    }
    /***
     *  REVERSE
     */
    public static List<String> reverse(List<String> array){
        List<String> rev = new ArrayList<>();
        for(int i = array.size()-1; i>=0; i--){
            rev.add(array.get(i));
        }
        return rev;
    }

    /***
     * FINDS WORD IN ENUM
     * @param keyword word
     * @return full list of definition from enum
     */
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

    /***
     * TYPE OF SPEECH
     * @param keyword word
     * @param param2 type of speech
     * @return This one prints word with type of speech
     */
    public static List<String> search(String keyword, String param2) {
        List<String> typeOfSpeechArray = new ArrayList<>();
        Data TOS = search(keyword);
        String keyString = TOS.toString();
        String rawDataLine[] = keyString.split("\n");
        for(String ar : rawDataLine){
            if(ar.toLowerCase().contains(param2.toLowerCase())){
                typeOfSpeechArray.add(ar);
            }
        }
        return typeOfSpeechArray;
    }


    /***
     * 3 PARAMETERS
     */
    public static List<String> search(String keyword, String param2, String Param3) {
        List<String> distinct = null;
        List<String> TOS = search(keyword, param2);
        String keyString = TOS.toString();
        String rawDataLine[] = keyString.split("\n");
        if(Param3.equals("distinct")){
            distinct = distinct(TOS);
        }
        if(Param3.equals("reverse")){
            distinct = reverse(TOS);
        }
        return distinct;
    }

    /***
     * HASHSET TO STORE UNIQUE ELEMENTS TO REMOVE DUPLICATES
     * @param par
     * @return
     * @param <E>
     */

    /***
     * 4 PARAMETERS
     * @return
     */

    public static List<String> search(String keyword, String param2, String param3, String param4) {
        List<String> reverse = search(keyword, param2, param3);
        reverse = reverse(reverse);
        return reverse;
    }



    private static Data param2Check(String param2){
        if(!(param2.contains("adjective")||param2.contains("noun")||param2.contains("verb")||param2.contains("conjunction")||param2.contains("interjection")||param2.contains("preposition")||param2.contains("pronoun")||param2.contains("adverb"))){
            return search(param2);
        }
        if((param2.contains("distinct"))){
            return search(param2);
        }

        if((param2.contains("reverse"))){
            return search(param2);
        }
        else{
            System.out.println("The entered 2nd parameter '" +param2+ "' is NOT a part of speech.");
            System.out.println("The entered 2nd parameter '" +param2+ "' is NOT 'distinct'.");
            System.out.println("The entered 2nd parameter '" +param2+ "' is NOT 'reverse'.");
            System.out.println("The 3rd parameter '"+param2+"' was disregarded");
        }

        return null;
    }

    private static String param3Check(String param3){
        if((param3.contains("distinct"))){
            return "distinct";
        }
        if((param3.contains("reverse"))){
            return "reverse";
        }
        else{
            System.out.println("The entered 2nd parameter '" +param3+ "' is NOT 'distinct'.");
            System.out.println("The entered 2nd parameter '" +param3+ "' is NOT 'reverse'.");
            System.out.println("The 3rd parameter '"+param3+"' was disregarded");
        }

        return null;
    }

    private static String param4Check(String param4){
        if((param4.contains("reverse"))){
            return "reverse";
        }
        else{
            System.out.println("The entered 2nd parameter '" +param4+ "' is NOT 'reverse'.");
            System.out.println("The 4th parameter '"+param4+"' was disregarded");
        }
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


/*
        if(!(holdsNull[1].contains("adjective")||holdsNull[1].contains("noun")||holdsNull[1].contains("verb")||holdsNull[1].contains("conjunction")||holdsNull[1].contains("interjection")||holdsNull[1].contains("preposition")||holdsNull[1].contains("pronoun")||holdsNull[1].contains("adverb"))){
            System.out.println("The entered 2nd parameter '" +holdsNull[1]+ "' is NOT a part of speech.");
        }
        if(!(holdsNull[1].contains("distinct"))){
            System.out.println("The entered 2nd parameter '" +holdsNull[1]+ "' is NOT 'distinct'.");
        }
        if(!(holdsNull[1].contains("reverse"))){
            System.out.println("The entered 2nd parameter '" +holdsNull[1]+ "' is NOT 'reverse'.");
        }
 */