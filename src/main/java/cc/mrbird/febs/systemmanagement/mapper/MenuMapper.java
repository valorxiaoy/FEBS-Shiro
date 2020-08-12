package cc.mrbird.febs.systemmanagement.mapper;

import cc.mrbird.febs.systemmanagement.entity.Menu;
import org.springframework.web.bind.annotation.PathVariable;

public interface MenuMapper {

    /**
     * 根据主键查询
     * @param menuId
     * @return
     */
    Menu selectIdByKey(@PathVariable("menuId") Integer menuId);

    /**
     *  根据主键删除
     * @param menuId
     */
    void deleteIdByKey(@PathVariable("menuId") Integer menuId);

    /**
     *  新增
     * @param menu
     */
    void addMenu(Menu menu);

    /**
     * 修改
     * @param menu
     */
    void updateIdByKey(Menu menu);
}
