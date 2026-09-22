class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
                ans.add(-1);

                Stack<Integer> st = new Stack<>();
                st.push(arr[arr.length-1]);

                for(int i=arr.length-2; i>=0; i--){
                    while(!st.empty() && st.peek()>=arr[i]){
                        st.pop();
                    }

                    if(st.isEmpty()){
                        ans.add(-1);
                    }else{
                        ans.add(st.peek());
                    }
                    st.push(arr[i]);
                }
                Collections.reverse(ans);
                return ans;
    }
}