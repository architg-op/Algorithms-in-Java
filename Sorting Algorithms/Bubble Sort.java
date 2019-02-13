import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     while (t-- != 0) {
	         int n = sc.nextInt();
	         int a[] = new int[n];
	         for (int i = 0; i < n; i++) {
	             a[i] = sc.nextInt();
	         }
	         int f = 0;
	         // n - 1 number of passes
	         for (int i = 0; i < n - 1; i++) {
	         	// 
	             for (int j = 0; j < n - i - 1; j++) {
	                 if (a[j] > a[j + 1]) {
	                     f = 1;
	                     int temp = a[j];
	                     a[j] = a[j + 1];
	                     a[j + 1] = temp;
	                 }
	             }
	             if (f == 0) {
	                 break;
	             }
	             f = 0;
	         }
	         // Printing the Array
	         for (int i = 0; i < n; i++) {
	             System.out.print(a[i] + " ");
	         }
	         System.out.println();
	     }
	 }
}