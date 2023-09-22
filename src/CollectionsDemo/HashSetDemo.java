package CollectionsDemo;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> list = new HashSet<>();
		//add() methods
		list.add("Mango");
		list.add("Apple");
        list.add("Grapes");
        list.add("Banana");
        list.add("Papaya");
        list.add("Orange");
        //size() of a method
        System.out.println(list.size());
        //for loop
       
        for(String t:list)
        {
        	System.out.println(t);
        }
        //does list contains a value
        System.out.println("Mango");

	}

}
