import java.util.Scanner;
public class codeforces4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0){
            int n = input.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for(int i = 0;i<n;i++){
                a[i]=input.nextInt();
                sum += a[i];
            }
            int min = a[0];
            for(int i = 1;i < n;i++){
                if(a[i]<min){
                    min = a[i];
                }
            }
            int result = 0;
            for(int i = 0;i < n;i++){
                while(a[i]>min){
                    result=a[i]/min;
                    a[i]=(int)(Math.ceil(result));
                }
            }
            int newsum = 0;
            for(int i = 0;i < n;i++){
                newsum+=a[i];
            }
            int totalsum = n * min;
            if(n<=1){
                System.out.println("0");
            }
            else if(totalsum == newsum){
                
            }

        }
    }
}
