package spring5_webmvc_mybatis_study.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring5_webmvc_mybatis_study.controller.ListCommand;
import spring5_webmvc_mybatis_study.dto.Member;
import spring5_webmvc_mybatis_study.dto.RegisterRequest;
import spring5_webmvc_mybatis_study.exception.DuplicateMemberException;
import spring5_webmvc_mybatis_study.mapper.MemberMapper;

@Service
public class RestMemberServiceImpl implements RestMemberService {

	@Autowired
	private MemberMapper mapper;

	@Override
	public List<Member> showMembers() {
		return mapper.selectAll();
	}

	@Override
	public Member showMemberById(Long memId) {
		return mapper.selectById(memId);
	}
	
	@Override
	public Long regist(RegisterRequest req) {
		Member member = mapper.selectByEmail(req.getEmail());
		if (member != null) {
			throw new DuplicateMemberException("dup email " + req.getEmail());
		}

		Member newMember = new Member(req.getEmail(), req.getPassword(), req.getName(), LocalDateTime.now());
		mapper.insertMember(newMember);
		return newMember.getId();

	}


}
