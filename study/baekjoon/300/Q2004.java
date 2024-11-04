import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2004{

    // 전체 수의 소인수의 지수를 구하기 위해서 꼭 하나씩 나눌 필요가 없다.
    // n까지 r의 배수의 개수를 구하기 위해 n을 r로 나눈 몫을 생각하면 된다는 점을 생각해야한다.
    public static int exponent(int num, int div){
        int res = 0;
        while (num > 0){
            num /= div;
            res += num;
        }
        return res;
    }
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");

        int n = Integer.parseInt(inputs[0]);
        int r = Integer.parseInt(inputs[1]);
        int res;

        if (r == 0 || n == r){
            res = 0;
        }
        else {
            int byTwo = exponent(n, 2) - exponent(r, 2) - exponent(n-r, 2);
            int byFive = exponent(n, 5) - exponent(r, 5) - exponent(n-r, 5);

            if (byTwo > byFive){
                res = byFive;
            }
            else{
                res = byTwo;
            }
        }
        
        bw.write(res+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}