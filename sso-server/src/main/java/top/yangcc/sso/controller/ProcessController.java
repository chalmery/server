package top.yangcc.sso.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import top.yangcc.server.result.SimpleResult;
import top.yangcc.sso.dto.LoginDTO;
import top.yangcc.sso.params.LoginParam;

/**
* 主流程服务
* @author: chalmery
* @date: 2023年7月23日 20:56:48
*/
@RestController("/sso")
public class ProcessController {


    /**
     * 登陆
     * @param param 登陆入参
     * @return 返回token信息
     */
    @PostMapping("/login")
    public SimpleResult<LoginDTO> login(LoginParam param){
        return SimpleResult.buildSuccess();
    }
    
}
