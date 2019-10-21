package com.bdqn.feign.controller;

import com.bdqn.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeignController {
    @Resource
    private FeignService feignService;

    @RequestMapping("/testfeign")
    public String test(@RequestParam String name){
        System.out.println("1");
       return feignService.testFeign(name);
    }
}
