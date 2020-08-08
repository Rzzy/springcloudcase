package com.yz.consumer.dao;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.yz.consumer.domain.User;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import org.slf4j.Logger;

@Component
public class UserDao {

    // @Autowired
    // private RestTemplate restTemplate;

    // @Autowired
    // private DiscoveryClient discoveryClient;

    // private static final Logger logger =  LoggerFactory.getLogger(UserDao.class);

   // @HystrixCommand(fallbackMethod = "queryUserByIdFallBack")
   // public User queryUserById(Long id){
   //     Long begin = System.currentTimeMillis();
        // 获取ip和端口信息
        // String baseUrl = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/user/";
   //     String baseUrl = "http://userservice/user/"+ id ;
        // User user = restTemplate.getForObject(baseUrl,User.class);
   //     Long end = System.currentTimeMillis();
        /* 记录访问用时 */
        // logger.info("访问用时：{}",end - begin);
        // return user;
   // }

    public User queryUserByIdFallBack(Long id) {
        User user = new User();

        user.setId(id);
        user.setName("用户信息查询异常");

        return user;
    }
}
