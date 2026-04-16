package com.ChanelManager.ChanelService;

import com.ChanelManager.DTO.ChanelDTO;
import com.ChanelManager.DTO.ChangeOwnerDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ChanelController {

  @PostMapping("/create_chanel")
  public ResponseEntity<?>
  createChanel(@Valid @RequestBody ChanelDTO chanelDto) {
    return ResponseEntity.ok().build();
  }

  @PostMapping("/change_owner")
  public ResponseEntity<?>
  changeOwner(@Valid @RequestBody ChangeOwnerDTO changeOwnerDto) {
    return ResponseEntity.ok().build();
  }

  @GetMapping("/get_chanel_inf/{chanelId}")
  public ResponseEntity<?> getChanelInfo(@PathVariable Long chanelId) {
    return ResponseEntity.ok().build();
  }
}
