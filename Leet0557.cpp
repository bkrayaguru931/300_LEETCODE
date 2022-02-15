  //557. Reverse Words in a String III
  
  int l , r = 0;
        while(l<s.length()){
            while(r<s.length() && s.charAt(r)!=' ')
                r++; 
            
            reverse(s.begin()+l,s.begin()+r);
            l=r+1;
            r=l;
        }
        returnn s;
