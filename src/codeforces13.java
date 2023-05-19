import java.util.Scanner;
public class codeforces13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0){
            int n = input.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n ; i++){
                a[i] = input.nextInt();
            }
            int e = 0;
            for(int i = 0; i< n ; i++){
                if(a[i]!= i+1){
                    e = gcd(e,Math.abs(a[i]-(i+1)));
                }
            }
            System.out.println(e);
        }
    }
    public static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b,a % b);
    }
}
