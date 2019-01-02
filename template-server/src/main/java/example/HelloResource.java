package example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class HelloResource {

    @Path("/hello")
    @GET
    public String hello() {
        return "world";
    }

    @Produces("application/json")
    @Path("/baz")
    @GET
    public Result baz() {
        return ImmutableResult.builder()
                .foo("foo")
                .bar("bar")
                .build();
    }
}
