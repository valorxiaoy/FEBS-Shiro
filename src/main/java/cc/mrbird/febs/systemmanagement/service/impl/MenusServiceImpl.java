package cc.mrbird.febs.systemmanagement.service.impl;

import cc.mrbird.febs.systemmanagement.entity.Menus;

import cc.mrbird.febs.systemmanagement.mapper.MenusMapper;
import cc.mrbird.febs.systemmanagement.service.MenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenusServiceImpl implements MenusService {

    @Autowired
    private MenusMapper menuMapper;


    @Override
    public Menus selectIdByKey(Integer menuId) {
        return menuMapper.selectIdByKey(menuId);
    }

    @Override
    public void deleteIdByKey(Integer menuId) {
        menuMapper.deleteIdByKey(menuId);
    }

    @Override
    public void addMenu(Menus menu) {
        menuMapper.addMenu(menu);
    }

    @Override
    public void updateIdByKey(Menus menu) {
        menuMapper.updateIdByKey(menu);
    }
}
