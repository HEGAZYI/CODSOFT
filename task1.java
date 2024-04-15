package com.semanticsquare.examples;

import java.util.*;

public class task1 {
    public static void main(String args[]){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("welcome to guess the number game!");
		    
            
		    boolean play = true;
		    outer:while(play) {
		    	int counter = 0 ;
		    	int score = 0 ;
		    	int attempts = 0;
		    	// if you want to choose random number between [1,100]
		    	int number =  (int) (Math.random()* 100) + 1; // 1 is the start
                boolean flag = false ;
            inner:while(!flag && counter <10){
            	System.out.println("Enter a number between 1 and 100:");
                int userInput = input.nextInt();
                attempts++;
                counter++;
                if(userInput == number){
                    flag = true ;// make this to make the loop stop if user reaches the correct answer
                    System.out.println("great,it is correct guess!.you have reached the correct guess in "+attempts+" attempts");
                    
                }else if(userInput > number){
                    System.out.println("sorry,it is too high!");
                    score ++;
                    
                }else if(userInput < number){
                    System.out.println("sorry,it is too low!");
                    score++;
                    
                }
               
                
            }
            System.out.println("the correct random number was : "+number);
            System.out.println("you have played "+ counter +" times\nnumber of lose: "+score);
            if(flag || counter == 10){
                System.out.println("do you want to continue [yes / no]");
                String choice = input.next();
                play = choice.equalsIgnoreCase("yes");
                if(choice.equalsIgnoreCase("no")){
                    System.out.println("GOOD BYE!");
                }
            }
            
            }
            
            
            }

        }

    
}

