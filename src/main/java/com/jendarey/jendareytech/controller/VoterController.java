package com.jendarey.jendareytech.controller;


import com.jendarey.jendareytech.model.Voter;
import com.jendarey.jendareytech.service.VoterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VoterController {

    @Autowired
    private  VoterService voterService;

    public VoterController() {
    }
    public VoterController(VoterService voterService) {
        this.voterService = voterService;
    }


    @GetMapping("/")
    public String index(){
        return "redirect:/index";
    }


    @GetMapping("/index")
    public String homePage(Model model){
        model.addAttribute("ip",voterService.getIpAddress());
        model.addAttribute("hostName",voterService.getHostName());
        return "index";

    }

    @PostMapping ("/vote")
    public String vote(@ModelAttribute Voter voter) {

        voterService.save(voter);
        return "redirect:/index";
    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("voter",voterService.getVoteDetails());
        return "voters-list";

    }

}
