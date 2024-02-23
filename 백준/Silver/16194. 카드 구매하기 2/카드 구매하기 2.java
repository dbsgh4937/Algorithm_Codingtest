import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //민규가 가지고 싶은 카드의 갯수
        int N = Integer.parseInt(bufferedReader.readLine());
        //입력되는 갯수별 가격 즉, 카드팩의 데이터를 넣기 위해 배열을 선언
        int[] arr = new int[1001];
        arr[0] = 0;

        //실질적인 dp알고리즘을 사용하기 위한 배열을 선언
        int[] dp = new int[1001];
        dp[0] = 0;

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        //카드팩들의 값 저장
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int i = 1; i <= N; i++) {

            dp[i] = arr[i];

            for (int j = 1; j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j] + arr[j]);
            }
        }

        System.out.println(dp[N]);

        bufferedReader.close();
    }
}

/*
[사용한 알고리즘 : DP]

[테이블] : N개의 카드에 대한 각각의 카드 비용을 생각해 가능한 경우의 수 중 총합 금액의 최솟값을 출력한다

[점화식 찾기] : 1,2,3,4개의 카드가 들어간 카드팩이라고 하면 마지막에 하나씩 그 값에 대한 갯수만 더해주면 되기때문에 1,2,3,4 생각
arr[1] = 1, arr[2] = 5, arr[3] = 6, arr[4] = 7

dp[1] = dp[0] + arr[1] = 0 + 1 = 1

dp[2] = dp[1] + arr[1] = 1 + 1 = 2
dp[2] = dp[0] + arr[2] = 0 + 5 = 5

dp[3] = dp[2] + arr[1] = 2(최솟값) + 1 = 3
dp[3] = dp[1] + arr[2] = 1 + 5 = 6
dp[3] = dp[0] + arr[3] = 0 + 6 = 6

dp[4] = dp[3] + arr[1] = 3(최솟값) + 1 = 4
dp[4] = dp[2] + arr[2] = 2(최솟값) + 5 = 7
dp[4] = dp[1] + arr[3] = 1 + 6 = 7
dp[4] = dp[0] + arr[4] = 0 + 7 = 7

dp[i] = dp[i-j] + arr[j]
점화식은 이렇게 나오고 진행되는 과정 중 작은 값도 나올 수 있는 경우의 수가 있는데 계속해서 작은 값으로 갱신을 해야하기 때문에 Math.max를 사용해야 한다.

최종 점화식 :
dp[i] = Math.min(dp[i], dp[i-j] + arr[j])

위를 계속 loop

[상향식(반복문) 방법을 사용할 예정]   *하향식은 재귀함수 이용

[카드 구매하기 1과는 다르게 Math.min으로만 바꿔봤는데 dp[]가 초기화가 당연히 안되있어 0으로 출력되기도 하였다
dp[]배열을 초기화 해주는 방식으로 추가한다
1,2,3,4를 다른 배열로 생성해서 나중에 더해지는 걸로(뒤에서 부터 하나씩) 진행을 하는 방식으로 구현해야 한다.]

*/