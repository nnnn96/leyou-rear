package com.leyou.item.web;

import com.leyou.item.pojo.SpecGroup;
import com.leyou.item.pojo.SpecParam;
import com.leyou.item.service.SpecGroupService;
import com.leyou.item.service.SpecParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author nzx
 * @email niu.nzx@bitsun-inc.com
 */
@RestController
@RequestMapping("spec")
public class SpecParamController {

    @Autowired
    private SpecParamService specParamService;

    @GetMapping(value = "params")
    private ResponseEntity<List<SpecParam>> queryParamListByGid(@RequestParam(value = "gid",required = false) Long gid,
                                                                @RequestParam(value = "cid",required = false) Long cid,
                                                                @RequestParam(value = "searching",required = false) Boolean searching) {
        return ResponseEntity.ok(specParamService.queryParamListByGid(gid,cid,searching));
    }
}
