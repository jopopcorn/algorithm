import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        boolean[] notPrime = new boolean[n+1];

        notPrime[0] = true;
        notPrime[1] = true;

        int sum = 0;
        int min = n;

        for(int i=2; i<Math.sqrt(notPrime.length); i++){
            if(notPrime[i]){
                continue;
            }

            for(int j=i*2; j<notPrime.length; j+=i){
                notPrime[j] = true;
            }
        }

        for(int i=m; i<=n; i++){
            if(notPrime[i]) continue;
            sum += i;
            if(min > i){
                min = i;
            }
        }

        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }

    }
}
