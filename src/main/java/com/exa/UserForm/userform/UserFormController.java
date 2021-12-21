package com.exa.UserForm.userform;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserFormController 
{
    @Autowired
    private UserFormService userformservice;
    
    @Autowired
    private SequenceGeneratorService sequencegeneratorservice;

    //Returning objects from controller
    @RequestMapping("/Users")
    public List<User> getAllUsers()
    {
        return userformservice.getAllUsers();
    }

    @RequestMapping("/Users/{id}")
    public User getUser(@PathVariable long id)
    {
        return userformservice.getUser(id);
    }

    @RequestMapping(value = "/Users/AddUser", method = RequestMethod.POST)
    public void addUser(@RequestBody User user)
    {
    	//generate sequence
    	if(user.getId() == 0)
    	{
    		user.setId(sequencegeneratorservice.generateSequence(User.SEQUENCE_NAME));
    		userformservice.addUser(user);
    	}
    	else
    	{
    		userformservice.addUser(user);
    	}
    }

    @RequestMapping(value = "/Users/{id}", method = RequestMethod.PUT)
    public void updateUser(@RequestBody User user, @PathVariable long id)
    {
    	//user.setId(sequencegeneratorservice.generateSequence(User.SEQUENCE_NAME));
        userformservice.updateUser(user,id);
    }

    @RequestMapping(value = "/Users/{id}", method = RequestMethod.DELETE)
   public void deleteUser(@PathVariable long id)
   {
        userformservice.deleteUser(id);
    }
   
}

