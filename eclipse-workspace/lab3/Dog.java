
import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class Dog extends Animal{
	
	public Dog(String name, int legs) {
		super(name, legs);
	}

	public String toString() {
		return "This dog's name is " + super.name + " and has " + super.numLegs + " legs.";
	}
	
	public int compareTo(Dog dog) {
		int n = 0;
		if (this.numLegs == dog.numLegs) {
			n = this.name.compareTo(dog.name);
		}
		else {
			n = this.numLegs - dog.numLegs;
		}
		return n;
	}
	
//	public static void main(String[] args) {
//	
//		List<Dog> dogList = new ArrayList<Dog>();
//		dogList.add(new Dog("fifo", 4));
//		dogList.add(new Dog("fifo", 3));
//		dogList.add(new Dog("lily", 4));
//		System.out.println(dogList);
//		
//		Comparator comp = new AnimalComparator();
//		Collections.sort(dogList, comp);
//		dogList.sort(comp);
//		System.out.println(dogList);
//	}
	
}