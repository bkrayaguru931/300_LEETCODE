//11. Container With Most Water


class Solution {
    public int maxArea(int[] height) {
      int n=height.length;
    int i=0,j=height.length-1;
    int a=0;
    while(i<j)
    {
            int temp=(Math.min(height[i],height[j])*(j-i));
            a=Math.max(a,temp);
    if(height[i]<height[j]){
            i+=1;
        }
        else{
            j-=1;
        }            
    }
    return a;  
    }
}
