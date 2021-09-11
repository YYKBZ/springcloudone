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
public class TbDevice implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "deviceId", type = IdType.AUTO)
    private Integer deviceId;

    @TableField("deviceName")
    private String deviceName;

    @TableField("devicePic")
    private String devicePic;

    @TableField("deviceInfo")
    private String deviceInfo;

    @TableField("deviceOwner")
    private String deviceOwner;

    @TableField("deviceNum")
    private Integer deviceNum;


}
