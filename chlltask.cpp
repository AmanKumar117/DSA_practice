#include<iostream>
#include<conio.h>
#include<math.h>       // for using math functions such as pow()
using namespace std;

class Account
{
protected:                       // declared protective so that sub classes Cur_acct & Sav_acct can easily ascess the variabls.
    char cname[20];
    int accno;
    char type;
    double bal;
public:
    void input()                 //for input of user info
    {
        cout<<"Enter customer name: "<<endl;
        cin>>cname;
        cout<<"Enter account number: "<<endl;
        cin>>accno;
        cout<<"Enter type(c or s) "<<endl; 
        cin>>type;
        cout<<"Enter bal: "<<endl;
        cin>>bal;
    }
    void display()               //to display user info including name, acc no., balance, and type of account
    {
        cout<<"\n Customer Name: "<<cname;
        cout<<"\n Account Number: "<<accno;
        cout<<"\n Type: "<<type;
        cout<<"\n Balance: "<<bal<<endl;
    }
    void deposit()            //function for adding deposited money to balance
    {
        int amt;
        cout<<"\n Enter the amount to deposit: ";
        cin>>amt;
        bal=bal+amt;
    }
};
class Cur_acct:public Account    // deriving Cur_acct from Account publicially
{
int chq_bk;
int penalty;
public:
    int min_bal()           // function to check for minimum balance
    {                       //and imposing panelty  
        int ret1=1;
        if(bal<=1000)
        {
            penalty=50;
            bal=bal-penalty;
            ret1=0;
        }
        else
        {
            cout<<"\n No penality imposed";
        }
        return ret1;
    }
    void withdrawal() // function to withdraw monry from balance amt.
    {
        int amt;
        cout<<"\n Enter the amount to withdrawn: ";
        cin>>amt;
        int k=min_bal(); //checking min balance before withdrawl
        if(k==1)         // k=1 means no penalty & k=0 means balance was less than 500 and penalty is imposed.
        {
            if(bal>=amt)
            bal=bal-amt;
        }
        else
        {
              cout<<"\n The amount cannot be withdrawn";
              cout<<"\n penalty will be charged of Rs. 50, since balance fails the requirement of minimum Rs. 1000";
        }
    }
};
class Sav_acct:public Account //deiving Sav_acct from Account publically
{
int inter;
    public:
    int comp_int()     // for calculating compound intrest to be given on saved balance
    {
        int time1,rate1;
        rate1=10;
        double updt_bal;
        cout<<"\n Enter time: ";cin>>time1;
        inter=bal*pow(1+rate1/100.0,time1)-bal; // compound intrest formula
        cout<<"\n intrest on your balance for time period of "<<time1<<"  years is:  "<<inter;
        updt_bal= inter + bal;                  //updation of balance
        cout<<"\n your updated balance is: "<<updt_bal<<endl;
        return 0;
    }
    void withdrawal()  // for withdrawl of money
    {
        int amt;
        cout<<"\n Enter amount to withdrawn: ";
        cin>>amt;
        if(bal>=amt)
        {
            bal=bal-amt;
        }
        else
        {
            cout<<"\n The amount cannot be withdrawn";
        }
    }
};

int main()
{
    char ans1;
    int ans2;
    Cur_acct c1;
    Sav_acct s1;
    cout<<"enter the type of account: c for current and s for savings:";
    cin>>ans1;
    if(ans1=='c'|| ans1=='C')
    {   c1.input();
        c1.display();
        do
        {
            cout<<"\n for depositing money enter 1 and for withdrawl enter 2"<<endl;
            cout<<"to exit enter 3 "<<endl;
            cin>>ans2;
            switch(ans2)
            {
                case 1:{    c1.deposit();
                            c1.display();
                            break;}
                case 2:{    c1.withdrawal();
                            c1.display();
                            break;} 
                case 3:     goto end;
                default:{   cout<<"enter choice in (1,2,3): "<<endl;
                            break;}
            }
        } while(ans2!=3);
    }
    else
    {   s1.input();
        s1.display();
        do
        {
            cout<<"for depositing money enter 1 and for withdrawl enter 2"<<endl;
            cout<<"to see intrest on your balance enter 3 and to exit enter 4 "<<endl;
            cin>>ans2;
            switch(ans2)
            {
                case 1:{    s1.deposit();
                            s1.display();
                            break;}
                case 2:{    s1.withdrawal();
                            s1.display();
                            break;}
                case 3:{    s1.comp_int();
                            break;}            
                case 4:     goto end;
                default:{   cout<<"enter choice in (1,2,3): "<<endl;
                            break;}
            }
        } while(ans2!=4); 
    }
end:
return 0;
}