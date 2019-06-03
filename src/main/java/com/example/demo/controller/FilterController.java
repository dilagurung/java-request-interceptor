package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by oa on 6/2/2019.
 */
@RestController
public class FilterController
{
    @RequestMapping(value = { "/secure-code" })
    public String secureCode() {

        return "2@F1FR$(%23";
    }

    @RequestMapping(value = { "/secure-code/public" })
    public String pubCode() {

        return "2@CLASG$(%23";
    }


    @RequestMapping(value = { "/auth-failed"})
    public String authFailed()
    {
        return "auth-failed";
    }


}
