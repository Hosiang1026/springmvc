package com.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

 
/**
 * ����
 * 
 * @author Howe Hsiang
 *
 */
@Controller
public class TestController {

    String message = "Welcome to Spring MVC!";
 
    @RequestMapping("/hello")
    public ModelAndView showMessage(@RequestParam(value = "name", required = false, defaultValue = "Howe Hsiang") String name) {
 
    	//ָ����ͼ
        ModelAndView mv = new ModelAndView("hellospring");
        //����ͼ�������Ҫչʾ��ʹ�õ����ݣ�����ҳ����ʹ��
        mv.addObject("message", message);
        mv.addObject("name", name);
        return mv;
    }
}
