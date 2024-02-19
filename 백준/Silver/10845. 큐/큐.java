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

        //명령어 갯수
        int N = Integer.parseInt(bufferedReader.readLine());
        Queue<Integer> queue = new LinkedList<>();

        //push에서 제공되는 숫자를 리턴하기 위해 선언
        int lastNum = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String str = stringTokenizer.nextToken();

            switch (str){
                case "push":
                    lastNum = Integer.parseInt(stringTokenizer.nextToken());
                    queue.offer(lastNum);
                    break;

                case "pop":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.poll());
                    }
                    break;

                case "size" :
                    System.out.println(queue.size());
                    break;

                case "empty" :
                    if (queue.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;

                case "front" :
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.peek());
                    }
                    break;

                case "back" :
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(lastNum);
                    }
                    break;
            }
        }

        bufferedReader.close();

    }
}
