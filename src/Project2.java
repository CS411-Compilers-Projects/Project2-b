/**
* Name: Phuoc Ngo
*       Scott Matsumura
*
* Class: CS 411 - Compilers and Interpreters
* Project #2
*/

import java.io.FileNotFoundException;

public class Project2 {

    public static void main (String[] args) {
        //Prevents additional output for parsing errors
        System.err.close();

        //Parse the first file
        parseFile("Test File 1", "TestFile1.txt");

        //Parse the second file
        parseFile("Test File 2", "TestFile2.txt");

        //Parse test case 1
//        parseFile("TEST CASE 1", "TestCase01.txt");
//
//        //Parse test case 2
//        parseFile("TEST CASE 2", "TestCase02.txt");
//
//        //Parse test case 3
//        parseFile("TEST CASE 3", "TestCase03.txt");
//
//        //Parse test case 4
//        parseFile("TEST CASE 4", "TestCase04.txt");
//
//        //Parse test case 5
//        parseFile("TEST CASE 5", "TestCase05.txt");
//
//        //Parse test case 6
//        parseFile("TEST CASE 6", "TestCase06.txt");
//
//        //Parse test case 7
//        parseFile("TEST CASE 7", "TestCase07.txt");
//
//        //Parse test case 8
//        parseFile("TEST CASE 8", "TestCase08.txt");
//
//        //Parse test case 9
//        parseFile("TEST CASE 9", "TestCase09.txt");
//
//        //Parse test case 10
//        parseFile("TEST CASE 10", "TestCase10.txt");
    }

    private static void parseFile(String title, String filename) {
        System.out.println(title);
        System.out.println("*** PARSING OUTPUT ***");
        try {
            parser p = new parser(new ToyScanner(filename));
            p.parse();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to find file.");
        } catch (Exception e) {
            System.out.println("\n[reject] from catch");
        }
        System.out.println();
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println();
    }
}
