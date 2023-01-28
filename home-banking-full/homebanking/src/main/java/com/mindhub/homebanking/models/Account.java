package com.mindhub.homebanking.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
public class Account {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="client_id")
    private Client client;
    private String number;
    private LocalDateTime creationDate;
    private Double balance;

    public Account() {
    }

    public Account(long id, Client client, String number, LocalDateTime creationDate, Double balance) {
        this.id = id;
        this.client = client;
        this.number = number;
        this.creationDate = creationDate;
        this.balance = balance;
    }
    public Account(String number, LocalDateTime creationDate, Double balance) {
        this.id = id;
        this.creationDate = creationDate;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
