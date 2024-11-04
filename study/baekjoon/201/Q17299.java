import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.stream.Stream;

public class Q17299 {
public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] nums = new int[1000001];
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int[] inputs = Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }
        Stack<Integer> st = new Stack<>();

        for(int c: inputs){
            nums[c] += 1;
        }
        
        for(int i = 0; i < n; i++){
            while(!st.empty() && nums[inputs[st.peek()]] < nums[inputs[i]]){  
                result[st.pop()] = inputs[i];
            }
        
            st.push(i);
        }
        
        for (int i = 0; i < n; i++) {
            bw.write(result[i]+" ");            
        }
        bw.write("\n");
        bw.flush();
        br.close();
        bw.close();
    }
}