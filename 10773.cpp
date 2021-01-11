#include <iostream>
#include <stack>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int num, arr[100001] = {0}, input, sum = 0;
	stack<int> q;
	cin >> num;
	for (int i = 0; i < num; i++)
	{
		cin >> input;
		if (input == 0)
		{
			q.pop();
		}
		else
			q.push(input);
	}
	for (int i = 0; q.size(); i++)
	{
		sum += q.top();
		q.pop();
	}
	cout << sum;
	return 0;
}