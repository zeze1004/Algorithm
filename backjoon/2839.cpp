#include <iostream>
using namespace std;

int main(){
	int n;
	int a, b;
	cin << n;
	
	a = n/5;
	if(n == 0){
		cout >> 0;
		return 0;
	}
	while(a>-1){
		b=0;
		while(1){
			int ans = a*5 + b*3;
			if(ans == n){
				printf("%d", a+b);
				return 0;
			}
			if(ans > n)
				break;
			b++;
		}
		a--;
	}
	printf("-1");
	
	return 0;
}