/*
 * Binance Spot REST API
 * OpenAPI Specifications for the Binance Spot REST API  API documents:   - [Github rest-api documentation file](https://github.com/binance/binance-spot-api-docs/blob/master/rest-api.md)   - [General API information for rest-api on website](https://developers.binance.com/docs/binance-spot-api-docs/rest-api/general-api-information)
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.spot.rest.model;

import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jakarta.validation.constraints.*;
import java.io.IOException;
import org.hibernate.validator.constraints.*;

/** Gets or Sets pendingType */
@JsonAdapter(PendingType.Adapter.class)
public enum PendingType {
    LIMIT("LIMIT"),

    MARKET("MARKET"),

    STOP_LOSS("STOP_LOSS"),

    STOP_LOSS_LIMIT("STOP_LOSS_LIMIT"),

    TAKE_PROFIT("TAKE_PROFIT"),

    TAKE_PROFIT_LIMIT("TAKE_PROFIT_LIMIT"),

    LIMIT_MAKER("LIMIT_MAKER");

    private String value;

    PendingType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PendingType fromValue(String value) {
        for (PendingType b : PendingType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PendingType> {
        @Override
        public void write(final JsonWriter jsonWriter, final PendingType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public PendingType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return PendingType.fromValue(value);
        }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        String value = jsonElement.getAsString();
        PendingType.fromValue(value);
    }
}
