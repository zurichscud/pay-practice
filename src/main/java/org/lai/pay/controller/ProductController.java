package org.lai.pay.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.lai.pay.model.Product;
import org.lai.pay.service.ProductService;

import org.lai.pay.model.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Author: zurichscud
 * @Date: 2024/8/30 下午10:18
 * @Description: TODO
 */
@Api(tags = "商品管理")
@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Resource
    private ProductService productService;
    @ApiOperation("测试接口")
    @GetMapping("/hello")
    public R hello() {
        return R.ok().data("time", new Date());
    }

    @GetMapping("/list")
    public R list(){
        List<Product> list = productService.list();
        return R.ok().data("productList", list);
    }

}