import java.util.ArrayList;

class Main {

	public static void main(String[] args) {

		ComputingCluster abel = new ComputingCluster(2);

		Node node1 = new Node(16, 1);
		Node node2 = new Node(16, 2);
		Node node3 = new Node(16, 3);
		Node node4 = new Node(16, 4);


		abel.insertNode(node1);
		abel.insertNode(node2);
		abel.insertNode(node3);
		abel.insertNode(node4);

		//System.out.println(abel.getRacks().get(0).getNodes()[0].getMemory());
		//System.out.println(abel.getRacks().get(0).getNodes()[1].getMemory());

		ArrayList<Rack> racks = abel.getRacks();

		System.out.println(racks.size());



		for (Rack rack : racks) {
			System.out.println(rack);
		}

	}
}