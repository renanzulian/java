package com.renanzulian.quakeparser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException {
        File source = new File("/home/renanferreira/Desktop/java/quake-parser-challenge/games.log");
        Scanner sc = new Scanner(source);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] event = App.getEvent(line);
            System.out.println(event[1]);
        }
        
        sc.close();
        
    }

    static String[] getEvent(String line) {
        Pattern pattern = Pattern.compile("([a-zA-Z]+): ");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()){
            String[] result = new String[2];
            result[0] = matcher.group(1);
            result[1] = pattern.split(line)[1];
            return result;
        } else {
            System.out.println("Event not found.");
            return null;
        }
    }
}
