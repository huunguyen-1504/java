package com.test.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.demo.Entity.KhoangSan_Huu;
import com.test.demo.Service.KhoangSanService;

@Controller
@RequestMapping("/")
public class HomeController {
	@Autowired
	private KhoangSanService theService;
	
	@GetMapping({"","/home"})
	public String home(ModelMap map) {
		map.addAttribute("list", theService.getAll());
		return "home";
	}
	
	@GetMapping("/add")
	public String add() {
		return "add";
	}
	
	@PostMapping("/add")
	public String saveADD(@RequestParam String maks, @RequestParam String tenks, @RequestParam int soluong, @RequestParam String tenmoks, @RequestParam String tentinh) {
		KhoangSan_Huu ks = new KhoangSan_Huu();
		ks.setMaks(maks);
		ks.setTenKS(tenks);
		ks.setSoLuong(soluong);
		ks.setTenTinh(tentinh);
		ks.setTenMoKS(tenmoks);
		theService.saveKs(ks);
		return "redirect:/home";
	}
	
	@GetMapping("/del/{id}")
	public String delete(@PathVariable String id) {
		theService.delete(id);
		return "redirect:/home";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable String id, ModelMap map) {
		map.addAttribute("ks", theService.getKSByID(id));
		return "update";
	}
	
	@PostMapping("/update/{id}")
	public String saveUp(@PathVariable String id,@RequestParam String maks, @RequestParam String tenks, @RequestParam int soluong, @RequestParam String tenmoks, @RequestParam String tentinh) {
		KhoangSan_Huu ks = new KhoangSan_Huu();
		ks.setMaks(id);
		ks.setMaks(maks);
		ks.setTenKS(tenks);
		ks.setSoLuong(soluong);
		ks.setTenTinh(tentinh);
		ks.setTenMoKS(tenmoks);
		theService.saveKs(ks);
		return "redirect:/home";
	}
	
	@GetMapping("/search")
	public String serach(ModelMap modelMap, @RequestParam String key) {
		if(key == "") {			
			return "redirect:/home";
		}	else {
			modelMap.addAttribute("list",theService.search(key));
			return "home";
		}
		
	}
	
}
