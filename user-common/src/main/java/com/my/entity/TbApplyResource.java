package com.my.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

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

    private Integer applyId;

    private String applyWeId;

    private String applicant;

    private String activityName;

    private String activityManning;

    private String createDate;

    private String activityContent;

    /**
     * 绑定手机号
     */
    private String applyPhone;

    private String applyReason;

    private String applyDevice;

    private String applyPlace;

    private LocalDateTime startUseDate;

    private LocalDateTime endUseDate;

    private String applyDay;

    private LocalDateTime applyDate;

    private String approvalFirst;

    private String approvalSecond;

    private String approvalFirstIdea;

    private String approvalSecondIdea;

    private String applyResult;

    private String applyState;

    private LocalDateTime applyFinalDate;

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

    private String messageId;

    /**
     * 联系手机号
     */
    private String bindPhone;


}
