class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int gap = 0;
        //최소값을 무조건 한번 바꿀수 있게 정수 최대 값으로 초기화를 함
        int smallestNum = Integer.MAX_VALUE;
        
        for(int i = 0; i < array.length; i++){
            gap = Math.abs(array[i] - n);
            
            if(gap < smallestNum){
                smallestNum = gap;
                answer = array[i]; 
            }
            
            //n기준 gap이 같은 n-x, n+x를 생각할때 여기서의 더 작은 수를 return 하기 위해. 만약 들어온 array[i]가 answer보다 크면 최소값을 넣어줄 필요가 없기 때문에 이 조건문이 시행도 안되고 필요도 없게 되기 때문.
            else if((gap == smallestNum) && (array[i] < answer)){
                answer = array[i];
            }
        }
        
        return answer;
    }
}