import java.util.Scanner;
public class codeforces10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0){
            String s = input.next();
            char[] chars = s.toCharArray();
            char[] z = new char[26];
            int count = 0;
            for(int i = 0; i < chars.length; i++){
                int a = (int)(chars[i] - 'a');
                z[a]++;
            }
            for(int i = 0; i < z.length; i++){
                if(z[i] >=2){
                    count++;
                }
            }
            if(count>1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
