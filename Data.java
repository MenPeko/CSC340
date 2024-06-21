//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.*;

public enum Data {

    //enum definition data bank
    word1("!help ", List.of("PARAMETER HOW-TO, please enter:\n1. A search key -then 2. An optional part of speech -then\n3. An optional 'distinct' -then 4. An optional 'reverse )")),
    word2("arrow ", List.of("Arrow [noun] : Here is one arrow: <IMG> -=>> </IMG>")),
    word3("book ", List.of("Book [noun] : A set of pages.", "Book [noun] : A written work published in printed or electronic form.", "Book [verb] : To arrange for someone to have a seat on a plane.", "Book [verb] : To arrange something on a particular date.")),
    word4("distinct ", List.of("Distinct [adjective] : Familiar. Worked in Java", "Distinct [adjective] : Unique. No duplicates. Clearly different or of a different kind.", "Distinct [adverb] : Uniquely. Written \"distinctly\"", "Distinct [noun] : A keyword in this assignment.", "Distinct [noun] : A keyword in this assignment.", "Distinct [noun] : A keyword in this assignment.", "Distinct [noun] : An advanced search option.", "Distinct [noun] : Distinct is a parameter in this assignment.")),
    word5("placeholder ", List.of("Placeholder [adjective] : To be updated...", "Placeholder [adjective] : To be updated...", "Placeholder [adverb] : To be updated...", "Placeholder [conjunction] : To be updated...", "Placeholder [interjection] : To be updated...", "Placeholder [noun] : To be updated...", "Placeholder [noun] : To be updated...", "Placeholder [noun] : To be updated...", "Placeholder [preposition] : To be updated...", "Placeholder [pronoun] : To be updated...", "Placeholder [verb] : To be updated...")),
    word6("reverse ", List.of("Reverse [adjective] : On back side.", "Reverse [adjective] : Opposite to usual or previous arrangement.", "Reverse [noun] : A dictionary program's parameter", "Reverse [noun] : Change to opposite direction", "Reverse [noun] : The opposite.", "Reverse [noun] : To be updated...", "Reverse [noun] : To be updated...", "Reverse [noun] : To be updated...", "Reverse [noun] : To be updated...", "Reverse [verb] : Change something to opposite.", "Reverse [verb] : Go back", "Reverse [verb] : Revoke ruling.", "Reverse [verb] : To be updated...", "Reverse [verb] : To be updated...", "Reverse [verb] : Turn something inside out.")),
    word7("speaker ", List.of("Electro-acoustic transducer that converts electrical signals into sounds loud enough to be heard at a distance.")),
    word8("Someone ", List.of("A Person. What in the hell else would this word mean?")),
    word9("extra", List.of("over the top")),
    word10("grades ", List.of("A number that is given to a student that gives little to no feedback on how the student is improving or how could the student improve.")),
    word11("phone ", List.of("A piece of glass stuck to plastic that takes up time and dies everyday but comes back to life after being plugged into an outlet.")),
    word12("school ", List.of("A mentally and physically straining torture chamber that resembles a prison.")),
    word13("bored ", List.of("the reason we're all here, unless you're looking up a dirty/slang word your friend said and you pretended you knew but you're looking it up to see what it means.")),
    word14("Keyboard ", List.of("the thing i used to type this definition.")),
    word15("screen ", List.of("a movable or fixed device, usually consisting of a covered frame, that provides shelter, serves as a partition, etc.", "To be updated...")),
    word16("color ", List.of("the quality of an object or substance with respect to light reflected by the object, usually determined visually by measurement of hue, saturation, and brightness of the reflected light; saturation or chroma; hue.")),
    word17("plate ", List.of("a shallow, usually circular dish, often of earthenware or porcelain, from which food is eaten.", "To be updated...")),
    word18("star ", List.of("any of the heavenly bodies, except the moon, appearing as fixed luminous points in the sky at night.", "To be updated...")),
    word21("sound ", List.of("the sensation produced by stimulation of the organs of hearing by vibrations transmitted through the air or other medium.", "mechanical vibrations transmitted through an elastic medium, traveling in air at a speed of approximately 1,087 feet (331 meters) per second at sea level.", "the particular auditory effect produced by a given cause:\n" +
            "the sound of music.", "any auditory effect; any audible vibrational disturbance:\n" +
            "all kinds of sounds.", "a noise, vocal utterance, musical tone, or the like:\n" +
            "the sounds from the next room.", "a distinctive, characteristic, or recognizable musical style, as from a particular performer, orchestra, or type of arrangement:\n" +
            "the big-band sound."));

    private String keyword;
    private final List<String> definition;
    static int totalDefinition = 0;

