package spring5_webmvc_mybatis_study.config;


import javax.sql.DataSource;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ContextRoot.class})
public class ContextDataSourceTest {

	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Autowired
	private DataSource dataSource;
	
	@Test
	public void test() {
		System.out.println(dataSource);
	}

}
