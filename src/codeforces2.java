import java.util.Arrays;
import java.util.Scanner;
public class codeforces2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0){
            int n = input.nextInt();
            int[] a = new int[n];
            for(int i = 0 ; i< n ; i++){
                a[i] = input.nextInt();
            }
            Arrays.sort(a);
            boolean answer = true;
            for(int i = 0; i < n-1; i++ ){
                if(a[i] >= a[i+1]){
                    answer = false;
                }
            }
            if(answer){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
