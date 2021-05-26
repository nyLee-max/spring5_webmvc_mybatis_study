package spring5_webmvc_mybatis_study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring5_webmvc_mybatis_study.dto.Member;
import spring5_webmvc_mybatis_study.mapper.MemberMapper;

@Service
public class MemberDetailServiceImpl implements MemberDetailService {

	@Autowired
	private MemberMapper mapper;
	
	@Override
	public Member selectById(Long memId) {
		return mapper.selectById(memId);
	}

}
