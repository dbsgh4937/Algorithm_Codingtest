class Solution {
    public int solution(int a, int b) {

        //분모의 값을 통해 유한/무한소수를 비교하기 위해
        int maxSameValue = b / GCD(a, b);   //7

        while (maxSameValue != 1) {
            if (maxSameValue % 2 == 0) {
                maxSameValue /= 2;
            }
            else if (maxSameValue % 5 == 0) {
                maxSameValue /= 5;
            }
            else {
                return 2;
            }
        }
        return 1;
    }

    //유클리드 호제법을 이용해서 최대공약수 구하기
    private int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        else {
            return GCD(b, a % b);
        }
    }
}