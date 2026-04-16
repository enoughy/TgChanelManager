package com.ChanelManager.DTO;

import jakarta.validation.constraints.NotNull;

public class ChangeOwnerDTO {
  @NotNull private Long chanelId;
  @NotNull private Long ownerId;

  // Geters && Setters
  public Long getChanelId() { return chanelId; }

  public void setChanelId(Long chanelId) { this.chanelId = chanelId; }

  public Long getOwnerId() { return ownerId; }

  public void setOwnerId(Long ownerId) { this.ownerId = ownerId; }
}
