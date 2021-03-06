package spring5_webmvc_mybatis_study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import spring5_webmvc_mybatis_study.dto.Member;
import spring5_webmvc_mybatis_study.service.ListService;
import spring5_webmvc_mybatis_study.service.ListServiceImpl;

@Controller
public class ListController {

	@Autowired
	private ListServiceImpl listService;
	
	@RequestMapping("/members")
	public String list(@ModelAttribute("cmd") ListCommand listCommand, Model model) {
		if(listCommand.getFrom() != null && listCommand.getTo() != null) {
			List<Member> members = listService.selectByRegdate(listCommand);
			model.addAttribute("members", members);
		}
		return "member/memberList";
		
	}
}
