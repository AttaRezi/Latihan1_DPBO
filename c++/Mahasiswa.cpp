#include <iostream>
#include <string>



//Using standard namespace
using namespace std;

// Class declaration. For C++, first letter doesn't have to be
//capitalized, but it's better so we can distinguish it with the other types.
class Mahasiswa
{
	//private attributes
	private:
		string name;
		string nim;
		string prodi;
		string fakultas;

	//public methods
	public:

		/* constructor */

		//constructor, doesn't have any return type
		Mahasiswa(){
			//set to default value
			this->name = "";
			this->nim = "";
			this->prodi = "";
			this->fakultas = "";
		}

		//another constructor with parameter. This one will be called if
		//the object is intanced with the given parameter.
		Mahasiswa(string name, string nim, string prodi, string fakultas){
			//"this" object's attributes will be set with the given parameter attributes.
			this->name = name;
			this->nim = nim;
			this->prodi = prodi;
			this->fakultas = fakultas;
		}

		/* getter and setter */

		//get name
		string getName(){
			return this->name;
		}

		//set name
		void setName(string name){
			this->name = name;
		}

		//get nim
		string getNim(){
			return this->nim;
		}

		//set nim
		void setNim(string nim){
			this->nim = nim;
		}

		//get prodi
		string getProdi(){
			return this->prodi;
		}

		//set prodi
		void setProdi(string prodi){
			this->prodi = prodi;
		}

		//get fakultas
		string getFakultas(){
			return this->fakultas;
		}

		//set fakultas
		void setFakultas(string fakultas){
			this->fakultas = fakultas;
		}


		
		/* destructors */

		//default destructor
		~Mahasiswa(){
			
		}
	
};