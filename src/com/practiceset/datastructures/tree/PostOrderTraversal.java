package com.practiceset.datastructures.tree;

import java.util.Iterator;
import java.util.Stack;

import com.practiceset.datastructures.tree.PreOrderTraversal.Node;

public class PostOrderTraversal {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){this.data = data;}
	}
	/*leftchild rightchild root*/
	void postOrderTraversal(Node root){
		Node previous = null;
		Stack<Node> stack = new Stack<Node>();
		if(root !=null){
			stack.push(root);
		}
		
		while(!stack.empty()){
            Node current  = stack.peek();
            if(previous == null || previous.left == current || previous.right == current)
            {
            	if(current.left != null){
            		stack.push(current.left);
            	}
            	else if(current.right != null){
            		stack.push(current.right);
            	}else {
            		System.out.println(stack.pop().data);
            	}
            }//left to right , need to check if there is a right child
            else if(current.left == previous){
            	if(current.right != null){
            		stack.push(current.right);
            	}else{
            		System.out.println(stack.pop().data);
            	}
            }///check right and process parent node and pop 
            else if(current.right == previous){
            	System.out.println(stack.pop().data);
            }
            previous = current;
		}

		}

	Node formTheTree(){
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
	
	public static void main(String args[]) {
		PostOrderTraversal postOTraversal = new PostOrderTraversal();
		Node root = postOTraversal.formTheTree();
		postOTraversal.postOrderTraversal(root);
		
	}
}
