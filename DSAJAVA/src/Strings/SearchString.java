package Strings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new FileReader("/Users/hemkishorepradhan/Desktop/HandsOnDataStructuresandAlgorithmsinJava/DSAJAVA/src/Strings/document.txt"));
        String line;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string you want to search: ");
        String searchString=sc.nextLine();
        while((line=reader.readLine())!=null){
            if(line.contains(searchString)){
                System.out.println("String found at index "+line.indexOf(searchString));
            }
        }
    }
}
