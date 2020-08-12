package cc.mrbird.febs.appmedical.controller;

import cc.mrbird.febs.appmedical.entity.AliYun;
import cc.mrbird.febs.appmedical.entity.RedisMessageConstant;
import cc.mrbird.febs.appmedical.entity.ValidateCodeUtils;
import cc.mrbird.febs.systemmanagement.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.JedisPool;

@Slf4j
@RestController
@RequestMapping("ValidateCode")
public class ValidateCodeController {

  /*  @Autowired
   private JedisPool jedisPool;

    @GetMapping("/sendPwd/{phone}")
    public Result sendPwd(@PathVariable("phone") String phone){
        Integer code = ValidateCodeUtils.generateValidateCode(6);
        //给用户发送验证码
        try {
            AliYun.note(phone,code.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"短信发送失败");
        }
        //将验证存入 redis中
        jedisPool.getResource().setex(phone+ RedisMessageConstant.SENDTYPE_GETPWD,300,code.toString());
        return new Result(true,"短信发送成功");
    }*/
}
