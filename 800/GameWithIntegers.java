https://codeforces.com/problemset/problem/1899/A

//logic is simple if number is already divisible by 3 then it will not be possible to get another number divisible by 3 under 10 trials since the other person will always chnage it


import java.util.*;

public class GameWithIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            Answer ans = new Answer();
            System.out.println(ans.fun(n));
        }

    }
}

class Answer{
    public String fun(int n){
        if(n % 3 == 0){
            return "Second";
        }
        return "First";
    }
}
