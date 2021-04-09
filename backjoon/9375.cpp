#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	int T, num, count, one = 1;
	bool check;
	cin >> T;
	string cloth_name, cloth_type;
	vector<pair<string, int>> vector;
	while (T--)
	{
		vector.clear();
		count = 1;
		cin >> num;
		while (num--)
		{
			cin >> cloth_name;
			cin >> cloth_type;
			check = false;
			for (int i = 0; i < vector.size(); i++)
			{
				// 같은 옷의 종류가 존재한다면
				if (vector[i].first == cloth_type)
				{
					vector[i].second++;
					check = true;
					break;
				}
			}
			// 같은 옷의 종류가 존재하지 않으면
			if (check == false)
			{
				vector.push_back(make_pair(cloth_type, 1));
			}
		}
		for (int i = 0; i < vector.size(); i++)
		{
			// 경우의 수 *= (옷 종류의 개수 + 해당 옷을 입지 않을 경우(1))
			count *= vector[i].second + 1;
			// cout << "count " << count << " " << vector[i].first << " " << vector[i].second << '\n';
		}
		// 전체 경우의 수에서 아무것도 입지 않는 경우의 수 빼기
		cout << count - 1 << '\n';
	}
	return 0;
}