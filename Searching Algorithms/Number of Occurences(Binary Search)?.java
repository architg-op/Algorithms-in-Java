import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static int upBinSearch(int a[], int x, int l, int r) {
        int temp = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == x) {
                temp = mid;
                l = mid + 1;
            }
            else if (x < a[mid]) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return temp;
    }
    static int lwBinSearch(int a[], int x, int l, int r) {
        int temp = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == x) {
                temp = mid;
                r = mid - 1;
            }
            else if (x < a[mid]) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return temp;
    }
	public static void main (String[] args)
	 {
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     int f = 0;
	     while (t-- != 0) {
	         int n = sc.nextInt();
	         int x = sc.nextInt();
	         int a[] = new int[n];
	         for (int i = 0; i < n; i++) {
	             a[i] = sc.nextInt();
	         }
	         int up = upBinSearch(a, x, 0, n - 1);
	         if (up != -1) {
	             int lw = lwBinSearch(a, x, 0, n - 1); 
	             System.out.println(up- lw + 1);
	         }
	         else {
	             System.out.println(-1);
	         }
	     }
	 }
}