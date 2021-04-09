#include <iostream>
using namespace std;

int main()
{
	bool ascced = true, desced = true;
	int prev, next;
	cin >> prev;
	for (int i = 0; i < 7; i++)
	{
		cin >> next;
		if (prev < next)
		{
			desced = false;
		}
		else if (prev > next)
		{
			ascced = false;
		}
		prev = next;
	}
	if (ascced)
	{
		cout << "ascending";
	}
	else if (desced)
	{
		cout << "descending";
	}
	else
	{
		cout << "mixed";
	}
}