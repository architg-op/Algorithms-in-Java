/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int a[] = {7, 2, 4, 1, 5, 3};
	    int n = a.length;
	    int j = 0;
	    int val = 0;
	    for (int i = 1; i < n; i++) {
	        val = a[i];
	        j = i;
	        while (j > 0 && a[j - 1] > val) {
	            a[j] = a[j - 1];
	            j--;
	        }
	        a[j] = val;
	    }
	    for (int i = 0; i < n; i++) {
	        System.out.print(a[i] + " ");
	    }
	}
}
