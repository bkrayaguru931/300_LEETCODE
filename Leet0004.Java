//4. Median of Two Sorted Arrays




class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len=nums1.length+nums2.length;
int fin[]=new int[len];int inc=0;
for(int i=0;i<len;i++){
if(i<nums1.length){
fin[i]=nums1[i];
}else{
fin[i]=nums2[inc++];
}
}
Arrays.sort(fin);
return len%2!=0?fin[len/2]:(fin[len/2]+fin[len/2-1])/2.0;
    }
}
