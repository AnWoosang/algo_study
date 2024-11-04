import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Q9012 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[] ch; 
        Stack<Character> st = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        boolean error = false;

        for (int i = 0; i < n; i++){
            ch = br.readLine().toCharArray();
            for (char c: ch){
                if (c == '('){
                    st.push(c);
                }
                else if(c == ')'){
                    if(st.empty()){
                        error = true;
                        break;               
                    }
                    else{
                        st.pop();
                    }
                }
            }
            if(st.empty() && !error){
                bw.write("YES\n");
            }
            else{
                bw.write("NO\n");
            }
            error = false;
            st.clear();
        }   
      
        bw.flush();

        br.close();
        bw.close();
    }
}
