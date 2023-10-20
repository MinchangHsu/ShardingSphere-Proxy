package com.caster.sharding.controller;

import com.caster.sharding.entity.Order;
import com.caster.sharding.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.LongStream;

/**
 * @author caster.hsu
 * @Since 2023/10/17
 */
@Slf4j
@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderMapper orderMapper;

    @GetMapping("/findAll")
    public ResponseEntity findAll(){
        List<Order> list = orderMapper.findAll();
        log.debug("list size:{}", list.size());
        list.forEach( o -> log.debug("{}", o.toString()));
        return ResponseEntity.ok(list);
    }

    @GetMapping("/findByCondition")
    public ResponseEntity findByCondition(Order order){
        List<Order> list = orderMapper.findByCondition(order);
        log.debug("orderInfo:{}, list size:{}",order.toString(), list.size());
        list.forEach( o -> log.debug("{}", o.toString()));
        return ResponseEntity.ok(list);
    }

    @GetMapping("/add")
    public ResponseEntity add(){
        LongStream.rangeClosed(1,100).forEach( o -> {
            orderMapper.add(new Order()
                    .setOrderId(o + RandomUtils.nextLong(1, 1000000))
                    .setUserId(RandomUtils.nextInt(1,1000))
                    .setStatus(RandomStringUtils.randomAlphabetic(5))
            );
        });
        return ResponseEntity.ok(200);
    }
}
