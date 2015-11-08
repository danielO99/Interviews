//Author: Daniel Olvera (danog99@gmail.com)

//A basic class for a stack using a Single Linked List
//Since the stack property is LIFO we always will insert at root at pop at root.

package StacksQueues;


public class Stack{
	private Node myRoot;
	
	
	public Stack(Node root){
		this.myRoot = root;		
	}
	
	public void push(Node node){
		node.setNext(this.myRoot);
		this.myRoot = node;
	}
	
	public void printStack(){
		Node current = this.myRoot;
		
		while(current != null){
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
	
	public Node peek(){
		return this.myRoot;
	}
	
	public Node pop(){
		Node temp = this.myRoot;
		this.myRoot = this.myRoot.getNext();
		return temp;
	}
	
	public void setRoot(Node newRoot){
		this.myRoot = newRoot;
	}
	
	
	
	
}
