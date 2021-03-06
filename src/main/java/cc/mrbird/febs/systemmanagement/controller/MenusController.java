package cc.mrbird.febs.systemmanagement.controller;

import cc.mrbird.febs.systemmanagement.entity.Menus;
import cc.mrbird.febs.systemmanagement.entity.Result;

import cc.mrbird.febs.systemmanagement.service.MenusService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menus")
public class MenusController {

    @Autowired
    private MenusService menuService;

    @ApiOperation("根据主键查询")
    @GetMapping("/selectIdByKey/{menuId}")
    public Result selectIdByKey(@PathVariable("menuId") Integer menuId){
        Menus menu = menuService.selectIdByKey(menuId);
        if (menu == null){
            return new Result(false,"没有数据");
        }
        return new Result(true,"查询成功",menu);
    }

    @ApiOperation("根据主键删除")
    @GetMapping("/deleteIdByKey/{menuId}")
    public Result deleteIdByKey(@PathVariable("menuId") Integer menuId){
        try {
            menuService.deleteIdByKey(menuId);
            return new Result(true,"删除成功");
        }catch (Exception e){
            return new Result(false,"删除失败");
        }
    }

    @ApiOperation("添加菜单项")
    @RequestMapping(value = "/addMenu",method = RequestMethod.POST)
    public Result addMenu(@RequestBody Menus menu){
        try {
            menuService.addMenu(menu);
          return new Result(true,"添加成功");
        }catch (Exception e){
            e.printStackTrace();
          return new Result(false,"添加失败");
        }
    }

    @ApiOperation("修改菜单项")
    @RequestMapping(value = "/updateIdByKey",method = RequestMethod.POST)
    public Result updateIdByKey(@RequestBody Menus menu){
        try {
            menuService.updateIdByKey(menu);
            return new Result(true,"添加成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"添加失败");
        }
    }
}
