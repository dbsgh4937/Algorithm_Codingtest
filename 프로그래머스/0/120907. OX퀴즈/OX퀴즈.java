class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] checkString = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {

            //띄어쓰기 기준으로 잘라서 숫자와 기호 넣기
            checkString = quiz[i].split(" ");

            if(checkString[1].equals("+")) {
                if((Integer.parseInt(checkString[0]) + Integer.parseInt(checkString[2])) == Integer.parseInt(checkString[4])){
                    answer[i] = "O";
                }
                else{
                    answer[i] = "X";
                }
            }

            if(checkString[1].equals("-")) {
                if((Integer.parseInt(checkString[0]) - Integer.parseInt(checkString[2])) == Integer.parseInt(checkString[4])){
                    answer[i] = "O";
                }
                else{
                    answer[i] = "X";
                }
            }
        }

        return answer;
    }
}