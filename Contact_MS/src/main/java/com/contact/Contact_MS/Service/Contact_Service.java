package com.contact.Contact_MS.Service;

import com.contact.Contact_MS.Entity.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class Contact_Service implements ContactService {

    //DummyContact
    public List<Contact> dummyValues()
    {
        List<Contact> l = new ArrayList<Contact>();
        l.add(new Contact(301L,"Bhilai",99493993,1001L));
        l.add(new Contact(302L,"Raipur",849999003,1001L));
        l.add(new Contact(303L,"Bilaspur",994985459,1002L));
        return l;

    }

    @Override
    public List getContactByUserID(Long userId) {
        Contact_Service cs = new Contact_Service();
        return cs.dummyValues().stream().filter(a->a.getUid().equals(userId)).collect(Collectors.toList());
    }
}
