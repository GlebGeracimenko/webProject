package com.vlad.controller;

import com.vlad.dao.DBDifferentDAO;
import com.vlad.model.DBDifferent;
import com.vlad.model.ItemsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by gleb on 03.04.16.
 */
@Controller
@RequestMapping("")
public class DifferentController {

    @Autowired
    private DBDifferentDAO differentDAO;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView showItems() {
        ItemsRepo itemsRepo = new ItemsRepo();
        ModelAndView view = new ModelAndView("itemsRepo");
        view.addObject("itemsRepo", itemsRepo);
        List<DBDifferent> allItems = differentDAO.getAll();
        view.addObject("allItems", allItems);
        return view;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String submitForm(Model model, ItemsRepo itemsRepo, BindingResult result) {
        model.addAttribute("itemsRepo", itemsRepo);
        //System.out.println(itemsRepo.getDifferentList().get(0));
        return "itemsResult";
    }


}
