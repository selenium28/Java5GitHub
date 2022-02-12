package collection;

import java.util.ArrayList;

public class CollectionCencept {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		
		
		list.add('A');
		list.add("Selenium");
		list.add(55.55);
		
//		list.remove(4);
		
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		ArrayList<String> listint = new ArrayList<String>();
		listint.add("Selenium");
		
		ArrayList<Integer> listit = new ArrayList<Integer>();
		listit.add(500);
	}

}
