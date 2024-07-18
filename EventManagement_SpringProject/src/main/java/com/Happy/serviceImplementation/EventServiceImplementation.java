package com.Happy.serviceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Happy.entity.EventsEntity;
import com.Happy.entity.Form;
import com.Happy.repository.EventsRepo;
import com.Happy.repository.FormRepo;
import com.Happy.serviceInterface.EventServiceInterface;

@Service
public class EventServiceImplementation implements EventServiceInterface {

    @Autowired
    private EventsRepo repo;  

    @Override
    public EventsEntity loadEventData(String eventCategory) {
    	//optional->used to handle the null pointer exception
        Optional<EventsEntity> data = repo.findByEventCategory(eventCategory); //userdifined method
        if (data.isPresent()) {
            return data.get(); //to get the data from database we r using get() present in Optional class
            //returning the object
        } else {
            return null;
        }
    }
@Autowired
private FormRepo fRepo;
    @Override
    public List<Form> getUserEvents(String email) {
       List <Form> list =fRepo.findEventByEmail(email);
        
        return list;
    }
    @Override
    public void deleteUserBooking(Integer id) {
        
        fRepo.cancelEventById(id);
    }

   
    
}
