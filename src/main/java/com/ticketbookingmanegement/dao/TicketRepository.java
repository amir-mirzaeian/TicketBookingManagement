package com.ticketbookingmanegement.dao;

import com.ticketbookingmanegement.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket,Integer> {
}
