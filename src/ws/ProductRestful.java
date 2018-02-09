package ws;

import entities.*;
import java.util.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("product")
public class ProductRestful {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/findall")
	public List<Product> findal(){
		List<Product> result = new ArrayList<Product>();
		result.add(new Product("p01","Product 1",1000,2));
		result.add(new Product("p02","Product 2",2000,3));
		result.add(new Product("p03","Product 3",3000,4));
		return result;
	}

}
