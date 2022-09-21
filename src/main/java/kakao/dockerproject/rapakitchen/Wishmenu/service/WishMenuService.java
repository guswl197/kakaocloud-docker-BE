package kakao.dockerproject.rapakitchen.Wishmenu.service;

import kakao.dockerproject.rapakitchen.Wishmenu.entity.requestmenu;
import kakao.dockerproject.rapakitchen.Wishmenu.repository.WishMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WishMenuService {

    @Autowired
    private WishMenuRepository wishMenuRepository;

    public requestmenu write(requestmenu menu){
        wishMenuRepository.save(menu);
        System.out.println(menu.toString());
        return menu;
    }
}
