class Solution {
    public int solution(int num, int k) {
        
        String arr = Integer.toString(num);
        String[] num_arr = arr.split("");
        
        int answer = -1;
        int i;
        
        for(i = 0; i < num_arr.length; i++){
            if(num_arr[i].equals(Integer.toString(k))){    
                answer = i + 1;
                break;
            }
        }
        
        return answer;
    }
}