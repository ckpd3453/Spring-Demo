package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * Contoller Class
 */
@RestController
public class HelloController {

    /**
     * Get Method - To Read or Retrieve the data
     * @return - String Type
     * URL - http://localhost:8080/hello
     */
    @GetMapping("/hello")
    public String sayHelloBridgeLabz(){
        return "Hello From Bridgelabz";
    }

    /**
     * Post Method - To define the parameters
     * @param user - Body of the Reference Type
     * @return - defined parameters in String type
     * URL - http://localhost:8080/create-user
     */
    @PostMapping("/create-user")
    public String createUser(@RequestBody User user){
        return "User = "+ user.getFirstName()+" "+user.getLastName();
    }

    /**
     * Get Method - To Read or Retrieve the data
     * @param name - Parameter passed in the url
     * @return - String Type
     * URL - http://localhost:8080/hello/Chandrakant
     */
    @GetMapping("/hello/{name}")
    public String sayHelloPathVariable(@PathVariable String name){
        return "Hello "+ name;
    }

    /**
     * PUT Method - To update the data
     * @param firstName
     * @param lastName
     * @return - String Type
     * URL -URL - http://localhost:8080/update/Chandrakant?lastName=Prasad
     */
    @PutMapping ("/update/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName){
        return "Hello " + firstName + " " + lastName;
    }
}
