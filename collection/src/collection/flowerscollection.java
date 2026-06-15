package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class flowerscollection {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("How many flowers name You want to enter??");
	int fsize=sc.nextInt();
	
	System.out.println("enter the flowers name");
	ArrayList<String> flowers=new ArrayList<String>();
	
	for(int i=0;i<fsize;i++)
	{
		flowers.add(sc.next());
	}
	System.out.println("List of Flowers:");
	System.out.println(flowers);
}
}
