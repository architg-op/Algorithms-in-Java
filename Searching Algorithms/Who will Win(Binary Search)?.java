import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    int op = 0;
    void binarySearch(int a[], int x, int l, int r) {
        //System.out.println("Called l is " + l + "and r is " + r);
        if (l < r) {
            int mid = (l + r) / 2;
            if (a[mid] == x) {
              //  System.out.print("Found");
                return;
            }
            else if (x < a[mid]) {
                binarySearch(a, x, l, mid - 1);
            }
            else if (x > a[mid]) {
                binarySearch(a, x, mid + 1, r);
            }
            this.op++;
        }
        else {
            return;
        }
    }
	public static void main (String[] args)
	 {
	     GFG gfg = new GFG();
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     while (t-- != 0) {
	         int n = sc.nextInt();
	         int m = sc.nextInt();
	         int g = sc.nextInt();
	         int s = sc.nextInt();
	         int a[] = new int[n];
	         for (int i = 0; i < n; i++) {
	             a[i] = i + 1;
	         }
	       //  for (int i = 0; i < n; i++) {
	       //      System.out.println(i + " " + a[i]);
	       //  }
	         int tG,tS;
	         tG = tS = 0;
	         tG = m * g;
	         gfg.binarySearch(a, m, 0, n - 1);
	       // System.out.println("Operations are " +gfg.op);
	         tS = gfg.op * s;
	       // System.out.println("Time Taken by Gautam " + tG + "seconds and "  + " by Suresh " + tS + "seconds");
	         if (tG > tS) {
	             System.out.println(2);
	         }
	         else if (tG < tS) {
	             System.out.println(1);
	         }
	         else {
	             System.out.println(0);
	         }
	         gfg.op = 0;
	     }
	 }
}