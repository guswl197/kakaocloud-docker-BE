package kakao.dockerproject.rapakitchen.Menu.service;

import kakao.dockerproject.rapakitchen.Menu.entity.menulist;
import kakao.dockerproject.rapakitchen.Menu.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    private MenuRepository menuRepository;

    public List<menulist> getAllMenu(){ return menuRepository.findAll(); }

    public menulist getMenu(Integer menuId){
        return menuRepository.findById(menuId).get();
    }

    public menulist findById(Integer menuId){
        return menuRepository.findById(menuId).get();
    }
}
