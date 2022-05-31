package moe.dazecake.arklightscloudbackend.controller;

import io.github.yedaxia.apidocs.ApiDoc;
import moe.dazecake.arklightscloudbackend.entity.AccountConfigEntity;
import moe.dazecake.arklightscloudbackend.service.Impl.UserServiceImpl;
import moe.dazecake.arklightscloudbackend.util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户接口
 */
@ApiDoc
@ResponseBody
@RestController
public class UserController {

    @Resource
    private UserServiceImpl userService;

    /**
     * 通过deviceToken获取所属账户配置
     *
     * @param deviceToken 设备token
     * @return moe.dazecake.arklightscloudbackend.util.Result<moe.dazecake.arklightscloudbackend.entity.AccountConfigEntity>
     * @author DazeCake
     * @date 2022/5/30 21:29
     */
    @GetMapping("/getDeviceAccountConfig")
    public Result<AccountConfigEntity> getDeviceAccountConfig(String deviceToken) {
        return userService.getDeviceAccountConfig(deviceToken);
    }
}
