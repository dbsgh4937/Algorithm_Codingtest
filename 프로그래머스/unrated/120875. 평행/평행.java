class Solution {
    public int solution(int[][] dots) {
        int x1 = dots[0][0];
        int x2 = dots[1][0];
        int x3 = dots[2][0];
        int x4 = dots[3][0];
        
        int y1 = dots[0][1];
        int y2 = dots[1][1];
        int y3 = dots[2][1];
        int y4 = dots[3][1];
        
        int answer = 0;
        
        // 1-2와 3-4를 잇는 직선의 기울기가 같은 경우
        if ((y2 - y1) * (x4 - x3) == (y4 - y3) * (x2 - x1)) {
            answer = 1;
        }
        
        // 1-3와 2-4를 잇는 직선의 기울기가 같은 경우
        if ((y3 - y1) * (x4 - x2) == (y4 - y2) * (x3 - x1)) {
            answer = 1;
        }
        
        // 1-4와 2-3를 잇는 직선의 기울기가 같은 경우
        if ((y4 - y1) * (x3 - x2) == (y3 - y2) * (x4 - x1)) {
            answer = 1;
        } 
        
        return answer;
    }
}