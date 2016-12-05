/*package com.test;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.results.ResultMatchers;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;

import ch.qos.logback.core.util.ContentTypeUtil;

import com.glexer.application.Application;
import com.jayway.jsonpath.internal.JsonContext;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
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
	public void addUser() throws Exception {

		this.mvc.perform(
				MockMvcRequestBuilders
						.post("/users/add")
						.param("name", "qilizhi").param("phone", "15766383962").param("email", "814597004@qq.com"))
				.andExpect(MockMvcResultMatchers.status().isOk());
		//Assert.assertEquals(200, MockMvcResultMatchers.status());
	}
}
*/