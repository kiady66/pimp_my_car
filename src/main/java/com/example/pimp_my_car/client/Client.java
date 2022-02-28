package com.example.pimp_my_car.client;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String firstName;

    private String lastName;

    private Integer contractId;

    public Client(){}

    public Client(Integer id, String firstName, String lastName, Integer contractId)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contractId = contractId;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public void setContractId(Integer contractId)
    {
        this.contractId = contractId;
    }

    public Integer getContractId()
    {
        return this.contractId;
    }
}
