#include <iostream>

using namespace std;
int main()
{
  cin.tie(NULL);
  int x;
  cin >> x;
  int num = 0;
  while (x != 0)
  {
    if (x % 2 == 1)
    {
      num++;
    }
    x = x / 2;
    // cout << "x " << x << '\n';
  }
  cout << num;
}