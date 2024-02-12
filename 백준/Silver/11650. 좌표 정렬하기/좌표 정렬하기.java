import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());
        int[][] arr = new int[N][2];

        //2차원 배열에 각각의 입력받은 값을 저장
        StringTokenizer stringTokenizer;
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            arr[i][0] = Integer.parseInt(stringTokenizer.nextToken());
            arr[i][1] = Integer.parseInt(stringTokenizer.nextToken());
        }

        //Arrays.sort 메소드를 사용해서 arr을 정렬하는데 이때 두번째 인자는 Comparator를 구현한 람다식을 사용
        Arrays.sort(arr, (e1, e2) -> {
            //첫번째 열이 같은지 확인해서 맞으면 두번째 열을 기준으로 오름차순 정렬한다
            if (e1[0] == e2[0]) {
                //두번째열을 기준으로 오름차순 정렬
                return e1[1] - e2[1];
            }
            //첫번째 열이 같지 않은 경우 첫번째열을 기준으로 오름차순 정렬한다
            else {
                //첫번째열을 기준으로 오름차순 정렬
                return e1[0] - e2[0];
            }
        });

        for (int i = 0; i < N; i++) {
            stringBuilder.append(arr[i][0] + " " + arr[i][1] + "\n");
        }

        System.out.println(stringBuilder);

        bufferedReader.close();
    }
}
