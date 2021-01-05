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
					if (arr[i][k] - arr[j][k] < 0)
						i++;
					else if (arr[i][k] - arr[j][k] > 0)
					{
						tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
						k = arr[i].length();
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