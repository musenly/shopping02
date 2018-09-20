package cn.rsvptech.shopping.repository;

import cn.rsvptech.shopping.domain.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository extends JpaRepository<Goods, Integer> {
    Goods findByGoodsId(Integer goodsId);

}
