//739. Daily Temperatures
class Solution {
public:                   
    vector<int> dailyTemperatures(vector<int>& T) {
    int n = T.size();
	stack<int> s;
	vector<int> ans(n, 0);
	for (int i = 0; i < n; ++i) {
		while (!s.empty() and T[s.top()] < T[i]) {
			int j = s.top(); 
            s.pop();
			ans[j] = i - j;
		}
		s.push(i);
	}
	return ans;
        // int n = T.size();
        // vector<int> res(n, 0);
        // stack<pair<int,int>> s; 
		
        // for(int i = 0; i < n; ++i) {
        //     while(!s.empty() && T[i] > s.top().first) {
        //         auto p = s.top();
        //         res[p.second] = i - p.second;
        //         s.pop();
        //     }
        //     s.push(make_pair(T[i], i));
        // }
        // return res;
    }
};
