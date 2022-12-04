//149. Max Points on a Line




class Solution {
public:
    int maxPoints(vector<vector<int>>& points) {
         int mx=INT_MIN;
        int sz=points.size();
        if(sz<=2) return sz;
        for(int i=0;i<sz;i++)
        {
            unordered_map<double,int> mp;
            double x1=points[i][0];
            double y1=points[i][1];
            int tempmx=INT_MIN;
            for(int j=0;j<points.size();j++)
            {
                double slope=(points[j][1]-y1)/(points[j][0]-x1);
                mp[slope]++;
                tempmx=max(tempmx,mp[slope]);
            }
            mx=max(tempmx,mx);
            
        }
        
        return mx+1;
    }
};
