package org.jug.algeria.controller;

import org.fest.assertions.Assertions;
import org.jug.algeria.config.AppConfig;
import org.jug.algeria.domain.AppUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {AppConfig.class})
@WebIntegrationTest("server.port:9000")
public class HomeControllerIntegrationTests {

    RestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void shouldAdd_AppUser_ToDb(){
        ResponseEntity<AppUser> responseEntity = restTemplate.postForEntity("http://localhost:9000/user/Abderrazak BOUADMA", MockHttpServletRequest.DEFAULT_PROTOCOL, AppUser.class);
        final AppUser appUser = responseEntity.getBody();
        Assertions.assertThat(appUser).isNotNull();
        Assertions.assertThat(appUser.getUsername()).isNotNull().isEqualTo("Abderrazak BOUADMA");
    }
}
