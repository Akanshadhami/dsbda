#include <bits/stdc++.h>
using namespace std;
int main() {
    string str = "Hello World";
    int length = str.length();
   cout << "Original String: " << str <<endl;
    string andResult = "";
    string xorResult = "";
    for (int i = 0; i < length; ++i) {
        if(str[i]==' ')
        {  andResult +=" ";
            xorResult +=" ";}
        else{
         andResult += static_cast<char>(str[i] & 127);
           char xoredChar = str[i] ^ 127;
            if (xoredChar < 32 || xoredChar > 126) {
                xorResult += "*";
            } else {
                xorResult += xoredChar;}}}
    cout <<"Bitwise AND with 127: "<<andResult<<endl;
    cout <<"Bitwise XOR with 127: "<<xorResult<<endl;
    return 0;
}