package com.baidu.systemcase.controller;

import com.baidu.systemcase.model.User;
import com.baidu.systemcase.service.IUserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ningyunfa on 2017/9/1.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;
    public void selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException{
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        long userId = Long.parseLong(request.getParameter("id"));
        User user = this.userService.selectUser(userId);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().close();
    }
}
