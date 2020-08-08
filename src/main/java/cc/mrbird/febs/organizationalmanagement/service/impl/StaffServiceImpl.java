package cc.mrbird.febs.organizationalmanagement.service.impl;

import cc.mrbird.febs.organizationalmanagement.entity.AgeUtils;
import cc.mrbird.febs.organizationalmanagement.entity.Patient;
import cc.mrbird.febs.organizationalmanagement.entity.Staff;
import cc.mrbird.febs.organizationalmanagement.mapper.StaffMapper;
import cc.mrbird.febs.organizationalmanagement.service.StaffService;
import cc.mrbird.febs.systemmanagement.entity.PageResult;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffMapper staffMapper;

    @Override
    public void addStaff(Staff staff) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd" );

        int ageByBirth = AgeUtils.getAgeByBirth(sdf.parse(staff.getBirthday()));
        staff.setAge(ageByBirth);
        staff.setCreateTime(new Date());
        staff.setUpdateTime(new Date());
        staffMapper.addStaff(staff);
        return;
    }

    @Override
    public Staff selectStaffByKey(String identityCardFront) {
        return staffMapper.selectStaffByKey(identityCardFront);

    }

    @Override
    public void deleteStaffByKey(String identityCardFront) {
        staffMapper.deleteStaffByKey(identityCardFront);
        return;
    }

    @Override
    public PageResult findAll(Integer currentPage, Integer pageSize, String queryString) {
        // 使用分页查询
        PageHelper.startPage(currentPage,pageSize);
        Page<Patient> all = staffMapper.findAll(queryString);
        return new PageResult(all.getTotal(),all.getResult());
    }

    @Override
    public void updateByKey(Staff staff) {
        staff.setUpdateTime(new Date());
        staffMapper.updateByKey(staff);
        return;
    }

}
