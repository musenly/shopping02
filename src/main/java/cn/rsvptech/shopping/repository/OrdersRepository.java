package cn.rsvptech.shopping.repository;

import cn.rsvptech.shopping.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {

}
