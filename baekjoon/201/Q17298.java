import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.stream.Stream;

public class Q17298 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> st = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int[] result = new int[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }
        String input = br.readLine();
        int[] inputs = Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        int size;

        for (int i = 0; i < n; i++) {
            while (!st.empty() && inputs[st.peek()] < inputs[i]){
                result[st.pop()] = inputs[i];
            }
            st.push(i);
        }
        size = result.length;
        for(int i = 0; i < size; i++){
            bw.write(result[i]+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
