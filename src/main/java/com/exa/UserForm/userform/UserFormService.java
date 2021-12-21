package com.exa.UserForm.userform;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserFormService 
{
	
    @Autowired
    public UserFormRepository userformrepository;
    
    @Autowired
    private SequenceGeneratorService sequencegeneratorservice;

   /* private List<User> users = new ArrayList <User> (Arrays.asList(
        new User("1", "Siddharth", "GR", "abc@gmail.com", 12-06-1995),
        new User("2", "Dhrithi", "MG", "bcd@gmail.com", 10-10-2020),
        new User("3", "Deeksha", "MG", "efg@gmail.com",30-12-1980),
        new User("4", "Suma", "Prasad", "ghi@gmail.com", 14-06-1998),
        new User("5", "Prasad", "ML", "ijk@gmail.com",19-09-1999)
    ));*/

    
    public List<User> getAllUsers() {
        //return users;
        List<User> users =  new ArrayList<User>();
       long usersCount =  userformrepository.count();
       for(int i = 0; i < usersCount; i++)
       {   
             users.add(userformrepository.findAll().get(i));
       }
        return users;
    }

       public User getUser(long id) 
        {
            return userformrepository.findById(id).get();
        }
    
        public void addUser(User user)
        {
        	
            userformrepository.save(user);
        }

        public void updateUser(User user, long id)
        {
        	
            userformrepository.save(user);
        }

        public void deleteUser(long id)
        {
            userformrepository.deleteById(id);
        }
   


}

    








  
  

   
    