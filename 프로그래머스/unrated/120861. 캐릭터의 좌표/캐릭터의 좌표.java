class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int width = board[0] / 2;   //가로 board의 길이(+,- 표현)
        int height = board[1] / 2;  //세로 board의 길이(+,- 표현)
        
        int i;
        for(i = 0; i < keyinput.length; i++){
            if(keyinput[i].equals("left")){
                answer[0] -= 1;
            }
            else if(keyinput[i].equals("right")){
                answer[0] += 1;
            }
            else if(keyinput[i].equals("up")){
                answer[1] += 1;
            }
            else if(keyinput[i].equals("down")){
                answer[1] -= 1;
            }    
            
            answer[0] = Math.max(-width, Math.min(answer[0], width));
            answer[1] = Math.max(-height, Math.min(answer[1], height));
        }
        
        return answer;
    }
}