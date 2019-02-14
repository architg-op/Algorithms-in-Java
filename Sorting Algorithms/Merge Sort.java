/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MergeSort
{
    void mergeSort(int a[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }
    
    void merge(int a[], int l, int m, int r) {
        int L[] = new int[m - l + 1];
        int R[] = new int[r - m];
        for (int i = 0; i < L.length; i++) {
            L[i] = a[l + i];
        }
        for (int i = 0; i < R.length; i++) {
            R[i] = a[m + i + 1];
        }
        int i, j, k;
        i = j = 0;
        k = l;
        while (i < L.length && j < R.length) {
            if (L[i] <= R[j]) {
                a[k] = L[i++];
            }
            else {
                a[k] = R[j++];
            }
            k++;
        }
        while (i < L.length) {
            a[k++] = L[i++];
        }
        while (j < R.length) {
            a[k++] = R[j++];
        }
    }
    
    void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    MergeSort m = new MergeSort();
	    int a[] = {2, 4, 1, 6, 8, 5, 3, 7};
	    m.mergeSort(a, 0, a.length - 1);
	    m.printArray(a);
	}
}
