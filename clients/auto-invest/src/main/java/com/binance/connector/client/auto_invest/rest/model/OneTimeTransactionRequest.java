/*
 * Binance Auto Invest REST API
 * OpenAPI Specification for the Binance Auto Invest REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.auto_invest.rest.model;

import com.binance.connector.client.auto_invest.rest.JSON;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jakarta.validation.Valid;
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

/** OneTimeTransactionRequest */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class OneTimeTransactionRequest {
    public static final String SERIALIZED_NAME_SOURCE_TYPE = "sourceType";

    @SerializedName(SERIALIZED_NAME_SOURCE_TYPE)
    @jakarta.annotation.Nonnull
    private String sourceType;

    public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";

    @SerializedName(SERIALIZED_NAME_REQUEST_ID)
    @jakarta.annotation.Nullable
    private Long requestId;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_AMOUNT = "subscriptionAmount";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_AMOUNT)
    @jakarta.annotation.Nonnull
    private Double subscriptionAmount;

    public static final String SERIALIZED_NAME_SOURCE_ASSET = "sourceAsset";

    @SerializedName(SERIALIZED_NAME_SOURCE_ASSET)
    @jakarta.annotation.Nonnull
    private String sourceAsset;

    public static final String SERIALIZED_NAME_FLEXIBLE_ALLOWED_TO_USE = "flexibleAllowedToUse";

    @SerializedName(SERIALIZED_NAME_FLEXIBLE_ALLOWED_TO_USE)
    @jakarta.annotation.Nullable
    private Boolean flexibleAllowedToUse;

    public static final String SERIALIZED_NAME_PLAN_ID = "planId";

    @SerializedName(SERIALIZED_NAME_PLAN_ID)
    @jakarta.annotation.Nullable
    private Long planId;

    public static final String SERIALIZED_NAME_INDEX_ID = "indexId";

    @SerializedName(SERIALIZED_NAME_INDEX_ID)
    @jakarta.annotation.Nullable
    private Long indexId;

    public static final String SERIALIZED_NAME_DETAILS = "details";

    @SerializedName(SERIALIZED_NAME_DETAILS)
    @jakarta.annotation.Nonnull
    private Details details;

    public static final String SERIALIZED_NAME_RECV_WINDOW = "recvWindow";

    @SerializedName(SERIALIZED_NAME_RECV_WINDOW)
    @jakarta.annotation.Nullable
    private Long recvWindow;

    public OneTimeTransactionRequest() {}

    public OneTimeTransactionRequest sourceType(@jakarta.annotation.Nonnull String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * Get sourceType
     *
     * @return sourceType
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(@jakarta.annotation.Nonnull String sourceType) {
        this.sourceType = sourceType;
    }

    public OneTimeTransactionRequest requestId(@jakarta.annotation.Nullable Long requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get requestId
     *
     * @return requestId
     */
    @jakarta.annotation.Nullable
    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(@jakarta.annotation.Nullable Long requestId) {
        this.requestId = requestId;
    }

    public OneTimeTransactionRequest subscriptionAmount(
            @jakarta.annotation.Nonnull Double subscriptionAmount) {
        this.subscriptionAmount = subscriptionAmount;
        return this;
    }

    /**
     * Get subscriptionAmount
     *
     * @return subscriptionAmount
     */
    @jakarta.annotation.Nonnull
    @NotNull
    @Valid
    public Double getSubscriptionAmount() {
        return subscriptionAmount;
    }

    public void setSubscriptionAmount(@jakarta.annotation.Nonnull Double subscriptionAmount) {
        this.subscriptionAmount = subscriptionAmount;
    }

    public OneTimeTransactionRequest sourceAsset(@jakarta.annotation.Nonnull String sourceAsset) {
        this.sourceAsset = sourceAsset;
        return this;
    }

    /**
     * Get sourceAsset
     *
     * @return sourceAsset
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getSourceAsset() {
        return sourceAsset;
    }

    public void setSourceAsset(@jakarta.annotation.Nonnull String sourceAsset) {
        this.sourceAsset = sourceAsset;
    }

    public OneTimeTransactionRequest flexibleAllowedToUse(
            @jakarta.annotation.Nullable Boolean flexibleAllowedToUse) {
        this.flexibleAllowedToUse = flexibleAllowedToUse;
        return this;
    }

    /**
     * Get flexibleAllowedToUse
     *
     * @return flexibleAllowedToUse
     */
    @jakarta.annotation.Nullable
    public Boolean getFlexibleAllowedToUse() {
        return flexibleAllowedToUse;
    }

    public void setFlexibleAllowedToUse(@jakarta.annotation.Nullable Boolean flexibleAllowedToUse) {
        this.flexibleAllowedToUse = flexibleAllowedToUse;
    }

    public OneTimeTransactionRequest planId(@jakarta.annotation.Nullable Long planId) {
        this.planId = planId;
        return this;
    }

    /**
     * Get planId
     *
     * @return planId
     */
    @jakarta.annotation.Nullable
    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(@jakarta.annotation.Nullable Long planId) {
        this.planId = planId;
    }

    public OneTimeTransactionRequest indexId(@jakarta.annotation.Nullable Long indexId) {
        this.indexId = indexId;
        return this;
    }

    /**
     * Get indexId
     *
     * @return indexId
     */
    @jakarta.annotation.Nullable
    public Long getIndexId() {
        return indexId;
    }

    public void setIndexId(@jakarta.annotation.Nullable Long indexId) {
        this.indexId = indexId;
    }

    public OneTimeTransactionRequest details(@jakarta.annotation.Nonnull Details details) {
        this.details = details;
        return this;
    }

    /**
     * Get details
     *
     * @return details
     */
    @jakarta.annotation.Nonnull
    @NotNull
    @Valid
    public Details getDetails() {
        return details;
    }

    public void setDetails(@jakarta.annotation.Nonnull Details details) {
        this.details = details;
    }

    public OneTimeTransactionRequest recvWindow(@jakarta.annotation.Nullable Long recvWindow) {
        this.recvWindow = recvWindow;
        return this;
    }

    /**
     * Get recvWindow
     *
     * @return recvWindow
     */
    @jakarta.annotation.Nullable
    public Long getRecvWindow() {
        return recvWindow;
    }

    public void setRecvWindow(@jakarta.annotation.Nullable Long recvWindow) {
        this.recvWindow = recvWindow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OneTimeTransactionRequest oneTimeTransactionRequest = (OneTimeTransactionRequest) o;
        return Objects.equals(this.sourceType, oneTimeTransactionRequest.sourceType)
                && Objects.equals(this.requestId, oneTimeTransactionRequest.requestId)
                && Objects.equals(
                        this.subscriptionAmount, oneTimeTransactionRequest.subscriptionAmount)
                && Objects.equals(this.sourceAsset, oneTimeTransactionRequest.sourceAsset)
                && Objects.equals(
                        this.flexibleAllowedToUse, oneTimeTransactionRequest.flexibleAllowedToUse)
                && Objects.equals(this.planId, oneTimeTransactionRequest.planId)
                && Objects.equals(this.indexId, oneTimeTransactionRequest.indexId)
                && Objects.equals(this.details, oneTimeTransactionRequest.details)
                && Objects.equals(this.recvWindow, oneTimeTransactionRequest.recvWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                sourceType,
                requestId,
                subscriptionAmount,
                sourceAsset,
                flexibleAllowedToUse,
                planId,
                indexId,
                details,
                recvWindow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OneTimeTransactionRequest {\n");
        sb.append("		sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("		requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("		subscriptionAmount: ")
                .append(toIndentedString(subscriptionAmount))
                .append("\n");
        sb.append("		sourceAsset: ").append(toIndentedString(sourceAsset)).append("\n");
        sb.append("		flexibleAllowedToUse: ")
                .append(toIndentedString(flexibleAllowedToUse))
                .append("\n");
        sb.append("		planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("		indexId: ").append(toIndentedString(indexId)).append("\n");
        sb.append("		details: ").append(toIndentedString(details)).append("\n");
        sb.append("		recvWindow: ").append(toIndentedString(recvWindow)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object sourceTypeValue = getSourceType();
        String sourceTypeValueAsString = "";
        sourceTypeValueAsString = sourceTypeValue.toString();
        sb.append("sourceType=").append(urlEncode(sourceTypeValueAsString)).append("");
        Object requestIdValue = getRequestId();
        String requestIdValueAsString = "";
        requestIdValueAsString = requestIdValue.toString();
        sb.append("requestId=").append(urlEncode(requestIdValueAsString)).append("");
        Object subscriptionAmountValue = getSubscriptionAmount();
        String subscriptionAmountValueAsString = "";
        subscriptionAmountValueAsString = subscriptionAmountValue.toString();
        sb.append("subscriptionAmount=")
                .append(urlEncode(subscriptionAmountValueAsString))
                .append("");
        Object sourceAssetValue = getSourceAsset();
        String sourceAssetValueAsString = "";
        sourceAssetValueAsString = sourceAssetValue.toString();
        sb.append("sourceAsset=").append(urlEncode(sourceAssetValueAsString)).append("");
        Object flexibleAllowedToUseValue = getFlexibleAllowedToUse();
        String flexibleAllowedToUseValueAsString = "";
        flexibleAllowedToUseValueAsString = flexibleAllowedToUseValue.toString();
        sb.append("flexibleAllowedToUse=")
                .append(urlEncode(flexibleAllowedToUseValueAsString))
                .append("");
        Object planIdValue = getPlanId();
        String planIdValueAsString = "";
        planIdValueAsString = planIdValue.toString();
        sb.append("planId=").append(urlEncode(planIdValueAsString)).append("");
        Object indexIdValue = getIndexId();
        String indexIdValueAsString = "";
        indexIdValueAsString = indexIdValue.toString();
        sb.append("indexId=").append(urlEncode(indexIdValueAsString)).append("");
        Object detailsValue = getDetails();
        String detailsValueAsString = "";
        detailsValueAsString = detailsValue.toString();
        sb.append("details=").append(urlEncode(detailsValueAsString)).append("");
        Object recvWindowValue = getRecvWindow();
        String recvWindowValueAsString = "";
        recvWindowValueAsString = recvWindowValue.toString();
        sb.append("recvWindow=").append(urlEncode(recvWindowValueAsString)).append("");
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
        openapiFields.add("sourceType");
        openapiFields.add("requestId");
        openapiFields.add("subscriptionAmount");
        openapiFields.add("sourceAsset");
        openapiFields.add("flexibleAllowedToUse");
        openapiFields.add("planId");
        openapiFields.add("indexId");
        openapiFields.add("details");
        openapiFields.add("recvWindow");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("sourceType");
        openapiRequiredFields.add("subscriptionAmount");
        openapiRequiredFields.add("sourceAsset");
        openapiRequiredFields.add("details");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to OneTimeTransactionRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!OneTimeTransactionRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in OneTimeTransactionRequest is not found"
                                        + " in the empty JSON string",
                                OneTimeTransactionRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!OneTimeTransactionRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `OneTimeTransactionRequest` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : OneTimeTransactionRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("sourceType").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `sourceType` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("sourceType").toString()));
        }
        if (!jsonObj.get("sourceAsset").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `sourceAsset` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("sourceAsset").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!OneTimeTransactionRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'OneTimeTransactionRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<OneTimeTransactionRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(OneTimeTransactionRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<OneTimeTransactionRequest>() {
                        @Override
                        public void write(JsonWriter out, OneTimeTransactionRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public OneTimeTransactionRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of OneTimeTransactionRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of OneTimeTransactionRequest
     * @throws IOException if the JSON string is invalid with respect to OneTimeTransactionRequest
     */
    public static OneTimeTransactionRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, OneTimeTransactionRequest.class);
    }

    /**
     * Convert an instance of OneTimeTransactionRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
