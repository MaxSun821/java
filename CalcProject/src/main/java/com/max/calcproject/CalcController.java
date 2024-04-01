package com.max.calcproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: CalcController
 * Package: com.max.calcproject
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/4/1 20:30
 * @Version 1.0
 */

@RequestMapping("/calc")
@RestController
public class CalcController {
    @RequestMapping("/sum")
    public String calcSum(Integer num1, Integer num2) {
        Integer sum = num1 + num2;
        return "计算结果是：" + sum;
    }
}
