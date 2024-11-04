import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Q1874 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] inputs = new int[n];
        Stack<Integer> st = new Stack<>();
        StringBuffer sb = new StringBuffer();

        // 스택수열이 만들어질 수 있는지 확인하는 상태값
        boolean avail = true;
        int cnt = 1;

        for (int i = 0; i < n; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
        }

        for(int i : inputs){
            // input에 입력을 받고 input까지 스택에 입력한다.
            while (cnt <= i){
                st.push(cnt++);
                sb.append('+');
                sb.append('\n');
            }

            // 스택의 최상위에 있는 값과 입력값을 비교하고 같으면 pop한다.
            if (st.peek() == i){
                st.pop();
                sb.append('-');
                sb.append('\n');
            }

            // 스택의 최상위에 있는 값과 입력값을 비교했을때 같지 않은 경우 pop이 불가능하기 때문에
            // avail의 상태값을 false로 변경한 후 for문을 break한다.
            else{
                avail = false;
                break;
            }
        }

        if(avail){
            bw.write(sb.toString());

        }
        else{
            bw.write("NO\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
