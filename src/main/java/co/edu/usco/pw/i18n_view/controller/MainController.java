package co.edu.usco.pw.i18n_view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping(value = "/locale")
	public String locale() {
		return "locale";
	}

}
