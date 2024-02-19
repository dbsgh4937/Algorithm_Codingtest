import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        String str = bufferedReader.readLine();
        Stack<Character> stack = new Stack<>();
        boolean tag = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '<') {
                //'<'가 들어오면 tag를 true로 바꿔서 입력을 열어놓기
                tag = true;
                //두번째 이상부터 tag에서는 이전에 문장이 있을 경우 stack에 저장한 값을 pop해서 역으로 출력해서 stringBuilder에 저장
                while (!stack.isEmpty()) {
                    stringBuilder.append(stack.pop());
                }
                //'<'추가
                stringBuilder.append(str.charAt(i));

            } else if (str.charAt(i) == '>') {
                tag = false;
                //'>'추가
                stringBuilder.append(str.charAt(i));

            } else if (tag) {       //tag가 참일때 그 안에 있는 값은 그대로 reverese안하고 입력
                //그대로 문자 추가
                stringBuilder.append(str.charAt(i));

            } else {                //tag가 false일 때(boolean에서 참이 아닐경우), (!tag)로 선언안하고 else로 예외처리
                if (str.charAt(i) == ' ') {
                    //스택 초기화
                    while (!stack.isEmpty()) {
                        stringBuilder.append(stack.pop());
                    }
                    //빈칸 추가
                    stringBuilder.append(str.charAt(i));
                } else {
                    stack.push(str.charAt(i));
                }

            }
        }

        //else문의 else에서 마지막으로 넣어놓은 문자열의 문자도 역순서로 나와야하기 떄문에
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }

        System.out.println(stringBuilder);

        bufferedReader.close();

    }
}
