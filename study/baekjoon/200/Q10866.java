import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Q10866 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deq = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        String command;
        int input;
        int size = 0;

        for(int i = 0; i < n; i++){
            command = br.readLine();
            if (command.contains("push_front")){
                input = Integer.parseInt(command.split(" ")[1]);
                deq.addFirst(input);
                size++;
            }
            else if (command.contains("push_back")){
                input = Integer.parseInt(command.split(" ")[1]);
                deq.addLast(input);
                size++;
            }
            else if (command.contains("pop_front")){
                if(size == 0) bw.write("-1\n");
                else {
                    bw.write(deq.pollFirst()+"\n");
                    size--;
                }
            }
            else if (command.contains("pop_back")){
                if(size == 0) bw.write("-1\n");
                else {
                    bw.write(deq.pollLast()+"\n");
                    size--;
                }
            }
            else if (command.contains("size")){
                bw.write(size+"\n");
            }
            else if (command.contains("empty")){
                if (size == 0) bw.write("1\n");
                else bw.write("0\n");
            }
            else if (command.contains("front")){
                if (size == 0) bw.write("-1\n");
                else bw.write(deq.peekFirst()+"\n");
            }
            else if (command.contains("back")){
                if (size == 0) bw.write("-1\n");
                else bw.write(deq.peekLast()+"\n");
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
