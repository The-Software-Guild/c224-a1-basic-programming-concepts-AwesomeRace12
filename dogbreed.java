/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one;
import java.util.*;
/**
 *
 * @author aakar
 */
public class dogbreed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String dogname="";
        int bernard=0, chi=0, dra=0, cur=0, king=0;
        int solution=0;
        System.out.println("What is your dog's name? ");
        dogname = input.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + dogname + "'s"+ 
                " prestigous background right here");
        
        while(solution!=100){
            bernard = random.nextInt(100);
            chi = random.nextInt(100);
            dra = random.nextInt(100);
            cur = random.nextInt(100);
            king = random.nextInt(100);
            solution = bernard + chi + dra + cur + king;
        }
        System.out.println(dogname + " is: ");
        System.out.println(bernard + "% St. Bernard");
        System.out.println(chi + "% Chihuahua");
        System.out.println(dra + "% Dramatic RedNosed Asian Pug");
        System.out.println(king + "% King Doberman");
        System.out.println(cur + "% Common Cur");
        
        System.out.println("Wow, that's QUITE the dog!");
    }
}
