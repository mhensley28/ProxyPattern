package proxyPackage;

public class SystemMonitor {
	RoboticCell system;
	 
	public SystemMonitor(RoboticCell system) {
		this.system = system;
	}
 
	public void report() {
		System.out.println("Robotic Cell: " + system.getLocation());
		System.out.println("Current throughput: " + system.getThroughput() + " parts");
		System.out.println("Current state: " + system.getState() + "\n");
	}
}
