import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] clearUser = new int[N];
        int[] notClearUser = new int[N];
        ArrayList<Stage> list = new ArrayList<>();
        for (int stage : stages) {
            for (int j = 0; j < N; j++) {
                if (stage >= j + 1) {
                    clearUser[j]++;
                }

                if(stage == j+1){
                    notClearUser[j]++;
                    break;
                }
            }
        }

        for(int i=0; i<clearUser.length; i++){
            if(clearUser[i] == 0)
                list.add(new Stage(i+1, 0));
            else
                list.add(new Stage(i+1, (double) notClearUser[i] / clearUser[i]));
        }

        list.sort((o1, o2) -> Double.compare(o2.rate, o1.rate));

        for(int i=0; i<N; i++){
            answer[i] = list.get(i).index;
        }

        return answer;
    }
}

class Stage{
    int index;
    double rate;

    public Stage(int index, double rate){
        this.index = index;
        this.rate = rate;
    }
}
