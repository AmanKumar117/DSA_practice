#include<iostream>
#include<math.h>
#include<cstdlib>
#include<cstdio>
#include<string>
using namespace std;
class date {
	//data members
	int year;
	int month;
	int day;
public:
	//member functions
	date(); //default constructor
	date(int year, int month, int day); //parameterized constructor
	~date(); //destructor
	void setYear(int year); //function to set year
	void setMonth(int month); //function to set month
	void setDay(int day); //function to set day
	int getYear()const; //constant function to get year
	int getMonth()const; //constamt function to get month
	int getDay()const;  //constant function to get day
	void addYear(int y); //function to add or subtract years in current date
	void addMonth(int m); //function to add or subtract months in current date
	void addDay(int d); //functon to add or subtract days in current date
	int diff(date d); //function to calculate difference between two dates
	void display(); //function to display all data membersmonth
	bool operator ==(date rhs); //Equal to
	bool operator !=(date rhs); //Not Equal to
	bool operator >(date rhs); //greater then
	bool operator <(date rhs); //less then
	bool operator >=(date rhs); //greter then equal to
	bool operator <=(date rhs); //less then equal to
	date& operator++();
	date& operator--();
	date operator++(int);
	date operator--(int);
	friend ostream& operator <<(ostream& os, const date& rhs);
	friend istream& operator >>(istream& is, date& rhs);
	int offsetDays(); //function to calculate the number of days elapsed in the current year since Jan 1 
};
int calYearDays(int, int); //function to calculate completed year days between two dates
int calFullMonthDays(int, int, int); //function to calculate running year days of between two dates
bool isLeapYear(int y); //function to check weather the year is leap or not
int monthDays(int m, int y); //function to calculate no. of days of the 


