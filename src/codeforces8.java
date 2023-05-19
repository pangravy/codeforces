import java.util.Scanner;
public class codeforces8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0){
            int n = input.nextInt();
            int m = input.nextInt();
            int []arr = new int[n];
            int []seat = new int[m+1];
            int one = 0;
            int two = 0;
            int count = -0;
            for(int i = 0 ; i < n ; i++){
                arr[i] = input.nextInt();
                if(arr[i]==-1){
                    one++;
                }
                else if(arr[i]==-2){
                    two++;
                }
                else{
                    if(seat[arr[i]]==0){
                        count++;
                    }
                    seat[arr[i]]=1;
                }
            }
            int ans = 0;
            int prefix[] = new int[m+1];
            int suffix[] = new int[m+1];
            prefix[1] = seat[1];
            for(int i = 2; i <= m;i++){
                prefix[i] += prefix[i-1] + seat[i];
            }
            suffix[m] = seat[m];
            for(int i = m-1; i>=1 ; i--){
                suffix[i] += suffix[i+1] + seat[i];
            }
            int ans1 = Math.min(m,one + count);
            int ans2 = Math.min(m,two + count);
            ans = Math.max(ans1,ans2);
            for(int i = 1; i < m ; i++){
                if(seat[i]==1){
                    int answer = 1 + Math.min(i-1,prefix[i-1]+one) +Math.min(m-i,suffix[i+1]+two);
                    ans = Math.max(ans,answer);
                }
            }
            System.out.println(ans);
        }
    }
}
