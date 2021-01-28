#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

int main()
{
	ios_base ::sync_with_stdio(false);
	cin.tie(NULL);

	int name_num, output_num;
	string name;
	vector<pair<string, int>> vec;
	vector<string> str;

	cin >> name_num >> output_num;
	str.push_back("");
	for (int i = 1; i <= name_num; i++)
	{
		cin >> name;
		vec.push_back({name, i});
		str.push_back(name);
	}

	// 탐색 트리는 정렬 트리란 뜻!
	// pair를 sort할 때는 first 먼저 비교 후 second 비교
	sort(vec.begin(), vec.end());

	for (int i = 1; i <= output_num; i++)
	{
		cin >> name;
		// 숫자일 시
		if ('0' <= name[0] && name[0] <= '9')
		{
			int output = stoi(name);
			cout << str[output] << '\n';
		}
		// 문자열일 시
		else
		{
			// start: 부모 노드 보다 값티 작은 자식 노드
			// mid: 부모 노드
			// end: 보모 노드 보다 값이 큰 자식 노드
			int start = 0, mid, end = name_num - 1;

			// 이진 탐색 트리
			while (start <= end) // start가 end보다 커지면 찾고자 하는 값이 없는 것이므로 종료
			{
				mid = (start + end) / 2;
				// 부모 노드랑 문자열이 같을 시 인덱스 출력 후 반복문 탈출
				if (vec[mid].first == name)
				{
					cout << vec[mid].second << '\n';
					break;
				}
				// 부모 노드가 name보다 값이 작으므로 오른쪽 방향 노드 탐색
				else if (vec[mid].first < name)
					start = mid + 1;
				// 부모 노드가 name보다 값이 크므로 왼쪽 방향 노드 탐색
				else
					end = mid - 1;
			}
		}
	}
}