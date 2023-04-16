import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Stack;

/**
 * 우선순위가 같은 경우 연산자 스택에서 결과 버퍼로 이동
 * 우선순위가 낮은 경우 연산자 스택으로 이동
 * 알파벳은 계속 결과 버퍼로 추가
 */
public class Test {
public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> st = new Stack<>();
        char[] input = br.readLine().toCharArray();
        StringBuffer res = new StringBuffer();
        char tmp;
        
        HashMap<Character, Integer> priority = new HashMap<>();
        priority.put('+', 2);   priority.put('-', 2);
        priority.put('*', 1);   priority.put('/', 1);
        priority.put('(', 0);   priority.put(')', 0);



        bw.write(res.toString()+"\n");
        bw.flush();
        br.close();
        bw.close();
    }
}