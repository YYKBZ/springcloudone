package com.my.user.entity;

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
public class TbMessageNotice implements Serializable {

    private static final long serialVersionUID = 1L;

    private String date;

    private String state;

    private String text;

    private String phone;

    @TableField("messageId")
    private String messageId;


}
