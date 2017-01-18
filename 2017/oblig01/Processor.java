
public class Processor {

	private double clockSpeed;
	private int nCores;

	public Processor(double clockSpeed, int nCores) {
		this.clockSpeed = clockSpeed;
		this.nCores = nCores;
	}

	public double getClock() {
		return clockSpeed;
	}

	public int getCores() {
		return nCores;
	}
}