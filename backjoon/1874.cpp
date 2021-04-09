#include <iostream>
#include <stack>
#include <vector>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int n, num, index = 0;
	vector<int> input;
	vector<char> sign;
	stack<int> stack;
	cin >> n;
	for (int i = 0; i < n; i++)
	{
		cin >> num;
		input.push_back(num);
	}

	for (int i = 1; i <= n; i++)
	{
		stack.push(i);			 // 1부터 n 쌓기
		sign.push_back('+'); // 해당 수가 쌓일 때 마다 + 추가
		while (!stack.empty())
		{
			if (input[index] == stack.top()) // 벡터에 있는 수와 제일 최근에 들어온, 스택의 최상단 수와 같다면
			{
				stack.pop();				 // 스택 pop
				sign.push_back('-'); // 수를 찾았으니 - 추가
				index++;						 // 찾았으니 index++
			}
			else
				break;
		}
	}

	if (stack.empty())
	{
		for (int i = 0; i < sign.size(); i++)
		{
			cout << sign[i] << "\n";
		}
	}
	else
		cout << "NO";
	return 0;
}