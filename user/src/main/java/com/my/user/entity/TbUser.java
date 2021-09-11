package com.my.user.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author WangLuoXin
 * @since 2021-09-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TbUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("userId")
    private String userId;

    @TableField("userName")
    private String userName;

    @TableField("userWx")
    private String userWx;

    @TableField("roleId")
    private String roleId;

    @TableField("userOpenid")
    private String userOpenid;

    @TableField("userPhone")
    private String userPhone;


}
