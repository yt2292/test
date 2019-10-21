package com.bdqn.feign.service;

import com.bdqn.feign.fallback.FeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "provider",fallback = FeignFallback.class)
public interface FeignService {
    @RequestMapping("/testfeign")
    public String testFeign(@RequestParam String name);
}
