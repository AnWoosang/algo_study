import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Q10845 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> que = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        String input;
        int size = 0;
        int last_elem = 0;

        for (int i = 0; i < n; i++) {
            input = br.readLine();
            if (input.contains("push")){
                last_elem = Integer.parseInt(input.split(" ")[1]);
                que.add(last_elem);
                size++;
            }
            else if (input.contains("pop")){
                if (size == 0) bw.write("-1\n");
                else {
                    bw.write(Integer.toString(que.poll())+"\n");
                    size--;
                }
                
            }
            else if (input.contains("size")){
                bw.write(size+"\n");
            }
            else if (input.contains("empty")){
                if (size == 0) bw.write("1\n");
                else bw.write("0\n");
            }
            else if (input.contains("front")){
                if (size == 0) bw.write("-1\n");
                else bw.write(que.peek()+"\n");
            }
            else if (input.contains("back")){
                if (size == 0) bw.write("-1\n");
                else bw.write(last_elem+"\n");
            }
            else {
                bw.write("Wrong Input...!");
                System.exit(1);
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
