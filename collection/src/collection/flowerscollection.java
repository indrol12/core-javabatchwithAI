package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class flowerscollection {
public static void main(String[] args) throws InterruptedException {
	L_iterator();
//	Scanner sc=new Scanner(System.in);
//	System.out.println("How many flowers name You want to enter??");
//	int fsize=sc.nextInt();
//	
//	System.out.println("enter the flowers name");
//	ArrayList<String> flowers=new ArrayList<String>();
//	
//	for(int i=0;i<fsize;i++)
//	{
//		flowers.add(sc.next());
//	}
//	System.out.println("List of Flowers:");
//	System.out.println(flowers);
//	
//	//task 3:
//	Iterator<String> it=flowers.iterator();//forward
//	while(it.hasNext())
//	{
//		String str=it.next();
//		if(str.equals("sunflower"))
//		{
//			it.remove();
//		}
//	}
//	System.out.println("after remove:"+flowers);
}
public static void L_iterator() throws InterruptedException
{
	LinkedList<Integer> num=new LinkedList<Integer>();
	num.add(20);
	num.add(50);
	num.add(80);
	
	System.out.println("-----Forward--------");
	ListIterator<Integer> f=num.listIterator();
	while(f.hasNext())
	{
		System.out.println(f.next());
	}
	Thread.sleep(1000);
	System.out.println("-----Backward--------");
	while(f.hasPrevious())
	{
		System.out.println(f.previous());
	}
}
}
//using iterator print the index of jasmin
//UInput:print the flower of index 3
//UInput:remove sunflower from the collection