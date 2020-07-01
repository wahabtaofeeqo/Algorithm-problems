/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taocoder.algorithmproblems;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author user
 */
public class DepthFirstSearch {
    
    private int total;
    private LinkedList<Integer>[] list;
    
    public DepthFirstSearch(int total) {
        this.total = total;
        this.list = new LinkedList[total];
        generateNodes();
    }
    
    
    public void DFS(int visit) {
        
        boolean[] visited = new boolean[total];
        DFSHelper(visit, visited);
    }
    
    private void DFSHelper(int v, boolean[] visited) {
        
        visited[v] = true;
        System.out.print(v + " ");
        
        Iterator<Integer> iterator = list[v].iterator();
        while(iterator.hasNext()) {
            int n = iterator.next();
            if(!visited[n]) {
                DFSHelper(n, visited);
            }
        }
    }
    
    private void generateNodes() {
        for(int i = 0; i < list.length; i++) {
            list[i] = new LinkedList<>();
        }
    }
    
    public void addEdge(int v, int value) {
        list[v].add(value);
    }
}
