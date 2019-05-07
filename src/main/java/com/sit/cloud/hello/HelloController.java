package com.sit.cloud.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private MessageService messageService;

    @Autowired
    private PersonService personService;

    @GetMapping("hello/{id}")
    public HelloResponse say(@PathVariable int id){
        Person person = personService.getPersonById(id);
        String message = messageService.concat(person.getName());
        return new HelloResponse(message);
    }


}
