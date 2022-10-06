package com.example.router_web_service;

import com.exemple.generate.CommandWs;
import com.exemple.generate.CommandWsImplService;

import java.net.MalformedURLException;
import java.net.URL;

public class ConnectionToCommandService {
    private static URL url;

    static {
        try {
            url = new URL("http://localhost:8081/ws/service-command?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private CommandWsImplService servicehe ;
    private CommandWs commandServiceMethods ;
    ConnectionToCommandService(){

    }
    public CommandWs getInstance(){
        try {
            this.servicehe = new CommandWsImplService(url);
            this.commandServiceMethods = servicehe.getCommandWsImplPort();
        }catch (Exception e ){
            System.out.println(ConnectionToCommandService.class+"   "+e.getCause());
        }
        return commandServiceMethods;
    }
}
