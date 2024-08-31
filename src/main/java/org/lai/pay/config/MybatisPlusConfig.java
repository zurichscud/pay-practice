package org.lai.pay.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: zurichscud
 * @Date: 2024/8/30 下午11:41
 * @Description: TODO
 */
@Configuration
@EnableTransactionManagement
@MapperScan("org.lai.pay.mapper")
public class MybatisPlusConfig {

}
