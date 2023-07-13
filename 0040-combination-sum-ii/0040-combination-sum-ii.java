class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        combination(0,target,list,candidates,ans);
        return ans;
    }
    private void combination(int ind, int target, ArrayList<Integer> list, int[] arr, List<List<Integer>> ans) {
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(arr[i]>target) break;
            if(i>ind && arr[i]==arr[i-1]) continue;
            list.add(arr[i]);
            combination(i+1,target-arr[i],list,arr,ans);
            list.remove(list.size()-1);
        }
    }
}