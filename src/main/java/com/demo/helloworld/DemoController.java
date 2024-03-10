package com.demo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.InetAddress;
import javax.servlet.http.HttpServletRequest;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String demo(){
        return "Hello World!";
    }

    @GetMapping("/print_your_host")
    public String getHost(HttpServletRequest request){
        String remoteAddr = request.getRemoteAddr();
        return "Requester's IP: " + remoteAddr;
    }

    @GetMapping("/print_jvm_host")
    public String printMyHost() {
        try {
            String hostAddress = InetAddress.getLocalHost().getHostAddress();
            return "Host IP: " + hostAddress;
        } catch (Exception e) {
            return "Unable to get Host IP: " + e.getMessage();
        }
    }
}
