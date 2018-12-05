package com.chenjie.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IDEA
 *
 * @author: Chenjie
 * @Date：Created in 13:02 2018/12/5
 * @Description：${description}
 * @Modified By：
 * @Version: $version$
 */
@RestController
public class HelloControler {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hello/{name}")
    public String Hello(@PathVariable String name) {
        return helloService.helloService(name);
    }
}
