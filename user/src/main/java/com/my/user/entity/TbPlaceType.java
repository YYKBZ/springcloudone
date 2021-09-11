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
public class TbPlaceType implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("typeId")
    private Integer typeId;

    @TableField("typeName")
    private String typeName;


}
