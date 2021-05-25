package spring5_webmvc_mybatis_study.mapper;

import static org.junit.Assert.fail;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring5_webmvc_mybatis_study.config.ContextRoot;
import spring5_webmvc_mybatis_study.dto.Member;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ContextRoot.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MemberMapperTest {

	private static final Log log = LogFactory.getLog(MemberMapperTest.class);
	
	@Autowired
	private MemberMapper mapper;

	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Test
	public void test01SelectAll() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		List<Member> list = mapper.selectAll();
		Assert.assertNotNull(list);
		list.stream().forEach(System.out::println);
	}

	@Test
	public void test02SelectByEmail() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		
		Member member = mapper.selectByEmail("skdus6559@naver.com");
		
		System.out.println(member);
		Assert.assertNotNull(member);
		
	}

	@Test
	public void test03InsertMember() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		
		Member member = new Member("test16@test.co.kr", "1111", "테스트");
	
		int res = mapper.insertMember(member);
		Assert.assertEquals(1, res);

		
	}

	@Test
	public void test05DeleteMember() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		
		Member member = mapper.selectByEmail("test16@test.co.kr");
		int res = mapper.deleteMember(member);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test04UpdateMember() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		Member member = mapper.selectByEmail("test16@test.co.kr");
		int res = mapper.updateMember(member);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test06CountMember() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		int res = mapper.countMember();
	}

}
