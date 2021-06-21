import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;
    public static HashMap<Integer, Integer> dupCntMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            if(st.hasMoreTokens()){
                arr[i] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(arr);

        System.out.println(checkDuplicateCount());
    }

    public static ArrayList<Integer> checkDuplicateCount(){
        for (int key : arr) {
            dupCntMap.put(key, dupCntMap.getOrDefault(key, 0) + 1);
        }

        ArrayList<Integer> answer = new ArrayList<>();

        for(Integer key : dupCntMap.keySet()){
            if(dupCntMap.get(key) != 1){
                answer.add(dupCntMap.get(key));
            }
        }

        if(answer.size() == 0){
            answer.add(-1);
        }

        return answer;
    }
}

