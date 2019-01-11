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
public class Picture implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("createTime")
    private LocalDateTime createTime;

    private String deleteUrl;

    private String filename;

    private String height;

    private String size;

    private String url;

    private String username;

    private String width;


}
