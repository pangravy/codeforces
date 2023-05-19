import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class codeforces14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0){
            Set<String> set = new HashSet<>();
            long n = input.nextLong();
            String str = input.next();

            for (int i = 0; i < str.length() - 1; i++) {
                String pair = str.substring(i, i + 2);
                set.add(pair);
            }
            System.out.println(set.size());
        }
    }
}
