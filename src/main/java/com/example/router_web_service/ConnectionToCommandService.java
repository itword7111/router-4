package com.example.router_web_service;

import com.exemple.generate.CommandWs;
import com.exemple.generate.CommandWsImplService;

import java.net.MalformedURLException;
import java.net.URL;

public class ConnectionToCommandService {
    private static URL url;

    static {
        try {
            url = new URL(" http://localhost:8081/ws/service-command?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private CommandWsImplService servicehe = new CommandWsImplService(url);
    private final CommandWs commandServiceMethods = servicehe.getCommandWsImplPort();
    ConnectionToCommandService(){

    }
    public CommandWs getInstance(){
        return commandServiceMethods;
    }
}
