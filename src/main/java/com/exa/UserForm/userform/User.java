package com.exa.UserForm.userform;


import java.util.Date;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;



import com.fasterxml.jackson.annotation.JsonFormat;


@EntityScan
public class User
{
	@Id
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