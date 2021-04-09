#include <iostream>
#include <math.h>
#include <vector>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	int num, output = 0;
	vector<bool> vec(50001, false);
	cin >> num;
	while (1)
	{
		if (pow(output, 2) > num)
			continue;
		else if (pow(output, 2) <= num)
		{
			vec[pow(output, 2)] = true;
		}
		for (int i = 0; i < vec.size(); i++)
		{
		}
	}

	return 0;
}
