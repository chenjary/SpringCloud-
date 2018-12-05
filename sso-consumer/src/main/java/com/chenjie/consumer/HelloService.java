package com.chenjie.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IDEA
 *
 * @author: Chenjie
 * @Date：Created in 13:00 2018/12/5
 * @Description：${description}
 * @Modified By：
 * @Version: $version$
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String helloService(String name) {
        return restTemplate.getForObject("http://service-producer/hello?name="+name,String.class);
    }
}
