package com.exa.UserForm.userform;


import java.util.Date;

//import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

//User schema class
@Document(collection = "user")
public class User
{
	@Transient
	public static final String SEQUENCE_NAME = "user_sequence";
	
	@Id
	private long id;
	
	private String firstName;
    private String lastName;
    private String email;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dateOfBirth;
   
    public User()
    {
    	
    }

    
    public User(String firstName, String lastName, String email, Date dateOfBirth)
    {
        super();
    
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }
    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

 
    public String getfirstName()
    {
        return firstName;
    }

    public void setfirstName(String firstName)
    {
            this.firstName = firstName;
    }

    public String getlastName()
    {
        return lastName;
    }

    public void setlastName(String lastName)
    {
         this.lastName = lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public void setDateOfBirth(Date dateOfBirth)
    {
    	this.dateOfBirth = dateOfBirth;
    }
    
    public Date getDateOfBirth()
    {
    	return dateOfBirth;
    }
}