/*
 * Binance Sub Account REST API
 * OpenAPI Specification for the Binance Sub Account REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.sub_account.rest.model;

import com.binance.connector.client.sub_account.rest.JSON;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jakarta.validation.constraints.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.hibernate.validator.constraints.*;

/** EnableLeverageTokenForSubAccountResponse */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class EnableLeverageTokenForSubAccountResponse {
    public static final String SERIALIZED_NAME_EMAIL = "email";

    @SerializedName(SERIALIZED_NAME_EMAIL)
    @jakarta.annotation.Nullable
    private String email;

    public static final String SERIALIZED_NAME_ENABLE_BLVT = "enableBlvt";

    @SerializedName(SERIALIZED_NAME_ENABLE_BLVT)
    @jakarta.annotation.Nullable
    private Boolean enableBlvt;

    public EnableLeverageTokenForSubAccountResponse() {}

    public EnableLeverageTokenForSubAccountResponse email(
            @jakarta.annotation.Nullable String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     *
     * @return email
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return email;
    }

    public void setEmail(@jakarta.annotation.Nullable String email) {
        this.email = email;
    }

    public EnableLeverageTokenForSubAccountResponse enableBlvt(
            @jakarta.annotation.Nullable Boolean enableBlvt) {
        this.enableBlvt = enableBlvt;
        return this;
    }

    /**
     * Get enableBlvt
     *
     * @return enableBlvt
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableBlvt() {
        return enableBlvt;
    }

    public void setEnableBlvt(@jakarta.annotation.Nullable Boolean enableBlvt) {
        this.enableBlvt = enableBlvt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnableLeverageTokenForSubAccountResponse enableLeverageTokenForSubAccountResponse =
                (EnableLeverageTokenForSubAccountResponse) o;
        return Objects.equals(this.email, enableLeverageTokenForSubAccountResponse.email)
                && Objects.equals(
                        this.enableBlvt, enableLeverageTokenForSubAccountResponse.enableBlvt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, enableBlvt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnableLeverageTokenForSubAccountResponse {\n");
        sb.append("		email: ").append(toIndentedString(email)).append("\n");
        sb.append("		enableBlvt: ").append(toIndentedString(enableBlvt)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object emailValue = getEmail();
        String emailValueAsString = "";
        emailValueAsString = emailValue.toString();
        sb.append("email=").append(urlEncode(emailValueAsString)).append("");
        Object enableBlvtValue = getEnableBlvt();
        String enableBlvtValueAsString = "";
        enableBlvtValueAsString = enableBlvtValue.toString();
        sb.append("enableBlvt=").append(urlEncode(enableBlvtValueAsString)).append("");
        return sb.toString();
    }

    public static String urlEncode(String s) {
        try {
            return URLEncoder.encode(s, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(StandardCharsets.UTF_8.name() + " is unsupported", e);
        }
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n		");
    }

    public static HashSet<String> openapiFields;
    public static HashSet<String> openapiRequiredFields;

    static {
        // a set of all properties/fields (JSON key names)
        openapiFields = new HashSet<String>();
        openapiFields.add("email");
        openapiFields.add("enableBlvt");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     EnableLeverageTokenForSubAccountResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!EnableLeverageTokenForSubAccountResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " EnableLeverageTokenForSubAccountResponse is not found in"
                                    + " the empty JSON string",
                                EnableLeverageTokenForSubAccountResponse.openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!EnableLeverageTokenForSubAccountResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `EnableLeverageTokenForSubAccountResponse` properties."
                                        + " JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull())
                && !jsonObj.get("email").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `email` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("email").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!EnableLeverageTokenForSubAccountResponse.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'EnableLeverageTokenForSubAccountResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<EnableLeverageTokenForSubAccountResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(EnableLeverageTokenForSubAccountResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<EnableLeverageTokenForSubAccountResponse>() {
                        @Override
                        public void write(
                                JsonWriter out, EnableLeverageTokenForSubAccountResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public EnableLeverageTokenForSubAccountResponse read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of EnableLeverageTokenForSubAccountResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of EnableLeverageTokenForSubAccountResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     EnableLeverageTokenForSubAccountResponse
     */
    public static EnableLeverageTokenForSubAccountResponse fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, EnableLeverageTokenForSubAccountResponse.class);
    }

    /**
     * Convert an instance of EnableLeverageTokenForSubAccountResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
