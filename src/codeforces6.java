import java.util.Scanner;
public class codeforces6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0){
            int n = input.nextInt();
            String p = "";

            if(n%2==0){
               System.out.println("-1");
            }
            else{
                int count = 0;
                while(n!=1 && count!=40){
                    if(((n+1)/2)%2==0){
                        n = (n+1)/2;
                        p+=1;
                    }
                    else{
                        n = (n-1)/2;
                        p+=2;
                    }
                count++;
                }
                if(count < 0){
                    System.out.println("-1");
                }
                else if(n==1){
                    System.out.println(p.length());
                    char[] chars = p.toCharArray();
                    for(int i = p.length()-1;i>=0;i--){
                        System.out.println(i + " ");
                    }
                }
                else{
                    System.out.println("-1");
                }
            }
        }
    }
}
