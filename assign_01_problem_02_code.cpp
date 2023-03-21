//Mostafa Mohamed Magdy
//202006209
#include <iostream>
using namespace std;
int main() 
{
    float num_x, num_y;
    cin>>num_x>>num_y;
if (num_x > 0 && num_y > 0)
    cout<<"Q1";
else if (num_x < 0 && num_y > 0)
    cout<<"Q2";
else if (num_x < 0 && num_y < 0)
    cout<<"Q3";
else if (num_x > 0 && num_y < 0)
    cout<<"Q4";
else if (num_x == 0 && num_y == 0)
    cout<<"Origem";
else if (num_x != 0 && num_y == 0)
    cout<<"Eixo X";
else if (num_x == 0 && num_y !=0)
    cout<<"Eixo Y";
}