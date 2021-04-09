#include <iostream>
using namespace std;

int main() {
    int hour, minute;
    cin >> hour >> minute;
    /*
    1.
    if (minute - 45 < 0)
        hour = hour - 1
        minute = 60 + (minute - 45)
        if (hour == -1)
            hour = 23

    2. if (minute - 45 > 0)
        hour은 그대로 출력
        minute = minute - 45
    */

    if (minute - 45 < 0) {
        hour = hour - 1;
        minute = 60 + (minute - 45);
        if (hour == -1) {
            hour = 23;
        }
        cout << hour << " " << minute << endl; 
    }
    else //(minute - 45 > 0) 
    {
        //hour은 그대로 출력
        minute = minute - 45;
        cout << hour << " " << minute << endl; 
    } 

    return 0;
}