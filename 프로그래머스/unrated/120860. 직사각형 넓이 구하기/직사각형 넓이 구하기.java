class Solution {
    public int solution(int[][] dots) {
        //dots 배열의 길이는 4, 원소의 길이는 2
        
        int answer = 0;
        int maxX = dots[0][0];
        int maxY = dots[0][1];
        
        int minX = dots[0][0];
        int minY = dots[0][1];
        
        int i;
        for(i = 0; i < dots.length; i++){
            maxX = Math.max(maxX, dots[i][0]);
            maxY = Math.max(maxY, dots[i][1]);
            
            minX = Math.min(minX, dots[i][0]);
            minY = Math.min(minY, dots[i][1]);
        }
        
        answer = (maxX - minX) * (maxY - minY);
        return answer;
    }
    
}
        
                
        
    