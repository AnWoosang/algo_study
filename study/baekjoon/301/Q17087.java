import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q17087{

    public static int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line1 = br.readLine().split(" ");
        String[] line2 = br.readLine().split(" ");
        
        int n = Integer.parseInt(line1[0]);
        int s = Integer.parseInt(line1[1]);
        int[] distance = new int[n];
        int tmp;
        int res;

        for (int i = 0; i < n; i++) {
            tmp = Integer.parseInt(line2[i]);
            if (tmp > s){
                distance[i] = tmp - s;
            }   
            else {
                distance[i] = s - tmp;
            }
        }

        res = distance[0];
        for (int i = 1; i < n; i++) {
            if (res > distance[i]){
                res = gcd(res, distance[i]);
            }
            else {
                res = gcd(distance[i], res);
            }
        }

        bw.write(res + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}