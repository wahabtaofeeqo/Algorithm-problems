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
public class Palindrome {
    
    boolean checkPalindrome(String word) {
        
        String words = word.replaceAll("\\s", ""); 
        String reversed = "";
        
        for(int i = words.length() - 1; i >= 0; i--){
            reversed = reversed + String.valueOf(words.charAt(i));
        }
        
        return (reversed.equalsIgnoreCase(words));
    }
    
    public static void main(String[] args) {
        boolean bool = new Palindrome().checkPalindrome("nurses run");
        System.out.println("Is is Palindrome: " + bool);
    }
}