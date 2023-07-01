package com.hncboy.beehive.base.domain.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.hncboy.beehive.base.enums.OpenAiApiKeyStatus;
import com.hncboy.beehive.base.enums.OpenAiApiKeyUseSceneEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author hncboy
 * @date 2023/6/30
 * OpenAi ApkKey 表实体类
 */
@TableName("bh_openai_api_key")
@Data
public class OpenAiApiKeyDO {

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * apiKey
     */
    private String apiKey;

    /**
     * 请求地址
     */
    private String baseUrl;

    /**
     * 使用场景列表
     */
    private List<OpenAiApiKeyUseSceneEnum> useScenes;

    /**
     * 总共额度
     */
    private BigDecimal totalBalance;

    /**
     * 已使用额度
     */
    private BigDecimal usageBalance;

    /**
     * 剩余额度
     */
    private BigDecimal remainBalance;

    /**
     * 刷新余额时间
     */
    private Date refreshBalanceTime;

    /**
     * 权重，权重高的优先执行
     */
    private Integer weight;

    /**
     * 状态
     */
    private OpenAiApiKeyStatus status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 版本
     */
    private Integer version;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
}
