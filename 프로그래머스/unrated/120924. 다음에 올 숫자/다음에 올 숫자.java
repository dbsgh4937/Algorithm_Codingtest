class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int minus_seq = 0;
        int multi_seq = 0;
        
        //등차수열
        if((common[2] - common[1]) == (common[1] - common[0])){
            minus_seq = common[1] - common[0];
            answer = (common.length * minus_seq) + common[0];           
        }
        
        //등비수열
        if(((double)common[2] / common[1]) == ((double)common[1] / common[0])){
            multi_seq = common[2] / common[1];
            answer = common[(common.length - 1)] * multi_seq;
        }
        
        return answer;
    }
}