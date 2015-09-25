package com.my.practice.general;

public class LineGraph extends Graph{

	private final int vertex;
	
	public LineGraph(int xCoor, int yCoor, int vertex){
		super(xCoor, yCoor);
		this.vertex = vertex;
	}
	
	public boolean equals(Object o) {
		if(o instanceof LineGraph) return false;
		return super.equals(o) && ((LineGraph)o).vertex == this.vertex ;
	}
	
	
}
