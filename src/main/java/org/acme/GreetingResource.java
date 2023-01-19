package org.acme;

import javax.inject.Singleton;

import org.jboss.logging.Logger;

import io.quarkus.vertx.web.Route;
import io.quarkus.vertx.web.Route.HttpMethod;
import io.smallrye.mutiny.Uni;

@Singleton
public class GreetingResource {

    private static final Logger log = Logger.getLogger(GreetingResource.class);

    @Route(methods = HttpMethod.GET, path = "hello", produces = "text/plain")
    public Uni<String> hello() {
        log.info("GreetingResource.hello()");
        return Uni.createFrom().item("Hello from RESTEasy Reactive");
    }

}