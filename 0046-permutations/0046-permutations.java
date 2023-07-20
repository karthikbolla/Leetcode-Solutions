class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        boolean mark[]=new boolean[nums.length];
        permutation(list,mark,ans,nums);
        return ans;
    }
    private void permutation(ArrayList<Integer> list, boolean[] mark, List<List<Integer>> ans, int[] arr) {
        if(list.size()==arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!mark[i]){
                mark[i]=true;
                list.add(arr[i]);
                permutation(list,mark,ans,arr);
                mark[i]=false;
                list.remove(list.size()-1);
            }
        }
    }
}