//default constructor
date::date() {
	year = 1900;
	month = 1;
	day = 1;
}
//no of days in month
int monthDays(int m, int y) {
	if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
		return 31;
	}
	else if (m == 4 || m == 6 || m == 9 || m == 11) {
		return 30;
	}
	else if (m == 2) {
		if (isLeapYear(y)) {
			return 29;
		}
		else {
			return 28;
		}
	}
	else
		return 0;
}
//is leap year
bool isLeapYear(int y) {
	if (y % 4 == 0 && y % 100 != 0) {
		return true;
	}
	else if (y % 100 == 0 && y % 400 == 0) {
		return true;
	}
	else if (y % 400 == 0) {
		return true;
	}
	else {
		return false;
	}
}
//constructor
date::date(int year, int month, int day) {
	if (year > 0) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day > 0 && day <= 31)
			{
				this->year = year;
				this->month = month;
				this->day = day;
			}
			else {
				this->year = 1900;
				this->month = 1;
				this->day = 1;
			}
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day > 0 && day <= 30)
			{
				this->year = year;
				this->month = month;
				this->day = day;
			}
			else {
				this->year = 1900;
				this->month = 1;
				this->day = 1;
			}
		}
		else if (month == 2) {
			if (isLeapYear(year)) {
				if (day > 0 && day <= 29) {
					this->year = year;
					this->month = month;
					this->day = day;
				}
				else {
					this->year = 1900;
					this->month = 1;
					this->day = 1;
				}
			}
			else {
				if (day > 0 && day <= 28) {
					this->year = year;
					this->month = month;
					this->day = day;
				}
				else {
					this->year = 1900;
					this->month = 1;
					this->day = 1;
				}
			}
		}
		else {
			this->year = 1900;
			this->month = 1;
			this->day = 1;
		}
	}
	else {
		this->year = 1900;
		this->month = 1;
		this->day = 1;
	}
}
//destructor
date::~date() {
	//Empty Destructor
}
//set year
void date::setYear(int year) {
	this->year = year;
	if (year < 0) {
		this->year = 1900;
	}
}
//set month
void date::setMonth(int month) {
	this->month = month;
	if (month < 0 || month > 12) {
		this->month = 1;
	}
}
//set day
void date::setDay(int day) {
	this->day = day;
	if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
		if (day < 0 || day > 31)
		{
			this->day = 1;
		}
	}
	else if (month == 4 || month == 6 || month == 9 || month == 11) {
		if (day < 0 || day > 30)
		{
			this->day = 1;
		}
	}
	else if (month == 2) {
		if (isLeapYear(year)) {
			if (day < 0 || day > 29) {
				this->day = 1;
			}
		}
		else {
			if (day < 0 || day > 28) {
				this->day = 1;
			}
		}
	}
}
//get year
int date::getYear()const {
	return year;
}
//get month
int date::getMonth()const {
	return month;
}
//get day
int date::getDay()const {
	return day;
}
//add year
void date::addYear(int y) {
	year = year + y;
}
//add month
void date::addMonth(int m) {
	month = month + m;
	while (month > 12) {
		month = month - 12;
		year++;
	}
	while (month < 1) {
		month = month + 12;
		year--;
	}
}
//add day
void date::addDay(int d) {
	day = day + d;
	while (day > monthDays(month, year)) {
		day = day - monthDays(month, year);
		addMonth(1);
	}
	while (day < 1) {
		addMonth(-1);
		day = day + monthDays(month, year);
	}
}
//difference
int date::diff(date d) {
	int days = 0;
	if (this->year != d.year) {
		days += calYearDays(this->year + 1, d.year - 1);
	}
	if (this->year != d.year && this->month != d.month) {
		days += calFullMonthDays(this->month, 12, this->year);
		days += calFullMonthDays(1, d.month, d.year);
		days += monthDays(this->month, this->year) - this->day;
		days += d.day;
	}
	if (this->year == d.year && this->month != d.month) {
		for (int x = this->month + 1; x < d.month; x++) {
			days += monthDays(x, this->year);
		}
		days += monthDays(this->month, this->year) - this->day;
		days += d.day;
	}
	if (this->year == d.year && this->month == d.month && this->day != d.day) {
		days += d.day - this->day;
	}
	/*days += calFullMonthDays(this->month, 12, this->year);
	days += monthDays(this->month, this->year) - this->day;
	days += calFullMonthDays(1, d.month, d.year);
	days += d.day;*/
	return days;
}
//display
void date::display() {
	cout << "YY/MM/DD : " << year << "/" << month << "/" << day << endl;
}
//calculate full year days
int calYearDays(int y1, int y2) {
	int days = 0;
	for (int y = y1; y <= y2; y++) {
		if (isLeapYear(y)) {
			days += 366;
		}
		else {
			days += 365;
		}
	}
	return days;
}
//calculate full month days
int calFullMonthDays(int m1, int m2, int y) {
	int days = 0;
	for (int m = m1; m <= m2; m++) {
		days += monthDays(m, y);
	}
	return days;
}

//Equal to
bool date::operator==(date rhs) {
	if ((year == rhs.year) && (month == rhs.month) && (day == rhs.day)) {
		return true;
	}
	else {
		return false;
	}
}

//Not Equal to
bool date::operator!=(date rhs) {
	if ((year != rhs.year) || (month != rhs.month) || (day != rhs.day)) {
		return true;
	}
	else {
		return false;
	}
}

//greater then
bool date::operator>(date rhs) {
	if (year > rhs.year)
		return true;
	else if ((year == rhs.year) && (month > rhs.month))
		return true;
	else if ((year == rhs.year) && (month == rhs.month) && (day > rhs.day))
		return true;
	else
		return false;
}

//less then
bool date::operator<(date rhs) {
	if (year < rhs.year)
		return true;
	else if ((year == rhs.year) && (month < rhs.month))
		return true;
	else if ((year == rhs.year) && (month == rhs.month) && (day < rhs.day))
		return true;
	else
		return false;
}

//greater then equal to
bool date::operator>=(date rhs) {
	if (year >= rhs.year)
		return true;
	else
		return false;
}

//less then equal to
bool date::operator<=(date rhs) {
	if (year <= rhs.year)
		return true;
	else
		return false;
}

//Pre Increament
date& date::operator++() {
	this->addDay(1);
	return *this;
}

//Pre Decreament
date& date::operator--() {
	this->addDay(-1);
	return *this;
}

//Post Increament
date date::operator++(int) {
	date temp(this->year, this->month, this->day);
	this->addDay(1);
	return temp;
}

