import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        //dp[0]~dp[n]까지 구현해야하기 때문에 n+1의 크기 필요, int시 n이 100도 안되서 오버플로우 발생
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1]) % 10007;
        }

        System.out.println(dp[n]);

        bufferedReader.close();
    }
}

/*
[사용한 알고리즘 : DP]

[테이블] : 2xn 크기의 직사각형에서 1x2, 2x1로 '타일을 채우는 방법의 수'

[점화식 찾기] :
직접 5번정도 계산을 했을 때 아래와 같이 도출
점화식 : dp[i] = dp[i-2] + dp[i-1], 그리고 0,1은 1이다.

위를 계속 loop

[상향식(반복문) 방법을 사용할 예정]   *하향식은 재귀함수 이용

[DP를 사용해서 푸는데 횟수를 직접 해보며 규칙을 찾아 점화식으로 표현한다]
*/

