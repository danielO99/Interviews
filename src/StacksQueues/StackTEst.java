package StacksQueues;

public class StackTEst {

	public static void main(String[] args) {
		Stack stackTest = new Stack(new Node(1));
		stackTest.push(new Node(2));
		stackTest.push(new Node(3));
		stackTest.push(new Node(4));
		stackTest.push(new Node(5));
		stackTest.push(new Node(6));
		stackTest.printStack();
		/*
		System.out.println(stackTest.pop().getData());
		System.out.println(stackTest.pop().getData());
		System.out.println(stackTest.pop().getData());
		System.out.println(stackTest.pop().getData());
		System.out.println(stackTest.pop().getData());
		stackTest.printStack();
		*/
		
		

	}

}
