import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Test {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write("1");
        bw.write("1");
        bw.write("1");
        bw.write("1\n");
        bw.close();
        bw.write("2");
        bw.write("2");
        bw.write("2");
        bw.write("2\n");
        bw.flush();
        bw.close();

    }
}
