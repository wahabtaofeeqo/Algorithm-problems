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
public class Main {
    
     public static void main(String[] args) {
        
        int[] input = new int[]{12, 11, 2, 3, 1, 30, 5, 20, 50};
        int find = 5;
        
        // Linear Searcing
        System.out.println("======Linear Searching=======");
        LinearSearch ls = new LinearSearch();
        int res = ls.search(input, find);
        if(res != -1) {
            System.out.println("Found " + find + " at location " + res);
        }
        else {
            System.out.println(find +" not found in the input");
        }
        
        
        System.out.println("\n\n======Binary Searching=======");
        BinarySearch bs = new BinarySearch();
        Arrays.sort(input);
        
        res = bs.recursive(input, 0, input.length -1, find);
        if(res != -1) {
            System.out.println("Found " + find + " at location (Recursive) " + res);
        }
        else {
            System.out.println(find +" not found in the input");
        }
        
        res = bs.iterative(input, find);
        if(res != -1) {
            System.out.println("Found " + find + " at location (Iterative) " + res);
        }
        else {
            System.out.println(find +" not found in the input");
        }
        
        
        System.out.println("\n\n======Bubble sort=======");
        System.out.println(Arrays.toString(BubbleSort.sort(new int[]{12, 11, 2, 3, 1, 30, 5, 20, 50})));
        
        System.out.println("\n\n=====Level Order Tree Search=====");
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        LevelOrderTreeSearch lots = new LevelOrderTreeSearch(root);
        lots.printLevel();
    }
}
