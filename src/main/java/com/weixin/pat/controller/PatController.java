package com.weixin.pat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YangHua at 2021/7/29 8:52 下午
 */
@RestController
@RequestMapping("/chat")
public class PatController {

    /**
     * 拍一拍
     * @param req
     * @return
     */
    @GetMapping("pat")
    public String pat(@RequestParam("") String req) {
        return "accountQueryService.get(number)";
    }

    /**
     * 撤回拍一拍
     * @param req
     * @return
     */
    @GetMapping("/pat/withdraw")
    public String patWithdraw(@RequestParam("") String req) {
        return "accountQueryService.get(number";
    }
}
