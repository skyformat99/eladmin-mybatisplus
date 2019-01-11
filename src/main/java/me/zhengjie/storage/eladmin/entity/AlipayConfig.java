package me.zhengjie.storage.eladmin.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 张俊辉
 * @since 2019-01-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class AlipayConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("appID")
    private String appID;

    private String charset;

    /**
     * 类型 固定格式json
     */
    private String format;

    @TableField("gatewayUrl")
    private String gatewayUrl;

    @TableField("notifyUrl")
    private String notifyUrl;

    @TableField("privateKey")
    private String privateKey;

    @TableField("publicKey")
    private String publicKey;

    @TableField("returnUrl")
    private String returnUrl;

    @TableField("signType")
    private String signType;

    @TableField("sysServiceProviderId")
    private String sysServiceProviderId;


}
