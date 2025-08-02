package Strings;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean exit=false;
        while(true && exit==false){

            System.out.println("-----------------");
            System.out.println("|MENU           |");
            System.out.println("|1.to Uppercase |");
            System.out.println("|2.to Lowercase |");
            System.out.println("|3.length       |");
            System.out.println("|4.charAt(Index)|");
            System.out.println("|5.substring    |");
            System.out.println("|6.Exit         |");
            System.out.println("-----------------");
            System.out.print("Enter Your Choice: ");
            int ch=sc.nextInt();
            sc.nextLine();
            switch (ch){
                case 1:
                    System.out.print("Enter word/String:");
                    String str=sc.nextLine();
                    System.out.println(str.toUpperCase());
                    break;
                case 2:
                    System.out.print("Enter word/String:");
                    String str2=sc.nextLine();
                    System.out.println(str2.toLowerCase());
                    break;
                    case 3:
                        System.out.print("Enter word/String:");
                        String str3=sc.nextLine();
                        System.out.println("The length of the string is " + str3.length());
                        break;
                        case 4:
                            System.out.println("Enter word/String:");
                            String str4=sc.nextLine();
                            System.out.print("Enter index:");
                            int idx=sc.nextInt();
                            System.out.println("The character at index " + idx + " is " + str4.charAt(idx));
                            break;
                            case 5:
                                System.out.println("Enter word/String:");
                                String str5=sc.nextLine();
                                System.out.println("Enter the start index for the substring:");
                                int starIdx=sc.nextInt();
                                System.out.println("Enter the end index for the substring:");
                                int endIdx=sc.nextInt();
                                System.out.println("The substring is " + str5.substring(starIdx, endIdx));
                                break;
                                case 6:
                                    System.out.println("Exiting....");
                                    exit=true;


            }
        }
    }
}
