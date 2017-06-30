
public class Address {
	private String state;
	private String city;
	private String pinCode;
	private String streetAddress;
	
	@Override
	public boolean equals(Object object){
		if(object instanceof Address){
			Address address = (Address) object; // Downcasting
			if(this==address){
				return true;
			}
			if(this.pinCode.equalsIgnoreCase(address.pinCode) 
					&& this.city.equalsIgnoreCase(address.city) 
					&& this.streetAddress.equalsIgnoreCase(address.streetAddress)){
				return true;
			}
			return false;
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		return city.length() + state.length();
//		if(city.equalsIgnoreCase("delhi")){
//			return 100;
//		}
//		else
//		if(city.equalsIgnoreCase("mumbai")){	
//			return 200;
//		}
//		else
//		if(city.equalsIgnoreCase("bangalore")){
//			return 300;
//		}
//		else
//		return 400;	
	}
	
	public Address(String state, String city, String pinCode, String streetAddress){
		this.state = state;
		this.city = city;
		this.pinCode = pinCode;
		this.streetAddress = streetAddress;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pinCode=" + pinCode + ", streetAddress="
				+ streetAddress + "]";
	}
	

}
