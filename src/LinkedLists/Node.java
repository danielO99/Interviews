//Author: Daniel Olvera (danog99@gmail.com)
//Node class for the problems

package LinkedLists;


public class Node{
	private int myData;
	private Node next;
	
	public Node(int data){
		this.myData = data;
		this.next = null;			
	}
	
	//Setters and Getters.
	public int getData(){
		return this.myData;
	}
	
	public Node getNext(){
		return this.next;
	}
	
	public void setNext(Node nextNode){
		this.next = nextNode;
	}
}
