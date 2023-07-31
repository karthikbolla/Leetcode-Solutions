class Solution {
    public String getPermutation(int n, int k) {
        int fact = 1;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            fact *= i;
            list.add(i);
        }
        String ans = "";
        k -= 1;
        int chunk = fact / n;
        while (true) {
            ans += list.get(k / chunk);
            list.remove(k / chunk);
            if (list.size() == 0) break;
            k %= chunk;
            chunk = chunk / list.size();
        }
        return ans;
    }
}