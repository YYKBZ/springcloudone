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
public class TbPlace implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "placeId", type = IdType.AUTO)
    private Integer placeId;

    @TableField("placeName")
    private String placeName;

    @TableField("placeArea")
    private Integer placeArea;

    @TableField("placePeoples")
    private Integer placePeoples;

    @TableField("typeId")
    private Integer typeId;

    @TableField("placePic")
    private String placePic;

    @TableField("placeInfo")
    private String placeInfo;

    @TableField("placeState")
    private String placeState;


}
