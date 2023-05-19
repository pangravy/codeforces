import java.util.*;
public class codeforces16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            List<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(input.nextInt());
            }
            boolean flg = false;
            for (int i = 0; i < n - 1; i++) {
                if (a.get(i) % 2 != a.get(i + 1) % 2) {
                    flg = true;
                    break;
                }
            }
            if (!flg) {
                System.out.println("YES");
            } else {
                int te = Collections.min(a);
                if (te % 2 == 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        input.close();
    }
    }

