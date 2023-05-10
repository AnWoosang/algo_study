import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1934 {

    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }

    public static int lcm(int a, int b){
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[2];
        String[] temp;

        for (int i = 0; i < n; i++) {
            temp = br.readLine().split(" ");
            nums[0] = Integer.parseInt(temp[0]);
            nums[1] = Integer.parseInt(temp[1]);
            bw.write(lcm(nums[0], nums[1])+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}