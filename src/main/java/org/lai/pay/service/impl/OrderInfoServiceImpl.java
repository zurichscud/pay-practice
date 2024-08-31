package org.lai.pay.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.lai.pay.mapper.OrderInfoMapper;
import org.lai.pay.model.OrderInfo;
import org.lai.pay.service.OrderInfoService;
import org.springframework.stereotype.Service;

@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements OrderInfoService {

}
