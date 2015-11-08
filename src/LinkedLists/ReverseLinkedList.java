package LinkedLists;
//Author: Daniel Olvera (danog99@gmail.com)
//Given a single Linked List reverse it in place.

//The time complexity is O(n) and space complexity is O(1).
//This is the best we can do since we have to traverse all the nodes, we don't need extra space to reverse the list.

public class ReverseLinkedList {


	
	public static void reverseLinkedListMethod(SingleLinkedList list){
		//We need to iterate the list, change current next to prev for each of the nodes
		
		//If there is only one node in the list we return it
		Node current = list.getRoot();
		
		if(current.getNext() == null){
			return;
		}
		
		Node next;
		Node prev = null;
		
		while(current != null){
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
			
		}
		//The last element inserted will be the previous root
		list.setLastInserted(list.getRoot());
		//The new root will be the last element of the list
		list.setRoot(prev);
	}
	
	
	public static void main(String[] args) {		
		Node node1 = new Node(1);		
		
		SingleLinkedList listTest = new SingleLinkedList(node1);
		listTest.insertAtEnd(new Node(2));
		listTest.insertAtEnd(new Node(3));
		listTest.insertAtEnd(new Node(4));
		listTest.insertAtEnd(new Node(5));
		listTest.insertAtEnd(new Node(6));
		listTest.insertAtEnd(new Node(7));
		listTest.insertAtEnd(new Node(8));
		listTest.insertAtEnd(new Node(9));
		listTest.insertAtEnd(new Node(10));
		
		listTest.printLinkedList();
		
		reverseLinkedListMethod(listTest);
		
		listTest.printLinkedList();
	}

}
