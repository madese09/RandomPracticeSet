package com.my.practice.general;

public class Graph {
    private final int xCoord;
    private final int yCoor;
    
    public Graph(int x, int y) {
    	this.xCoord = x;
    	this.yCoor = y;
    }
    
    public boolean equals(Object o) {
    	if(!(o instanceof Graph)){
    		return false;
    	}
    	Graph g = (Graph)o;
    	
    	return g.xCoord == xCoord && g.yCoor == yCoor;
    }
}
