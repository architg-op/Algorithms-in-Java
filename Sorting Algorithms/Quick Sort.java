/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class QuickSort
{
    // Arranging elements i.e. elements smaller than are on left side of pivot and vice-versa
    int partition(int a[], int l, int r) {
        int pvt = a[r];
        int pIndex = l;
        for (int i = l; i < a.length; i++) {
            if (a[i] < pvt) {
                int temp = a[i];
                a[i] = a[pIndex];
                a[pIndex] = temp;
                pIndex++;
            }
        }
        int temp = a[r];
        a[r] = a[pIndex];
        a[pIndex] = temp;
        return pIndex;
    }
    void quickSort(int a[], int l, int r) {
        if (l < r) {
            int pvt = partition(a, l, r);
            quickSort(a, l, pvt - 1);
            quickSort(a, pvt + 1, r);
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    QuickSort qs = new QuickSort();
	   // int a[] = {7, 1, 2, 6, 8, 5, 3, 4};
	   int a[] = {8, 7, 6, 5, 4, 3, 2, 1};
	    qs.quickSort(a, 0, a.length - 1);
	    for (int i = 0; i < a.length; i++) {
	        System.out.print(a[i] + " ");
	    }
	}
}
