package com.taocoder.algorithmproblems;


import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class BinarySearch {
    
   public int iterative(int[] input, int find) {
        
        int mid = 0;
        int startFrom = 0;
        int stopAt = input.length - 1;
        
        while(startFrom <= stopAt) {
            //Calculate the middle number
            mid = (startFrom + stopAt) / 2;
            
            if(input[mid] == find) {
                return mid;
            }
            else if(input[mid] < find) {
                startFrom = mid + 1;
            }
            else {
                stopAt = mid - 1;
            }
        }
        
        return -1;
    }
    
    public int recursive(int[] input, int startFrom, int stopAt, int find) {
        
        if(startFrom > stopAt) return -1;
        
        int mid = (startFrom + stopAt) / 2;
        if(input[mid] == find)
            return mid;
        
        if(input[mid] > find) {
            stopAt = mid - 1;
            return recursive(input, startFrom, stopAt, find);
        }
        else {
            startFrom = mid + 1;
            return recursive(input, startFrom, stopAt, find);
        }
    }
}