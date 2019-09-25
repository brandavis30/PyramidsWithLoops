/* 
 * Brandon Davis
 * davis3bn@mail.uc.edu
 * Assignment 04
 * Due Date: September 26, 2019
 * Description: Printing pyramids using loops
 * Citations: http://www.java2s.com/Tutorials/Java/Statement/Java_for_loop.htm
 * Course: Java Programming
 * --------------------------------
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
        1
       222
      33333
     4444444
    555555555 
*/

package main;

public class Main {

	
	public static void main(String[] args) {
		int lines = 5; //the number of lines
		for (int i = 1; i <= lines; i++) {      //loops through once for each line
			for (int j = 1; j <= (lines - i + 4); j++) { //determines number of spaces to print, and prints them
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) { //determines the number of times to print i, and prints it
				System.out.print(i);
			}
			System.out.print("\n");  //ensures that each time it loops, it begins on a new line
		}

		

	
	}
}
