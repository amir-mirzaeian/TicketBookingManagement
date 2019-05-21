package com.ticketbookingmanegement.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    private String passengerName;
    private Date date;
    private String origin;
    private String destination;
    private String email;

    public String getPassengerName() {
        return passengerName;
    }

    public Ticket() {
    }

    public Ticket(String passengerName, Date date, String origin, String destination, String email) {
        this.passengerName = passengerName;
        this.date = date;
        this.origin = origin;
        this.destination = destination;
        this.email = email;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
