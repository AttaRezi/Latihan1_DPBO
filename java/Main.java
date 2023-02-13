import java.util.Scanner;
import java.util.ArrayList; //library arraylist


public class Main{
	public static void main(String[] args) {
		

		//attribute mahasiswa
		String name;
		String nim;
		String prodi;
		String fakultas;

		Scanner sc = new Scanner(System.in);

		//array list Mahasiswa
		ArrayList<Mahasiswa> list = new ArrayList<>();

		char another;
		int choice = 0; 
		//"another" mrpkn variabel yg dibutuhkan dalam proses untuk melanjutkan program
		//"choice" mrpkn variable untuk pemilihan menu

		
		int i; 

		// //menentukan banyaknya data mahasiswa yg bisa dimasukkan sekali jalan program
		// System.out.println("MASUKKAN BANYAKNYA MAHASISWA : ");
		// //proses input n
		// try
		// {
		// 	n = sc.nextInt();	
		// }
		// catch (Exception e)
		// {
		// 	System.out.println("Input yang dimasukkan bukan angka! coba lagi");
		// }

		int mulai = 1;
		//mulai gui
		while(mulai > 0)
		{
			System.out.flush();

			System.out.println();
			System.out.println(" ####### DATA MAHASISWA #######");
	        System.out.println("\n\n                                          ");
	 
	        System.out.println("\n 1. CREATE DATA MAHASISWA");
	        System.out.println("\n 2. READ RECORD");
	        System.out.println("\n 3. UPDATE RECORD (x)"); //belum 
	        System.out.println("\n 4. DELETE RECORD (x)"); //belum
	        System.out.println("\n 5. Exit");
	        System.out.println("\n\n");
	        System.out.println(" Select Your Choice : ");

	        //proses pemilihan menu
			try
			{
				choice = sc.nextInt();	
			}
			catch (Exception e)
			{
				System.out.println("Menu tidak tersedia");
			}
			System.out.println("\n\n");
			

			switch(choice)
			{

			//proses menu no.1
			case 1 :
				i = 0;
				another = 'Y';

				while((another == 'Y' || another == 'y'))
				{
					System.out.flush();

					

					//proses input nama, nim, prodi, dan fakultas
					System.out.println("Masukkan Nama Mahasiswa : ");
					name = sc.next();

					System.out.println("Masukkan Nim Mahasiswa : ");
					nim = sc.next();

					System.out.println("Masukkan Prodi Yang Diambil : ");
					prodi = sc.next();

					System.out.println("Masukkan Nama Fakultas Dari Prodi Yang Diambil : ");
					fakultas = sc.next();

					Mahasiswa temp = new Mahasiswa(); //set temp attribut
					temp.setNama(name);
					temp.setNim(nim);
					temp.setProdi(prodi);
					temp.setFakultas(fakultas);

					//insert temp object into the list
					list.add(temp);


					System.out.println();
					System.out.println("Add Another Record (Y/N) ");

					//proses menanyakan apakah akan lanjut atau tidak
			
					try
					{
						another = sc.next().charAt(0);	
					}
					catch (Exception e)
					{
						System.out.println("Tolong masukkan Y/N!");
					}

					i++;
				}
				break;

			//proses read tabel list
			case 2 :
				System.out.flush();

				System.out.println("=== View the list in the Database ===");
				System.out.println("\n");

				//print list tabel mahasiswa
				for (i = 0; i < list.size(); i++) {
					System.out.println( "| " + list.get(i).getNama() + " | " + list.get(i).getNim() + " | " + list.get(i).getProdi() + " | " + list.get(i).getFakultas() + " |");
				}
				System.out.println("\n\n");
				System.out.println("\n\n");

				break;


			//proses exit
			case 5 :
				System.out.println("\n\n");
	            System.out.println("   THANK YOU!");
	            System.out.println("\n\n");

	            mulai = 0;

	           System.exit(0);
			}
			
		}

	}
}