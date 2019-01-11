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
public class Visits implements Serializable {

    private static final long serialVersionUID = 1L;

    private String date;

    private Long ipCounts;

    private Long pvCounts;

    @TableField("weekDay")
    private String weekDay;

    @TableField("createTime")
    private LocalDateTime createTime;


}
