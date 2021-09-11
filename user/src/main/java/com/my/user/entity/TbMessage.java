package com.my.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
public class TbMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "msgId", type = IdType.AUTO)
    private Integer msgId;

    @TableField("msgContent")
    private String msgContent;

    @TableField("msgDate")
    private LocalDate msgDate;


}
