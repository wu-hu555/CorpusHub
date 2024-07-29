package com.zyh.corpushub.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zyh.corpushub.common.Result;
import com.zyh.corpushub.entity.Corpora;
import com.zyh.corpushub.service.impl.CorporaServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zyh
 * @since 2024-07-24
 */
@RestController
@RequestMapping("/corpora")
public class CorporaController {
    @Autowired
    private CorporaServiceImpl corporaService;

    @GetMapping("list")
    @Operation(summary = "查询所有语料库")
    public Result<List<Corpora>> list(){
        return Result.success(corporaService.list());
    }


    //对name和 description进行模糊查询
    @GetMapping("fuzzySearch/{keyword}")
    @Operation(summary = "模糊查询")
    public Result<List<Corpora>> fuzzySearch(@PathVariable String keyword){
        QueryWrapper<Corpora> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name", keyword).like("description", keyword);
        List <Corpora> list = corporaService.list(queryWrapper);
        if(list == null || list.isEmpty()){
            return Result.error("nothing Found");
        }else
            return Result.success(list);
    }


    //增
    @PostMapping("add")
    @Operation(summary = "添加语料库")
    public Result<Boolean> add (@RequestBody Corpora corpora){
        boolean result = corporaService.save(corpora);
        return Result.success(result);
    }

    //删
    @DeleteMapping("delete/{id}")
    @Operation(summary = "删除语料库")
    public Result<Boolean> delete (@PathVariable Integer id){
        boolean result = corporaService.removeById(id);
        return Result.success(result);
    }


    //改

    @PutMapping("update")
    @Operation(summary = "修改语料库")
    public Result<Boolean> update (@RequestBody Corpora corpora){
        boolean result = corporaService.updateById(corpora);
        return Result.success(result);
    }



}
