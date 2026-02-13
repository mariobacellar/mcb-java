package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.Set;

@Path("/fruits")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FruitResource {

    @Inject
    FruitService service;

    @GET
    public Set<Fruit> list() {
        return service.list();
    }

    @GET
    @Path("/{id}")
    public Response getById(@PathParam("id") Long id) {
        return service.findById(id)
                .map(fruit -> Response.ok(fruit).build())
                .orElse(Response.status(Response.Status.NOT_FOUND).build());
    }

    @POST
    public Response create(Fruit fruit) {
        Fruit createdFruit = service.create(fruit);
        return Response.status(Response.Status.CREATED).entity(createdFruit).build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Fruit fruit) {
        try {
            Fruit updatedFruit = service.update(id, fruit);
            return Response.ok(updatedFruit).build();
        } catch (NotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id) {
        if (service.delete(id)) {
            return Response.noContent().build(); // 204 No Content
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
