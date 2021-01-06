#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

bool compare(string prev, string next)
{
	if (prev.length() == next.length())		// 길이 같은거 끼리 오름차순 비교
		return prev < next;									// 오름차순
	return prev.length() < next.length(); // 길이가 다르면 길이 짧은거 부터 오름차순
}

int main()
{
	int N;
	vector<string> str;
	cin >> N;
	for (int i = 0; i < N; i++)
	{
		string input;
		cin >> input;
		if (find(str.begin(), str.end(), input) == str.end()) // input이 vector에 없으면 vector 끝 return
			str.push_back(input);
	}
	sort(str.begin(), str.end(), compare);

	for (int i = 0; i < str.size(); i++)
	{
		cout << str[i] << '\n';
	}
}