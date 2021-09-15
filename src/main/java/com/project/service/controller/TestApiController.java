package com.project.service.controller;

import com.project.service.model.BaseModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/test")
public class TestApiController {

    @RequestMapping(value = "/testApi", produces = "application/json", method = RequestMethod.GET)
    public @ResponseBody
    BaseModel testApi() {
        BaseModel resp = new BaseModel();

        resp.setResult(true);
        resp.setMessage("測試訊息");

        return resp;
    }
}
