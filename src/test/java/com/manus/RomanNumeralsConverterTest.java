package com.manus;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsConverterTest {
    
  @Test
void shouldConvert5ToV() {
    RomanNumeralsConverter converter = new RomanNumeralsConverter();
    assertEquals("V", converter.convert(5));
}
}
