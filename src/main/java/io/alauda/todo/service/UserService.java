package io.alauda.todo.service;

import io.alauda.todo.vo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("user-service")
public interface UserService {

    @RequestMapping(method = RequestMethod.GET,value="/users/{id}")
    User getUserInfo(@PathVariable("id") Long id);
}
