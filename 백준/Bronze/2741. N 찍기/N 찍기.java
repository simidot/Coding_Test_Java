import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N찍기 브론즈5
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i=1; i<=N; i++) {
            System.out.println(i);
        }
    }

}
