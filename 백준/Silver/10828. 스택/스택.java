import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;

        int N = Integer.parseInt(bufferedReader.readLine());

        //스택 클래스를 이용
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            //command(첫번째)
            String command = stringTokenizer.nextToken();

            //향상된 switch문을 사용해서 break도 사용안해도 된다.
            switch (command) {
                case "push":
                    int commandValue = Integer.parseInt(stringTokenizer.nextToken());
                    stack.push(commandValue);
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.pop());
                    }
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if (stack.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.peek());
                    }
                    break;
                default:
                    break;
            }
        }

        bufferedReader.close();
    }
}
