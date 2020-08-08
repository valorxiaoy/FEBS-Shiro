package cc.mrbird.febs.organizationalmanagement.service.impl;

import cc.mrbird.febs.organizationalmanagement.entity.Guardian;
import cc.mrbird.febs.organizationalmanagement.mapper.GuardianMapper;
import cc.mrbird.febs.organizationalmanagement.service.GuardianService;
import cc.mrbird.febs.systemmanagement.entity.PageResult;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class GuardianServiceImpl implements GuardianService {

    @Autowired
    private GuardianMapper guardianMapper;


    @Override
    public Guardian selectPhoneByKey(Integer phone) {
        return guardianMapper.selectPhoneByKey(phone);
    }

    @Override
    public void add(Guardian guardian) {
        guardian.setUpdateTime(new Date());
        guardian.setCreateTime(new Date());
        guardianMapper.add(guardian);
    }

    @Override
    public void deletePhoneByKey(Integer phone) {
        guardianMapper.deletePhoneByKey(phone);
    }

    @Override
    public void updatePhoneByKey(Guardian guardian) {
        guardianMapper.updatePhoneByKey(guardian);
    }

    @Override
    public PageResult findAll(Integer currentPage, Integer pageSize, String queryString) {
        PageHelper.startPage(currentPage,pageSize);
        Page<Guardian> all =guardianMapper.findAll(queryString);

        return new PageResult(all.getTotal(),all.getResult());
    }
}
