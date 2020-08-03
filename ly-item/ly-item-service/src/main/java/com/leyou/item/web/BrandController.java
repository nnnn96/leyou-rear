package com.leyou.item.web;

import com.github.pagehelper.Page;
import com.leyou.common.vo.PageResult;
import com.leyou.item.pojo.Brand;
import com.leyou.item.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author nzx
 * @email niu.nzx@bitsun-inc.com
 */
@RestController
@RequestMapping("brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     * 分页查询品牌
     * @param page
     * @param rows
     * @param sortBy
     * @param desc
     * @param key
     * @return
     */
    @GetMapping("page")
    private ResponseEntity<PageResult<Brand>> queryBrandPager(
            @RequestParam(value = "page",defaultValue = "1") Integer page,
            @RequestParam(value = "rows",defaultValue = "5") Integer rows,
            @RequestParam(value = "sortBy",required = false) String sortBy,
            @RequestParam(value = "desc",defaultValue="false") Boolean desc,
            @RequestParam(value = "key",required = false) String key
    ) {
        return ResponseEntity.ok(brandService.queryBrandPager(page,rows,sortBy,desc,key));
    }

    /**
     * 新增一个品牌
     * @param brand
     * @param cids
     * @return
     */
    @PostMapping
    private ResponseEntity<Void> saveBrand(Brand brand, @RequestParam(value = "cids")List<Long> cids) {
        brandService.saveBrand(brand, cids);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    /**
     * 根据分类id查询品牌列表
     * @param cid
     * @return
     */
    @GetMapping("cid/{cid}")
    public ResponseEntity<List<Brand>> queryBrandListByCid(@PathVariable("cid") Long cid) {

        return ResponseEntity.ok(brandService.queryBrandListByCid(cid));
    }
}
