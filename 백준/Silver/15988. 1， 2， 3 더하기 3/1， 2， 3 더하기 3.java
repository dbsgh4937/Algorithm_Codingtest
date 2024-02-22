import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int T = Integer.parseInt(bufferedReader.readLine());
        //n은 1~10까지의 10개, 0을 제외하고 dp[1]부터 dp[10]까지의 index를 필요로 한다.
        //1은 1이런식으로 매칭해야 하기 때문에 10 + 1개 필요
        long[] dp = new long[1000001];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i < 1000001; i++) {
            dp[i] = (dp[i - 3] + dp[i - 2] + dp[i - 1]) % 1000000009;
        }

        for (int i = 0; i < T; i++) {
            int count = Integer.parseInt(bufferedReader.readLine());
            stringBuilder.append(dp[count]).append("\n");
        }

        System.out.println(stringBuilder);

        bufferedReader.close();
    }
}

/*
[사용한 알고리즘 : DP]

[테이블] : 정수 n을 1,2,3의 합으로 나타내는 방법(경우의 수)를 구하자(단, n은 양수이며 1,000,000보다 작다, n : 1~1,000,000 중 하나의 수)

[점화식 찾기] :
직접 5번정도 계산을 했을 때 아래와 같이 도출(0:1, 1:1, 2:2, 3:4, 4:7, 5:13)
점화식 : dp[i] = dp[i-3] + dp[i-2] + dp[i-1], 그리고 0,1은 1이다.

위를 계속 loop

[상향식(반복문) 방법을 사용할 예정]   *하향식은 재귀함수 이용

[DP를 사용해서 푸는데 횟수를 직접 해보며 규칙을 찾아 점화식으로 표현한다, 1,2,3은 하나의 수로도 표현가능한거를 놓치지 말자]
*/

