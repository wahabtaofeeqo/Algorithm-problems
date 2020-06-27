package com.taocoder.algorithmproblems;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class LinearSearch {
    
    public int search(int[] input, int find) {
        
        for(int i = 0; i < input.length; i++) {
            if(input[i] == find) 
                return i;
        }
       return -1;
    }
}