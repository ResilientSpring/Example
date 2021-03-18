
public class Shark_objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Shark sammy = new Shark("Sammy", 5);
        sammy.swim();
        sammy.be_awesome();

        System.out.println(sammy.name);
        System.out.println(sammy.age);

        Shark stevie = new Shark("Stevie", 80);
        stevie.swim();

	}

}
