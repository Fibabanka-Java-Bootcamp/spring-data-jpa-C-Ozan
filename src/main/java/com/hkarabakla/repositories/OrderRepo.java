package com.hkarabakla.repositories;

import com.hkarabakla.entities.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<Order, Integer>{


    Order findById(int id);


}
