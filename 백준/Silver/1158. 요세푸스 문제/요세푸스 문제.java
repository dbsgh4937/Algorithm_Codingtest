import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        stringBuilder.append("<");

        while (queue.size() > 1) {
            for (int i = 0; i < K - 1; i++) {
                //원형을 큐로 추상하고 진행했기 때문에 K번째 전까지의 값은 다시 큐에 넣어 순서를 뒤로 바꿔줘야 한다
                queue.offer(queue.poll());
            }
            //for 반복문에서 설정한 값을 로직을 통해 맨 앞으로 바꿨기 때문에 stringBuilder에 맨 앞 값 저장
            stringBuilder.append(queue.poll() + ", ");
        }
        //while문에서 1을 포함하고, 이후에 방법으로 뒤에 ' , ' 하고 ' '를 지우는 방법도 가능하다
//        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
//        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        stringBuilder.append(queue.poll() + ">");

        System.out.println(stringBuilder);

        bufferedReader.close();

    }
}
