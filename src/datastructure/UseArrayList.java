package MidtermJuly2019.src.datastructure;


import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */

		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(1);//add to arraylist
		aList.add(3);
		aList.add(5);
		aList.add(7);
		aList.add(10);
		aList.remove(2);//remove from arraylist

		System.out.println(aList.get(1));//retrieve from arraylist
		System.out.println(aList.size());

		System.out.println("--------------");
		for(int al1:aList){//for each loop to print array
			System.out.println(al1);
		}
		System.out.println("---------------");
		int i=0;
		while (aList.size()>i){//while loop to print
			System.out.println(aList.get(i));
			i++;
		}
		System.out.println("-------------");
		Iterator it= aList.iterator();//iterator to print
		while (it.hasNext())
			System.out.println(it.next());



	}

}
