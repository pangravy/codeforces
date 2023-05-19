import java.util.Scanner;
public class codeforces7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0) {
            String s = input.next();
            int l = s.length();
            boolean count = true;
            for(int i = 0 ; i < l-1 ; i++ ){
                if(s.charAt(i)!=s.charAt(i+1)){
                    count = false;
                }
            }
            if(count == false){
                System.out.println(l-1);
            }
            else{
                System.out.println("-1");
            }
        }
    }
}
