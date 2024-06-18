//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.*;

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

    public static String start(){
        int i = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("! Loading data...");
        System.out.println("! Loading completed...\n");
        System.out.println("===== DICTIONARY 340 JAVA =====");
        System.out.println("----- Keywords:\t" + Data.getTotalKeyword());
        System.out.println("----- Definitions:\t" + Data.getTotalDefinition()+"\n");
        // this calls the parameter

        String search = "";
        while(!search.toLowerCase().equals("!q")){
            if(search.equals("!q")){
                return "Hello World";
            }
            System.out.print("Search ["+i+"]: ");
            search = scan.nextLine().toLowerCase();
            Data.parameterCheck(search);
            i++;
        }
        return null;
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
    public static List<String> parameterCheck(String search){
        String[] holdsNull = new String[4];
        holdsNull = search.split(" ");
        List<String> printout = new ArrayList<>();
        if(searchEngine(holdsNull[0]) == null){
            printout.add("<NOT FOUND> To be considered for the next release. Thank you.\n");
            printArray(printout);
            return printout;
        }

        if(holdsNull.length==1){
            printout = Data.search(holdsNull[0]);
            printArray(printout);
        }
        if(holdsNull.length==2){
            if(param2Check(holdsNull[1]).equals("false")){
                System.out.println("2nd parameter:" + holdsNull[1] + "is not distinct/reverse/TOS");
            }
            printout = Data.search(holdsNull[0],holdsNull[1]);
            printArray(printout);
        }
        if(holdsNull.length==3){
            if(param2Check(holdsNull[2]).equals("false")){
                System.out.println("3rd parameter:" + holdsNull[1] + "is not distinct/reverse/TOS");
            }
            printout = Data.search(holdsNull[0],holdsNull[1],holdsNull[2]);
            printArray(printout);
        }
        if(holdsNull.length==4){
            if(param2Check(holdsNull[3]).equals("false")){
                System.out.println("4th parameter:" + holdsNull[1] + "is not distinct/reverse/TOS");
            }
            printout = Data.search(holdsNull[0],holdsNull[1],holdsNull[2],holdsNull[3]);
            printArray(printout);
        }
        return printout;
    }

    /***
     * PRINTS ARRAYLIST
     */
    public static void printArray(List<String> array){
        System.out.println("\t|");
        for(String i : array){
            System.out.println("\t " + i);
        }
        System.out.println("\t|");
    }

    /***
     *
     * TYPEOFSPEECHd
     */
    public static List<String> typeOfSpeech(String keyword, String param2) {
        List<String> typeOfSpeechArray = new ArrayList<>();
        List<String> TOS = search(keyword);
        for(String ar : TOS){
            if(ar.toLowerCase().contains(param2.toLowerCase())){
                typeOfSpeechArray.add(ar);
            }
        }
        return typeOfSpeechArray;
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
     * SEARCH FROM ENUM
     */
    public static Data searchEngine(String keyword) {
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

    public static List<String> search(String keyword){
        List<String> Arr = new ArrayList<>();
        Data TOS = searchEngine(keyword);
        String keyString = TOS.toString();         // Could be simplified but chose to leave it for future stuff.
        String rawDataLine[] = keyString.split("\n");
        Arr.addAll(List.of(rawDataLine));
        return Arr;
    }
    /***
     * TYPE OF SPEECH
     * @param keyword word
     * @param param2 type of speech
     * @return This one prints word with type of speech
     */
    public static List<String> search(String keyword, String param2) {
        List<String> da = null;
        if(param2Check(param2).equalsIgnoreCase("typeofspeech")){
            da = typeOfSpeech(keyword, param2);
            return da;
        }
        if(param2.equalsIgnoreCase("distinct")){
            da = distinct(search(keyword));
            return da;
        }
        if(param2.equalsIgnoreCase("reverse")){
            da = reverse(search(keyword));
            return da;
        }

        return da;
    }

    public static String param2Check(String a){
        if(a.contains("noun")||a.contains("verb")||a.contains("adverb")||a.contains("adjective")||a.contains("pronoun")
                ||a.contains("conjunction")||a.contains("interjection")||a.contains("preposition")){
            return "typeofspeech";
        }
        if(a.contains("distinct")){
            return "distinct";
        }
        if(a.contains("reverse")){
            return "reverse";
        }
        return "false";
    }

    public static String param3Check(String a){
        if(a.contains("distinct")){
            return "distinct";
        }
        if(a.contains("reverse")){
            return "reverse";
        }
        return "false";
    }

    public static String param4Check(String a){
        if(a.contains("reverse")){
            return "reverse";
        }
        return "The entered 4th parameter '"+a+"' is NOT 'reverse'.\nThe entered 4th parameter '"+a+"' was disregarded.\nThe 4th ";
    }


    /***
     * 3 PARAMETERS
     */
    public static List<String> search(String keyword, String param2, String param3) {
        List<String> distinct = new ArrayList<>();
        List<String> TOS = search(keyword, param2);
        String keyString = TOS.toString();
        String rawDataLine[] = keyString.split("\n");
        if(param3.equals("distinct")){
            distinct = distinct(TOS);
        }
        if(param3.equals("reverse")){
            distinct = reverse(TOS);
        }
        return distinct;
    }

    /***
     * 4 PARAMETERS
     * @return
     */

    public static List<String> search(String keyword, String param2, String param3, String param4) {
        List<String> reverse = search(keyword, param2, param3);
        reverse = reverse(reverse);
        return reverse;
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

