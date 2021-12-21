import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int commonDivisor = gcd(x, y);

        System.out.println(commonDivisor);
        System.out.println(x * y / commonDivisor);
    }

    // GCD(x, y) = GCD(y, r)
    public static int gcd(int x, int y){
        while(y != 0){
            int r = x % y;

            x = y;
            y = r;
        }
        return x;
    }
}
