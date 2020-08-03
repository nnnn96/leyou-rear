package com.leyou.item.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author nzx
 * @email niu.nzx@bitsun-inc.com
 */
@Data
@Table(name="tb_spu_detail")
public class SpuDetail {
    // id没有加上自增主键，因为这张表id不是自增的，而是和spu表的id关联的
    @Id
    private Long spuId;// 对应的SPU的id
    // 商品描述
    private String description;
    // 商品特殊规格的名称及可选值模板
    private String genericSpec;
    // 商品的全局规格属性
    private String specialSpec;
    // 包装清单
    private String packingList;
    // 售后服务
    private String afterService;
}

