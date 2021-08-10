// Source: https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html
class Bicycle {
        
    // the Bicycle class has three fields
    public int cadence;
    public int gear;
    public int speed;
        
    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
        
}

class MountainBike extends Bicycle {
    
    // the MountainBike subclass adds one field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        
        seatHeight = startHeight;
    }   
        
    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   
}

/* MountainBike inherits all the fields and methods of Bicycle and adds the field seatHeight and a method to set it. 
 * Except for the constructor, it is as if you had written a new MountainBike class entirely from scratch, 
 * with four fields and five methods. 
 * 
 * However, you didn't have to do all the work. 
 * 
 * This would be especially valuable if the methods in the Bicycle class were complex 
 * and had taken substantial time to debug.
 * 
 * */

public class An_example_of_inheritance {
	
	public static void main(String[] args) {
		
		MountainBike giantBike = new MountainBike(15, 28, 0, 10);
		
		System.out.println(giantBike.cadence);
		
	}	
}

/* Keynote: 
 * In the Java language, classes can be derived from other classes, 
 * thereby inheriting fields and methods from those classes.
 * 
 * Definitions: 
 * A class that is derived from another class is called a subclass (also a derived class, 
 * extended class, or child class). The class from which the subclass is derived is called a superclass 
 * (also a base class or a parent class).
 * 
 * The idea of inheritance is simple but powerful: When you want to create a new class and 
 * there is already a class that includes some of the code that you want, 
 * you can derive your new class from the existing class. 
 * 
 * In doing this, you can reuse the fields and methods of the existing class without having to write 
 * (and debug!) them yourself.
 * 
 * A subclass inherits all the members (fields, methods, and nested classes) from its superclass. 
 * Constructors are not members, so they are not inherited by subclasses, 
 * but the constructor of the superclass can be invoked from the subclass.
 * 
Private Members in a Superclass:
A subclass does not inherit the private members of its parent class. 
However, if the superclass has public or protected methods for accessing its private fields, 
these can also be used by the subclass.

A nested class has access to all the private members of its enclosing class—both fields and methods. 
Therefore, a public or protected nested class inherited by a subclass has indirect access to 
all of the private members of the superclass.
 * 
 * */
