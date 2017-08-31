package org.lanqiao.myBatis.repository;

import java.util.List;
import org.lanqiao.myBatis.entity.Role;

public interface RoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac_role
     *
     * @mbg.generated Sun Aug 27 11:56:41 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac_role
     *
     * @mbg.generated Sun Aug 27 11:56:41 CST 2017
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac_role
     *
     * @mbg.generated Sun Aug 27 11:56:41 CST 2017
     */
    Role selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac_role
     *
     * @mbg.generated Sun Aug 27 11:56:41 CST 2017
     */
    List<Role> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rbac_role
     *
     * @mbg.generated Sun Aug 27 11:56:41 CST 2017
     */
    int updateByPrimaryKey(Role record);
}