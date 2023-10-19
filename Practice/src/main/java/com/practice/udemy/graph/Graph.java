package com.practice.udemy.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();
    
    public void printGraph(){
        System.out.println(adjList);
    }
    
    public boolean addVertex(String vertex){
        if(adjList.get(vertex) == null){
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }
    
    public boolean addEdge(String vertex1, String vertex2){
        if(adjList.get(vertex1) != null && adjList.get(vertex2) != null){
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }
    
    //removeEdge(String vertex1, String vertex2): remove the edge between the vertex
    public boolean removeEdge(String vertex1, String vertex2){
        if(adjList.get(vertex1) != null && adjList.get(vertex2) != null){
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }
    
    //removeVertex(String vertex): remove the node or vertex from the list with their connection or edge
    public boolean removeVertex(String vertex){
        if(adjList.get(vertex) == null) {
            return false;
        }
        for(String otherVertex : adjList.get(vertex)){
            adjList.get(otherVertex).remove(vertex);
        }
        adjList.remove(vertex);
        return true;
    }
}
