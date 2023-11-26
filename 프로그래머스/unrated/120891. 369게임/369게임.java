class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String arr = Integer.toString(order);   //order값을 String타입으로 변경
        String[] array = arr.split("");         //arr를 split한다
        
        int i;
        for(i = 0; i < array.length; i++){
            if(array[i].equals("3") || array[i].equals("6") || array[i].equals("9")){
                answer++;
            }
        }
        
        return answer;
    }
}