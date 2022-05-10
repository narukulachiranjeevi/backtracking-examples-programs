class Solution {
    void rec(int index,int k,int target,List<Integer> stack,List<List<Integer>> ans){
        if(target==0 && stack.size()==k){
            ans.add(new ArrayList(stack));
            return;
        }
        if(target<0) return ;
        for(int i=index;i<=9;i++){
            stack.add(i);
            rec(i+1,k,target-i,stack,ans);
            stack.remove(stack.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        rec(1,k,n,new ArrayList<>(),ans);
        return ans;
    }
}
