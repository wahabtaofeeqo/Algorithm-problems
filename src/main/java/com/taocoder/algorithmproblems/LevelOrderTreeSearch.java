/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taocoder.algorithmproblems;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author user
 */
public class LevelOrderTreeSearch {
    
    private Node root;
    private Queue<Node> nodes;
    
    public LevelOrderTreeSearch(Node root) {
        this.root = root;
        nodes = new LinkedList<>();
        if(root != null) nodes.add(root);
    }
    
    public void printLevel() {
        
        while(!nodes.isEmpty()) {
            
            Node current = nodes.poll();
            System.out.print(current.getData() + " ");
            
            if(current.left != null) {
                addNode(current.left);
            }
            
            if(current.right != null) {
                addNode(current.right);
            }
        }
    }
    
    private void addNode(Node node) {
        nodes.add(node);
    }
}

class Node {
    
    private int data;
    Node left, right;
    
    public Node(int item) {
        this.data = item;
        this.left = null;
        this.right = null;
    }
    
    public int getData() {
        return data;
    }
}
