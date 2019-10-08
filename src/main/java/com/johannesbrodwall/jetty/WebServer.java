package com.johannesbrodwall.jetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.webapp.WebAppContext;

public class WebServer {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        WebAppContext handler = new WebAppContext();
        handler.setBaseResource(Resource.newClassPathResource("/webapp"));
        server.setHandler(handler);
        server.start();
    }
}
