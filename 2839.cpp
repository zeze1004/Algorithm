#include <iostream>
using namespace std;

int main() {
    int sugar, result;
    cin >> sugar;

    if(sugar == 3 || sugar == 5) 
        cout << 1;
    else if((sugar % 5) % 3 == 0) 
        cout << (sugar / 5) + ((sugar % 5) / 3);
    else if ((sugar % 5 == 0 && (sugar % 5) % 3 != 0)) 
        cout << sugar / 5;
    else if ((sugar % 3 == 0 && sugar % 5 != 0))
        cout << sugar / 3;
    //else if (sugar % 3 != 0 && )
    else
        cout << -1;
    


    return 0;
}