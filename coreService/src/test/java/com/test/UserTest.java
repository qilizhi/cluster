package com.test;


import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.glexer.core.application.CoreServiceApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CoreServiceApplication.class)
// @ActiveProfiles("scratch")
// @WebAppConfiguration(value = "src/main/webapp,src/main/resources")
// @ContextHierarchy({ @ContextConfiguration(locations =
// {"classpath:dubbo-provider.xml"}) })
public class UserTest {

	@Autowired
	private WebApplicationContext context;

	private MockMvc mvc;

	@Before
	public void setUp() {
		this.mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
	}

	@Test
	public void ListUser() throws Exception {

		this.mvc.perform(MockMvcRequestBuilders.get("/users"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(
						MockMvcResultMatchers.content().string(
								Matchers.containsString("qilizhi")));
	}

	@Test
	public void dubboListUser() throws Exception {

		ResultActions result=this.mvc.perform(
				MockMvcRequestBuilders
						.post("/dubbo"))						
				.andExpect(MockMvcResultMatchers.status().isOk());
		MvcResult mrs = result.andDo(MockMvcResultHandlers.print()).andReturn();
		// 返回状态码
		int resultStr = mrs.getResponse().getStatus();
//		// 如果返回状态相等 就通过
		Assert.assertEquals(200, resultStr);
		//Assert.assertEquals(200, MockMvcResultMatchers.status());
	}
}