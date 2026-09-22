class Solution {
    public ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(-1);

        Stack<Integer>st = new Stack<>();

        st.push(arr[0]);


        for(int i=1; i<arr.length; i++){
            while(!st.empty() && st.peek()<=arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                ans.add(-1);
            }else{
                ans.add(st.peek());
            }
            st.push(arr[i]);
        }

        return ans;
    }
}