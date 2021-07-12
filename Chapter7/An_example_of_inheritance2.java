// Source: https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html

/* What You Can Do in a Subclass:
 * 
 * A subclass inherits all of the public and protected members of its parent, 
 * no matter what package the subclass is in.
 * 
 * If the subclass is in the same package as its parent, it also inherits the package-private members of the parent.
 *  
 * You can use the inherited members as is, replace them, hide them, or supplement them with new members:
 * 
 ** The inherited fields can be used directly, just like any other fields.
 * 
 ** You can declare a field in the subclass with the same name as the one in the superclass, 
 *  thus hiding it (not recommended).
 * 
 ** You can declare new fields in the subclass that are not in the superclass.
 * 
 ** The inherited methods can be used directly as they are.
 * 
 ** You can write a new "instance" method in the subclass that has the same signature as the one in the superclass, 
 *  thus overriding it.
 * 
 ** You can write a new "static" method in the subclass that has the same signature as the one in the superclass, 
 *  thus hiding it.
 * 
 ** You can write a subclass constructor that invokes the constructor of the superclass, 
 *  either implicitly or by using the keyword super.
 * 
 * */

public class An_example_of_inheritance2 {

}
