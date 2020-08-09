package com.yz.consumer.dao;

import com.yz.consumer.config.FeignConfig;
import com.yz.consumer.dao.impl.UserFeignClientFallback;
import com.yz.consumer.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "userservice", fallback = UserFeignClientFallback.class, configuration = FeignConfig.class)
public interface UserFeignClient {

    @GetMapping("/user/{id}")
    User queryUserById(@PathVariable("id") Long id);
}
