package edu.khityaev.yademocontestfigital;

//import java.io.File;
//import java.io.FileWriter;
//import java.util.Scanner;
//
//public class Start {
//    public static void main(String[] args) {
//        File f = new File("input.txt");
//        try {
//            Scanner scanner = new Scanner(f);
//            String j = scanner.nextLine();
//            String s = scanner.nextLine();
//            char[] charsJ = j.toCharArray();
//            char[] charsS = s.toCharArray();
//            int count = 0;
//            for(char chS : charsS){
//                for(char chJ : charsJ){
//                    if(chS==chJ) count++;
//                }
//            }
//            System.out.println(count);
//            String output = String.valueOf(count);
//
//            File f1 = new File("output.txt");
//            if(!f1.exists()){
//                f1.createNewFile();
//            }
//            FileWriter fileWriter = new FileWriter(f1);
//            fileWriter.write(output);
//            fileWriter.close();
//
//        } catch (Exception e) {}
//    }
//}

import java.util.Scanner;

public class Start {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String j = scanner.nextLine();
        String s = scanner.nextLine();
        char[] charsJ = j.toCharArray();
        char[] charsS = s.toCharArray();
        int count = 0;
        for(char chS : charsS){
            for(char chJ : charsJ){
                if(chS==chJ) count++;
            }

        }
        System.out.println(count);
    }
    Stac
}

//import java.io.*;
//
//public class Start {
//    public static void main(String[] args) throws Exception {
//        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
//
//        String J = r.readLine();
//        String S = r.readLine();
//
//        int result = 0;
//        for (int i = 0; i < S.length(); ++i) {
//            char ch = S.charAt(i);
//            if (J.indexOf(ch) >= 0) {
//                ++result;
//            }
//        }
//
//        System.out.println(result);
//    }
//}

//import java.io.File;
//import java.io.FileWriter;
//import java.util.Scanner;
//
//public class Start {
//    public static void main(String[] args) {
//        File f = new File("input.txt");
//        try {
//            Scanner scanner = new Scanner(f);
//            String input = scanner.nextLine();
//            String[] numbers = input.split(" ");
//            int a = Integer.parseInt(numbers[0]);
//            int b =  Integer.parseInt(numbers[1]);
//            String output = String.valueOf(a+b);
//
//            File f1 = new File("output.txt");
//            if(!f1.exists()){
//                f1.createNewFile();
//            }
//            FileWriter fileWriter = new FileWriter(f1);
//            fileWriter.write(output);
//            fileWriter.close();
//
//        } catch (Exception e) {}
//
//
//    }
//}



//import java.util.Scanner;
//
//public class Start {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        String[] numbers = input.split(" ");
//        int a = Integer.parseInt(numbers[0]);
//        int b =  Integer.parseInt(numbers[1]);
//        System.out.println(a+b);
//    }
//}