    private Data(String keyword, List definition) {
        this.keyword = keyword;
        this.definition = definition;
    }
    public List<String> getDefinitionsArray() {
        return this.definition;
    }
    /***
     * Returns total definition in enum
     */
    public static int getTotalDefinition() {
        Data[] var0 = values();
        Data[] var2 = var0;
        int var3 = var0.length;
        for(int var4 = 0; var4 < var3; ++var4) {
            Data searchWord = var2[var4];
            totalDefinition += searchWord.getDefinitionsArray().size();
        }
        return totalDefinition;
    }
    /***
     * Starts the program
     */
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
            System.out.print("Search ["+i+"]: ");
            search = scan.nextLine().toLowerCase();
            if(search.equals("!q")){
                System.out.println("-----THANK YOU-----");
                break;
            }
            Data.parameterCheck(search);
            i++;
        }
        return null;
    }
    /***
     * Returns total number of keyword in enum
     */
    public static int getTotalKeyword() {
        Data[] var0 = values();
        int var1 = var0.length;
        return var1;
    }
    /***
     * Sends the entered input into parameters.
     */
    public static List<String> parameterCheck(String search){
        String[] holdsNull = new String[4];
        holdsNull = search.split(" ");
        List<String> printout = new ArrayList<>();
        if(holdsNull.length>4){
            printArray(Data.search("!help"));
            return null;
        }
        if(search.isEmpty()){
            printout = Data.search("!help");
            printArray(printout);
            return null;
        }
        if(searchEngine(holdsNull[0]) == null){
            printout.add("<NOT FOUND> To be considered for the next release. Thank you.\n");
            printArray(printout);
            printArray(Data.search("!help"));
            return printout;
        }
        if(holdsNull.length==1){
            printout = Data.search(holdsNull[0]);
            printArray(printout);
        }
        if(holdsNull.length==2){
            if(!(param2Check(holdsNull[1]).equals("typeofspeech")||param2Check(holdsNull[1]).equals("distinct")||param2Check(holdsNull[1]).equals("reverse"))){
                printout.clear();
                printout.add("<The entered 2nd parameter '"+holdsNull[1]+"' is NOT a part of speech.>");
                printout.add("<The entered 2nd parameter '"+holdsNull[1]+"' is NOT 'distinct'.>");
                printout.add("<The entered 2nd parameter '"+holdsNull[1]+"' is NOT 'reverse'.>");
                printout.add("<The entered 2nd parameter '"+holdsNull[1]+"' was disregarded.>");
                printout.add("<The 2nd parameter should be a part of speech or 'distinct' or 'reverse'.>");
                printArray(printout);
                holdsNull[1]="";
            }
            printout = Data.search(holdsNull[0],holdsNull[1]);
            printArray(printout);
        }
        if(holdsNull.length==3){
            if(!(param2Check(holdsNull[1]).equals("typeofspeech")||param2Check(holdsNull[1]).equals("distinct")||param2Check(holdsNull[1]).equals("reverse"))){
                printout.clear();
                printout.add("<The entered 2nd parameter '"+holdsNull[1]+"' is NOT a part of speech.>");
                printout.add("<The entered 2nd parameter '"+holdsNull[1]+"' is NOT 'distinct'.>");
                printout.add("<The entered 2nd parameter '"+holdsNull[1]+"' is NOT 'reverse'.>");
                printout.add("<The entered 2nd parameter '"+holdsNull[1]+"' was disregarded.>");
                printout.add("<The 2nd parameter should be a part of speech or 'distinct' or 'reverse'.>");
                printArray(printout);
                holdsNull[1]="";
            }
            if(!(param3Check(holdsNull[2]).equals("distinct")||param3Check(holdsNull[2]).equals("reverse"))){
                printout.clear();
                printout.add("<The entered 3rd parameter '"+holdsNull[2]+"' is NOT 'distinct'.>");
                printout.add("<The entered 3rd parameter '"+holdsNull[2]+"' is NOT 'reverse'.>");
                printout.add("<The entered 3rd parameter '"+holdsNull[2]+"' was disregarded.>");
                printout.add("<The entered 3rd parameter '"+holdsNull[2]+"' was disregarded.>");
                printout.add("<The 3rd parameter should be 'distinct' or 'reverse'.>");
                printArray(printout);
                holdsNull[2]="";
            }
            printout = Data.search(holdsNull[0],holdsNull[1],holdsNull[2]);
            printArray(printout);
        }
        if(holdsNull.length==4){
            if(!(param2Check(holdsNull[1]).equals("typeofspeech")||param2Check(holdsNull[1]).equals("distinct")||param2Check(holdsNull[1]).equals("reverse"))){
                printout.clear();
                printout.add("<The entered 2nd parameter '"+holdsNull[1]+"' is NOT a part of speech.>");
                printout.add("<The entered 2nd parameter '"+holdsNull[1]+"' is NOT 'distinct'.>");
                printout.add("<The entered 2nd parameter '"+holdsNull[1]+"' is NOT 'reverse'.>");
                printout.add("<The entered 2nd parameter '"+holdsNull[1]+"' was disregarded.>");
                printout.add("<The 2nd parameter should be a part of speech or 'distinct' or 'reverse'.>");
                printArray(printout);
                holdsNull[1]="";
            }
            if(!(param3Check(holdsNull[2]).equals("distinct")||param3Check(holdsNull[2]).equals("reverse"))){
                printout.clear();
                printout.add("<The entered 3rd parameter '"+holdsNull[2]+"' is NOT 'distinct'.>");
                printout.add("<The entered 3rd parameter '"+holdsNull[2]+"' is NOT 'reverse'.>");
                printout.add("<The entered 3rd parameter '"+holdsNull[2]+"' was disregarded.>");
                printout.add("<The entered 3rd parameter '"+holdsNull[2]+"' was disregarded.>");
                printout.add("<The 3rd parameter should be 'distinct' or 'reverse'.>");
                printArray(printout);
                holdsNull[2]="";
            }
            if(!(param4Check(holdsNull[3]).equals("reverse"))){
                printout.clear();
                printout.add("<The entered 4th parameter '"+holdsNull[3]+"' is NOT 'reverse'.>");
                printout.add("<The entered 4th parameter '"+holdsNull[3]+"' was disregarded.>");
                printout.add("<The 4th parameter should be 'reverse'.>");
                printArray(printout);
                holdsNull[3]="";
            }
            printout = Data.search(holdsNull[0],holdsNull[1],holdsNull[2],holdsNull[3]);
            printArray(printout);
        }
        return printout;
    }
    /***
     * PRINTS ARRAYLIST OF WHATEVERR IS PUT IN THE PARAMETER
     */
    public static void printArray(List<String> array){
        System.out.println("\t|");
        for(String i : array){
            System.out.println("\t " + i);
        }
        System.out.println("\t|");
    }
    /***
     * TYPEOFSPEECH - RETURNS AS TYPE OF SPEECH
     */
    public static List<String> typeOfSpeech(String keyword, String param2) {
        List<String> typeOfSpeechArray = new ArrayList<>();
        List<String> TOS = search(keyword);
        for(String ar : TOS){
            if(ar.toLowerCase().contains(param2.toLowerCase())){
                typeOfSpeechArray.add(ar);
            }
        }
        if(typeOfSpeechArray.isEmpty()){
            typeOfSpeechArray.add("<NOT FOUND> To be considered for the next release. Thank you.\n");
            printArray(typeOfSpeechArray);
            typeOfSpeechArray = Data.search("!help");
            return typeOfSpeechArray;
        }
        return typeOfSpeechArray;
    }
    /***
     * DISTINCT - REMOVES DUPLICATES
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
     *  REVERSE - FLIPS ARRAY TO SHOW A REVERSED ARRAYLIST
     */
    public static List<String> reverse(List<String> array){
        List<String> rev = new ArrayList<>();
        for(int i = array.size()-1; i>=0; i--){
            rev.add(array.get(i));
        }
        return rev;
    }
    /***
     * SEARCH FROM ENUM THE INPUT OF A WORD
     */
    public static Data searchEngine(String keyword) {
        Data[] var1 = values();
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
     * CHECKS PARAMETER 2 FOR WHAT IS ENTERED
     */
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
    /***
     * CHECKS PARAMETER 3 FOR WHAT IS ENTERED
     */
    public static String param3Check(String a){
        if(a.contains("distinct")){
            return "distinct";
        }
        if(a.contains("reverse")){
            return "reverse";
        }
        return "false";
    }
    /***
     * CHECKS PARAMETER 4 FOR WHAT IS ENTERED
     */
    public static String param4Check(String a){
        if(a.contains("reverse")){
            return "reverse";
        }
        return "false";
    }
    public static List<String> search(String keyword){
        List<String> Arr = new ArrayList<>();
        Data TOS = searchEngine(keyword);
        String keyString = TOS.toString();
        String rawDataLine[] = keyString.split("\n");
        Arr.addAll(List.of(rawDataLine));
        return Arr;
    }
    /***
     *  ENGINE FOR 2 PARAMETERS
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
        if(param2.equalsIgnoreCase("")){
            da = search(keyword);
            return da;
        }
        return null;
    }
    /***
     * ENGINE FOR 3 PARAMETERS
     */
    public static List<String> search(String keyword, String param2, String param3) {
        List<String> distinct = new ArrayList<>();
        List<String> TOS = search(keyword, param2);
        if(param3.equals("distinct")){
            distinct = distinct(TOS);
        }
        if(param3.equals("reverse")){
            distinct = reverse(TOS);
        }
        if(param3.equalsIgnoreCase("")){
            distinct = search(keyword, param2);
        }
        return distinct;
    }
    /***
     * ENGINE FOR 4 PARAMETERS
     */
    public static List<String> search(String keyword, String param2, String param3, String param4) {
        List<String> reverse = new ArrayList<>();
        if(param4.equalsIgnoreCase("reverse")){
            reverse = search(keyword, param2, param3);
            reverse = reverse(reverse);
        }
        if(param4.equalsIgnoreCase("")){
            reverse = search(keyword, param2, param3);
        }
        return reverse;
    }
    /***
     * toString method to turn objects into a string with a stringbuilderr
     */
    public String toString() {
        StringBuilder word = new StringBuilder(this.keyword.replaceFirst(this.keyword, ""));
        Iterator<String> var2 = this.definition.iterator();
        while(var2.hasNext()) {
            String definition = (String)var2.next();
            word.append(definition).append("\n");
        }
        return word.toString();
    }
}

