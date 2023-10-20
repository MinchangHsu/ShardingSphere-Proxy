package com.caster.sharding.mapper;

import com.caster.sharding.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author caster.hsu
 * @Since 2023/10/17
 */
@Repository
public interface OrderMapper {
    List<Order> findAll();
    List<Order> findByCondition(Order record);

    void add(Order record);
}
