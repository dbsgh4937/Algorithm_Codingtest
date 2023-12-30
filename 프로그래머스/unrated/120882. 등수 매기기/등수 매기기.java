class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avg = new double[score.length];
        
        for(int i = 0; i < score.length; i++){
            avg[i] = score[i][0] + score[i][1];
        }
        
        for(int j = 0; j < avg.length; j++){
            int count = 1;
            
            for(int k = 0; k < avg.length; k++){
                if(avg[j] < avg[k]){
                    count++;
                }
                answer[j] = count;
            }
        }
        
        
        return answer;
    }
}