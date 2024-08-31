package org.lai.pay.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.lai.pay.mapper.ProductMapper;
import org.lai.pay.model.Product;
import org.lai.pay.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
