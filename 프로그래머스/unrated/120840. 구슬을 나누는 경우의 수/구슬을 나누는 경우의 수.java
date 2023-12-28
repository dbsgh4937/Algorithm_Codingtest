class Solution {
    public int solution(int balls, int share) {
        return f_Combination(balls, share);
    }
    
    //ex) n = 3, m = 2일때
    private int f_Combination(int n, int m){
        if(m == 0 || n == m){
            return 1;
        }
        else{
            return (f_Combination(n - 1, m - 1) + f_Combination(n - 1, m));    
        }
    }
}