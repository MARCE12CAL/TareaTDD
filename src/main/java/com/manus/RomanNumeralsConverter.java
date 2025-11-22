package com.manus;

public class RomanNumeralsConverter {
    
  public String convert(int number) {
    if (number >= 5) {
        return "V" + convert(number - 5);
    }
    String result = "";
    for (int i = 0; i < number; i++) {
        result += "I";
    }
    return result;
}
}
