package com.ChanelManager.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class ChanelEntity {

  @Id @GeneratedValue(strategy = GenerationType.AUTO) Long chanelId;

  @OneToOne OwnerEntity owner;

  String outerId; // id in usese API
  String chanelName;
  String chanelURL;
}
