package cc.mrbird.febs.systemmanagement.service;

import cc.mrbird.febs.systemmanagement.entity.Menu;
import org.springframework.web.bind.annotation.PathVariable;

public interface MenuService {

    /**
     * 根据主键查询
     * @param menuId
     * @return
     */
    Menu selectIdByKey(@PathVariable("menuId") Integer menuId);

    /**
     * 根据id删除
     * @param menuId
     */
    void deleteIdByKey(Integer menuId);

    /**
     * 添加
     * @param menu
     */
    void addMenu(Menu menu);

    /**
     *  修改
     * @param menu
     */
    void updateIdByKey(Menu menu);
}
