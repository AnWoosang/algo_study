import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;


/**
 * A~Z에 해당하는 수가 입력되므로 
 * 알파벳에 해당하는 숫자를 어떻게 이어줄지 생각해야함.
 * 아스키코드를 생각해서 인덱스처럼 활용
 */
public class Q1935 {
public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[] inputs = br.readLine().toCharArray();
        double[] input_nums = new double[n];

        for (int i = 0; i < n; i++) {
            input_nums[i] = Double.parseDouble(br.readLine());
        }

        Stack<Double> st = new Stack<>();
        double tmp = 0;


        for (char c: inputs) {
            if (c == '+'){
                tmp = st.pop();
                tmp += st.pop();
                st.push(tmp);                        
            }
            else if (c == '-'){
                tmp = st.pop();
                tmp = st.pop() - tmp;
                st.push(tmp);            
            }
            else if (c == '*'){
                tmp = st.pop();
                tmp *= st.pop();
                st.push(tmp);                
            }
            else if (c == '/'){
                tmp = st.pop();
                tmp = st.pop() / tmp;
                st.push(tmp);                                        
            }
            else {
                st.push(input_nums[(int)(c - 'A')]);
            }
            tmp = 0;
        }
        bw.write(String.format("%.2f\n", st.peek()));

        bw.flush();
        br.close();
        bw.close();
    }
}