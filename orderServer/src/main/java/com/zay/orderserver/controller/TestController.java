package com.zay.orderserver.controller;


import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.zay.orderserver.client.UserServerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

/**
 * @author AnYuan
 * port: 9090
 */

@RestController
@RequestMapping("/order-server")
public class TestController {

    @Autowired
    private UserServerFeign userServerFeign;

    @GetMapping("/test/one")
    private String testOne() {
        HashMap<String, Object> map = Maps.newHashMapWithExpectedSize(2);
        map.put("code", 0);
        map.put("msg", "This is Order Server: 9090");

        String s = userServerFeign.userTestOne();
        map.put("requestData", s);

        return JSONObject.toJSONString(map);
    }
}
