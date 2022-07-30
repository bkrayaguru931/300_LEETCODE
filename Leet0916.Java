//916. Word Subsets


class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] hash = new int[26];
        List<String> res = new ArrayList<>();

        for(int i=0;i<words2.length;i++){
            int[] tempHash = new int[26];
            for(int j=0;j<words2[i].length();j++){
                char currentChar = words2[i].charAt(j);
                tempHash[currentChar-'a']++;
            }
            
            for(int p=0;p<26;p++){
                hash[p] =  Math.max(hash[p], tempHash[p]);
            }
        }


        for(int i=0;i<words1.length;i++){
            int[] hashCopy = Arrays.copyOf(hash, hash.length);
            boolean flag = false;
            for(int j=0;j<words1[i].length();j++){
                char currentChar = words1[i].charAt(j);
                if(hashCopy[currentChar-'a']>0){
                    hashCopy[currentChar-'a']--;
                }
            }

            for(int k=0;k<26;k++){
                if(hashCopy[k]!=0){
                    flag = true;
                    break;
                }
            }

            if(!flag){
                res.add(words1[i]);
            }
        }


        return res;
    }
}
