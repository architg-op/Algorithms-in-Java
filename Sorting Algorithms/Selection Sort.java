/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int a[] = {2, 5, 3, 1, 9, 8};
	    int min, temp;
	    for (int i = 0; i < a.length - 1; i++) {
	        min = i;
	        // Finding the minimum element in unsorted subarray
	        for (int j = i + 1; j < a.length; j++) {
	            if (a[j] < a[min]) {
	                min = j;
	            }
	        }
	        // Swapping the ith and min position
	        temp = a[i];
	        a[i] = a[min];
	        a[min] = temp;
	    }
	    // Printing the Array 
	    for (int i = 0; i < a.length; i++) {
	        System.out.print(a[i] + " ");
	    }
	}
}
