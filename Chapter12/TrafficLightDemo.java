
enum TrafficLightColor{
	RED, YELLOW, GREEN
}

class TrafficLightSimulator implements Runnable {
	private TrafficLightColor trafficLightColor;  // holds the traffic light color.
	private boolean stop = false;  // set to true to stop the simulation.
	private boolean changed = false; // true when the light has changed.
	
	public TrafficLightSimulator(TrafficLightColor initiaLightColor) {
		trafficLightColor = initiaLightColor;
	}
	
	public TrafficLightSimulator() {
		trafficLightColor = TrafficLightColor.RED;
	}
	
	public void run() {
		while (!stop) {
			try {
				switch (trafficLightColor) {
				case GREEN:
					Thread.sleep(10000);  // green for 10 seconds.
					break;
				case YELLOW:
					Thread.sleep(2000);   // yellow for 2 seconds.
					break;
				case RED:
					Thread.sleep(12000);  // red for 12 seconds.
					break;
				default:
					break;
				}
			} catch (InterruptedException exc) {
				System.out.println(exc);
			}	
			changeColor();
		}
	}
	
	// change color. 
	synchronized void changeColor() {
		switch (trafficLightColor) {
		case RED:
			trafficLightColor = TrafficLightColor.GREEN;
			break;
		case YELLOW:
			trafficLightColor = TrafficLightColor.RED;
			break;
		case GREEN:
			trafficLightColor = TrafficLightColor.YELLOW;

		default:
			break;
		}
		
		changed = true;
		notify();  // signal that the light has changed.

	}
	
	// Wait until a light change occurs. 
	synchronized void waitForChange() {
		try {
			while (!changed) {
				wait();  // wait for light to change.
				changed = false;
			}
		} catch (InterruptedException exc) {
			System.out.println(exc);
		}
	}
	
	// Return current color. 
	synchronized TrafficLightColor getTrafficLightColor() {
		return trafficLightColor;
	}
	
	// Stop the traffic light.
	synchronized void cancel() {
		stop = true;
	}
}

public class TrafficLightDemo {

	public static void main(String[] args) {
		
		TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);
		
		Thread thrdThread = new Thread(t1);
		
		thrdThread.start();
		
		for (int i = 0; i < 9; i++) {
			System.out.println(t1.getTrafficLightColor());
			t1.waitForChange();
		}
		
		t1.cancel();

	}

}
