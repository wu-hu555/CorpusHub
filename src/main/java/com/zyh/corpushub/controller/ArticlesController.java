package com.zyh.corpushub.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zyh.corpushub.common.Result;
import com.zyh.corpushub.entity.Articles;
import com.zyh.corpushub.entity.Corpora;
import com.zyh.corpushub.service.impl.ArticlesServiceImpl;
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
@RequestMapping("/articles")
public class ArticlesController {
    @Autowired
    private ArticlesServiceImpl articlesService;

    @GetMapping("list")
    @Operation(summary = "文章列表")
    public Result<List<Articles>> list(){
        return Result.success(articlesService.list());
    }



    //增
    @PostMapping("add")
    @Operation(summary = "添加文章")
    public Result<Boolean> add (@RequestBody Articles articles){
        boolean result = articlesService.save(articles);
        return Result.success(result);
    }

    //删
    @DeleteMapping("delete/{id}")
    @Operation(summary = "删除文章")
    public Result<Boolean> delete (@PathVariable Integer id){
        boolean result = articlesService.removeById(id);
        return Result.success(result);
    }


    //改

    @PutMapping("update")
    @Operation(summary = "修改文章")
    public Result<Boolean> update (@RequestBody Articles articles){
        boolean result = articlesService.updateById(articles);
        return Result.success(result);
    }


}
