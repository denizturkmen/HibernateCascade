package com.denizturkmen.Entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Adress_table")
public class Adress {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Adres_ID")
	private Integer adressId;

	@Column(name = "Street")
	private String street;

	@Column(name = "City")
	private String city;

	@Column(name = "State")
	private String state;

	@Column(name = "PinCode")
	private Long pincode;

	@OneToOne(mappedBy = "adress")
	private Employee employee;

	public Integer getAdressId() {
		return adressId;
	}

	public void setAdressId(Integer adressId) {
		this.adressId = adressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pin_code) {
		this.pincode = pin_code;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Adress [street=" + street + ", city=" + city + ", state=" + state + ", pin_code=" + pincode + "]";
	}

}
