package com.hendisantika.hazelcastsample.controller;

import com.hazelcast.core.HazelcastInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : hazelcast-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/10/18
 * Time: 04.01
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class HazelcastController {
    @Autowired
    private HazelcastInstance instance;     // autowire hazel cast instance

    @RequestMapping("/write")
    public String write(@RequestParam("values") String values) {
        java.util.Map<String, String> stringStringMap = instance.getMap("configuration");    // get map from hazel cast
        stringStringMap.put("data", values);                 // write value, This value will be accessible from another jvm also
        return "Value has been write to Hazelcast";
    }

    @RequestMapping("/read")
    public String read() {
        java.util.Map<String, String> stringStringMap = instance.getMap("configuration");    // get map from hazel cast
        return "Hazelcast values is :" + stringStringMap.get("data");                    // read value
    }
}