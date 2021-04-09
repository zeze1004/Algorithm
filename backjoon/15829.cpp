#include <iostream>
#include <string>

#define M 1234567891
#define r 31

using namespace std;

long long hash_func(int input, int index)
{
	long long output = input;
	for (int i = 0; i < index; i++)
	{
		output = (output * r) % M;
	}
	return output;
}

int main()
{
	int L;
	long long output = 0;
	string input;
	cin >> L >> input;
	for (int i = 0; i < L; i++)
	{
		output = (output + hash_func(input[i] - 'a' + 1, i)) % M;
	}
	cout << output;

	return 0;
}