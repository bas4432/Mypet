package com.mycompany.mypet.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mycompany.mypet.domain.RegisterVO;
import com.mycompany.mypet.service.RegisterService;

@Controller
@RequestMapping("/register")

public class RegisterController {
	private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);

	private final RegisterService registerService;

	@Inject
	public RegisterController(RegisterService registerService) {
		this.registerService = registerService;
	}

	// ��� ������ �̵�
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String writeGET() {

		logger.info("write���°�");

		return "/register/write";
	}

	// ��� ó��
	@RequestMapping(value = "/write", method = RequestMethod.POST) 
	public String writePOST(RegisterVO registerVO, RedirectAttributes redirectAttributes) throws Exception { 
		logger.info("write POST...");
	
	 logger.info(registerVO.toString()); 
	 registerService.create(registerVO);
	 redirectAttributes.addFlashAttribute("msg", "regSuccess"); 
	 
	 return "redirect:/register/list"; }

	
	// ��� ������ �̵�
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) throws Exception {

		logger.info("list ���°�");
		model.addAttribute("registers", registerService.listAll());

		return "/register/list";
	}

	// ��ȸ ������ �̵�
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public String read(@RequestParam("register_no") int register_no, Model model) throws Exception {

		logger.info("read ...");

		model.addAttribute("register", registerService.read(register_no));

		return "/register/read";
	}

	// ���������� �̵�
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public String modifyGET(@RequestParam("register_no") int register_no, Model model) throws Exception {

		logger.info("modifyGet ...");

		model.addAttribute("register", registerService.read(register_no));

		return "/register/modify";
	}

	// ���� ó��
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPOST(RegisterVO registerVO, RedirectAttributes redirectAttributes) throws Exception {
		logger.info("modifyPOST ...");

		registerService.update(registerVO);
		redirectAttributes.addFlashAttribute("msg", "modSuccess");

		return "redirect:/register/list";

	}

	// ����ó��
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(@RequestParam("register_no") int register_no, RedirectAttributes redirectAttributes)
			throws Exception {
		logger.info("remove ...");

		registerService.delete(register_no);
		redirectAttributes.addFlashAttribute("msg", "delSuccess");

		return "redirect:/register/list";
	}

}
