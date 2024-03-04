import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer;
        //초기 편집기에 입력할 문자열
        String str = bufferedReader.readLine();
        //입력할 명령어의 개수
        int M = Integer.parseInt(bufferedReader.readLine());

        //기본 본래의 스택을 사용
        Stack<String> basicStack = new Stack<>();
        //각각의 명령어에 따른 데이터를 잠깐 저장하기 위해 임시의 스택을 하나 추상화
        Stack<String> temporaryStack = new Stack<>();

        //basicStack에 str을 저장하기 위해 배열 선언
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            basicStack.push(arr[i]);
        }

        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            //명령어 입력 받기
            String command = stringTokenizer.nextToken();

            switch (command) {
                case "L":   //왼쪽으로 한칸
                    if (basicStack.isEmpty()) {
                        break;
                    }
                    temporaryStack.push(basicStack.pop());
                    break;
                case "D":   //오른쪽으로 한칸
                    if (temporaryStack.isEmpty()) {
                        break;
                    }
                    basicStack.push(temporaryStack.pop());
                    break;
                case "B":   //왼쪽 delete
                    if (basicStack.isEmpty()) {
                        break;
                    }
                    basicStack.pop();
                    break;
                case "P":   //입력 받은거 왼쪽에 넣기
                    String inputString = stringTokenizer.nextToken();
                    basicStack.push(inputString);
                    break;
            }
        }

        //basicStack에 넣어놨던거를 스택의 FILO를 활용해 마지막에 다 넣어준다(그래야 StringBuilder에 순서대로 넣을 수 있끼 때문)
        while (!basicStack.isEmpty()) {
            temporaryStack.push(basicStack.pop());
        }

        //StringBuilder에 순서대로 저장하기
        while (!temporaryStack.isEmpty()) {
            stringBuilder.append(temporaryStack.pop());
        }

        System.out.println(stringBuilder);

        bufferedReader.close();
    }
}

/*
[사용한 알고리즘 : Stack]

[스택을 2개 활용해서 에디터에 관한 내용을 다른 방법으로 접근했다]
*/