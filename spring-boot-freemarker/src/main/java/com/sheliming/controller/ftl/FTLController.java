package com.sheliming.controller.ftl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 整合Freemarker，默认模板配置路径为：src/main/resources/templates
 * 下的*.ftl
 */
@Controller
public class FTLController {
    @RequestMapping("/helloFtl")
    public String getftl(Map<String, Object> result) {
        result.put("name", "sheliming");
        result.put("sex", "1");
        List<String> listResult = new ArrayList<String>();
        listResult.add("zhangsan");
        listResult.add("lisi");
        listResult.add("wangwu");
        result.put("listResult", listResult);

        return "helloFtl";
    }
}
