package cc.mrbird.febs.appmedical.controller;

import cc.mrbird.febs.appmedical.entity.PatientSerice;
import cc.mrbird.febs.appmedical.service.AppHospitalSericeService;
import cc.mrbird.febs.organizationalmanagement.entity.Patient;
import cc.mrbird.febs.organizationalmanagement.service.PatientService;
import cc.mrbird.febs.systemmanagement.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/hospitalSerice")
public class AppHospitalSericeController {

    @Autowired
    private AppHospitalSericeService sericeService;

    @Autowired
    private PatientService patientService;

    @GetMapping("/findAll")
    public Result appFindAll(){
        List<Patient> hos =sericeService.appFindAll();
      if (hos != null && hos.size() > 0){

        return new Result(true,"查询成功",hos);
      }
        return new Result(false,"查询失败");
    }

    @PostMapping("/add")
    public Result add(@RequestBody Patient patient){

        try {
            int phone = patient.getPhone();
            Patient patient1 = patientService.selectPhoneByKey(phone);
            if (patient1!=null){
                return new Result(false,"该手机已经注册过");
            }
            patientService.add(patient);
            return new Result(true,"添加成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"添加失败");
        }
    }

    @PostMapping("/selectStateByKey/{state}")
    public Result selectStateByKey(@PathVariable("state") String state){
        List<Patient> patient1 = sericeService.selectStateByKey(state);
        if (patient1 == null){
            return new Result(false,"没有数据");
        }
            return new Result(true,"查询成功",patient1);
    }



}
