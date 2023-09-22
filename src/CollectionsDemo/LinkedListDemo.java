package CollectionsDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		//add() methods
		list.add("Mango");
		list.add("Apple");
        list.add("Grapes");
        list.add("Banana");
        list.add("Papaya");
        list.add("Orange");
        //size() of a method
        System.out.println(list.size());
        //while loop
        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        System.out.println(list.get(1));
        //does list contains a value
        System.out.println("Mango");

	}

}
