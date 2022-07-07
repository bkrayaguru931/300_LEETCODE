//496. Next Greater Element I


class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
int []ngr=new int[nums2.length];
        
        Stack<Integer>st=new Stack<>();
        
        for(int i=nums2.length-1;i>=0;i--){
            while(st.size()>0&&st.peek()<=nums2[i]) st.pop();
            ngr[i]=st.size()==0?-1:st.peek();
            st.push(nums2[i]);     
        }
        
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        for(int i=0;i<nums2.length;i++){
            hm.put(nums2[i],ngr[i]);
        }
        
        int []ans=new int[nums1.length];
        
        for(int i=0;i<nums1.length;i++){
            ans[i]=hm.get(nums1[i]);
        }
        
        return ans;
        }
        }
