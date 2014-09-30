public class Tree {

	private Node root;
	private Node current;

	public Tree() {
		root = null;
	}

	public void clearTree() {
		root = null;
	}

	public void insert(int value) {

		if (root == null) {
			root = new Node(value);
			return;
		}
		current = root;
		boolean added = false;
		do {

			if (current.getValue() < value) {
				if (current.getRight() == null) {
					current.setRight(new Node(value));
					added = true;
				} else
					current = current.getRight();
			} else {
				if (current.getLeft() == null) {
					current.setLeft(new Node(value));
					added = true;
				} else
					current = current.getLeft();
			}
		} while (!added);
	}

	public void insertRecursively(int value) {
		root = recursively(root, value);
	}

	private Node recursively(Node node, int value) {
		if (node == null) {
			return new Node(value);
		}

		if (node.getValue() < value) {
			node.setRight(recursively(node.getRight(), value));
		} else {
			node.setLeft(recursively(node.getLeft(), value));
		}

		return node;
	}

	public void printTree() {
		if (root == null) {
			return;
		}
		System.out.println("root: " + root.getValue());
		printPreOrder(root);
		System.out.println();
	}

	private void printPreOrder(Node node) {
		if (node == null) {
			return;
		}

		printPreOrder(node.getLeft());
		System.out.print(node.getValue() + " ");
		printPreOrder(node.getRight());

	}
}
