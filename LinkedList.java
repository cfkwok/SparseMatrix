import java.util.ArrayList;

public class LinkedList {
	public Node head;

	class Coords {
		int row;
		int col;
		public Coords(int r, int c) {
			row = r;
			col = c;
		}
	}

	public LinkedList() {
		head = null;
	}

	public void addNode(int val, int col) {
		Node n = new Node(val, col);
		if (head == null) {
			head = n;
		}
		else {
			Node tracker = head;
			while (tracker.next != null) {
				tracker = tracker.next;
			}
			tracker.next = n;
		}
	}

	public LinkedList[] addValues(LinkedList[] l1, LinkedList[] l2) {
		if (l1.length != l2.length) {
			return null;
		}
		LinkedList[] result = new LinkedList[l1.length];

		for (int i = 0; i < l1.length; i++) {
			result[i] = new LinkedList();
		}

		for (int i = 0; i < result.length; i++) {
			Node ptr1 = l1[i].head;
			Node ptr2 = l2[i].head;
			while (ptr1 != null) {
				if (ptr2 == null) {
					result[i].addNode(ptr1.value, ptr1.colVal);
					ptr1 = ptr1.next;
				}
				else if (ptr1.colVal == ptr2.colVal) {
					result[i].addNode(ptr1.value + ptr2.value, ptr1.colVal);
					ptr1 = ptr1.next;
					ptr2 = ptr2.next;
				}
				else if (ptr1.colVal < ptr2.colVal) {
					result[i].addNode(ptr1.value, ptr1.colVal);
					ptr1 = ptr1.next;
				}
				else if (ptr1.colVal > ptr2.colVal) {
					result[i].addNode(ptr2.value, ptr2.colVal);
					ptr2 = ptr2.next;
				}
			}

			while (ptr2 != null) {
				result[i].addNode(ptr2.value, ptr2.colVal);
				ptr2 = ptr2.next;
			}
		}
		return result;
	}

	public void search(LinkedList[] ll, int val) {
		
		ArrayList<Coords> al = new ArrayList<Coords>();
		for (int i = 0; i < ll.length; i++) {
			Node ptr = ll[i].head;
			while (ptr != null) {
				if (ptr.value == val) {
					al.add(new Coords(i, ptr.colVal));
				}
				ptr = ptr.next;
			}
		}

		for (int i = 0; i < al.size(); i++) {
			System.out.println("(" + al.get(i).row + ", " + al.get(i).col + ")");
		}
	}

	public void print() {
		Node tracker = head;
		while (tracker != null) {
			System.out.print("[" + tracker.colVal + "|" + tracker.value + "] -> ");
			tracker = tracker.next;
		}
	}
}