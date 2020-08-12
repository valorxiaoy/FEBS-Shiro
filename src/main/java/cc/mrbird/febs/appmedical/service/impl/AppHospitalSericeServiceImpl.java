package cc.mrbird.febs.appmedical.service.impl;


import cc.mrbird.febs.appmedical.mapper.AppHospitalSericeMapper;
import cc.mrbird.febs.appmedical.service.AppHospitalSericeService;
import cc.mrbird.febs.organizationalmanagement.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AppHospitalSericeServiceImpl implements AppHospitalSericeService {

    @Autowired
    private AppHospitalSericeMapper sericeMapper;

    @Override
    public List<Patient> appFindAll() {
        return sericeMapper.appFindAll();
    }

    @Override
    public List<Patient> selectStateByKey(String state) {
        return sericeMapper.electStateByKey(state);
    }
}
