//https://codeforces.com/problemset/problem/1900/A

//pretty simple logic if anywhere in the whole string we have three consecutive "..." it means middle can be emptied infinete number of time and according to the question
//condition it will get filled automatically so jsut we need to fill two other wise just count every groups of "."


import java.util.*;

public class CoverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for(int i=0;i<t;i++){
                int n = sc.nextInt();
                String str = sc.next();

                System.out.println(Answer.fun(str,n));

            }
    }
}

class Answer{
    public static int fun(String str, int n){
        int ans = 0;
        
        int i=0;
        while(i<n){
            while(i<n && str.charAt(i) == '#'){
                i++;
            }
            int count = 0;
            while(i<n && str.charAt(i) == '.'){
                count++;
                i++;
            }
            if(count >=3){
                return 2;
            }
            else{
                ans+=count;
            }
        }
        return ans;
    }
}
