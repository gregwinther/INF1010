class Main {

	public static void main(String[] args) {

		ComputingCluster abel = new ComputingCluster(3);

		Node node1 = new Node(16, 2);
		Node node2 = new Node(16, 4);

		abel.insertNode(node1);
		abel.insertNode(node2);

		System.out.println(abel.getRacks().get(0).getNodes()[0].getMemory());
		System.out.println(abel.getRacks().get(0).getNodes()[1].getMemory());

	}
}