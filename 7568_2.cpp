#include <iostream>
#include <vector>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int N, weight, height, count[55] = {0};
	cin >> N;
	vector<pair<int, int>> vec;
	for (int i = 0; i < N; i++)
	{
		cin >> weight >> height;
		vec.push_back(make_pair(weight, height));
	}

	for (int i = 0; i < N; i++)
	{
		// cout << i << " " << vec[i].first << " " << vec[i].second << '\n';

		for (int j = 0; j < N; j++)
		{
			// cout << j << " " << vec[j].first << " " << vec[j].second << '\n';
			if (vec[i].first < vec[j].first && vec[i].second < vec[j].second)
			{
				count[i]++;
			}
		}
		cout << count[i] + 1 << " ";
	}
	return 0;
}