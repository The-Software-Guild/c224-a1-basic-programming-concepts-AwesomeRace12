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
public class hearts {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age=0;
        double rate =0;
        double upper, lower=0;
        System.out.println("What is your age: ");
        age = input.nextInt();
        rate = 220 - age;
        System.out.println("Your maximum heart rate is: " + rate);
        upper = Math.round(50 * rate / 100);
        lower = Math.round(85 * rate / 100);
        System.out.println("Your target HR zone is: " + upper + "-" + lower + 
                " beats per minute");
    }
}
