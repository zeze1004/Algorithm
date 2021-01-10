#include <iostream>
#include <queue>
#include <vector>
#include <algorithm>
using namespace std;
// m 무게, v 가격, w =1이면 보석, 0이면 가방
main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	priority_queue<int> pq;
	int jewel_num, bag_num, jewel_price, jewel_w, bag_w, check, bag[3000001];
	long long output;
	int index = 0;
	cin >> jewel_num >> bag_num;
	vector<pair<int, int>> vec(jewel_num);
	for (int i = 0; i < jewel_num; i++)
	{
		cin >> jewel_w >> jewel_price;
		vec[i].first = jewel_w;
		vec[i].second = jewel_price;
	}
	for (int i = 0; i < bag_num; i++)
	{
		cin >> bag_w;
		bag[i] = bag_w;
	}

	// 보석, 가방 오름차순
	sort(vec.begin(), vec.end());
	sort(&bag[0], &bag[bag_num]);

	for (int i = 0; i < bag_num; i++)
	{
		// 가방의 무게보다 작은 보석들을 다 집어넣음
		while (index < jewel_num && vec[index].first <= bag[i])
		{
			pq.push(vec[index++].second);
		}
		if (!pq.empty())
		{
			output += pq.top(); // 제일 비싼 가격
			pq.pop();
		}
	}
	cout << output << '\n';

	return 0;
}