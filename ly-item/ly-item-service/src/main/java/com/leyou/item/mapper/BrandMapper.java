package com.leyou.item.mapper;

import com.leyou.common.mapper.BaseMapper;
import com.leyou.item.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.additional.idlist.IdListMapper;
import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author nzx
 * @email niu.nzx@bitsun-inc.com
 */
public interface BrandMapper extends BaseMapper<Brand> {

    /**
     * 品牌分类关系表插入数据
     * @param brandId
     * @param categoryId
     * @return
     */
    @Insert("INSERT INTO tb_category_brand ( brand_id, category_id )\n" +
            "VALUES\n" +
            "\t(#{brandId},#{categoryId})")
    int insertBrandCategory(@Param("brandId")Long brandId,@Param("categoryId")Long categoryId);

    @Select("SELECT\n" +
            "\tt2.id,t2.image,t2.`name`,t2.letter \n" +
            "FROM\n" +
            "\ttb_category_brand t1\n" +
            "\tLEFT JOIN tb_brand t2 ON t1.brand_id = t2.id \n" +
            "WHERE\n" +
            "\tt1.category_id = #{cid}")
    List<Brand> queryBrandListByCid(@Param("cid") Long cid);
}
