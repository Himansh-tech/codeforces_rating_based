import java.util.*;
public class DontTryToCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();

            String str = sc.next();
            String ans = sc.next();

            System.out.println(Answer.fun(str,ans, n, m));
        }
    }
}
//to check is one string exist in another string when we can increase size of one string, there should be some
//upper bound till which we will check 

//if n>m and still it will exist that is str will be there in ans then ans will always be 1
class Answer{
    public static int fun(String str, String ans, int n, int m){

        if(n<m){

        StringBuilder sb = new StringBuilder(str);
        int count=0;
        while(str.length() <= 2*m){
            sb.append(str);
            str = sb.toString();
            count++;
            if(sb.toString().contains(ans)){
            return count;
        }
        }
        
        return -1;
    }

    else if(n>m){
        if(str.contains(ans)){
            return 0;
        }
        else{
        StringBuilder sb = new StringBuilder(str);
        sb.append(str);

        if(sb.toString().contains(ans)){
            return 1;
        }
        return -1;
    }
    }
    else{
        StringBuilder sb = new StringBuilder(str);
        if(sb.toString().contains(ans)){
            return 0;
        }
        sb.append(str);
        if(sb.toString().contains(ans)){
            return 1;
        }
        return -1;

    }
    }
}

//above is meesy code with useless same checks done in differnt conditions

//below is code by gpt(thing to note that we have to put safe upper bound till which we will check, because sometimes certain string can appear in the original after repating several time even though both have almost same length)

class Answer {
    public static int fun(String str, String ans, int n, int m) {
        // 0 append check
        if (str.contains(ans)) return 0;

        StringBuilder sb = new StringBuilder(str);
        int count = 0;

        // continue appending until a reasonable upper limit
        while (sb.length() <= 2 * m + n) {  // safe upper bound
            sb.append(str);
            count++;
            if (sb.toString().contains(ans)) {
                return count;
            }
        }

        return -1;
    }
}
