package com.wpf.video.controller;

import com.wpf.video.util.MoblieUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PageController {

    @GetMapping("/")
    public String goIndex(HttpServletRequest request){
        String url = "web";
        boolean isMoblie = MoblieUtil.IsMoblie(request);
        if(isMoblie){
            url = "mobile";
        }
        return url+"/index";
    }
}
