package com.renanzulian.quakeparser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException {
        File source = new File("/home/renanzulian/Desktop/java/quake-parser-challenge/games.log");
        Scanner sc = new Scanner(source);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());             
        }
        
        sc.close();
        
    }
}
