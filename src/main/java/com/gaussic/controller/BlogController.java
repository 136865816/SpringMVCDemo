package com.gaussic.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.gaussic.model.ApiRequest;
import com.gaussic.model.BlogEntity;
import com.gaussic.model.User;
import com.gaussic.model.UserEntity;
import com.gaussic.repository.BlogRepository;
import com.gaussic.repository.UserRepository;
import com.gaussic.util.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by dzkan on 2016/3/18.
 */
@Controller
public class BlogController {

    /*@Autowired
    BlogRepository blogRepository;

    @Autowired
    UserRepository userRepository;*/

    @RequestMapping(path="/hello",method = RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Object hello(@RequestBody User user) throws IOException {

//        System.out.println(JSON.toJSONString(json));
        System.out.println("controller user:" + user);

//        System.out.println("request params:" + JSON.parseObject(HttpUtil.readPostJsonData(request),new TypeReference<ApiRequest<List<Map<String,String>>>>(){}));
//        System.out.println("request params:" + JSON.parseObject(HttpUtil.readPostJsonData(request),new TypeReference<ApiRequest<List<Map<String,String>>>>(){}));

        return user;
    }
}
