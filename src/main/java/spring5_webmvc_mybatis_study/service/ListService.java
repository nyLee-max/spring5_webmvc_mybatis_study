package spring5_webmvc_mybatis_study.service;

import java.util.List;


import org.springframework.stereotype.Service;

import spring5_webmvc_mybatis_study.controller.ListCommand;
import spring5_webmvc_mybatis_study.dto.Member;

public interface ListService {
	List<Member> selectByRegdate(ListCommand listCommand);
}
