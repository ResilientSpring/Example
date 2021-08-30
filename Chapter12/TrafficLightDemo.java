
enum TrafficLightColor{
	RED, YELLOW, GREEN
}

class TrafficLightSimulator {
	private TrafficLightColor trafficLightColor;  // holds the traffic light color.
	private boolean stop = false;  // set to true to stop the simulation.
	private boolean changed = false; // true when the light has changed.
	
	public TrafficLightSimulator(TrafficLightColor initiaLightColor) {
		trafficLightColor = initiaLightColor;
	}
	
	public TrafficLightSimulator() {
		trafficLightColor = TrafficLightColor.RED;
	}
}

public class TrafficLightDemo {

	public static void main(String[] args) {
		

	}

}
