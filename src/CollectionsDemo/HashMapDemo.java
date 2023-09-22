package CollectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<String, Integer> td = new HashMap<>();
		
		td.put("Ram", 12345);  
		td.put("Marc", 35345);
		td.put("John", 5345);
		td.put("Jaya", 5345);
		td.put("James", 34535);
		
		Set set = td.entrySet();
		
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		td.remove("Marc");
	}

}
