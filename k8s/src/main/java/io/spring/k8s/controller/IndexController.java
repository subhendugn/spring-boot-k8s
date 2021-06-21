package io.spring.k8s.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class IndexController {
    

    @GetMapping("index")
    public String index() {
        String host = null;
        try {
            host = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        return "Hello from " + host;
    }

    @GetMapping("updateone")
    public String uopdateone() {
        return "Update 1 successful!!";
    }
}
