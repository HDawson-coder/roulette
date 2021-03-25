package edu.cnm.deepdive.roulette.model.type;

import androidx.room.TypeConverter;
import com.google.gson.annotations.SerializedName;

public enum Color {

  BLACK,
  RED,
  GREEN;

  @TypeConverter
  public static Integer colorToInteger(Color value) {
    return (value != null) ? value.ordinal() : null;
  }

  @TypeConverter
  public static Color integerToColor(Integer value) {
    return (value != null) ? Color.values()[value] : null;
  }

}