/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaghtest;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author peterschellhorn
 */
public class JavaGHTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
///Data Types - primitive - int ( 32 bits) double, short, float,char, boolean,long, 
            // reference - string
            
        int xr = 10;
        int x = 15; // integer -2^31 -> 2^31 
        float w = 12.4f;//with out default data type is double for 12.4
       
        int sum = x + (x + x) % xr;
        double  sum1 = x/(float)xr; //casting - converting one data type to another
        
        /*
        implicit casting -
        vs 
         explicit casting -
        */
        
        System.out.println("Hello World \n" + sum );
        System.out.println(sum1);
        
        Scanner scn = new Scanner(System.in);
        
        //reading input
        x = scn.nextInt();
        
        
        System.out.println(x);
        
        Random rd = new Random();
        int z = rd.nextInt(11)+5;//range 5-15
        System.out.println(z);
            }
    
}

