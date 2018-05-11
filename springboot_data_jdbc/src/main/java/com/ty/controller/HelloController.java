package com.ty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/5/11.
 */
@Controller
public class HelloController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("query")
    @ResponseBody
    public Map<String,Object> findAll(){
        List<Map<String,Object>> list = jdbcTemplate.queryForList("SELECT * FROM department");
        return list.get(0);
    }
}
