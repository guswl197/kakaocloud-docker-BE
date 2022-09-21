package kakao.dockerproject.rapakitchen.Wishmenu.controller;


import kakao.dockerproject.rapakitchen.Wishmenu.DTO.WishMenuRequest;
import kakao.dockerproject.rapakitchen.Wishmenu.entity.requestmenu;
import kakao.dockerproject.rapakitchen.Wishmenu.service.WishMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
@RequestMapping("/wishmenu")
public class wishMenuController {

    @Autowired
    private WishMenuService wishMenuService;

    @PostMapping
    private Boolean wishMenu(@RequestBody WishMenuRequest wishmenu){
        requestmenu addMenu = null;
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        try{
            addMenu = requestmenu.builder()
                    .requestDate(timestamp)
                    .requestMenu(wishmenu.getRequestMenu())
                    .build();

            wishMenuService.write(addMenu);
        } catch (Exception e){
            return false;
        }
        return true;
    }


}


/*

 this.requestId = requestId;
        this.requestDate = requestDate;
        this.requestMenu = requestMenu;
 */