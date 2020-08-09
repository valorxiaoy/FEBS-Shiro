package cc.mrbird.febs.appmedical.service.impl;

import cc.mrbird.febs.appmedical.mapper.PersonalMapper;
import cc.mrbird.febs.appmedical.service.PersonalService;
import cc.mrbird.febs.organizationalmanagement.entity.AgeUtils;
import cc.mrbird.febs.organizationalmanagement.entity.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class PersonalServicelmpl implements PersonalService {

        @Autowired
        private PersonalMapper personalMapper;

    @Override
    public Staff selectPhoneByKey(Integer phone) {
      return   personalMapper.selectPhoneByKey(phone);

    }

    @Override
    public void updatePhoneByKey(Staff staff) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd" );

        int ageByBirth = AgeUtils.getAgeByBirth(sdf.parse(staff.getBirthday()));
        staff.setAge(ageByBirth);
        staff.setUpdateTime(new Date());
        personalMapper.updatePhoneByKey(staff);
    }
}
