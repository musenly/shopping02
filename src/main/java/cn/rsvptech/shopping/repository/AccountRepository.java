package cn.rsvptech.shopping.repository;

import cn.rsvptech.shopping.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    Account findByUserId(Integer userId);

}
