package org.lanqiao.rbac.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class AccountWithUserRoleMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;

    @Column(name = "account")
    private String accountAccount;

    @Column(name = "user_profile_id")
    private Integer userId;

    @Column(name = "nick_name")
    private String userNickname;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "menu_id")
    private Integer menuId;

    @Column(name = "title")
    private String menuTitle;

    @Column(name = "pid")
    private Integer menuPid;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountAccount() {
        return accountAccount;
    }

    public void setAccountAccount(String accountAccount) {
        this.accountAccount = accountAccount;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    public Integer getMenuPid() {
        return menuPid;
    }

    public void setMenuPid(Integer menuPid) {
        this.menuPid = menuPid;
    }

    @Override
    public String toString() {
        return "AccountWithUserRoleMenu{" +
                "accountId=" + accountId +
                ", accountAccount='" + accountAccount + '\'' +
                ", userId=" + userId +
                ", userNickname='" + userNickname + '\'' +
                ", roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", menuId=" + menuId +
                ", menuTitle='" + menuTitle + '\'' +
                ", menuPid=" + menuPid +
                '}';
    }
}
