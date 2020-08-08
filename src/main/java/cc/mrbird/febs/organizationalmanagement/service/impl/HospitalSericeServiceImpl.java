package cc.mrbird.febs.organizationalmanagement.service.impl;

import cc.mrbird.febs.organizationalmanagement.entity.HospitalSerice;
import cc.mrbird.febs.organizationalmanagement.mapper.HospitalSericeMapper;
import cc.mrbird.febs.organizationalmanagement.service.HospitalSericeService;
import cc.mrbird.febs.systemmanagement.entity.PageResult;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class HospitalSericeServiceImpl implements HospitalSericeService {
    @Autowired
    private HospitalSericeMapper sericeMapper;


    @Override
    public HospitalSerice selectSeriaByKey(String sericeSerial) {
        return sericeMapper.selectSeriaByKey(sericeSerial);
    }

    @Override
    public void add(HospitalSerice hospitalSerice) {
        hospitalSerice.setCreateTime(new Date());
        hospitalSerice.setUpdateTime(new Date());
        sericeMapper.add(hospitalSerice);
    }

    @Override
    public void deleteSerialByKey(String sericeSerial) {
        sericeMapper.deleteSerialByKey(sericeSerial);
    }

    @Override
    public void updateSericeByKey(HospitalSerice hospitalSerice) {
        hospitalSerice.setUpdateTime(new Date());
        sericeMapper.updateSericeByKey(hospitalSerice);
    }

    @Override
    public PageResult findAll(Integer currentPage, Integer pageSize, String queryString) {
        PageHelper.startPage(currentPage,pageSize);
        Page<HospitalSerice> hos = sericeMapper.findAll(queryString);
        return new PageResult(hos.getTotal(),hos.getResult());
    }


}
