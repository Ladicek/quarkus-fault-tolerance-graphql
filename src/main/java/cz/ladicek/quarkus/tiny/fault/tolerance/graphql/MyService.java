package cz.ladicek.quarkus.tiny.fault.tolerance.graphql;

import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.faulttolerance.Timeout;

import javax.inject.Singleton;

@Singleton
public class MyService {
    @Timeout
    public Uni<String> get() {
        return Uni.createFrom().item("Hello!");
    }
}
