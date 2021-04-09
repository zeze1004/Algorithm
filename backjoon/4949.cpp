#include <iostream>
#include <string>
#include <stack>
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(0);
	cout.tie(0);

	while (1)
	{
		string Text;
		getline(cin, Text);
		stack<char> check;
		if (Text.size() == 1 && Text[0] == '.')
			break;
		bool check_Line = false;
		for (int i = 0; i < Text.size(); i++)
		{
			if (Text[i] == '(' || Text[i] == '[')
				check.push(Text[i]);
			else if (Text[i] == ')')
			{
				if (check.size() > 0 && check.top() == '(')
					check.pop();
				else
				{
					check_Line = true;
					break;
				}
			}
			else if (Text[i] == ']')
			{
				if (check.size() > 0 && check.top() == '[')
					check.pop();
				else
				{
					check_Line = true;
					break;
				}
			}
		}

		if (check.empty() && !check_Line)
			cout << "yes" << '\n';
		else
			cout << "no" << '\n';
	}
	return 0;
}