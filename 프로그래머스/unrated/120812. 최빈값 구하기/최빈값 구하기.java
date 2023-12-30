class Solution {
    public int solution(int[] array) {
        int[] index_count = new int[1000];
        int answer = 0;
        
        //count배열의 index 숫자로 나올 수 있게끔 ++해줘서 count
        for(int i = 0; i < array.length; i++){
            index_count[array[i]]++;
        }
        
        int max = Integer.MIN_VALUE;
        
        for(int j = 0; j < index_count.length; j++){
            if(max < index_count[j]){
                max = index_count[j];
                answer = j;
            }
            else if(max == index_count[j]){
                answer = -1;
            }
        }
        
        return answer;
    }
}