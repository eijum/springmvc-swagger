package com.sxz.zxd.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dxjm on 2017/7/27.
 */

@Api(value = "helloController", description = "hello控制器")
@Controller
public class HelloController {


    @ApiOperation(value = "获取hello")
    @RequestMapping(value = "getHello", method = RequestMethod.GET)
    @ResponseBody
    public String getHello(){
        return "hello";
    }


}
