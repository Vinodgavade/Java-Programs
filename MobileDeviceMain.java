
public class MobileDeviceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileDevice md = new MobileDevice();
		
		 String companyname = "Samsung";
		 String model = "Sm-M31S";
		 int storage = 128;
		 double prise = 19999.99;
		 
		 md.setCompanyName(companyname);
		 md.getCompanyName();
		 md.setPhoneModel(model);
		 md.getPhoneModel();
		 md.setMemoryStorage(storage);
		 md.getMemoryStorage();
		 md.setPhonePrise(prise);
		 md.getPhonePrise();
		 
		 System.out.println("Mobile Company Name: "+companyname+ "\n Mobile Model No: "+model+ "\n Mobile Storage in(GB): "+storage+ "GB\n Price Of Mobile  :"+prise);
	}

}
