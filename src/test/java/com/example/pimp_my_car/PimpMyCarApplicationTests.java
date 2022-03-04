package com.example.pimp_my_car;

import com.example.pimp_my_car.client.ClientController;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(Parameterized.class)
@WebMvcTest(ClientController.class)
class PimpMyCarApplicationTests {

	@Autowired
	private MockMvc mvc;
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
						post("/api/v1/client/authentication")
								.contentType(MediaType.APPLICATION_JSON).content(data))
				.andExpect(status().isBadRequest());
	}






}
