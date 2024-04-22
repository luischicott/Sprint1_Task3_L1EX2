package n1exercici2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
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
	list.add(6); 
	list.add(7); 
	list.add(8); 
	list.add(9); 
	list.add(10);

	System.out.println(list);
	
	ListIterator<Integer> iterator = list.listIterator(list.size());
	//ListIterator<Integer> iterator2 = list2.listIterator();

	
	
	while (iterator.hasPrevious()) {
		Integer number = iterator.previous();
        list2.add(number);
    }
	
	
	System.out.println(list2);
	
	while (iterator.hasNext()) {
		Integer number = iterator.next();
        list2.add(number);
    }
	
	System.out.println(list2);
	
	}

}
