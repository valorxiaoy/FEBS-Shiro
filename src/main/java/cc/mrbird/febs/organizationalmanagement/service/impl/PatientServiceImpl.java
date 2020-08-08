package cc.mrbird.febs.organizationalmanagement.service.impl;

import cc.mrbird.febs.organizationalmanagement.entity.Patient;
import cc.mrbird.febs.organizationalmanagement.entity.Staff;
import cc.mrbird.febs.organizationalmanagement.mapper.PatientMapper;
import cc.mrbird.febs.organizationalmanagement.service.PatientService;
import cc.mrbird.febs.systemmanagement.entity.PageResult;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientMapper patientMapper;


    @Override
    public Patient selectPhoneByKey(Integer phone) {
        return patientMapper.selectPhoneByKey(phone);
    }

    @Override
    public void add(Patient patient) {
        patient.setUpdateTime(new Date());
        patient.setCreateTime(new Date());
        patientMapper.add(patient);
    }

    @Override
    public void deletePhoneByKey(Integer phone) {
        patientMapper.deletePhoneByKey(phone);
    }



    @Override
    public void updatePhoneByKey(Patient patient) {
        patient.setUpdateTime(new Date());
        patientMapper.updatePhoneByKey(patient);
    }

    @Override
    public PageResult findAll(Integer currentPage, Integer pageSize, String queryString) {
        // 使用分页查询
        PageHelper.startPage(currentPage,pageSize);
        Page<Patient> all = patientMapper.findAll(queryString);
        return new PageResult(all.getTotal(),all.getResult());
    }
}
