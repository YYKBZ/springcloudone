package com.my.user.entity;

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
public class TbNotice implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键(年月日时分秒)+微信号
     */
    @TableId("noticeId")
    private String noticeId;

    @TableField("noticeContent")
    private String noticeContent;

    @TableField("noticeDateTime")
    private LocalDate noticeDateTime;

    @TableField("noticeSend")
    private String noticeSend;

    @TableField("noticeReceive1")
    private String noticeReceive1;

    @TableField("noticeReceive2")
    private String noticeReceive2;


}
