package ds.linkedlist;

import java.util.Scanner;
import java.util.Stack;

public class ReverseSubPartLinkedList {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();

		LinkedListImpl2 linkedList = new LinkedListImpl2();
		for (int i = 0; i < len; i++) {
			linkedList.insert(new MyNode(sc.nextInt()));
		}

		linkedList.display();
		linkedList.reverseSubPart();
        linkedList.display();

	}

}

class LinkedListImpl2 {
	Stack<MyNode> stack = new Stack<MyNode>();
	private MyNode head;

	// inset node
	public void insert(MyNode node) {
		if (head == null) {
			head = node;
		} else {
			MyNode last = head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = node;
		}

	}

	public void reverseSubPart() {
		MyNode current = head;
		MyNode previous = head;
		while (current != null) {
			if (current.data % 2 == 0) {
				reverse(previous, current);
			}
			previous = current;
			current = current.next;
		}

	}

	public void reverse(MyNode previous, MyNode current) {
		MyNode end = null;

		while (current.data % 2 != 0) {
			stack.push(current);
			current = current.next;
		}

		end = current;

		while (!stack.isEmpty()) {
			MyNode popped = stack.pop();
			previous.next = popped;
			previous = popped;
		}

		end.next = previous;
        current=previous;
	}

	public void display() {
		MyNode current = head;
		while (current != null) {
			System.out.print("->" + current);
			current = current.next;
		}
	}

}

class MyNode {

	public int data;
	public MyNode next;

	public MyNode() {
	}

	public MyNode(int data) {
		this.data = data;
	}

	public String toString() {
		return "MyNode : " + data;
	}
}
