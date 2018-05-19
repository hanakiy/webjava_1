package shoppingsite.controller;

import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/itemlist", method = RequestMethod.GET)

public class ListController {

  @Autowired
  HttpSession session;

    public ModelAndView show(ModelAndView mav) {

      ArrayList<Item> itemlist= new ArrayList<Item>();

      mav.addObject("id", itemlist);
      mav.addObject("name", itemlist);
      mav.addObject("price", itemlist);

      mav.setViewName("itemlist");
      return mav;
    }
}
