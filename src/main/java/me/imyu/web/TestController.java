package me.imyu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by imyu on 2017-11-29.
 */
@Controller
public class TestController {
    @RequestMapping(path = "/test/list")
    public ModelAndView list() {
        return new ModelAndView("test/list");
    }
}
