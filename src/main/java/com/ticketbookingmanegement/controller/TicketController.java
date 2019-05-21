package com.ticketbookingmanegement.controller;

import com.ticketbookingmanegement.Service.TicketService;
import com.ticketbookingmanegement.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping(value = "/create")
    public Ticket createTicket(@RequestBody Ticket ticket){
        return ticketService.create(ticket);
    }

    @GetMapping(value = "/tickets")
    public Iterable<Ticket> getAllTickets(){
        return ticketService.getAllTicket();
    }
    @GetMapping("/ticket/{id}")
    public Ticket getTicketById(@PathVariable Integer id){
        return ticketService.getTicketById(id);
    }
    @DeleteMapping("/ticket/{id}")
    public void delete(@PathVariable Integer id){
        ticketService.delete(id);
    }
    @PutMapping("/ticket/{id}")
    public Ticket update(@RequestBody Ticket ticket,@PathVariable Integer id){
        return ticketService.update(ticket);
    }

}
