package com.jzo2o.customer.controller.consumer;

import com.jzo2o.customer.model.dto.request.InstitutionRegisterReqDTO;
import com.jzo2o.customer.model.dto.request.InstitutionResetPasswordReqDTO;
import com.jzo2o.customer.service.IServeProviderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Jimmy679
 * @date 2024/6/23
 * @Description
 */
@RestController("openServeProviderController")
@RequestMapping("/open/serve-provider/institution")
@Api(tags = "机构端 -  注册等相关接口")
public class ServeProviderController {

    @Resource
    private IServeProviderService iServeProviderService;
    @PostMapping("/register")
    @ApiOperation("机构注册接口")
    public void register(@RequestBody InstitutionRegisterReqDTO institutionRegisterReqDTO){
        iServeProviderService.register(institutionRegisterReqDTO);
    }
}