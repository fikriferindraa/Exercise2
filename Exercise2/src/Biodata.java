public class Biodata {
	String name = "Fikri Putra Ferindra";

	public void PrintName() {
		System.out.println("Name from Method : " + name);
	}

	public void DisplayGender() {
		System.out.println("Gender : Male");
	}

	public static String DisplayBirth() {
		String birth = "BirthDay : 16 October 2001";
		System.out.println(birth);
		return birth;
	}

	public int ShowAge() {
		int year = 0;
		for (int i = 2001; i <= 2020; i++) {
			year = (i - 2001);
		}
		System.out.println("Age : " + year);
		return year;
	}

	public String DisplayStatus() {
		String status = "Marital Status : in Relationship";
		System.out.println(status);
		return status;
	}

	public void DisplayCitizen() {
		System.out.println("Citizenship : Indonesia");
	}

	public void DisplayAdrres() {
		System.out.println("Home Adrress : Telaga Sakinah Residence Blok CD2 NO.10, Bekasi, Indonesia");
	}

	public void DisplayNumber() {
		System.out.println("Handphone Number : (+62)81388925146");
	}
}