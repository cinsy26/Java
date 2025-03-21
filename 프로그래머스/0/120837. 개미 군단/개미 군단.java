class Solution {
    public int solution(int hp) {
        int l = hp/5;
        int m = (hp%5)/3;
        int s = (hp%5)%3;
    
        return l+m+s;
    }
}