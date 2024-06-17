//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("! Loading data...");
        System.out.println("! Loading completed");
        System.out.println("===== DICTIONARY 340 JAVA =====\n");
        System.out.println("----- Keywords:\t" + Data.getTotalKeyword());
        System.out.println("----- Definitions:\t" + Data.getTotalDefinition());
        System.out.println("Search: ");
        String search = scan.nextLine().toLowerCase();// this calls the parameter
        System.out.println(Data.parameterCheck(search));
        //update test
        //hello world
    }
}
