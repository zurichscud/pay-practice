package org.lai.pay;

import org.junit.jupiter.api.Test;
import org.lai.pay.config.WxPayConfig;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.security.PrivateKey;

@SpringBootTest
class PayPracticeApplicationTests {

    @Resource
    private WxPayConfig wxPayConfig;

    @Test
    void testGetPrivateKey() {
        //获取私钥路径
        String privateKeyPath = wxPayConfig.getPrivateKeyPath();
        //加载私钥
        PrivateKey privateKey = wxPayConfig.getPrivateKey(privateKeyPath);
        System.out.println(privateKey);
    }

}
