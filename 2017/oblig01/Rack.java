
public class Rack {

	private Node[] nodes;
	private boolean full;
	private int nodesPerRack;

	public Rack(int nodesPerRack) {
		this.full = false;
		this.nodesPerRack = nodesPerRack;
		this.nodes = new Node[nodesPerRack];

	}

	public void insertNode(Node nodeIn) {

		//nodes[0] = nodeIn;

		
		int i = 0;

		// Iterating over nodes and finding empty slot.
		for (Node node: nodes) {
			if (node == null) {
				nodes[i] = nodeIn;
				//System.out.println(i);

				// Breaks for loop if empty slot was found.
				break;
			}
			i++;

			/*
			if (i == this.nodesPerRack) {
				this.full = true;
			}
			*/
		}
	}

	// Check if rack is full.
	public boolean isFull() {
		return full;
	}


	// Getter
	public Node[] getNodes() {
		return nodes;
	}
}