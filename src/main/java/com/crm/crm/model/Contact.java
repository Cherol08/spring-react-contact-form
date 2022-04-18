package com.crm.crm.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import lombok.Data;

@Data
@Entity

public class Contact {
    @Id
    @GeneratedValue
    private long id;

    private String firstName;
    private String lastName;
    private String email;

    protected Contact(){}

    public Contact(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email =email;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName =firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName =lastName;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email =email;
    }
    

}
