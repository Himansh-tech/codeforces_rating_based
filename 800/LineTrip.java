//https://codeforces.com/problemset/problem/1901/A

import java.util.*;



public class lineTrip {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int x = sc.nextInt();

           

            int arr[] = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = sc.nextInt();
            }
            
            int last = 2 * (x-arr[n-1]);
            answer fin = new answer();
            System.out.println(Math.max(Math.max(last,fin.fun(arr,n)),arr[0]));
        }
        

    }
}
class answer{
    public int fun(int arr[], int n){
        int ans = Integer.MIN_VALUE;
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return arr[0];
        }
        for(int i=n-1;i>0;i--){
            ans = Math.max(ans, arr[i]-arr[i-1]);
        }
        return ans;
    }
}
