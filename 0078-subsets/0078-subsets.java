class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         ArrayList<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        subsequence(list,0,nums,ans);
        ans.sort(Comparator.comparing(List::size));
        return ans;
    }
    public  void subsequence(ArrayList<Integer> list, int i, int[] arr, List<List<Integer>> ans) {
        if (i >= arr.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
            list.add(arr[i]);
            subsequence(list, i + 1, arr, ans);
            list.remove(Integer.valueOf(arr[i]));
            subsequence(list, i + 1, arr, ans);
    }
}