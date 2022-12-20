



class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
         int surplus(0), dificient(0), start(0);
        for(int i=0;i<gas.size();i++){
            surplus+=gas[i]-cost[i];
            if(surplus<0){
                start=i+1;
                dificient+=surplus;
                surplus=0;
            }
        }
        if (surplus+dificient>=0)
        return start;
        else 
        return -1;
    }
};
