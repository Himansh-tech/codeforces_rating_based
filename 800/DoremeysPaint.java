import java.util.*;
//simple observation
//if it has more than two type of number(in array) and their count has difference of more than 1 then no otherwise yes
public class DoreymsPaint {
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
        HashMap<Integer, Integer> numCount = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }
        
        if(numCount.size()<=1){
            return "Yes";
        }
        if(numCount.size()<=2){
             Iterator<Integer> it = numCount.keySet().iterator();
            int firstCount = numCount.get(it.next());
            int secondCount = numCount.get(it.next());
            if(Math.abs(firstCount - secondCount) <= 1){
                return "Yes";
            }
            
        }
        return "No";
    }
}
