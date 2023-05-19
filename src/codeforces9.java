import java.util.*;
public class codeforces9 {
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        int t = san.nextInt();
        long[][] mt = new long[1500][1500];
        long[] ans = new long[2000007];
        long cur = 1;
        for(int i = 1 ; i < 1500 ; i++){
            for(int j = i - 1 ; j >= 1 ; j--){
                mt[j][i-j] = mt[j-1][i-j] + mt[j][i-j-1] - mt[j-1][i-j-1] + cur*cur;
                ans[(int)cur]=mt[j][i-j];
                cur++;
            }
        }
        while(t>0){
            int n = san.nextInt();
            System.out.println(ans[n]);
            t--;
        }
    }
}