package advancedREST;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/myapp")
public class MyApp extends Application{

	/*@Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> set = new HashSet<>();
        set.add(MyResource.class);
        return set;
    }*/

}
