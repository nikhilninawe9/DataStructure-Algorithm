package LinkedList;

public class SinglyLinkedList {

	private ListNode head;

	private static class ListNode {
		private int data;// generic but taken here as int
		private ListNode next; // pointer to the next node

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
		sl1.length();
	}

}
