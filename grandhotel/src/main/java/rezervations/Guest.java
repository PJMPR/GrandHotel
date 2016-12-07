package rezervations;

import org.joda.time.*;

public class Guest { 
	long nr_k;
	public long getNr_k() {
		return nr_k;
	}

	public void setNr_k(long nr_k) {
		this.nr_k = nr_k;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public DateTime getBr_date() {
		return br_date;
	}

	public void setBr_date(DateTime br_date) {
		this.br_date = br_date;
	}

	String name; 
	String surname; 
	String email; 
	String phone;   
	String adres; 
	String card; 
	
	DateTime br_date;

}
