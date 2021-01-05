#include <iostream>
#include <string>
using namespace std;

int main()
{
	int N;
	string tmp;
	string arr[N];

	cin >> N;
	for (int i = 0; i < N; i++)
	{
		cin >> arr[i];
	}
	for (int i = 0; i < N; i++)
	{
		for (int j = i + 1; j < N; j++)
		{
			if (arr[i].length() > arr[j].length())
			{
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
	}

	for (int i = 0; i < N; i++)
	{
		for (int j = i + 1; j < N; j++)
		{
			if (arr[i].length() == arr[j].length())
			{
				for (int k = 0; k < arr[i].length(); k++)
				{
					// 두 문자열의 다른 알파벳을 찾았을 때
					if (arr[i][k] != arr[j][k])
					{
						// arr[j][k]가 더 뒤에 나올 때
						if (arr[i][k] < arr[j][k])
						{
							j++;
						}
					}
				}
			}
		}
	}

	for (int i = 0; i < N; i++)
	{
		for (int j = i + 1; j < N; j++)
		{
			if (arr[i] == arr[j])
			{
				arr[j] = '\0';
			}
		}
		if (arr[i][0] != '\0')
			cout << arr[i] << '\n';
	}

	return 0;
}