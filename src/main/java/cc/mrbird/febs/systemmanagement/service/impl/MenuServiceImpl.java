package cc.mrbird.febs.systemmanagement.service.impl;

import cc.mrbird.febs.systemmanagement.entity.Menu;
import cc.mrbird.febs.systemmanagement.mapper.MenuMapper;
import cc.mrbird.febs.systemmanagement.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;


    @Override
    public Menu selectIdByKey(Integer menuId) {
        return menuMapper.selectIdByKey(menuId);
    }

    @Override
    public void deleteIdByKey(Integer menuId) {
        menuMapper.deleteIdByKey(menuId);
    }

    @Override
    public void addMenu(Menu menu) {
        menuMapper.addMenu(menu);
    }

    @Override
    public void updateIdByKey(Menu menu) {
        menuMapper.updateIdByKey(menu);
    }
}
