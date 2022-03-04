package com.example.pimp_my_car;

import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class PimpMyCarApplicationTests {

	@Autowired
	private MockMvc mvc;

	@Autowired
	private ApplicationContext appContext;

	private JSONObject firstData;
	private JSONObject secondData;
	private JSONObject thirdData;


	@BeforeEach
	void setup () throws Exception
	{
		firstData = new JSONObject();
		firstData.put("emailClient", "osebringd@oaic.gov.au");
		firstData.put("mdpClient","test");

		secondData = new JSONObject();
		secondData.put("emailClient",  "uvervecerce@gevve.com");
		secondData.put("mdpClient", "verve");

		thirdData = new JSONObject();
		thirdData.put("emailClient","ferve");
		thirdData.put("mdpClient", "erce");
	}


	@Test
	void testAuthentificationReussi() throws Exception {

		String data = firstData.toString();

		mvc.perform(
				post("/api/v1/client/authentication")
						.contentType(MediaType.APPLICATION_JSON).content(data))
				.andExpect(status().isOk());
	}

	@Test
	void testAuthentificationEchoue() throws Exception {

		String data = firstData.toString();

		mvc.perform(
						post("/api/v1/client/authentication")
								.contentType(MediaType.APPLICATION_JSON).content(data))
				.andExpect(status().isForbidden());
	}


	@Test
	void testMauvaiseRoute() throws Exception {

		String data = firstData.toString();

		mvc.perform(
						post("/api/v1/authentication")
								.contentType(MediaType.APPLICATION_JSON).content(data))
				.andExpect(status().isBadGateway());
	}


	@Test
	void testMauvaiseRequete() throws Exception {

		String data = firstData.toString();

		mvc.perform(
						get("/api/v1/client/authentication")
								.contentType(MediaType.APPLICATION_JSON).content(data))
				.andExpect(status().isBadRequest());
	}






}
