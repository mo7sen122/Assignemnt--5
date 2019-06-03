package hangman;

import java.util.Random;
import java.util.Scanner;

public class WordsList {
	
	public static void random_words() {
		char a;
		char ch = 0;
		String chh [];
		int f;
		String miss = null;
		int pnum = 0;
		char temp;
		
		String words[] = {"Ahmed1","test12","eslam3","mohamed4","mahmoud","hassan6"}; //list of 6 words
		Random rand = new Random();
		int one_word = rand.nextInt(words.length);
		System.out.println(words[one_word]);
		for(int i=0;i<words[one_word].length();i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println("You have only 8 misses after that you lose the game ");
		
		for(int tr=0;tr<8;tr++) {
		System.out.print("Please write your gussing character : ");
	
		//System.out.println(words.length);
		//System.out.println(words[one_word]);
		
		Scanner s= new Scanner(System.in);
		String letter = s.nextLine();
		//System.out.println(word);
		//for(int miss= 0;miss<8;miss++) {
		
			/*for (int i=0; i< words[one_word].length(); i++) {
				
				a=words[one_word].charAt(i);
				System.out.println(a);
			    
		}*/
		
			
			for(int d=0;d<words[one_word].length();d++) {
			
			 ch = words[one_word].charAt(d);
			 
			if (letter.equals(String.valueOf(ch))) {
				System.out.print(ch);
				pnum=d;
				temp = ch;
				
				}
				else
					{System.out.print("-");
					}
			}
			System.out.println();
		//System.out.println("You wrote this wrong char "+ miss);
		}
		
		System.out.println("You finish all the 8 chances");
	}	
}

//for(int m=words[one_word].length()-1;m>f;m--) {
//System.out.print("-");

//if (word == String.valueOf(a)) {
	//System.out.println("true");
