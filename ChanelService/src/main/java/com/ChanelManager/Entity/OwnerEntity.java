package com.ChanelManager.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class OwnerEntity {
  @Id @GeneratedValue(strategy = GenerationType.AUTO) Long OwnerId;
}
