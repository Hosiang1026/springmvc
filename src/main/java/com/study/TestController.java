package com.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 测试
 *
 * @author Howe Hsiang
 *
 */

@Controller
public class TestController {

    String message = "Welcome to Spring MVC!";
 
    @RequestMapping("/hello")
    public ModelAndView showMessage(@RequestParam(value = "name", required = false, defaultValue = "Howe Hsiang") String name) {

        //1、收集参数、验证参数
        //2、绑定参数到命令对象
        //3、将命令对象传入业务对象进行业务处理
        //4、选择下一个页面

        //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
        ModelAndView mv = new ModelAndView("hellospring");
        //添加模型数据 可以是任意的POJO对象
        mv.addObject("message", message);
        mv.addObject("name", name);
        return mv;
    }

}
