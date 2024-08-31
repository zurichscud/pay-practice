package org.lai.pay.model;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zurichscud
 * @Date: 2024/8/30 下午10:43
 * @Description: TODO
 */
@Data
public class R {
    private int code;
    private String message;
    private Map<String, Object> data = new HashMap<>();
    public  static  R ok(){
        R r = new R();
        r.setCode(0);
        r.setMessage("success");
        return r;
    }
    public  static  R error(){
        R r = new R();
        r.setCode(-1);
        r.setMessage("失败");
        return r;
    }
    /*便于链式操作*/
    public R data(String key, Object value){
        this.data.put(key, value);
        return this;
    }
}
