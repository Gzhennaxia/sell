package com.mooc.sell.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author: LiBo
 * @Date: 2018/8/8下午 09:57
 */
@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeixinController {

    @GetMapping("/check/token")
    public String checkToken(String signature, String timestamp, String nonce, String echostr, String code) {
        log.info("进入checkToken方法。。。");
        log.info("signature={},timestamp={},nonce={},echostr={}", signature, timestamp, nonce, echostr);
        // 没做校验，直接返回的。
        return echostr;
    }

    @GetMapping("/auth")
    public void auth(@RequestParam("code") String code) {
        log.info("进入auth方法。。。");
        log.info("code={}", code);

        // 换取access_token
        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wxa4fb609e642696be&secret=310ca42cb9f36f27a9c997b01faf6a0b&code=" + code + "&grant_type=authorization_code";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        log.info("response={}", response);
    }
}
