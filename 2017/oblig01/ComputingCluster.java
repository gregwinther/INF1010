import java.util.ArrayList;


public class ComputingCluster {

	private int nodesPerRack;
	private ArrayList<Rack> racks = new ArrayList<Rack>();

	public ComputingCluster(int nodesPerRack) {
		this.nodesPerRack = nodesPerRack;

		// Adding initial rack
		this.racks.add(new Rack(nodesPerRack));
	}

	public void insertNode(Node node) {

		int i = 1;
		boolean wasInserted = false;

		// Iterating over racks
		for (Rack rack : racks) {

			// Checking if there is space in the rack 
			if (!rack.isFull()) {

				// Inserting the node if there is space.
				rack.insertNode(node);
				wasInserted = true;
				System.out.println("yo");
				break;
			} 
		i++;

		}

		if (!wasInserted) {
			Rack newRack = new Rack(this.nodesPerRack);
			racks.add(newRack);
			newRack.insertNode(node);
		}
	}

	// Getter
	public ArrayList<Rack> getRacks() {
		return racks;
	}
}