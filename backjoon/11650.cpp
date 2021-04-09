#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main()
{
	int N, x, y;
	cin >> N;
	vector<int> vec;
	pair<int, int> p[200001]; // pair 선언법
	for (int i = 0; i < N; i++)
	{
		cin >> p[i].first >> p[i].second;
	}
	// vector.end()는 벡터의 마지막 번째에서 +1 한 값이므로
	// p[N-1]이 마지막 배열 순서지만 +1을 해야 끝까지 비교 가능
	sort(&p[0], &p[N]); // first와 비교하고 first끼리 같으면 second와 비교함
	for (int i = 0; i < N; i++)
	{
		cout << p[i].first << " " << p[i].second << '\n';
	}
	return 0;
}