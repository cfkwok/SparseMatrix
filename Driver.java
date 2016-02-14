public class Driver {
	public static void main(String[] args) {
		LinkedList[] llArr = new LinkedList[5];
		for (int i = 0; i < 5; i++) {
			llArr[i] = new LinkedList();
		}
		llArr[0].addNode(12, 1);
		llArr[0].addNode(5, 3);

		llArr[2].addNode(2, 4);

		llArr[3].addNode(6, 3);

		llArr[4].addNode(1, 0);
		llArr[4].addNode(4, 2);
		llArr[4].addNode(9, 4);
		llArr[4].addNode(16, 5);

		System.out.println("Array One");
		for (int i = 0; i < 5; i++) {
			llArr[i].print();
			System.out.println();
		}



		LinkedList[] llArr1 = new LinkedList[5];
		for (int i = 0; i < 5; i++) {
			llArr1[i] = new LinkedList();
		}
		llArr1[0].addNode(12, 1);
		llArr1[0].addNode(5, 3);

		llArr1[2].addNode(2, 4);

		llArr1[3].addNode(6, 3);

		llArr1[4].addNode(1, 0);
		llArr1[4].addNode(4, 2);
		llArr1[4].addNode(9, 4);
		llArr1[4].addNode(16, 5);
		
		System.out.println("Array Two");
		for (int i = 0; i < 5; i++) {
			llArr1[i].print();
			System.out.println();
		}

		LinkedList[] result = llArr[0].addValues(llArr, llArr1);

		System.out.println("Result");
		for (int i = 0; i < 5; i++) {
			result[i].print();
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("Searching Array");
		LinkedList[] llArr2 = new LinkedList[4];
		for (int i = 0; i < 4; i++) {
			llArr2[i] = new LinkedList();
		}
		llArr2[0].addNode(1, 0);
		llArr2[0].addNode(1, 2);

		llArr2[1].addNode(3, 0);
		llArr2[1].addNode(2, 3);

		llArr2[2].addNode(1, 0);
		llArr2[2].addNode(2, 2);

		llArr2[3].addNode(4, 1);

		for (int i = 0; i < 4; i++) {
			llArr2[i].print();
			System.out.println();
		}
		System.out.println();


		llArr2[0].search(llArr2, 3);
		System.out.println();
		llArr2[0].search(llArr2, 1);
		
	}
}