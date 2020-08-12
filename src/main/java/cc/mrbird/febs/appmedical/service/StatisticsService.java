package cc.mrbird.febs.appmedical.service;

import org.springframework.web.bind.annotation.PathVariable;

public interface StatisticsService {

    /**
     *  根据地区和服务方式查询已服务的
     * @param region
     * @param
     * @return
     */
    int selectCertificationStatusYes(String region,String entrustTheWay);

    /**
     *  根据地区和服务方式查询未服务的
     * @param region
     * @param
     * @return
     */
    int selectCertificationStatusNo(String region, String entrustTheWay);

    /**
     *  根据地区查询所有的已服务的
     */
    int selectRegionYes(String region);


    /**
     *  根据地区查询所有的未服务的
     */
    int selectRegionNo(String region);





    /**
     * 根据地址模糊查询已服务的个数
     * @return
     */
    int selectSiteYes(String site);

    /**
     * 根据地址模糊查询未服务的个数
     * @return
     */
    int selectSiteNo(String site);



    /**
     * 根据地址模糊查询已服务的个数
     * @return
     */
    int selectSiteETWYes(String site, String entrustTheWay);

    /**
     * 根据地址模糊查询未服务的个数
     * @return
     */
    int selectSiteAndETWNo(String site, String entrustTheWay);

}
