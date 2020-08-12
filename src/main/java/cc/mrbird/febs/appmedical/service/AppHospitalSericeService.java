package cc.mrbird.febs.appmedical.service;


import cc.mrbird.febs.appmedical.entity.PatientSerice;
import cc.mrbird.febs.organizationalmanagement.entity.Patient;

import java.util.List;


public interface AppHospitalSericeService {

    List<Patient> appFindAll();

    List<Patient> selectStateByKey(String state);
}
