package edu.ngp.lms;

import java.util.Iterator;
import java.util.Arrays;

public class LMS {

	public static void main(String[] args) {
		int[] a = { 1, 2, 1, 2, 1, 2, 3, 4, 4, 2 };

		StringBuffer str = new StringBuffer();

		for (int i : a) {
			str.append(i);
		}

		StringBuffer str1 = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			
			if(str1.toString().contains(""+str.toString().charAt(i))) {
				continue;
			}
			str1.append(str.toString().charAt(i));
			
		}
		
		int[] a2 = new int[str1.length()];
		
		for (int i = 0; i < str1.length(); i++) {
			a2[i] = Integer.parseInt(""+str1.toString().charAt(i));
		}
		
		
		int[] count = new int[a2.length];
		
		
		for (int i = 0; i < a2.length; i++) {
			count[i]=0;
			for (int j = 0; j < a.length; j++) {
				
				if(a2[i]==a[j]) {
					count[i]+=1;
				}
				
			}
			
		}
		
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(a2));
//		System.out.println(Arrays.toString(count));
//		
		for (int i = 0; i < count.length; i++) {
			for (int j = 0; j < count.length; j++) {
				if(count[i]<count[j]) {
					int t=count[i];
					count[i] = count[j];
					count[j] = t;
					
					int t1=a2[i];
					a2[i] = a2[j];
					a2[j] = t1;
					
				}
			}
		}
		
		System.out.println("Maximum Count : "+a2[a2.length-1]);
		System.out.println("Minimum Count : "+a2[0]);
		
		
		
		
	
	}

}
