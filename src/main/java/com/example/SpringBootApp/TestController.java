package com.example.SpringBootApp;

import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
public class TestController{
//public class TestController implements CommandLineRunner {
@Value("${spring.messages}")// Read from prop or yml value
private String propValue;
    //http://localhost:8088/abc
    @RequestMapping("/abc")
    public String test()
    {
       //String value= System.getenv().get("un");
        String value2= System.getProperty("USERNAME_VM_OPT");//vm argument value
        System.out.print("From controller console");
        return "From Controller,  VM option value :"+value2+propValue;
    }

//https://www.youtube.com/watch?v=Op4SRM3t0nw
    /*Run or Debug  Configs */
    //Vm Options( Credentials ): -DUSERNAME_VM_OPT=FromVM  (without space )
    //Env Varable(Profiles) : -DSpring.profile.active=dev




  /*  @Override
    public void run(String... args) throws Exception {
      // String ar= args[0];
    }*/
}
