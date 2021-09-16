package cz.ladicek.quarkus.tiny.fault.tolerance.graphql;

import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import javax.inject.Inject;

@GraphQLApi
public class MyEndpoint {
    @Inject
    MyService myService;

    @Query
    public Uni<String> get() {
        return myService.get();
    }
}
