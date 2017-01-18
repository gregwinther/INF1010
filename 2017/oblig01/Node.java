
public class Node {

	int nProcessors;
	int memory;

	public Node(int nProcessors, int memory) {
		this.nProcessors = nProcessors;
		this.memory = memory;
	}

	public int getnProcessors() {
		return nProcessors;
	}

	public int getMemory() {
		return memory;
	}
}