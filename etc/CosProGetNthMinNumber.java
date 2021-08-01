import java.util.*;

class Main {
	public static ArrayList<Integer> list = new ArrayList<>();
	public static boolean[] visited;

	public int solution(int[] card, int n) {
		Arrays.sort(card);
		visited = new boolean[card.length];

		permutation(card, "", 0, card.length, card.length);

		int answer = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == n) {
				answer = i + 1;
			}
		}
		return answer;
	}

	public void permutation(int[] arr, String number, int depth, int n, int r) {
		if (depth == r) {
			for (int i = 0; i < r; i++) {
				if (!list.contains(Integer.parseInt(number))) {
					list.add(Integer.parseInt(number));
				}
			}
			return;
		}

		for (int i = 0; i < n; i++) {
			if (visited[i]) continue;
			visited[i] = true;
			permutation(arr, number + arr[i], depth + 1, n, r);
			visited[i] = false;
		}
	}
}

