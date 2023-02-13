#include <bits/stdc++.h>
#include <cstdio>
#include <cstring>
#include <cstdlib>
#include <conio.h>
#include <iomanip>
#include "Mahasiswa.cpp"


//using standard namespace
using namespace std;


int main(int argc, char const *argv[])
{
	/* code */

	//attribute mahasiswa
	string name;
	string nim;
	string prodi;
	string fakultas;

	//attribute

	char another, choice; 
	//"another" mrpkn variabel yg dibutuhkan dalam proses untuk melanjutkan program
	//"choice" mrpkn variable untuk pemilihan menu

	//premade linked list library
	list<Mahasiswa> llist;

	

	while(1){
		system("cls"); //clear cmd supaya terlihat rapih

		cout << "\t\t  ####### DATA MAHASISWA #######";
        cout <<"\n\n                                          ";
        cout << "\n\n";
        cout << "\n \t\t\t 1. CREATE DATA MAHASISWA";
        cout << "\n \t\t\t 2. READ RECORD";
        cout << "\n \t\t\t 3. UPDATE RECORD (x)"; //belum 
        cout << "\n \t\t\t 4. DELETE RECORD (x)"; //belum
        cout << "\n \t\t\t 5. Exit";
        cout << "\n\n";
        cout << "\t\t\t Select Your Choice : ";

        choice = getche(); //proses pengambilan input untuk menu

        switch(choice)
        {

        //proses create
        case '1' :
        	
        	another = 'Y';

        	while((another == 'Y' || another == 'y'))
        	{
        		system("cls"); 

        		Mahasiswa temp;
        		/* code */

        		//proses input nama, nim, prodi, dan fakultas
        		cout << "Masukkan Nama Mahasiswa : ";
        		cin >> name;

        		cout << "Masukkan Nim Mahasiswa : ";
        		cin >> nim;

        		cout << "Masukkan Prodi Yang Diambil : ";
        		cin >> prodi;

        		cout << "Masukkan Nama Fakultas Dari Prodi Yang Diambil : ";
        		cin >> fakultas;


        		//set data inputan ke dalam temp object
        		temp.setName(name);
			    temp.setNim(nim);
			    temp.setProdi(prodi);
			    temp.setProdi(prodi);
			    temp.setFakultas(fakultas);


			    //insert temp object into the list
				llist.push_back(temp);

			    cout << "\n Add Another Record (Y/N) ";
			    cin >> another;
			 
        	}
        	break;

        //proses read tabel
        case '2' :
        	system("cls");

        	cout << "=== View the list in the Database ===";
            cout << "\n";

           //print list tabel mahasiswa
            for (list<Mahasiswa>::iterator it = llist.begin(); it != llist.end(); it++)
			{
				/* code */
				cout << "| " << it->getName() << " | " << it->getNim() << " | " << it->getProdi() << " | " <<  it->getFakultas() << " |" <<'\n';
				
			}
            cout << "\n\n";
            system("pause");
            break;

        //proses exit menu
        case '5' :
        	cout << "\n\n";
            cout << "\t\t     THANK YOU!";
            cout << "\n\n";
            exit(0);
        }
	}

	system("pause");
	return 0;
}


