package spring5_webmvc_mybatis_study.service;

import org.springframework.stereotype.Service;

import spring5_webmvc_mybatis_study.dto.Member;

public interface MemberDetailService {
	Member selectById(Long memId);

}