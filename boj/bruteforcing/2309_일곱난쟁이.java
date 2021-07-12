import java.util.*;

public class Main{
    public static int[] height = new int[9];
    public static boolean[] visited = new boolean[9];
    public static int sum = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<9; i++){
            height[i] = sc.nextInt();
            sum += height[i];
        }

        Arrays.sort(height);
        
        for(int i=0; i<8; i++){
            for(int j=i+1; j<9; j++){
                if(sum - height[i] - height[j] == 100){
                    print(i, j);
                    System.exit(0);
                }
            }
        }
    }
    
    public static void print(int x, int y){
        for(int i=0; i<9; i++){
            if(i == x || i == y) continue;
            System.out.println(height[i]);
        }
    }
}
