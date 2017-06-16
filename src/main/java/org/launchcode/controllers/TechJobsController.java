package org.launchcode.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

/**
 * Created by lucke on 5/25/2017.
 */
public class TechJobsController {
    private static HashMap<String, String> actionChoices = new HashMap<>();

    @ModelAttribute("actions")
    public static void getActionChoices(Model model) {
        model.addAttribute("actions" , actionChoices);
    }



}
