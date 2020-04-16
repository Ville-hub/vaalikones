package persist;

public class Candidate {
	
	private int id;
	private String fname;
	private String lname;
	private String puolue;
	private String kotipaikkakunta;
	private String miksi_eduskuntaan;
	private String mita_asioita_haluat_edistaa;
	private String ammatti;
	private String ika;
	
	
	public Candidate(int id, String fname, String lname, String puolue, String kotipaikkakunta,
			String miksi_eduskuntaan, String mita_asioita_haluat_edistaa, String ammatti, String ika) {
		
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.puolue = puolue;
		this.kotipaikkakunta = kotipaikkakunta;
		this.miksi_eduskuntaan = miksi_eduskuntaan;
		this.mita_asioita_haluat_edistaa = mita_asioita_haluat_edistaa;
		this.ammatti = ammatti;
		this.ika = ika; 
	}




	public String getIka() {
		return ika;
	}




	public void setIka(String ika) {
		this.ika = ika;
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getPuolue() {
		return puolue;
	}


	public void setPuolue(String puolue) {
		this.puolue = puolue;
	}


	public String getKotipaikkakunta() {
		return kotipaikkakunta;
	}


	public void setKotipaikkakunta(String kotipaikkakunta) {
		this.kotipaikkakunta = kotipaikkakunta;
	}


	public String getMiksi_eduskuntaan() {
		return miksi_eduskuntaan;
	}


	public void setMiksi_eduskuntaan(String miksi_eduskuntaan) {
		this.miksi_eduskuntaan = miksi_eduskuntaan;
	}


	public String getMita_asioita_haluat_edistaa() {
		return mita_asioita_haluat_edistaa;
	}


	public void setMita_asioita_haluat_edistaa(String mita_asioita_haluat_edistaa) {
		this.mita_asioita_haluat_edistaa = mita_asioita_haluat_edistaa;
	}


	public String getAmmatti() {
		return ammatti;
	}


	public void setAmmatti(String ammatti) {
		this.ammatti = ammatti;
	}



	
	

}
