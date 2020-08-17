package lecture.dynamicProgramming;

/**
 * acmicpc.net/problem/15990 1,2,3 더하기 5
 * 배운 것 : "연속"이라는 추가 조건이 붙었을 경우
 * D[i][j] = i를 1,2,3의 합으로 나타내는 방법의 수, 마지막에 사용한 수는 j
 * D[i-1][2] + D[i-1][3]
 * D[i-2][1] + D[i-2][3]
 * D[i-3][1] + D[i-3][2]
 *
 * 초기화에 대해서도 신경써주어야 한다. 아무것도 사용하지 않은 것을 사용하면 중복이 발생해서 초기화해주어야 한다.
 * 첫 번째 수인경우와 아닌경우로 에외 처리해주어야 한다.
 */
public class BOJ15990 {
}
