/*
 * Binance Derivatives Trading Portfolio Margin REST API
 * OpenAPI Specification for the Binance Derivatives Trading Portfolio Margin REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model;

import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jakarta.validation.constraints.*;
import java.io.IOException;
import org.hibernate.validator.constraints.*;

/** Gets or Sets strategyType */
@JsonAdapter(StrategyType.Adapter.class)
public enum StrategyType {
    STOP("STOP"),

    STOP_MARKET("STOP_MARKET"),

    TAKE_PROFIT("TAKE_PROFIT"),

    TAKE_PROFIT_MARKET("TAKE_PROFIT_MARKET"),

    TRAILING_STOP_MARKET("TRAILING_STOP_MARKET");

    private String value;

    StrategyType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StrategyType fromValue(String value) {
        for (StrategyType b : StrategyType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StrategyType> {
        @Override
        public void write(final JsonWriter jsonWriter, final StrategyType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public StrategyType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return StrategyType.fromValue(value);
        }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        String value = jsonElement.getAsString();
        StrategyType.fromValue(value);
    }
}
