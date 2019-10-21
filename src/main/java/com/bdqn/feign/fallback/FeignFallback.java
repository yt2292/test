package com.bdqn.feign.fallback;

import com.bdqn.feign.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FeignFallback implements FeignService {
    @Override
    public String testFeign(String name) {
        return "方法一出错";
    }
}
