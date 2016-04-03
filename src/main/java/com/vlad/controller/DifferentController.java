package com.vlad.controller;

import com.vlad.model.Consultant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by gleb on 03.04.16.
 */
@Controller
@RequestMapping("/allItems")
public class DifferentController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView showItems() {
        ModelAndView view = new ModelAndView("allItems");
        List<String> list = new ArrayList<>();
        list.add(UUID.randomUUID().toString());
        list.add(UUID.randomUUID().toString());
        list.add(UUID.randomUUID().toString());
        list.add(UUID.randomUUID().toString());
        list.add(UUID.randomUUID().toString());
        list.add(UUID.randomUUID().toString());
        list.add(UUID.randomUUID().toString());
        list.add(UUID.randomUUID().toString());
        view.addObject("allItems", list);
        return view;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String submitForm(Model model, List<String> list) {
        model.addAttribute("allItems", list);
        return "itemsResult";
    }


}
