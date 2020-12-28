package com.zay.orderserver.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author AnYuan
 */
@Service
@FeignClient(value = "user-server", fallback = UserServerFeignFallbackFactory.class)
public interface UserServerFeign {

    @GetMapping("/user-server/test/one")
    String userTestOne();

}

@Component
class UserServerFeignFallbackFactory implements UserServerFeign {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public String userTestOne() {
        log.info("请求userServer服务失败");
        return "请求userServer服务失败";
    }
}
