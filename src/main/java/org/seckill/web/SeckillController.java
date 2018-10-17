package org.seckill.web;

import org.seckill.entity.Seckill;
import org.seckill.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * ClassName: SeckillController
 * Description: TODO
 * Author: Cribbee
 * Date: 2018/10/17、下午5:27
 * Version: 1.0
 **/

@Controller
@RequestMapping("/seckill")//url:/模块/资源/{id}/细分 （对应） /seckill/list
public class SeckillController {

    @Autowired
    private SeckillService seckillService;

    @RequestMapping(name = "/list", method = RequestMethod.GET)
    public String list(Model model){
        //list.jsp(模板) + model(数据) = ModelAndView
        //获取列表页--调用Service
        List<Seckill> list = seckillService.getSeckillList();
        model.addAttribute("list",list);
        return "list";// /WEB-INF/jsp/"list".jsp
    }

    @RequestMapping(value = "/{seckillId}/detail", method = RequestMethod.GET)
    public String detail(@PathVariable("seckillId") Long seckillId, Model model) {
        if (seckillId == null) {
            return "redirect:/seckill/list";
        }
        Seckill seckill = seckillService.getById(seckillId);
        if (seckill == null) {
            return "forward:/seckill/list";
        }
        model.addAttribute("seckill", seckill);
        return "detail";
    }
}
