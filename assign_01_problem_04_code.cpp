//Mostafa Mohamed Magdy
//202006209
int main()
{
int num1, num2, num3, tmp, save1, save2, save3;
     cin >> num1 >> num2 >> num3;
     
    //saving the values 
    save1 = num1;
    save2 = num2;
    save3 = num3;
     //First number in order
     //swapping 
if (num2 < num1)
{
   tmp = num2;
   num2 = num1;
   num1 = tmp;
}

 if (num3 < num2)
{
   tmp = num2;
   num2 = num3;
   num3 = tmp;
   if (num2 < num1)
   {
   tmp = num2;
   num2 = num1;
   num1 = tmp;
   }
}
cout<<num1<<endl<<num2<<endl<<num3<<endl<<endl;
cout<<save1<<endl<<save2<<endl<<save3;
}