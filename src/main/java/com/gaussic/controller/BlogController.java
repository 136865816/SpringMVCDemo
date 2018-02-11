package com.gaussic.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gaussic.model.ApiRequest;
import com.gaussic.model.BlogEntity;
import com.gaussic.model.UserEntity;
import com.gaussic.repository.BlogRepository;
import com.gaussic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by dzkan on 2016/3/18.
 */
@Controller
public class BlogController {

    /*@Autowired
    BlogRepository blogRepository;

    @Autowired
    UserRepository userRepository;*/

    @RequestMapping(path="/hello",method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String hello(@RequestBody ApiRequest<JSONObject> json){
        System.out.println(JSON.toJSONString(json));
        return "hello";
    }
}
