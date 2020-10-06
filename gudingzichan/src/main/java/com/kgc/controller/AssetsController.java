package com.kgc.controller;

import com.kgc.mapper.AssetsMapper;
import com.kgc.pojo.Assets;
import com.kgc.service.AssetsService;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AssetsController {
    @Resource
    AssetsService assetsService;
    @Resource
    AssetsMapper assetsMapper;
    @RequestMapping("/")
    public String index(Model model, HttpServletRequest request){
        String assetid=request.getParameter("assetid");
        String assettype=request.getParameter("assettype");
        String assettypes="";
        if (assettype!=null){
            assettypes=String.valueOf(assettype);
        }
        if (assetid==null && assettypes==""){
            List<Assets> assets=assetsMapper.selectByExample(null);
            model.addAttribute("assettypes",assettypes);
            model.addAttribute("assetid",assetid);
            model.addAttribute("list",assets);
        }else{
            List<Assets> assets=assetsService.selectAll(assetid,assettypes);
            model.addAttribute("assettypes",assettypes);
            model.addAttribute("assetid",assetid);
            model.addAttribute("list",assets);
        }
        return "index";
    }
    @RequestMapping("toAdd")
    public String toAdd(){
        return "add";
    }
    @RequestMapping("doAdd")
    public String doAdd(Assets assets){
        assetsService.insert(assets);
        return "redirect:/";
    }
}
