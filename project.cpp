//Required header files
#include <iostream>
#include <fstream>
#include <sstream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

//Function for efficient input
string removeAlphabets(string s)
{
    string num;
    for (int i = 0; i < s.length(); i++)
    {
        if (isdigit(s[i]))
        {
            num.push_back(s[i]);
        }
    }
    if (num.empty())
    {
        num = "0";
    }
    return num;
}

//To add a single book detail
void addBook()
{
    fstream file;
    file.open("main.csv", ios::out | ios::app | ios::in);
    string bookName, authorName, publisher, id, pages, price, year;
    cout << "\n\nEnter Book ID:\t";
    cin >> id;
    cin.ignore();
    id = removeAlphabets(id);
    cout << "Enter Book Name:\t";
    getline(cin, bookName);
    cout << "Enter Author Name:\t";
    getline(cin, authorName);
    cout << "Enter Price:\t";
    cin >> price;
    price = removeAlphabets(price);
    cout << "Enter No. of Pages:\t";
    cin >> pages;
    cin.ignore();
    pages = removeAlphabets(pages);
    cout << "Enter Publisher:\t";
    getline(cin, publisher);
    cout << "Enter Year of Publishing:\t";
    cin >> year;
    cin.ignore();
    year = removeAlphabets(year);

    file << id << ","
         << bookName << ","
         << authorName << ","
         << price << ","
         << pages << ","
         << publisher << ","
         << year << "\n";
}

//To add multiple book details (overloaded)
void addBook(int n)
{
    fstream file;
    file.open("main.csv", ios::out | ios::app);

    string bookName, authorName, publisher, id, pages, price, year;

    for (int i = 0; i < n; i++)
    {
        cout << "\n\nEnter record " << i + 1 << endl;
        cout << "Enter Book ID:\t";
        cin >> id;
        cin.ignore();
        id = removeAlphabets(id);
        cout << "Enter Book Name:\t";
        getline(cin, bookName);
        cout << "Enter Author Name:\t";
        getline(cin, authorName);
        cout << "Enter Price:\t";
        cin >> price;
        price = removeAlphabets(price);
        cout << "Enter No. of Pages:\t";
        cin >> pages;
        cin.ignore();
        pages = removeAlphabets(pages);
        cout << "Enter Publisher:\t";
        getline(cin, publisher);
        cout << "Enter Year of Publishing:\t";
        cin >> year;
        cin.ignore();
        year = removeAlphabets(year);

        file << id << ","
             << bookName << ","
             << authorName << ","
             << price << ","
             << pages << ","
             << publisher << ","
             << year << "\n";
    }
}

//To count total number of book details in file
int rowCount()
{
    string temp;
    fstream file;
    file.open("main.csv", ios::in);
    int i = 0;
    while (getline(file, temp))
    {
        i++;
    }
    return i;
}

//To view book details
void viewBook(int choice)
{

    fstream file;
    file.open("main.csv", ios::in);

    int count = rowCount();

    string stringData[count][7];

    for (int row = 0; row < count; row++)
    {
        string line;
        getline(file, line);
        if (!file.good())
            break;

        stringstream iss(line);

        for (int col = 0; col < 7; col++)
        {
            string val;
            getline(iss, val, ',');

            stringstream converter(val);
            getline(converter, stringData[row][col]);
        }
    }

    string detailCheck;
    cout << "Enter detail to check:\t";
    getline(cin, detailCheck);
    int i = 1;
    for (int row = 1; row < count; row++)
    {
        string compCheck = stringData[row][choice];
        if (!compCheck.compare(detailCheck))
        {
            cout << "\n\nDetail:\t" << i << endl;
            cout << "Book ID:\t" << stringData[row][0] << endl;
            cout << "Book Name:\t" << stringData[row][1] << endl;
            cout << "Author Name:\t" << stringData[row][2] << endl;
            cout << "Price:\t" << stringData[row][3] << endl;
            cout << "No. of Pages:\t" << stringData[row][4] << endl;
            cout << "Publisher:\t" << stringData[row][5] << endl;
            cout << "Year of Publishing:\t" << stringData[row][6] << endl;
            i++;
        }
    }
    if (i == 1)
    {
        cout << "\n\nNo detail found." << endl;
    }
}

//Extra function for using sort efficiently
bool sortcol(const vector<string> &v1, const vector<string> &v2)
{
    string str1 = v1[2];
    string str2 = v2[2];
    transform(str1.begin(), str1.end(), str1.begin(), ::tolower);
    transform(str2.begin(), str2.end(), str2.begin(), ::tolower);
    return str1 < str2;
}

