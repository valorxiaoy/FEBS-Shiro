package cc.mrbird.febs.appmedical.mapper;


import cc.mrbird.febs.organizationalmanagement.entity.Patient;

import java.util.List;

public interface AppHospitalSericeMapper {

    List<Patient> appFindAll();


    List<Patient> electStateByKey(String state);
}
