package links;

import links.resources.LinkResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

// my.site.com/api
@ApplicationPath("api")
public class RestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>(1);
        classes.add(LinkResource.class);
        return classes;
    }
}
