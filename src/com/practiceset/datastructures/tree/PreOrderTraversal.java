package com.practiceset.datastructures.tree;

import java.util.ArrayList;
import java.util.Stack;

public class PreOrderTraversal {
	
    static class Node {
    	Node left;
    	Node right;
    	int data;
    	Node(int data){this.data=data;}
    	
    }
    /*root leftchild right */
    static void preOrder(Node root) {
    	Stack<Node> stack = new Stack<Node>();
    	stack.push(root);
    	while(!stack.empty()){
    		Node n = stack.pop();
    		System.out.println(n.data);
    		
    		if(n.right != null) {
    			stack.push(n.right);
    		}
    		if(n.left != null) {
    			stack.push(n.left);
    		}
    	}
    }
   
    
    public static void main(String[] args) {
    	Node root = createNode();
    	preOrder(root);
    	
    	
    }
    
    static Node createNode(){
    	Node root = new Node(40);
    	Node n20 = new Node(20);
    	Node n10 = new Node(10);
    	Node n30 = new Node(30);
    	Node n60 = new Node(60);
    	Node n50 = new Node(50);
    	Node n70 = new Node(70);
    	
    	root.left = n20;
    	root.right = n60;
    	n20.left = n10;
    	n20.right = n30;
    	n60.left = n50;
    	n60.right = n70;
    	
    	return root;
    }
}
