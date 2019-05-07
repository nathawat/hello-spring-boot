package com.sit.cloud.hello;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String concat(String name){
        return "Sawasdee , "+ name;
    }
}
