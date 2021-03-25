package edu.cnm.deepdive.roulette.model.dto;

import com.google.gson.annotations.Expose;

public class Color {

  private String id = "green";
  private String label = "Green";
  private String value = "FF4C8C4A";
  private int wagerPosition = 40;
  private int wagerSpan = 2;
  private int payout = 18;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public int getWagerPosition() {
    return wagerPosition;
  }

  public void setWagerPosition(int wagerPosition) {
    this.wagerPosition = wagerPosition;
  }

  public int getWagerSpan() {
    return wagerSpan;
  }

  public void setWagerSpan(int wagerSpan) {
    this.wagerSpan = wagerSpan;
  }

  public int getPayout() {
    return payout;
  }

  public void setPayout(int payout) {
    this.payout = payout;
  }
}
