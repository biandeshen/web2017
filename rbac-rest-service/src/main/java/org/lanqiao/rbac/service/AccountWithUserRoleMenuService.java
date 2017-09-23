package org.lanqiao.rbac.service;

import org.lanqiao.rbac.base.Mapper;
import org.lanqiao.rbac.base.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.lanqiao.rbac.dto.AccountWithUserRoleMenu;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional(readOnly=true)
public class AccountWithUserRoleMenuService extends AbstractService<AccountWithUserRoleMenu>{
    public List<AccountWithUserRoleMenu> findAllByAid(Integer aid) {
        return mapper.selectAllByAid(aid);
    }
}
