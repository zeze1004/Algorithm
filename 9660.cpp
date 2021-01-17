#include <iostream>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);

	long long N;
	int rest;
	cin >> N;

	if (N % 7 == 0)
		cout << "CY";
	else if (N % 7 == 2)
		cout << "CY";
	else
		cout << "SK";
	return 0;
}

/*
1 : L

2 : R (1,1)

3 : L (3)

4 : L (4)

5 : L (3,1,1)

6 : L (4,1,1)

7 : R (3,4), (4,3)

8 : L (3,4,1), (3,1,4)

9 : R (3,4,1,1), (4,3,1,1)

10 : L (4,4,1,1)
*/