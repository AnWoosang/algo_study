import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10430 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);

        bw.write(((A+B)%C)+"\n");
        bw.write((((A%C) + (B%C))%C)+"\n");
        bw.write(( (A*B)%C )+"\n");
        bw.write(( ((A%C) * (B%C))%C )+"\n");
        bw.flush();
        br.close();
        bw.close();
    }
}