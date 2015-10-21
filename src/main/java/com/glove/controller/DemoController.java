package com.glove.controller;

import com.glove.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Frank on 2015/10/21.
 */
@Controller
public class DemoController extends BaseController{

    @RequestMapping("test")
    public String test(){

        return "test";
    }
}
