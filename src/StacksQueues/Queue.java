package StacksQueues;
//Author: Daniel Olvera (danog99@gmail.com)


//Classic class for a LinkedList

public class Queue{
	private Node myRoot;
	//A pointer to the last element inserted to skip iteration every time we are going to insert a new element.
	private Node lastInserted;
	
	public Queue(Node root){
		this.myRoot = root;
		this.lastInserted = root;
	}
	
	public void enqueue(Node node){
		this.lastInserted.setNext(node);
		this.lastInserted = node;
	}
	
	public void printLinkedList(){
		Node current = this.myRoot;
		
		while(current != null){
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
	
	public Node peek(){
		return this.myRoot;
	}
	
	public Node dequeue(){
		Node temp = this.myRoot;
		this.myRoot = this.myRoot.getNext();
		return temp;
	}
	
	public void setRoot(Node newRoot){
		this.myRoot = newRoot;
	}
	
	public void setLastInserted(Node newNode){
		this.lastInserted = newNode;
	}
	
	
}
