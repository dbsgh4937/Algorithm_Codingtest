class Solution {
    public int[] solution(int n, int[] numlist) {
        int count = 0;
        int i;
        
        //n의 배수만큼을 수용할 배열을 만들기 위해 n의 배수 갯수 파악
        for(i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                count++;
            }
        }
        
        //n의 배수 갯수만큼의 길이를 가진 배열을 만든다
        int[] answer = new int[count];
        int j;
        int k = 0;
        
        for(j = 0; j < numlist.length; j++){
            if(numlist[j] % n == 0){
                answer[k] = numlist[j];
                k++;
            }
        }
        
        return answer;
    }
}