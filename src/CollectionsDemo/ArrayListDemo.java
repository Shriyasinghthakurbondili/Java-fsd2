package CollectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		//add() methods
		list.add("Mango");
		list.add("Apple");
        list.add("Grapes");
        list.add("Banana");
        list.add("Papaya");
        list.add("Orange");
        //size() of a method
        System.out.println(list.size());
        //for each loop
        for(String t:list)
        {
        	System.out.println(t);
        }
        System.out.println(list.get(1));
	}

}
