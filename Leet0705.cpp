

705. Design HashSet
 class MyHashSet {
public:
    vector<int> ans;
    int size;
    MyHashSet() {
        size = 1e6+1;
        ans.resize(size);
        
    }
    
    void add(int key) {
        ans[key] = 1;
    }
    
    void remove(int key) {
        ans[key] = 0;
    }
    
    bool contains(int key) {
        return ans[key];
    }
};
