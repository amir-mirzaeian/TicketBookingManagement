package com.ticketbookingmanegement.Service;

import com.ticketbookingmanegement.dao.TicketRepository;
import com.ticketbookingmanegement.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public Ticket create(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public Iterable<Ticket> getAllTicket() {
        return ticketRepository.findAll();
    }

    public Ticket getTicketById(Integer id) {
        return ticketRepository.findById(id).get();
    }

    public void delete(Integer id) {
        ticketRepository.deleteById(id);
    }

    public Ticket update(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
}
