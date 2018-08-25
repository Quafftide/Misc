package niitexample.entity;


public class Student {
	
	private String name;
	private String email;
	private String password;
	private String city;
	private String country;
	private String address;
	private String gender;
	
public  Student() {};
	
	
	public Student(String name,String email, String password, String city, String country, String address, String gender)
	{
		this.name=name;
		this.email=email;
		this.password=password;
		this.city=city;
		this.country=country;
		this.address=address;
		this.gender=gender;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", password=" + password + ", city=" + city + ", country="
				+ country + ", address=" + address + ", gender=" + gender + "]";
	}
	
	
	
	
	

}
