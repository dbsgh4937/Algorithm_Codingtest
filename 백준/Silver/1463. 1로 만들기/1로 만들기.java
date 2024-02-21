import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        //0~N을 넣어야하기 때문에 N+1로 선언
        int[] dp = new int[N + 1];
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= N; i++) {
            //1을 빼는 경우
            dp[i] = dp[i - 1] + 1;

            //2로 나눌 수 있는 경우
            if (i % 2 == 0) {
                //-1 계산과 2로 나눈 계산의 최소 횟수를 파악해서 dp[i]에 다시 넣기 
                dp[i] = Math.min(dp[i], (dp[i / 2] + 1));   
            }

            //3로 나눌 수 있는 경우
            if (i % 3 == 0) {
                //-1 계산과 3로 나눈 계산의 최소 횟수를 파악해서 dp[i]에 다시 넣기
                dp[i] = Math.min(dp[i], (dp[i / 3] + 1));
            }
        }

        System.out.println(dp[N]);

        bufferedReader.close();
    }
}

/*
[테이블] : 정수X의 최소 연산 횟수 i

[점화식 찾기] :
1. dp[i] = dp[i-1] + 1  :   1을 빼는경우, 이전 숫자의 최소 연산 횟수를 가져오고 여기다가 1을 뺀 경우를 더해 '+1'을 더한다
2. dp[i] = dp[i/2] + 1  :   2을 나누는 경우, 이전 숫자의 최소 연산 횟수를 가져오고 여기다가 2로 나눈 경우를 더해 '+1'을 더한다
3. dp[i] = dp[i/3] + 1  :   3을 나누는 경우, 이전 숫자의 최소 연산 횟수를 가져오고 여기다가 3로 나눈 경우를 더해 '+1'을 더한다
위를 계속 loop

[상향식(반복문) 방법을 사용할 예정]   *하향식은 재귀함수 이용

[DP를 사용해서 푸는데 각각의 커지는 '큰 숫자'들은(큰문제) '작은 숫자들의 최적의 값'(작은 문제)을 가져다가 써서 구현한다]
[ex) 10을 생각시 9로 일단 만들고 if문에서 해당 값이 없으니 루프 다시 돌고 9는 3으로 나눠지므로 3의 최소 횟수를 넣고 쭉~] 
*/