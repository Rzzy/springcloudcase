package com.yz.consumer.service;

import org.springframework.cloud.client.discovery.DiscoveryClient;;
import com.yz.consumer.dao.UserDao;
import com.yz.consumer.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
//    @Autowired
//    private UserDao userDao;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    public List<User> queryUserByIds(List<Long> ids){
        List<User> users = new ArrayList<>();

        // String baseUrl = "http://localhost:8081/user/";
        // 根据服务名称，获取服务实例
        List<ServiceInstance> instances = discoveryClient.getInstances("userservice");
        // 因为只有一个UserService,因此我们直接get(0)获取

        ServiceInstance serviceInstance = instances.get(0);

        // 获取ip和端口信息
        String baseUrl = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/user/";

        for (Long id :  ids) {
            User user = restTemplate.getForObject(baseUrl + id, User.class);
            users.add(user);
        }
        return users;
    }
}
