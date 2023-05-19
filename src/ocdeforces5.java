import java.util.Scanner;
public class ocdeforces5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0){
            int n = input.nextInt();
            int a[] = new int[n];
            boolean answer = false;
            for(int i = 0; i < n ; i++){
                a[i]= input.nextInt();
            }
            for(int i = 0; i <n; i++){
                if(a[i]==(i+1)){
                    answer = true;
                    break;
                }
                else if((a[i]<=n) && i+1>a[i]){
                    answer = true;
                    break;
                }
                else{
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
