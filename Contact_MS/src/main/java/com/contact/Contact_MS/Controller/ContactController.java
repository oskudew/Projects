package com.contact.Contact_MS.Controller;

import com.contact.Contact_MS.Service.Contact_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    public Contact_Service cs;

    @GetMapping(path="/{UserId}", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List> getContactByUid(@PathVariable Long UserId){
        return new ResponseEntity<List>(cs.getContactByUserID(UserId), HttpStatus.OK);
    }
}
