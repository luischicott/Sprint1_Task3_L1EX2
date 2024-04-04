package n1exercici2;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class S1_T3_N1EX2_Luis_Chicott {

	public static void main(String[] args) {
		
	List<Integer> list = new ArrayList<>();
	List<Integer> list2 = new ArrayList<>();	
	

	list.add(1); 
	list.add(2); 
	list.add(3); 
	list.add(4); 
	list.add(5);
	
	for (int i = list.size() - 1; i >= 0; i--) {
	    list2.add(list.get(i));
	}

	System.out.println(list);
	System.out.println(list2);
	
	ListIterator<Integer> iterator = list.listIterator();
	ListIterator<Integer> iterator2 = list2.listIterator();
	
	
	while(iterator.hasNext()) {
		Integer number = iterator.next(); 		
		list2.add(number); 
	}
	
	System.out.println(list2);
	
	}

}
