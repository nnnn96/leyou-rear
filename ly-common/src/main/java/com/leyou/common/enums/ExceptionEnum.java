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
    CATEGORY_NOT_FOUND(404,"分类为空"),
    BRAND_SAVE_FAIL(500,"品牌保存失败"),
    INVALID_FILE_TYPE(500,"无效的文件类型"),
    FILE_CONTENT_ERROR(500,"文件内容错误"),
    GROUP_IS_EMPTY(404,"规格参数分组为空"),
    PARAM_IS_EMPTY(404,"规格参数为空"),
    SPU_IS_EMPTY(404,"品牌为空"),
    ;
    private Integer code;
    private String msg;
}
