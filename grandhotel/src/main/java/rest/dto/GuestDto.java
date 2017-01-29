package rest.dto;

/**
 * Created by Sopot Roza on 2017-01-28.
 */
public class GuestDto {
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String adres;
    private String card;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAdres() {
        return adres;
    }

    public String getCard() {
        return card;
    }
}
