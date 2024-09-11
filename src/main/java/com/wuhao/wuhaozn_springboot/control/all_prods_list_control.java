package com.wuhao.wuhaozn_springboot.control;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wuhao.wuhaozn_springboot.bean.product_bean;
import com.wuhao.wuhaozn_springboot.server.product_ser;
import com.wuhao.wuhaozn_springboot.util.StateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller

public class all_prods_list_control {
    @Autowired
    product_ser productService;

  @ResponseBody
  @RequestMapping("/show_prod_list")
  public StateUtil showProdList(String name, HttpSession httpSession){
    List<product_bean> product_beans = productService.select_product();
    httpSession.setAttribute("details",product_beans);
    return new StateUtil("成功",200);
  }
}
