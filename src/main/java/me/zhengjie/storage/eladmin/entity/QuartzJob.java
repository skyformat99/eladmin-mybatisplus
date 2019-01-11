package me.zhengjie.storage.eladmin.entity;

import java.time.LocalDateTime;
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
public class QuartzJob implements Serializable {

    private static final long serialVersionUID = 1L;

    private String beanName;

    private String cronExpression;

    private Boolean isPause;

    @TableField("jobName")
    private String jobName;

    private String methodName;

    private String params;

    private String remark;

    @TableField("updateTime")
    private LocalDateTime updateTime;


}
