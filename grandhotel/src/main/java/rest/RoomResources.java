package rest;

import grandhotel.Room;
import repo.IRoomRepository;
import repo.impl.RezervationRepository;
import repo.impl.RoomRepository;
import rest.dto.RoomDto;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("room")
@Stateless
public class RoomResources {

    private IRoomRepository roomRepository = CatalogInstance.getCatalog().room();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){

        List<RoomDto> result = new ArrayList<RoomDto>();

        for (Room room : roomRepository.getAll()) {
            result.add(map(room));
        }

        return Response.ok(new GenericEntity<List<RoomDto>>(result){}).build();
    }



    private RoomDto map(Room room) {
        RoomDto roomDto = new RoomDto();
        roomDto.setCena(room.getCena());
        roomDto.setCapasity(room.getCapasity());
        roomDto.setId(room.getId());
        return roomDto;
    }
}
