package rest.dto;

/**
 * Created by Sopot Roza on 2017-01-28.
 */
public class RezervationDto {
    private long id;
    private int dni;

    public int getDni() {
        return dni;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
