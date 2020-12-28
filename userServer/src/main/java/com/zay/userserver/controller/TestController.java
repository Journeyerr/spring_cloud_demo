package com.zay.userserver.controller;


import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

/**
 * @author AnYuan
 * port: 9091
 */

@RestController
@RequestMapping("/user-server")
public class TestController {

    @GetMapping("/test/one")
    private String testOne() {
        HashMap<String, Object> map = Maps.newHashMapWithExpectedSize(2);
        map.put("code", 0);
        map.put("msg", "This is User Server: 9091");
        throw new RuntimeException("服务端测试异常！");
//        return JSONObject.toJSONString(map);
    }
}
