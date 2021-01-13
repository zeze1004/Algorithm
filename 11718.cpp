#include <iostream>
#include <string>
using namespace std;

int main()
{
	// ios_base ::sync_with_stdio(false);
	// cin.tie(NULL);
	// cout.tie(NULL);
	string str;
	while (1)
	{
		getline(cin, str);
		if (str == "")
			break;
		cout << str << '\n';
	}

	return 0;
}