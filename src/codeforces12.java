import java.util.Arrays;
import java.util.Scanner;
public class codeforces12 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0){
            int n = input.nextInt();
            int a[] = new int[n];
            int count =1;
            int sum = 0;
            for(int i = 0;i <n;i++){
                a[i] = count++;
                sum+= a[i];
            }
            int rem = sum % n;
            if(rem != 0){
                a[0] += rem;
            }
            for(int i = 0 ; i < n ; i++){
                System.out.print(a[i] + " ");
            }
        }
    }
}
