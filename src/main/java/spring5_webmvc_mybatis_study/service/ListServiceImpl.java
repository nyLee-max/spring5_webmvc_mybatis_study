package spring5_webmvc_mybatis_study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring5_webmvc_mybatis_study.controller.ListCommand;
import spring5_webmvc_mybatis_study.dto.Member;
import spring5_webmvc_mybatis_study.mapper.MemberMapper;

@Service
public class ListServiceImpl implements ListService {
	
	@Autowired
	private MemberMapper mapper;
	
	@Override
	public List<Member> selectByRegdate(ListCommand listCommand) {
		return mapper.selectByRegdate(listCommand);
	}

}
