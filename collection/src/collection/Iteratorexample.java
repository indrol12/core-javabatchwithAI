package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Iteratorexample {

	public void generic() throws InterruptedException
	{
		ArrayList<String> email=new ArrayList<String>();
		email.add("Tina@gmail.com");
		email.add("Pooja@gmail.com");
		email.add("om@gmail.com");
		
		System.out.println("--------------Iteration using foreach loop---------------");
		//foreach=it is used to iterate the array or collection
		for (String e : email) {
			System.out.println(e);
			Thread.sleep(1000);
		} 		
	}
	public void LL_generic() throws InterruptedException
	{
		LinkedList<Integer> salary=new LinkedList<Integer>();
		salary.add(60000);
		salary.add(9000);
		salary.add(72000);
		salary.add(41000);
		salary.add(10000);
		salary.add(9000);
		
		System.out.println("index of:"+salary.indexOf(72000));
		System.out.println("--------------Iteration using Iterator---------------");
	    //Iterator used to iterate objects in the collections
		Iterator it=salary.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			Thread.sleep(1000);
		}
		System.out.println("contains :");
		//logic for index of
	
			 if(salary.contains(41000))
			 {
				 System.out.println("Index of 41000:"+salary.indexOf(41000));
				
			 }
		
	}
	public static void main(String[] args) throws InterruptedException {
		Iteratorexample o=new Iteratorexample();
		o.generic();
		o.LL_generic();
	}
}
//iterate the empsalary and check whether the 10000 salary is present--Logic pending
//iterator the emp salary and print the index of 41000
//take the input from user flowers name stored it into arraylist and print the same