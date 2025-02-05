package vn.hoidanit.laptopshop.controller.admin;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import vn.hoidanit.laptopshop.domain.Product;

@Controller
public class DashboardController {

    @GetMapping("/admin")
    public String getDashboard() {
        return "admin/dashboard/show";
    }

}
