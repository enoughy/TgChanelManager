package com.ChanelManager.DTO;

import jakarta.validation.constraints.NotNull;

public class ChanelDTO {
  @NotNull private Long chanelId;
  private String chanelName;
  private String chanelDiscription;
  private String chanelURL; // unnecessary maby need to remove

  // Getters && Setters
  public Long getChanelId() { return chanelId; }

  public void setChanelId(Long chanelId) { this.chanelId = chanelId; }

  public String getChanelName() { return chanelName; }

  public void setChanelName(String chanelName) { this.chanelName = chanelName; }

  public String getChanelDiscription() { return chanelDiscription; }

  public void setChanelDiscription(String chanelDiscription) {
    this.chanelDiscription = chanelDiscription;
  }

  public String getChanelURL() { return chanelURL; }

  public void setChanelURL(String chanelURL) { this.chanelURL = chanelURL; }
}
