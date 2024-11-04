import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1212{

    public static void main(String[] args) throws IOException {
        // string 형에서의 '+' 연산은 시간복잡도가 O(1)이 아닙니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuffer input = new StringBuffer();
        StringBuffer result = new StringBuffer();
        String[] binarys = {"000", "001", "010", "011", "100", "101", "110", "111"};
        input.append(br.readLine());
        int size = input.length();
        int i;
        for (i = 0; i < size; i++) {
            result.append(binarys[Integer.parseInt(input.substring(i, i+1))]);
        }
        size = result.length();
        while(result.charAt(0) == '0'){
            result.deleteCharAt(0);
            i++; size--;

            if (size == 1){
                break;
            }
        }

        bw.write(result.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}