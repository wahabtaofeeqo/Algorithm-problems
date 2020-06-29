/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taocoder.algorithmproblems;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class StableAndUnstableSort {
    
    public static void insertionSortStable(int[] input) {
   
        int current;
        int j;
        
        for(int i = 1; i < input.length; ++i) {
            current = input[i];
            j = i - 1;
            
            while(j >= 0 && input[j] > current) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = current;
        }
        
        System.out.println(Arrays.toString(input));
    }
    
    public static void quickSortUnstable(int[] input, int left, int right) {
        if(left < right) {
            int pi = partition(input, left, right);
            
            quickSortUnstable(input, left, pi - 1);
            quickSortUnstable(input, pi + 1, right);
        }
        
        System.out.println(Arrays.toString(input));
    }
    
    private static int partition(int[] input, int left, int right) {
        int pivot = input[right];
        int index = left - 1;
        int temp;
        
        for(int j = left; j < right; j++) {
            if(input[j] < pivot) {
              
                index++;
                temp = input[index];
                input[index] = input[j];
                input[j] = temp;
            }
        }
        
        temp = input[index + 1];
        input[index + 1] = input[right];
        input[right] = temp;
        return index++;
    }
}
