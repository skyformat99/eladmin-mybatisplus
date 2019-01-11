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
public class QiniuConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("accessKey")
    private String accessKey;

    private String bucket;

    private String host;

    @TableField("secretKey")
    private String secretKey;

    private String type;

    private String zone;


}
