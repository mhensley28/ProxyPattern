package proxyPackage;

public class RobotPickAndPlace_main {

	public static void main(String[] args) {
		RoboticCell roboticCell = new RoboticCell("Robot P&P", 0);
		SystemMonitor monitor = new SystemMonitor( roboticCell);
		
		System.out.println(roboticCell);
		
		for(int i=0; i<3; i++) {
			roboticCell.partAtInfeed();
			roboticCell.outfeedClear();
		}
		
		System.out.println(roboticCell);
		
		roboticCell.resetThroughput();
		
		monitor.report();
		
		for(int i=0; i<2; i++) {
			roboticCell.partAtInfeed();
			roboticCell.outfeedClear();
		}
		
		System.out.println(roboticCell);

		monitor.report();
	}
}
