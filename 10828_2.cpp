#include <iostream>
#include <stack>
#include <string>
using namespace std;

int main()
{
	int N, num;
	stack<int> s;
	string word;
	cin >> N;
	for (int i = 0; i < N; i++)
	{
		cin >> word;
		if (word == "push")
		{
			cin >> num;
			s.push(num);
		}
		if (word == "pop")
		{
			if (s.empty())
				cout << -1 << '\n';
			else
			{
				cout << s.top() << '\n';
				s.pop();
			}
		}
		if (word == "top")
		{
			if (s.empty())
				cout << -1 << '\n';
			else
				cout << s.top() << '\n';
		}
		if (word == "empty")
		{
			if (s.empty())
				cout << 1 << '\n';
			else
				cout << 0 << '\n';
		}
		if (word == "size")
		{
			cout << s.size() << '\n';
		}
	}
}