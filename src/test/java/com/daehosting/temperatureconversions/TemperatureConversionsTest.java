package com.daehosting.temperatureconversions;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionsTest {

    @Test
    void getTemperatureConversionsSoap12() {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();

        BigDecimal celsiusToFahrenheitResult = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));
        BigDecimal fahrenheitToCelsiusResult = service.fahrenheitToCelsius(BigDecimal.valueOf(212));
        BigDecimal windChillInCelsiusResult = service.windChillInCelsius(BigDecimal.valueOf(0), BigDecimal.valueOf(15));
        BigDecimal windChillInFahrenheitResult = service.windChillInFahrenheit(BigDecimal.valueOf(22), BigDecimal.valueOf(5));

        assertEquals(celsiusToFahrenheitResult, BigDecimal.valueOf(32));
        assertEquals(fahrenheitToCelsiusResult, BigDecimal.valueOf(100));
        assertEquals(windChillInCelsiusResult, BigDecimal.valueOf(-13.23));
        assertEquals(windChillInFahrenheitResult, BigDecimal.valueOf(13.91300006));
    }

}