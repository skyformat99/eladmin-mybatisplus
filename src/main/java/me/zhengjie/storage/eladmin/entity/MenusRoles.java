package me.zhengjie.storage.eladmin.entity;

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
public class MenusRoles implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long menuId;

    private Long roleId;


}
