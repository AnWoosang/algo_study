import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Q1406Stack {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> lst = new Stack<>();
        Stack<Character> rst = new Stack<>();
        StringBuffer sbLeft = new StringBuffer();
        StringBuffer sbRight = new StringBuffer();
        for (char c : br.readLine().toCharArray()) {
            lst.push(c);
        }
        int lstSize = lst.size();
        int rstSize = rst.size();

        int n = Integer.parseInt(br.readLine());
        String input;
        for (int i = 0; i < n; i++) {
            input = br.readLine();

            if (input.contains("P")){
                lst.add(input.charAt(2));
                lstSize++;
            }
            else if (input.contains("L")){
                if(lstSize == 0) continue;
                rst.push(lst.pop());
                lstSize--;
                rstSize++;
            }
            else if (input.contains("D")){
                if(rstSize == 0) continue;
                lst.push(rst.pop());
                lstSize++;
                rstSize--;
            }
            else if (input.contains("B")){
                if(lstSize == 0) continue;
                lst.pop();
                lstSize--;
            }
            else{
                bw.write("wrong input...!");
                System.exit(1);
            }
        }


        for (int i = 0; i < lstSize; i++){
            sbLeft.append(lst.pop());
        }

        for (int i = 0; i < rstSize; i++){
            sbRight.append(rst.pop());
        }

        bw.write(sbLeft.reverse().toString()+sbRight.toString()+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
