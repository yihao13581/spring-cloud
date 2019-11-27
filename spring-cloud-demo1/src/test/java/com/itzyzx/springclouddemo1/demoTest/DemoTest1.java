package com.itzyzx.springclouddemo1.demoTest;

import org.junit.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;


/**
 * @CLassName DemoTest1
 * @Description: TODO
 * @Author: shenhao
 * @date: 2019/11/26 15:31
 * @Version 1.0
 */
public class DemoTest1 extends BaseUnitTest {
	public static final Logger logger= LoggerFactory.getLogger(DemoTest1.class);

	public static MockHttpSession session;
//	static {
//		UserAuth userAuth=new UserAuth();
//		userAuth.setLoginUserPhone("15290803298");
//		userAuth.setLoginUserName("张磊");
//		userAuth.setAccount("OP001");
//		userAuth.setUserId("1");
//		session=new MockHttpSession();
//		session.setAttribute(CommonConsts.SESSION_USER,userAuth);
//	}
//
//		@Test
//	public void test() throws Exception{
//		String url="/hello/word";
//			MultiValueMap<String,String> params=new LinkedMultiValueMap<>();
//			params.add("name","Kotlin");
//			params.add("name2","java");
//			MvcResult result=mockMvc
//					.perform(MockMvcRequestBuilders.post(url).accept(MediaType.APPLICATION_JSON_VALUE)
//					.contentType(MediaType.APPLICATION_JSON_VALUE).session(session).params(params))
//					.andExpect(MockMvcResultMatchers.status().isOk())
//					.andDo(new EncodingResultHandler()).andReturn();
//			logger.info(""+result.getResponse().getContentAsString());
//
//		}
}
