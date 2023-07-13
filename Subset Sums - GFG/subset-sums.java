//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
      ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        subset(0,arr,list,ans);
        Collections.sort(ans);
        return ans;
    }
    private void subset(int ind,ArrayList<Integer> arr, ArrayList<Integer> list,ArrayList<Integer> ans) {
        if(ind== arr.size()){
            int sum = 0;
            for (int num: list){
                sum += num;
            }
            ans.add(sum);
            return;
        }
        list.add(arr.get(ind));
        subset(ind+1,arr,list,ans);
        list.remove(list.size()-1);
        subset(ind+1,arr,list,ans);
    }
}
