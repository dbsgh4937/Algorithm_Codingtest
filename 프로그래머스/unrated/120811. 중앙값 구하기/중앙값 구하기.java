import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Arrays.sort(array); //오름차순 정렬
        
        return array[((array.length - 1) / 2)];
    }
}