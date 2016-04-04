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
import java.util.Map;
import java.util.UUID;

/**
 * Created by gleb on 03.04.16.
 */
@Controller
@RequestMapping("")
public class DifferentController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView showItems() {
        Consultant consultant = new Consultant();
        ModelAndView view = new ModelAndView("consultant");
        view.addObject("consultant", consultant);
        List<String> allItems = new ArrayList<>();
        allItems.add(UUID.randomUUID().toString());
        allItems.add(UUID.randomUUID().toString());
        allItems.add(UUID.randomUUID().toString());
        allItems.add(UUID.randomUUID().toString());
        allItems.add(UUID.randomUUID().toString());
        allItems.add(UUID.randomUUID().toString());
        allItems.add(UUID.randomUUID().toString());
        allItems.add(UUID.randomUUID().toString());
        view.addObject("allItems", allItems);
        return view;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String submitForm(Model model, Consultant consultant) {
        model.addAttribute("consultant", consultant);
        return "itemsResult";
    }


}
