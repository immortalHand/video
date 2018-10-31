package com.wpf.video.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PageController {

    @GetMapping("/")
    public String goIndex(HttpServletRequest request){
        /*String url = "web";
        boolean isMoblie = MoblieUtil.IsMoblie(request);
        if(isMoblie){
            url = "mobile";
        }
        System.out.println(url);*/
        return "index";
    }
    @GetMapping("/index.html")
    public String goIndex2(){
        return "index";
    }
    @GetMapping("/single-page-with-img.html")
    public String goSinglePageWithImg(){
        return "single-page-with-img";
    }
    @GetMapping("/single-page.html")
    public String goSinglePage(){
        return "single-page";
    }
    @GetMapping("/single-video.html")
    public String goSingleVideo(){
        return "single-video";
    }
    @GetMapping("/gallery-video-boxed.html")
    public String goGalleryVideoBoxed(){
        return "gallery-video-boxed";
    }
    @GetMapping("/model/public-model.html")
    public String getModel(){
        return "model/public-model";
    }

    @GetMapping("/video")
    public String video(){
        return "video";
    }
}
