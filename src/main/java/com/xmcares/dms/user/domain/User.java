package com.xmcares.dms.user.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

/**
 * 用户实体类
 *
 * @author huangzh
 */
@Data
@Entity
@Table(name = "dms_user")
public class User {

    /** id */
    @Id
    @Column(name = "id", nullable = false)
    private String id = UUID.randomUUID().toString();

    /** 用户名 */
    @Column(name = "user_name")
    private String userName;

    /** 用户编号 */
    @Column(name = "user_code")
    private String userCode;

    /** 真实姓名 */
    @Column(name = "real_name")
    private String realName;

    /** 密码 */
    @Column(name = "password")
    private String password;

    /** 是否管理员 */
    @Column(name = "is_admin")
    private Boolean admin;

    /** 备注 */
    @Column(name = "remark")
    private String remark;
}
