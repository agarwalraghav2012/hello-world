class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length() ;
        int l = 0, r =0 ;
        HashSet<Character> h = new HashSet<Character>() ;
        int len = 0;
        while(l<=r && (l<n && r<n)) {
            if(h.contains(s.charAt(r))==false) {
                len = Math.max(len, r-l+1);
                h.add(s.charAt(r)) ;
                r++ ;
            }
            else {
                h.remove(s.charAt(l)) ;
                l++ ;
            }
        }
        return len ;
    }
}
