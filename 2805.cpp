#include <iostream>
using namespace std;

int tree_num, need_lenght, tree_lenght[1000001];
bool check(long long lenght)
{
	long long count = 0;
	for (int i = 0; i < tree_num; i++)
	{
		if (tree_lenght[i] >= lenght)
			count += tree_lenght[i] - lenght;
		// cout << "count " << count << " tree_lenght: " << tree_lenght[i] << " mid: " << lenght << '\n';
	}
	return count >= need_lenght;
}

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	long long max = 0;

	cin >> tree_num >> need_lenght;
	for (int i = 0; i < tree_num; i++)
	{
		cin >> tree_lenght[i];
		if (max < tree_lenght[i])
		{
			max = tree_lenght[i];
		}
	}
	long long right = max, left = 1, mid, output = 0;
	while (right >= left)
	{
		mid = (right + left) / 2;
		// cout << "mid: " << mid << '\n';
		if (check(mid))
		{
			if (output < mid)
			{
				output = mid;
				// cout << "output: " << output << '\n';
			}
			left = mid + 1;
			// cout << "left: " << left << '\n';
		}
		else
		{
			right = mid - 1;
			// cout << "right: " << right << '\n';
		}
	}
	cout << output;
	return 0;
}