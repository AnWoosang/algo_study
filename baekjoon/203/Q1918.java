import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Q1918 {

public static int priority(char c){
    int result = -1;
    switch(c){
        case '*': case'/': result = 1; break;
        case '+': case'-': result = 0; break;
        default: break;
    }
    return result;
}

public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuffer sb = new StringBuffer();
        Stack<Character> st = new Stack<>();
        char[] input = br.readLine().strip().toCharArray();

        for(char c : input){
            if (c == '*' || c== '/' || c == '+' || c == '-'){
                while(!st.isEmpty() && priority(st.peek()) >= priority(c)){
                    sb.append(st.pop());
                }
                st.push(c);
            }
            else if (c =='('){
                st.push(c);
            }
            else if (c == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    sb.append(st.pop());
                }
                st.pop();
            }
            else{
                sb.append(c);
            }

        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        
        
        bw.write(sb.toString()+"\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
