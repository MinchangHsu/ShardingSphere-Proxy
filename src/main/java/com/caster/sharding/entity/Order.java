package com.caster.sharding.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author caster.hsu
 * @Since 2023/10/17
 */
@Data
@Accessors(chain = true)
public class Order {
    private Long orderId;
    private Integer userId;
    private String status;
}
