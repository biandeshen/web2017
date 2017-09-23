package org.lanqiao.rbac.api;

import org.lanqiao.rbac.service.AccountWithUserRoleMenuService;
import org.web2017.web.rest.Result;
import org.web2017.web.rest.ResultGenerator;
import org.springframework.web.bind.annotation.*;
import org.lanqiao.rbac.dto.AccountWithUserRoleMenu;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;

/**
 * @author fjp
 * Created by 2017年9月15日
 */

@RestController
@RequestMapping("/rbac/AccountWithUserRoleMenu")
public class AccountWithUserRoleMenuAPI {
    @Resource
    private  AccountWithUserRoleMenuService accountWithUserRoleMenuService;

    @GetMapping("/u/{uid}") // /rbac/menu/1
    public Result showlist(@PathVariable("uid") Integer uid){
        return ResultGenerator.genSuccessResult(accountWithUserRoleMenuService.findAllByAid(uid));
    }
}
