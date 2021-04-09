#include <iostream>
using namespace std;

int main()
{
	int T, W, H, N, num_room, h, w;
	cin >> T;
	int hotel[T];
	for (int i = 0; i < T; i++)
	{
		num_room = 0;
		cin >> H >> W >> N;
		num_room = N % H;
		if (num_room == 0)
		{
			num_room = H;
		}
		w = N / H;
		if (N % H != 0)
			w++;
		hotel[i] = num_room * 100 + w;
	}
	// 출력
	for (int i = 0; i < T; i++)
	{
		cout << hotel[i] << '\n';
	}
}
