#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
using namespace std;

int main()
{
	string A, B, tmp;
	vector<int> output;
	int A_arr[10001], B_arr[10001]; // 입력 값이 (0 < A,B < 10^10000)
	int sum = 0;
	cin >> A >> B;

	// 더 긴 수를 A로 저장
	if (A.size() < B.size())
	{
		tmp = A;
		A = B;
		B = tmp;
	}

	// A는 배열의 두 번째 자리 부터 저장
	for (int i = 0; i < A.size(); i++)
	{
		A_arr[i + 1] = A[i] - '0'; // 아스키 코드 96 빼서 원래 숫자 저장
	}
	// B는 A의 끝자리에 맞춰서 저장
	for (int i = 0; i < B.size(); i++)
	{
		B_arr[i + 1 + (A.size() - B.size())] = B[i] - '0';
	}
	// 끝 부분부터 덧셈을 하면서 output벡터에 값 저장
	for (int i = A.size(); i > 0; i--)
	{
		sum = A_arr[i] + B_arr[i];
		if (sum >= 10)
		{
			A_arr[i - 1]++; // 전에 값이 10이상이면 앞의 값(한 자리수 더 큰 값)에게 1 추가
			sum -= 10;			// 1의 자리값만 벡터에 저장
		}
		output.push_back(sum);
	}

	// 맨 앞자리수 출력
	if (A_arr[0] != 0) // if (sum >= 10) A_arr[i - 1]++;
		cout << 1;

	// output벡터 거꾸로 출력
	for (int i = output.size() - 1; i >= 0; i--)
	{
		cout << output[i];
	}
}