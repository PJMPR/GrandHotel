package rest.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RoomDto {

    private long id;
    private int cena;
    private int capasity;

    public int getCapasity() {
        return capasity;
    }

    public int getCena() {
        return cena;
    }

    public long getId() {
        return id;
    }

    public void setCapasity(int capasity) {
        this.capasity = capasity;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void setId(long id) {
        this.id = id;
    }
}
