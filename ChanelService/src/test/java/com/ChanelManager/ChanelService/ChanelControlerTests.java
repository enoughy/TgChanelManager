package com.ChanelManager.ChanelService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.ChanelManager.DTO.ChanelDTO;
import com.ChanelManager.DTO.ChangeOwnerDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(ChanelController.class)
class ChanelControllerTests {

  @Autowired private MockMvc mockMvc;

  @Test
  void create_chanel_happyPass() throws Exception {
    ChanelDTO reqBody = new ChanelDTO();
    reqBody.setChanelId(100L);
    ObjectMapper mapper = new ObjectMapper();
    mockMvc
        .perform(post("/api/create_chanel")
                     .contentType(MediaType.APPLICATION_JSON)
                     .content(mapper.writeValueAsString(reqBody)))

        .andExpect(status().isOk());
  }

  @Test
  void create_chanel_NotContainId() throws Exception {
    ChanelDTO reqBody = new ChanelDTO();
    ObjectMapper mapper = new ObjectMapper();
    mockMvc
        .perform(post("/api/create_chanel")
                     .contentType(MediaType.APPLICATION_JSON)
                     .content(mapper.writeValueAsString(reqBody)))

        .andExpect(status().isBadRequest());
  }

  @Test
  void get_chanel_happyPass() throws Exception {
    mockMvc.perform(get("/api/get_chanel_inf/2")).andExpect(status().isOk());
  }

  @Test
  void change_owner_happyPass() throws Exception {
    ChangeOwnerDTO changeOwner = new ChangeOwnerDTO();
    ObjectMapper mapper = new ObjectMapper();
    changeOwner.setChanelId(100L);
    changeOwner.setOwnerId(100L);
    mockMvc
        .perform(post("/api/change_owner")
                     .contentType(MediaType.APPLICATION_JSON)
                     .content(mapper.writeValueAsString(changeOwner)))
        .andExpect(status().isOk());
  }

  @Test
  void change_owner_without_chanelId() throws Exception {
    ChangeOwnerDTO changeOwner = new ChangeOwnerDTO();
    changeOwner.setOwnerId(100L);
    mockMvc.perform(post("/api/change_owner"))
        .andExpect(status().isBadRequest());
  }
}
