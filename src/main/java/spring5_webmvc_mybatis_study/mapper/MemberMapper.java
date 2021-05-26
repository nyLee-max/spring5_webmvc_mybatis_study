package spring5_webmvc_mybatis_study.mapper;

import java.time.LocalDateTime;
import java.util.List;

import spring5_webmvc_mybatis_study.controller.ListCommand;
import spring5_webmvc_mybatis_study.dto.Member;

public interface MemberMapper {

	List<Member> selectAll();
	
	Member selectByEmail(String email);
	
	int insertMember(Member member);
	
	int deleteMember(Member member);
	
	int updateMember(Member member);
	
	int countMember();
	
	List<Member> selectByRegdate(ListCommand listCommand);
	
	Member selectById(Long memId);
}
