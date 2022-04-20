/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one;

import java.util.*;
import java.util.Scanner;
/**
 *
 * @author aakar
 */
public class rockpaperscissor {
    public static void main(String[] args){
        String playagain= "Y";
        Scanner input = new Scanner(System.in);
        do{
        System.out.println("Choose any of the following options");
        System.out.println("Rock");
        System.out.println("Paper");
        System.out.println("Scissors");
        
        String userchoice = playasuser();
        String compchoice = playascomp();
        
        
        if(userchoice.equals(compchoice)){
            System.out.println("Tie game");
        }
        else if(userchoice.equals("Rock")){
            System.out.println(compchoice.equals("Paper") ? "Computer wins" : "Computer loses");
        }
        else if(userchoice.equals("Paper")){
            System.out.println(compchoice.equals("Scissors") ? "Computer wins" : "Computer loses");
        }
        else if(userchoice.equals("Scissors")){
            System.out.println(compchoice.equals("Rock") ? "Computer wins" : "Computer loses");
        }
        
        System.out.println("Do you want to play agian? Y or N");
        playagain = input.next();
        if(playagain.equals("N")){
            System.out.println("Thanks for playing");
        }
        }while(playagain.equals("Y"));
    }
    
    
    public static String playascomp(){
        String compmove;
        Random random = new Random();
        int input = random.nextInt(3) + 1;
        if(input==1){
            compmove = "Rock";
        }
        else if(input==2){
            compmove = "Paper";
        }
        else{
            compmove = "Scissors";
        }
        System.out.println("Computer move is" + compmove);
        return compmove;
    }
    
    public static String playasuser(){
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        System.out.println("Player choice is " + choice);
        return choice;
    }
}
