/*Q.1) take the total bill amount from user and then depending on sell give discount
   if total_bill>10000 10% off, if bill is between 9999 to 5000 5% off on bill ,if bill in 4999 to 2000 2% off
   below 2000 just 100INR off.
  output: Total bill amount  11000
                discount given x% 10%
                Discount of INR  1100
                Amount to pay   -----------*/
#include <iostream>
using namespace std;
int main()
{
    float total_bill;
    float discount_percentage;
    float discount_amount;
    float amount_to_pay;
    cout<<"Enter the total bill amount: \n";
    cin>>total_bill;
    if 
    (total_bill > 10000)
   {
   discount_percentage = 10;
   discount_amount = total_bill * (discount_percentage / 100);
   amount_to_pay = total_bill - discount_amount;
    }
    else if 
    (total_bill>=5000 && total_bill<=9999)
    {
    discount_percentage = 5;
    discount_amount = total_bill * (discount_percentage / 100);
    amount_to_pay = total_bill - discount_amount;
    }
    else if
    (total_bill>=2000 && total_bill<=4999)
   {
   discount_percentage = 2;
   discount_amount = total_bill * (discount_percentage / 100);
   amount_to_pay = total_bill - discount_amount;
    }
    else
    {
    discount_amount = 100;
    amount_to_pay = total_bill - discount_amount;
    }
    cout<<"\nTotal bill amount: "<< total_bill;
    cout<<"\nDiscount given: " <<discount_percentage<<"%";
    cout<<"\nDiscount amount: " <<discount_amount;
    cout<<"\nAmount to pay: "<<amount_to_pay;
    return 0;
}

/* Enter the total bill amount: 5000
Total bill amount: 5000
Discount given: 5%
Discount amount: 250
Amount to pay: 4750 */