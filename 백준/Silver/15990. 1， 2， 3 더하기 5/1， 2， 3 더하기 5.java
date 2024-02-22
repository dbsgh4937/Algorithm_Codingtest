import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int T = Integer.parseInt(bufferedReader.readLine());
        //n은 1~100000까지의 100000개, 0을 제외하고 dp[1]부터 dp[10]까지의 index를 필요로 한다.
        //1은 1 이런식으로 매칭해야 하기 때문에 100000 + 1개 필요
        //1,2,3에 대해서만 파악하면 되기 때문에 사용 숫자는 '1','2','3'이기 때문에 3 + 1개 필요
        long[][] dp = new long[100001][4];
        dp[1][1] = 1;   //1
        dp[2][2] = 1;   //2
        dp[3][1] = 1;   //2+'1'
        dp[3][2] = 1;   //1+'2'
        dp[3][3] = 1;   //3

        for (int i = 4; i < 100001; i++) {
            dp[i][1] = (dp[i - 1][2] + dp[i - 1][3]) % 1000000009;
            dp[i][2] = (dp[i - 2][1] + dp[i - 2][3]) % 1000000009;
            dp[i][3] = (dp[i - 3][1] + dp[i - 3][2]) % 1000000009;
        }

        for (int i = 0; i < T; i++) {
            int count = Integer.parseInt(bufferedReader.readLine());
            stringBuilder.append((dp[count][1] + dp[count][2] + dp[count][3]) % 1000000009).append("\n");
        }

        System.out.println(stringBuilder);

        bufferedReader.close();
    }
}

/*
[사용한 알고리즘 : DP]

[테이블] : 정수 n을 1,2,3의 합으로 나타내는 방법(경우의 수)를 구하자(단, n은 양수이며 100,000보다 작다, n : 1~100,000 중 하나의 수, 같은 수를 두 번 이상 연속해서 사용하면 안된다.)

[점화식 찾기] :
직접 7번정도 계산을 했을 때 아래와 같이 도출(0:1, 1:1, 2:1, 3:3, 4:3, 5:4, 6:8, 7:9)
위의 결과를 통한 점화식을 찾지 못해서 주어진 n을 만들기 위해 마지막 경우의 수가 1, 2, 3으로 끝나는 것들로 세분화하여
두 번이상 연속사용하지 못하게 한다.
2차원 배열 DP방법을 이용해 점화식을 구할 것이다

1) n을 만드는 수식 중 마지막 수가 1로 끝나게 되면 1을 마지막에 더할 예정이기 때문에 [n-1]로 보고 1을 한번 더 사용하면
중복이 되기 때문에 2와 3으로 끝나는 것만 생각하면 된다
점화식 : dp[n][1] = dp[n-1][2] + dp[n-1][3]

2) n을 만드는 수식 중 마지막 수가 2로 끝나게 되면 2를 마지막에 더할 예정이기 때문에 [n-2]로 보고 2를 한번 더 사용하면
중복이 되기 때문에 1과 3으로 끝나는 것만 생각하면 된다
점화식 : dp[n][2] = dp[n-2][1] + dp[n-2][3]

3) n을 만드는 수식 중 마지막 수가 3으로 끝나게 되면 3을 마지막에 더할 예정이기 때문에 [n-3]로 보고 3을 한번 더 사용하면
중복이 되기 때문에 1과 2로 끝나는 것만 생각하면 된다
점화식 : dp[n][3] = dp[n-3][1] + dp[n-3][2]

최종 점화식 :
dp[n][1] = dp[n-1][2] + dp[n-1][3]
dp[n][2] = dp[n-2][1] + dp[n-2][3]
dp[n][3] = dp[n-3][1] + dp[n-3][2]

위를 계속 loop

[상향식(반복문) 방법을 사용할 예정]   *하향식은 재귀함수 이용

[DP를 사용해서 푸는데 횟수를 직접 해보며 규칙을 찾아 점화식으로 표현한다,
같은 수 두 번이상 연속하면 안되는 규칙이 생겼기 때문에 정상적인 방법으로 수 들의 관계르르 파악하기 힘들다
때문에 2차원 배열로 1,2,3이 중복되지 않게 마지막 수만 파악을 하고 DP로 풀면 된다
경우의 수만으로 점화식 도출이 어려워서 2차원 배열을 생각하지 못했지만
단순히 1,2,3을 마지막에 더해 중복되는 수가 없는 경우의 수만 비교한다는 알고리즘을 이해하니 기본문제가 되었다]
*/