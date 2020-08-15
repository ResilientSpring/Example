import java.util.Scanner;

public class Self_Test_chapter_2_1 {

	public Self_Test_chapter_2_1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Distance = speed x time 
		
		double distance, speed, time;
		
		// Sound travels approximately 1,100 feet per second through air.
		speed = 1100;
		
		// Clap my hands and time how long it takes for me to hear the echo, then you know the total round-trip time.
		Scanner myObj = new Scanner(System.in);
		System.out.println("The time it takes for me to hear the echo since I clapped my hands: ");
		time = myObj.nextDouble();
		
		// Dividing the total round-trip time by two yields the time it takes the sound to go one way. 
		double time2 = time/2 ;
		
		distance = speed * time2;
		
		System.out.println("The distance to the object approximates: " + distance + " feet.");

	}

}
