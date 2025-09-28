import java.util.*;

//inititally I did not get, chatgpt gave me logic that
//evertime this ti work "1" should be on 0th index of every array otherwise there is no way we can put it there, so if it there then array is sortable or no

public class JaggedSwaps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = sc.nextInt();
        }
        Answer ans = new Answer();
        System.out.println(ans.fun(arr, n));
    }
    }
    

}

class Answer{
    public String fun(int arr[], int n){
        if(arr[0] == 1){
            return "YES";
        }
        return "NO";
    }

}
