package ws;

import java.util.*;
import javax.ws.rs.core.*;

@javax.ws.rs.ApplicationPath("rest")
public class ApplicationConfig extends Application{

	public Set<Class<?>> getClasses(){
		Set<Class<?>> resources = new java.util.HashSet<>();
		addRestResourceClasses(resources);
		return resources;
	}

	private void addRestResourceClasses(Set<Class<?>> resources) {
		// TODO Auto-generated method stub
		resources.add(ws.ProductRestful.class);
		
	}
}
