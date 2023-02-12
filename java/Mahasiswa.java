public class Mahasiswa 
{
	//attribut//

	private String name;
	//attribut nama
	private String nim;
	//attribut nim
	private String prodi;
	//attribut prodi
	private String fakultas;
	//attribut fakultas


	//konstruktor//

	Mahasiswa() {
		// konstruktor kosong
	}

	Mahasiswa(String nama, String nim, String prodi, String fakultas) {
		// konstruktor langsung isi atribut
		this.name = nama;
		this.nim = nim;
		this.prodi = prodi;
		this.fakultas = fakultas;
	}



	//setter and getter//

	public void setNama(String nama) {
		// mengeset nilai nama Mahasiswa
		this.name = nama;
	}

	public String getNama() {
		//mengembalikan nilai nama mahasiswa
		return this.name;
	}

	public void setNim(String nim) {
		// mengeset nilai nim Mahasiswa
		this.nim = nim;
	}

	public String getNim() {
		//mengembalikan nilai nim mahasiswa
		return this.nim;
	}

	public void setProdi(String prodi) {
		// mengeset nilai prodi Mahasiswa
		this.prodi = prodi;
	}

	public String getProdi() {
		//mengembalikkan nilai prodi mahasiswa
		return this.prodi;
	}

	public void setFakultas(String fakultas) {
		// mengeset nilai fakultas Mahasiswa
		this.fakultas = fakultas;
	}

	public String getFakultas() {
		//mengembalikkan nilai fakultas mahasiswa
		return this.fakultas;
	}

	

}