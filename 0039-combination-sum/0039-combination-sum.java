class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>() ;
        ArrayList<Integer> list=new ArrayList<>();
        combination(0,target,candidates,list,ans);
        return ans;
        }
    private void combination(int ind,int target,int arr[],ArrayList<Integer> list,List<List<Integer>> ans){
        if(ind == arr.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[ind]<=target){
            list.add(arr[ind]);
            combination(ind,target-arr[ind],arr,list,ans);
            list.remove(list.size()-1);
        }
        combination(ind+1,target,arr,list,ans);
    }
}