//Arange book in a new file
void arrangeBook()
{
    fstream fin, fout;
    fin.open("main.csv", ios::in);
    fout.open("mainChanged.csv", ios::out);

    int count = rowCount();

    string stringData[count][7];

    for (int row = 0; row < count; row++)
    {
        string line;
        getline(fin, line);
        if (!fin.good())
            break;

        stringstream iss(line);

        for (int col = 0; col < 7; col++)
        {
            string val;
            getline(iss, val, ',');

            stringstream converter(val);
            getline(converter, stringData[row][col]);
        }
    }

    vector<vector<string>> vec;

    for (int i = 1; i < count; i++)
    {
        vector<string> temp;
        for (int j = 0; j < 7; j++)
        {
            temp.push_back(stringData[i][j]);
        }
        vec.push_back(temp);
    }
    sort(vec.begin(), vec.end(), sortcol);

    fout << "Book ID,Book Name,Author Name,Price,Pages,Publisher,Year of Publishing\n";

    for (int i = 0; i < count - 1; i++)
    {
        for (int j = 0; j < 7; j++)
        {
            if (j == 6)
            {
                fout << vec[i][j] << "\n";
            }
            else
            {
                fout << vec[i][j] << ",";
            }
        }
    }

    cout << "\n\nThe book details have been arranged in ascending order by their Author's name." << endl;
    fin.close();
    fout.close();

    cout << "\nDo you want to open the file. (Y):\t";
    string choice = "";
    cin >> choice;
    if ("Y" == choice || "yes" == choice || "y" == choice)
    {
        system("mainChanged.csv");
    }
    else
    {
        cout << "\nInvalid Input!!! Exiting section...." << endl;
    }
}

//Displays the main menu
void mainMenu()
{
    cout << "\n\nPlease select a choice to proceed." << endl;
    cout << "1\tAdd book details." << endl;
    cout << "2\tSearch specific book details." << endl;
    cout << "3\tArrange book details by their Author's name." << endl;
    cout << "4\tExit program." << endl;
    cout << "Enter your choice:\t" << endl;
}

//Displays the add book details section
void addMenu()
{
    cout << "\n\nYour are in Add details section.\nChoose anyone of the following choices" << endl;
    cout << "1\tAdd single book detail." << endl;
    cout << "2\tAdd multiple book details." << endl;
    cout << "3\tExit section." << endl;
    cout << "Enter your choice:\t" << endl;
}

//Displays the search book details section
void searchMenu()
{
    cout << "\n\nYour are in Search details section.\nChoose anyone of the following choices" << endl;
    cout << "1\tSearch by Book ID." << endl;
    cout << "2\tSearch by Book Name." << endl;
    cout << "3\tSearch by Author Name." << endl;
    cout << "4\tSearch by Price." << endl;
    cout << "5\tSearch by Pages number." << endl;
    cout << "6\tSearch by Publisher." << endl;
    cout << "7\tSearch by Year of Publishing." << endl;
    cout << "8\tExit section." << endl;
    cout << "Enter your choice:\t" << endl;
}

//Main function
int main()
{
    cout << "Welcome !!!!!" << endl;
    cout << "\nThis program lets you add, search and arrange book details." << endl;

    //Check if file is already present or not and then add initial data to it.
    fstream file;
    file.open("main.csv");
    file.seekg(0, ios::end);
    if(!file){
        file.open("main.csv", ios::out);

        file << "Book ID,Book Name,Author Name,Price,Pages,Publisher,Year of Publishing\n";
    }
    if (file.tellg() == 0)
    {
        file << "Book ID,Book Name,Author Name,Price,Pages,Publisher,Year of Publishing\n";
    }
    file.close();

    //Main working menu and functions
    int choice = 0;
    string strChoice;
    do
    {
        mainMenu();
        cin >> strChoice;
        choice = stoi(removeAlphabets(strChoice));
        if (choice == 1)
        {
            do
            {
                addMenu();
                cin >> strChoice;
                cin.ignore();
                choice = stoi(removeAlphabets(strChoice));
                switch (choice)
                {
                case 1:
                    addBook();
                    break;
                case 2:
                    int n;
                    cout << "Enter number of books you want to add." << endl;
                    cin >> n;
                    cin.ignore();
                    addBook(n);
                    break;
                case 3:
                    cout << "Exiting section....." << endl;
                    break;
                default:
                    cout << "Invalid Input!!! Try again." << endl;
                    break;
                }
            } while (choice != 3);
        }

        else if (choice == 2)
        {
            do
            {
                searchMenu();
                cin >> strChoice;
                cin.ignore();
                choice = stoi(removeAlphabets(strChoice));
                if (choice < 8 && choice > 0)
                {
                    viewBook(choice - 1);
                }
                else if (choice == 8)
                {
                    cout << "Exiting section....." << endl;
                }
                else
                {
                    cout << "Invalid Input!!! Try again." << endl;
                }
            } while (choice != 8);
        }

        else if (choice == 3)
        {
            arrangeBook();
        }

        else if (choice == 4)
        {
            cout << "Exiting....." << endl;
        }

        else
        {
            cout << "Invalid Input!!! Try again." << endl;
        }
    } while (choice != 4);
    return 0;
}