//Post Decreament
date date::operator--(int) {
	date temp(this->year, this->month, this->day);
	this->addDay(-1);
	return temp;
}

//Insertion Operator
ostream& operator <<(ostream& os, const date& rhs) {
	os << rhs.year << "/" << rhs.month << "/" << rhs.day;
	return os;
}

//Extraction Operator
istream& operator >>(istream& in, date& rhs) {
	long int date;
	in >> date;
	int year = date % 10000;
	date = date / 10000;
	int month = date / 100;
	int day = date % 100;
	if (year > 0) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day > 0 && day <= 31)
			{
				rhs.year = year;
				rhs.month = month;
				rhs.day = day;
			}
			else {
				rhs.year = 1900;
				rhs.month = 1;
				rhs.day = 1;
			}
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day > 0 && day <= 30)
			{
				rhs.year = year;
				rhs.month = month;
				rhs.day = day;
			}
			else {
				rhs.year = 1900;
				rhs.month = 1;
				rhs.day = 1;
			}
		}
		else if (month == 2) {
			if (isLeapYear(year)) {
				if (day > 0 && day <= 29) {
					rhs.year = year;
					rhs.month = month;
					rhs.day = day;
				}
				else {
					rhs.year = 1900;
					rhs.month = 1;
					rhs.day = 1;
				}
			}
			else {
				if (day > 0 && day <= 28) {
					rhs.year = year;
					rhs.month = month;
					rhs.day = day;
				}
				else {
					rhs.year = 1900;
					rhs.month = 1;
					rhs.day = 1;
				}
			}
		}
		else {
			rhs.year = 1900;
			rhs.month = 1;
			rhs.day = 1;
		}
	}
	else {
		rhs.year = 1900;
		rhs.month = 1;
		rhs.day = 1;
	}
	return in;
}

// Given a date, returns number of days elapsed 
// from the  beginning of the current year (1st jan). 
int date::offsetDays()
{
	int offset = day;

	switch (month - 1)
	{
	case 11:
		offset += 30;
	case 10:
		offset += 31;
	case 9:
		offset += 30;
	case 8:
		offset += 31;
	case 7:
		offset += 31;
	case 6:
		offset += 30;
	case 5:
		offset += 31;
	case 4:
		offset += 30;
	case 3:
		offset += 31;
	case 2:
		offset += 28;
	case 1:
		offset += 31;
	}

	if (isLeapYear(year) && month > 2)
		offset += 1;

	return offset;
}

int main() 
{
	//only checking new operators overloaded in ths assignment getting two date from user
	date a, b;
	int d;
	cout << "Enter a date in this format [MMDDYYYY]: ";
	cin >> a;
	cout << "Date Entered: " << a << endl;
	cout << "Enter another date in this format [MMDDYYYY]: ";
	cin >> b;
	cout << "Date Entered: " << b << endl;
	cout << "Enter number of days to add: ";
	cin >> d;
	//testing logical operators
	if (a == b)
		cout << "Both dates are EQUAL" << endl;
	if (a != b)
		cout << "Dates are NOT EQUAL" << endl;
	if (a > b)
		cout << a << " is greator than " << b << endl;
	if (a < b)
		cout << b << " is greator than " << a << endl;
	if (a >= b)
		cout << a << " is greator than and equal to " << b << endl;
	if (a <= b)
		cout << b << " is greator than and equal to " << a << endl;
	cout << "Date is " << a;
	cout << " after pre increament, date is " << ++a << endl;
	cout << "Date is " << b;
	cout << " after post increament, date is " << b++ << endl;
	cout << "Date is " << a;
	cout << " after pre decreament, date is " << --a << endl;
	cout << "Date is " << b;
	cout << " after post decreament, date is " << b-- << endl;
	cout << "Number of days elapsed in current year from date "<< a << " is " << a.offsetDays()<<endl;
	cout << "Number of days elapsed in current year from date " << b << " is " << b.offsetDays() << endl;
	cout << "Number of days " << d << " added to date " << a << " will mean date ";
	a.addDay(d);
	cout << a << endl;
	cout << "Number of days " << d << " added to date " << b << " will mean date ";
	b.addDay(d);
	cout << b << endl;
    return 0;
}