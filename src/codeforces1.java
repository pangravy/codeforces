
import java.util.Scanner;
import java.util.Arrays;
public class codeforces1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0){
            int n = input.nextInt();
            int m = input.nextInt();
            int s = n*m;

            int b[] = new int[n*m];
            for(int i = 0 ; i < b.length ; i++){
                b[i] = input.nextInt();
            }

            Arrays.sort(b);
            int min1 = b[0];
            int min2 = b[1];
            int max1 = b[n*m-1];
            int max2 = b[n*m - 2];
            int min = Math.min(n,m);
            int l = ((s - min) * (max1 - min1)) + ((min-1) * (max2 - min1));
            int p = ((s - min) * (max1 - min1)) + ((min - 1) * (max1 - min2));
            int ans = Math.max(l,p);
            System.out.println(ans);
        }
    }
}