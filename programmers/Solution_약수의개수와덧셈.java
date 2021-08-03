package com.programmers;

public class Solution_약수의개수와덧셈 {
	public static void main(String[] args) {
		solution(24, 27);
	}

	public static int solution(int left, int right) {
		int answer = 0;
		for (int i = left; i <= right; i++) {
			int cnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					cnt++;
			}
			answer += cnt % 2 == 0 ? i : -i;
		}
		System.out.println(answer);
		return answer;
	}
}
