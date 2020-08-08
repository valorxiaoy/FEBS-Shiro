package cc.mrbird.febs.organizationalmanagement.controller;


import cc.mrbird.febs.organizationalmanagement.entity.HospitalSerice;
import cc.mrbird.febs.organizationalmanagement.service.HospitalSericeService;
import cc.mrbird.febs.systemmanagement.entity.PageResult;
import cc.mrbird.febs.systemmanagement.entity.QueryPageBean;
import cc.mrbird.febs.systemmanagement.entity.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hospitalserice")
public class HospitalSericeManagementController {

    @Autowired
    private HospitalSericeService sericeService;

    @ApiOperation("根据编号查询服务项目")
    @GetMapping("/selectSeriaByKey/{sericeSerial}")
    public Result selectSeriaByKey(@PathVariable("sericeSerial") String sericeSerial){
        try {
            HospitalSerice guardian = sericeService.selectSeriaByKey(sericeSerial);
            return new Result(true,"查询成功",guardian);
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"查询失败");
        }
    }

    @ApiOperation("添加服务项目")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result add(@RequestBody HospitalSerice hospitalSerice){
        try {
            String sericeSerial = hospitalSerice.getSericeSerial();
            HospitalSerice hos = sericeService.selectSeriaByKey(sericeSerial);
            if (hos!=null){
                return new Result(false,"该手机已经注册过");
            }
            sericeService.add(hospitalSerice);
            return new Result(true,"添加成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"添加失败");
        }
    }

    @ApiOperation("根据项目编号删除")
    @GetMapping("/deleteSerialByKey/{sericeSerial}")
    public Result deleteSerialByKey(@PathVariable("sericeSerial") String sericeSerial){
        try {
            sericeService.deleteSerialByKey(sericeSerial);
            return new Result(true,"删除成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    @ApiOperation("根据项目编号修改")
    @RequestMapping("/updateSericeByKey")
    public Result updateSericeByKey(@RequestBody HospitalSerice hospitalSerice){
        try {
            HospitalSerice hos =  sericeService.selectSeriaByKey(hospitalSerice.getSericeSerial());
            if (hos == null){
                return new Result(false,"你修改的信息不存在");
            }
            sericeService.updateSericeByKey(hospitalSerice);
            return  new Result(true,"修改成功");
        }catch (Exception e){
            e.printStackTrace();
            return  new Result(false,"修改失败");
        }
    }

    @ApiOperation("分页查询")
    @RequestMapping(value = "/findAll",method = RequestMethod.POST)
    public PageResult findAll(@RequestBody QueryPageBean queryPageBean){
        PageResult all = sericeService.findAll(queryPageBean.getCurrentPage(), queryPageBean.getPageSize()
                ,queryPageBean.getQueryString());
        return all;
    }

    @ApiOperation("根据项目编号修改项目状态")
    @GetMapping("/updatestate/{sericeSerial}")
    public Result updateState(@PathVariable("sericeSerial") String sericeSerial){
        try {
            sericeService.updateState(sericeSerial);

            return new Result(true,"修改成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }
}
