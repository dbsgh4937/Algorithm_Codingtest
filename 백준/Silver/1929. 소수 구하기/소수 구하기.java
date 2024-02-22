import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int M = Integer.parseInt(stringTokenizer.nextToken());
        int N = Integer.parseInt(stringTokenizer.nextToken());

        //N까지의 숫자를 만들어야 되기 때문에 N+1로 선언
        //'에라토스테네스의 체' 알고리즘을 사용해서 저장할 배열 선언
        //true -> 소수, false -> 소수X
        boolean[] prime = new boolean[N + 1];

        //배열의 전체를 true로 설정(0,1은 어차피 소수가 아님)
        for (int i = 2; i <= N; i++) {
            prime[i] = true;
        }

        //'에라토스테네스의 체' 알고리즘을 사용해서 해당되는 것들은 false로 만들어 버린다(소수가 아니니까)
        //알고리즘의 특성으로 2~루트n까지를 반복해서 n을 제외한 n의 배수들을 제외할 것이다
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            //false(소수가 아닌 수로 이미 설정된 값)가 되면 소수가 아니니까 넘어간다
            if (prime[i]){
                //중복 제거를 하기 위해 i*i부터 최종 길이 까지 비교를 하는데 이때 다루는 수인 i의 배수를 제거한다.(=false로 설정)
                for (int j = i * i; j < prime.length; j += i) {
                    prime[j] = false;
                }
            }
        }

        for (int i = M; i <= N; i++) {
            if (prime[i]) {
                stringBuilder.append(i).append("\n");
            }
        }

        System.out.println(stringBuilder);

        bufferedReader.close();
    }
}

/*
[에라토스테네스의 체 이용]
범위가 지정되어있는 소수 혹은 다양한 소수 관련 문제에서 좋은 알고리즘으로 사용된다.
*/