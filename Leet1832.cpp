//1832. Check if the Sentence Is Pangram


class Solution {
public:
    bool checkIfPangram(string sentence) {
        unordered_set<char> set(sentence.begin(), sentence.end());
        return set.size() == 26;
    }
};
