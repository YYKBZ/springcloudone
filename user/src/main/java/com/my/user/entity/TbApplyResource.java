package com.my.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
public class TbApplyResource implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "applyId", type = IdType.AUTO)
    private Integer applyId;

    @TableField("applyWeId")
    private String applyWeId;

    private String applicant;

    @TableField("activityName")
    private String activityName;

    @TableField("activityManning")
    private String activityManning;

    @TableField("createDate")
    private String createDate;

    @TableField("activityContent")
    private String activityContent;

    /**
     * 绑定手机号
     */
    @TableField("applyPhone")
    private String applyPhone;

    @TableField("applyReason")
    private String applyReason;

    @TableField("applyDevice")
    private String applyDevice;

    @TableField("applyPlace")
    private String applyPlace;

    @TableField("startUseDate")
    private LocalDateTime startUseDate;

    @TableField("endUseDate")
    private LocalDateTime endUseDate;

    @TableField("applyDay")
    private String applyDay;

    @TableField("applyDate")
    private LocalDateTime applyDate;

    @TableField("approvalFirst")
    private String approvalFirst;

    @TableField("approvalSecond")
    private String approvalSecond;

    @TableField("approvalFirstIdea")
    private String approvalFirstIdea;

    @TableField("approvalSecondIdea")
    private String approvalSecondIdea;

    @TableField("applyResult")
    private String applyResult;

    @TableField("applyState")
    private String applyState;

    @TableField("applyFinalDate")
    private LocalDateTime applyFinalDate;

    @TableField("placeId")
    private Integer placeId;

    /**
     * 评价语
     */
    private String evaluate;

    /**
     * 取值：上午，下午，全天
     */
    private String day;

    /**
     * 取值：优，良，中，差
     */
    private String rating;

    @TableField("messageId")
    private String messageId;

    /**
     * 联系手机号
     */
    @TableField("bindPhone")
    private String bindPhone;


}
