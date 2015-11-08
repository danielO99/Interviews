package LinkedLists;
//Author: Daniel Olvera (danog99@gmail.com)

//Classic class for a LinkedList

public class SingleLinkedList{
	private Node myRoot;
	//A pointer to the last element inserted to skip iteration every time we are going to insert a new element.
	private Node lastInserted;
	
	public SingleLinkedList(Node root){
		this.myRoot = root;
		this.lastInserted = root;
	}
	
	public void insertAtEnd(Node node){
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
	
	public Node getRoot(){
		return this.myRoot;
	}
	
	public void setRoot(Node newRoot){
		this.myRoot = newRoot;
	}
	
	public void setLastInserted(Node newNode){
		this.lastInserted = newNode;
	}
	
	
}
