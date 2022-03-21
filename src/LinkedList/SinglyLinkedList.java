package LinkedList;

public class SinglyLinkedList {

	private ListNode head;

	private static class ListNode {
		private int data; /* generic but taken here as int */
		private ListNode next; /* pointer to the next node */

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	/* Printing the singly linked list */
	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + ",");
			current = current.next;
		}
		System.out.print("null");
	}

	/* Count the length of singly linked list */
	public int length() {
		int counter = 0;
		ListNode current = head;
		while (current != null) {
			counter++;
			current = current.next;
		}
		System.out.println("Length of SinglyLinkedList is " + counter);
		return counter;
	}

	/* Inserting the node at the beginning */
	public void insertFirst(int value) {
		ListNode node = new ListNode(value);
		node.next = head;
		head = node;
	}

	/* Inserting the node at the end */
	public void insertLast(int value) {
		ListNode node = new ListNode(value);
		if (head == null) {
			head = node;
			return;
		} else {
			ListNode current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
		}
	}

	/* Inserting the node at given position */
	public void insertNodeAtPosition(int data, int position) {
		ListNode node = new ListNode(data);
		if (position == 1) {
			node.next = head;
			head = node;
		} else {
			ListNode previous = head;
			int count = 1;
			while (count < position - 1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			node.next = current;
			previous.next = node;
		}
	}

	/* Delete the first node */
	public ListNode deleteFirstNode() {
		if (head == null) {
			return null;
		} else {
			ListNode node = head;
			head = head.next;
			node.next = null;
			return node;
		}
	}

	/* Delete the last node */
	public ListNode deleteLastNode() {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		while (current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		return current;
	}

	public static void main(String[] args) {
		/* 4 listnodes has been created */
		SinglyLinkedList sl1 = new SinglyLinkedList();
		sl1.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);
		/******************************************************************************/
		/* connecting 4 listnodes forming chain and creating singly linked list. */
		sl1.head.next = second;
		second.next = third;
		third.next = fourth;
		/******************************************************************************/
		/* Execution of methods */
		// sl1.display();
		// sl1.length();
		sl1.insertFirst(55);
		sl1.insertLast(98);
		sl1.insertLast(22);
		sl1.insertNodeAtPosition(786, 3);
		sl1.insertNodeAtPosition(999, 6);
		System.out.println(sl1.deleteFirstNode().data);
		System.out.println(sl1.deleteLastNode().data);
		sl1.display();

	}

}
