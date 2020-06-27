/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taocoder.algorithmproblems;


/**
 *
 * @author user
 */
public class BubbleSort {
    
    public static int[] sort(int[] input) {
        
        int prev = 0;
        
        for(int i = 0; i < input.length; i++) {
            for(int j = 1; j < input.length - 1; j++) {
                if(input[j - 1] > input[j]) {
                    prev = input[j - 1];
                    input[j - 1] = input[j];
                    input[j] = prev;
                }
            }
        }
        
       return input;
    }
}