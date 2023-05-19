import java.util.Scanner;
import java.util.Arrays;
public class codeforces3 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = input.nextInt();
            }
            Arrays.sort(a);
            int count = 0;
            int count1 = 0;
            int count2 = 0;
            int max = 0;
            for(int i = 0;i<n-1;i++){
                for(int j = 1;j<=i;j++){
                    if(i%j==0){
                        count++;
                    }
                }
                if(count==2){
                    count1 =i;
                }
                else{
                    count2 = i;
                }

            }
        }
    }
}
