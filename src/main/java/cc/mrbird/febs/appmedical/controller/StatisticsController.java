package cc.mrbird.febs.appmedical.controller;

import cc.mrbird.febs.appmedical.service.StatisticsService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
@Slf4j
@RestController
@RequestMapping("/statistics")
public class StatisticsController {

    @Autowired
    private StatisticsService service;


    @ApiOperation("地区的统计")
    @GetMapping("/selectCertificationStatus/{region}/{entrustTheWay}")
    public Map<String,Integer> selectCertificationStatus(@RequestParam("region") String region,
                                                         @RequestParam("entrustTheWay") String entrustTheWay){
        int regionYes = service.selectCertificationStatusYes(region, entrustTheWay);
        int regionNo = service.selectCertificationStatusNo(region, entrustTheWay);

        int regionYesSum = service.selectRegionYes(region);
        int regionNoSum = service.selectRegionNo(region);

        Map<String,Integer> map = new HashMap<>();
        map.put("regionYes",regionYes);
        map.put("regionNo",regionNo);
        map.put("regionYesSum",regionYesSum);
        map.put("regionNoSum",regionNoSum);
        return map;
    }


    @ApiOperation("地址的统计")
    @GetMapping("/selectSite/{site}/{entrustTheWay}")
    public Map<String,Integer> selectSite(@RequestParam("region") String site,
                                                         @RequestParam("entrustTheWay") String entrustTheWay){
        int siteYesSum = service.selectSiteYes(site);
        int siteNoSum = service.selectSiteNo(site);
        int siteYes = service.selectSiteETWYes(site, entrustTheWay);
        int siteNo = service.selectSiteAndETWNo(site, entrustTheWay);

        Map<String,Integer> map = new HashMap<>();
        map.put("siteYesSum",siteYesSum);
        map.put("siteNoSum",siteNoSum);
        map.put("siteYes",siteYes);
        map.put("siteNo",siteNo);
        return map;
    }
}
