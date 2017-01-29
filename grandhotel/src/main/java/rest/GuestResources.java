package rest;

import repo.IRepositoryCatalog;
import repo.IRepositoryGuest;
import repo.IRezervationRepository;
import repo.impl.RepositoryGuest;
import repo.impl.RezervationRepository;
import rest.dto.GuestDto;
import rest.dto.RezervationDto;
import rezervations.Guest;
import rezervations.Rezervation;

import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("guest")
@Stateless
public class GuestResources {

    private IRepositoryGuest repositoryGuest = CatalogInstance.getCatalog().guest();
    private IRezervationRepository rezervationRepository = CatalogInstance.getCatalog().rezervation();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}/reservations")
    public Response get(@PathParam("id") long id) {
        Guest guest = repositoryGuest.get(id);
        List<Rezervation> rezervations = rezervationRepository.byGuest(guest);
        List<RezervationDto> results = new ArrayList<RezervationDto>();

        for (Rezervation rezervation : rezervations) {
            RezervationDto rezervationDto = map(rezervation);
            results.add(rezervationDto);
        }


        return Response.ok(new GenericEntity<List<RezervationDto>>(results){}).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response Add(GuestDto guestDto) {
        Guest guest = new Guest();
        guest.setName(guestDto.getName());
        guest.setAdres(guestDto.getAdres());
        guest.setCard(guestDto.getCard());
        //..dokonczyć mapowanie
        repositoryGuest.add(guest);
        return Response.ok(guest.getId()).build();
    }


    private RezervationDto map(Rezervation rezervation) {
        RezervationDto rezervationDto = new RezervationDto();
        rezervationDto.setDni(rezervation.getDni());
        rezervationDto.setId(rezervation.getId());
        return rezervationDto;
    }


}
