package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author nzx
 * @email niu.nzx@bitsun-inc.com
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum  ExceptionEnum {

    BRAND_NOT_FOUND(400,"品牌为空"),
    CATEGORY_NOT_FOUND(404,"分类为空")
    ;
    private Integer code;
    private String msg;
}
