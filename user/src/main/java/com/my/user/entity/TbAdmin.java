package com.my.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class TbAdmin implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "adminId", type = IdType.AUTO)
    private Integer adminId;

    @TableField("adminName")
    private String adminName;

    @TableField("adminPwd")
    private String adminPwd;


}
