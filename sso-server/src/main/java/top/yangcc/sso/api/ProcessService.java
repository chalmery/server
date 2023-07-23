package top.yangcc.sso.api;

import top.yangcc.server.result.SimpleResult;
import top.yangcc.sso.dto.LoginDTO;
import top.yangcc.sso.params.LoginParam;

/**
* 主流程服务
* @author: chalmery
* @date: 2023年7月23日 20:56:48
*/
public interface ProcessService {


    /**
     * 登陆接口
     * @param param 登陆入参
     * @return 返回token信息
     */
    SimpleResult<LoginDTO> login(LoginParam param);
    
}
