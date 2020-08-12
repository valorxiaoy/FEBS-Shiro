package cc.mrbird.febs.appmedical.service.impl;

import cc.mrbird.febs.appmedical.mapper.StatisticsMapper;
import cc.mrbird.febs.appmedical.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatisticsServicelmpl implements StatisticsService {

    @Autowired
    private StatisticsMapper mapper;


    @Override
    public int selectCertificationStatusYes(String region, String entrustTheWay) {
        return mapper.selectCertificationStatusYes(region, entrustTheWay);
    }

    @Override
    public int selectCertificationStatusNo(String region, String entrustTheWay) {
        return mapper.selectCertificationStatusNo(region, entrustTheWay);
    }

    @Override
    public int selectRegionYes(String region) {
        return mapper.selectRegionYes(region);
    }

    @Override
    public int selectRegionNo(String region) {
        return mapper.selectRegionNo(region);
    }




    @Override
    public int selectSiteYes(String site) {
        return mapper.selectSiteYes(site);
    }

    @Override
    public int selectSiteNo(String site) {
        return mapper.selectSiteNo(site);
    }

    @Override
    public int selectSiteETWYes(String site, String entrustTheWay) {
        return mapper.selectSiteETWYes(site, entrustTheWay);
    }

    @Override
    public int selectSiteAndETWNo(String site, String entrustTheWay) {
        return mapper.selectSiteAndETWNo(site, entrustTheWay);
    }
}
