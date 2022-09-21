package kakao.dockerproject.rapakitchen.Menu.controller;

import kakao.dockerproject.rapakitchen.Menu.entity.menulist;
import kakao.dockerproject.rapakitchen.Menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping
    private List<menulist> menu() {
        return menuService.getAllMenu();
    }
}
