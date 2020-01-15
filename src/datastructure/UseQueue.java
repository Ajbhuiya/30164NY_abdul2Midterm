package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */


				Queue<String> docOfficeLine = new LinkedList<String>();
				docOfficeLine.add("Michael");
				docOfficeLine.add("Tom");
				docOfficeLine.add("Bob");
				docOfficeLine.add("Tim");
				docOfficeLine.add("Rick");


				System.out.println(docOfficeLine.peek());
				System.out.println(docOfficeLine.poll());
				System.out.println(docOfficeLine.size());
				System.out.println(docOfficeLine);
				System.out.println("------------");

				for (String nq : docOfficeLine) {
					System.out.println(nq);
				}
				System.out.println("--------------------");
				Iterator it = docOfficeLine.iterator();//iterator to print
				while (it.hasNext())
					System.out.println(it.next());

				System.out.println("-------------------");
				int i = 0;
				while (docOfficeLine.size() > i) {//while loop to print
					System.out.println(((LinkedList<String>) docOfficeLine).get(i));
					i++;
				}
			}
		}
