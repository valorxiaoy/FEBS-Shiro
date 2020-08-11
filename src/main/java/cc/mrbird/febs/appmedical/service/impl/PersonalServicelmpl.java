package cc.mrbird.febs.appmedical.service.impl;

import cc.mrbird.febs.appmedical.entity.Pwd;
import cc.mrbird.febs.appmedical.mapper.PersonalMapper;
import cc.mrbird.febs.appmedical.service.PersonalService;
import cc.mrbird.febs.organizationalmanagement.entity.AgeUtils;
import cc.mrbird.febs.organizationalmanagement.entity.Staff;
import cc.mrbird.febs.systemmanagement.entity.UserT;
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
    public UserT selectPhoneByKey(String phone) {
        return personalMapper.selectPhoneByKey(phone);
    }

    @Override
    public void updatePhoneByKey(UserT user) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd" );
        int ageByBirth = AgeUtils.getAgeByBirth(sdf.parse(user.getBirthday()));
        user.setAge(ageByBirth);
        user.setModifyTime(new Date());
        personalMapper.updatePhoneByKey(user);
    }

    @Override
    public void updatePwd(Pwd pwd) {
        personalMapper.updatePwd(pwd.getPhnoe(),pwd.getNewPwd());
    }

    @Override
    public UserT selectUserPhoneByKey(String phone) {
        return personalMapper.selectUserPhoneByKey(phone);
    }
}
