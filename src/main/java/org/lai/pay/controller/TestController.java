package org.lai.pay.controller;

import io.swagger.annotations.Api;
import org.lai.pay.config.WxPayConfig;
import org.lai.pay.model.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: zurichscud
 * @Date: 2024/8/31 上午12:58
 * @Description: TODO
 */
@Api(tags = "微信支付配置文件读取")
@RestController
@RequestMapping("/api/test")
public class TestController {
    @Resource
    private WxPayConfig wxPayConfig;

    @GetMapping
    public R getWxPayConfig() {
        String mchId = wxPayConfig.getMchId();
        return R.ok().data("mchId",mchId);
    }
}

