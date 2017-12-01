package me.imyu.web;

import me.imyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by imyu on 2017-11-29.
 */
@Controller
public class TestController {
    @Autowired
    UserService userService;

    @RequestMapping(path = "/test/list")
    public ModelAndView list() {
        return new ModelAndView("test/list");
    }

    @RequestMapping(path = "/test/getAll")
    @ResponseBody
    public Object getAll() {
        System.out.println(userService.getAll());
        return null;
    }
}
