package cc.mrbird.febs.appmedical.mapper;

import org.springframework.web.bind.annotation.PathVariable;

public interface StatisticsMapper {

    /**
     *  根据地区和服务方式查询已服务的
     * @param region
     * @param
     * @return
     */
    int selectCertificationStatusYes(@PathVariable("region") String region, @PathVariable("entrustTheWay") String entrustTheWay);

    /**
     *  根据地区和服务方式查询未服务的
     * @param region
     * @param
     * @return
     */
    int selectCertificationStatusNo(@PathVariable("region") String region, @PathVariable("entrustTheWay") String entrustTheWay);

    /**
     *  根据地区查询所有的已服务的
     */
    int selectRegionYes(@PathVariable("region") String region);


    /**
     *  根据地区查询所有的未服务的
     */
    int selectRegionNo(@PathVariable("region") String region);





    /**
     * 根据地址模糊查询已服务的个数
     * @return
     */
    int selectSiteYes(@PathVariable("site") String site);

    /**
     * 根据地址模糊查询未服务的个数
     * @return
     */
    int selectSiteNo(@PathVariable("site") String site);



    /**
     * 根据地址模糊查询已服务的个数
     * @return
     */
    int selectSiteETWYes(@PathVariable("site") String site,@PathVariable("entrustTheWay") String entrustTheWay);

    /**
     * 根据地址模糊查询未服务的个数
     * @return
     */
    int selectSiteAndETWNo(@PathVariable("site") String site,@PathVariable("entrustTheWay") String entrustTheWay);

}
