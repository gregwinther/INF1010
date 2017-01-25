import java.util.ArrayList;


public class ComputingCluster {

	private int nodesPerRack;
	private ArrayList<Rack> racks;

	public ComputingCluster(int nodesPerRack) {
		this.nodesPerRack = nodesPerRack;
	}

	public void insertNode(Node node) {
		for (Rack rack : racks) {
			if (!rack.isFull()) {
				rack.insertNode(node);
			}
		}
	}
}