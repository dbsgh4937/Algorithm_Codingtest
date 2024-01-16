class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        //wordValueA = hello
        String wordValueA = A;   //A를 기본 단어로 하나 string으로 선언해서 비교할 수 있게끔

        //한 칸씩 늘리면서 A와 B의 일치를 판단
        for(int i = 0; i < A.length(); i++){
            if (wordValueA.equals(B)) { //hello == hello이면
                return answer;          //그대로 출력
            }
            
            //compareA(=o)
            String compareA = wordValueA.substring(A.length() - 1);
            //wordValueA(o + hello)
            wordValueA = compareA + wordValueA.substring(0, A.length() - 1);
            answer++;
        }


            return -1;
    }
}