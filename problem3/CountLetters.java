package Problem3;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);

        //get word from user
        System.out.println("Enter a single word (Letters only, please): ");
        String word = scan.nextLine();

        //convert to all upper case
        word = word.toUpperCase();

        try {
            //count frequency of each letter in string
            for (int i = 0; i<word.length(); i++){
                counts[word.charAt(i)-'A']++;
        }
        } catch (Exception e) {
            System.out.println("Invalid Character - "+e);
        }

        //print requencies
        System.out.println();
        for (int i = 0; i<counts.length; i++){
            if (counts[i] != 0){
                System.out.println((char)(i+'A')+":"+counts[i]);
            }
        }

        scan.close();
    }
}
