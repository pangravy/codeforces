import java.util.Scanner;
import java.util.Arrays;
public class codeforces11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
            }
            Arrays.sort(a);
            int l = 0, r = n-1;
            while (k-- > 0 && l < r) {
                if (a[l+1] + a[l] > a[r]) {
                    r--;
                }
                else {
                    l+=2;
                }
            }
            long sum = 0;
            for (int i = l; i <= r; i++) {
                sum += a[i];
            }
            System.out.println(sum);
        }
    }
}