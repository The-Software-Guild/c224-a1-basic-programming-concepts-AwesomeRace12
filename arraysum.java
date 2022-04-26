/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one;

/**
 *
 * @author aakar
 */
public class arraysum {
    
    
    
    public static void main(String[] args) {
        int [] array1 = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int [] array2 = {999, -60, -77, 14, 160, 301 };
        int [] array3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
140, 150, 160, 170, 180, 190, 200, -99};
        
        System.out.println("Sum of array 1: " + sum(array1));
        System.out.println("Sum of array 2: " + sum(array2));
        System.out.println("Sujm of array 3: " + sum(array3));
    }
    
    
    public static int sum(int [] array){
        int total=0;
        for(int i=0; i<array.length; i++){
            total = total + array[i];
    }
        return total;
}
    
}
