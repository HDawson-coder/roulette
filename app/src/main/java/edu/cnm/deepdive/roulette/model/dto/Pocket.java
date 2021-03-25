package edu.cnm.deepdive.roulette.model.dto;

public class Pocket {

  private String label = "00";
  private int wheelPosition = 0;
  private int wagerPosition = 1;
  private int wagerSpan = 3;
  private String color = "green";
  private int payout = 36;

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public int getWheelPosition() {
    return wheelPosition;
  }

  public void setWheelPosition(int wheelPosition) {
    this.wheelPosition = wheelPosition;
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

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getPayout() {
    return payout;
  }

  public void setPayout(int payout) {
    this.payout = payout;
  }
}
