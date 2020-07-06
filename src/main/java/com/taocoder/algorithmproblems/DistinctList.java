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
public class DistinctList {
    
    int duplicates(String[] input) {
        
        String letters = "";
        int count = 0;
        
        for (String i : input) {
            if (!letters.contains(i)) {
                letters = letters + i;
            } else {
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        int res = new DistinctList().duplicates(new String[] {"a", "b", "a"});
        System.out.println("Duplicates: " + res);
    }
}