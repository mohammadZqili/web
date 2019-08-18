package com.luv2code.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("students")
public class StudentController {

    @RequestMapping("/")
    public String index(){
        return "student-show";
    }

}
