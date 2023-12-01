
public class MobileDevice {

	private String companyname;
	private String model;
	private int storage;
	private double prise;
	
	public void setCompanyName (String cn) {
		companyname =cn;
	}
	public void setPhoneModel(String mo) {
		model = mo;
	}
	public void setMemoryStorage(int s) {
		storage = s;
	}
	public void setPhonePrise(double p) {
		prise = p;
	}
	
	public String getCompanyName () {
		return companyname;
	}
	
	public String getPhoneModel () {
		return model;
	}
	
	public int getMemoryStorage () {
		return storage;
	}
	public double getPhonePrise () {
		return prise;
	}
}
