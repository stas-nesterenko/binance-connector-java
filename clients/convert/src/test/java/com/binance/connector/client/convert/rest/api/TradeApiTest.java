/*
 * Binance Convert REST API
 * OpenAPI Specification for the Binance Convert REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.convert.rest.api;

import static org.junit.Assert.assertEquals;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.auth.BinanceAuthenticationFactory;
import com.binance.connector.client.common.auth.SignatureAuthentication;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.sign.HmacSignatureGenerator;
import com.binance.connector.client.common.sign.SignatureGenerator;
import com.binance.connector.client.convert.rest.model.AcceptQuoteRequest;
import com.binance.connector.client.convert.rest.model.AcceptQuoteResponse;
import com.binance.connector.client.convert.rest.model.CancelLimitOrderRequest;
import com.binance.connector.client.convert.rest.model.CancelLimitOrderResponse;
import com.binance.connector.client.convert.rest.model.GetConvertTradeHistoryResponse;
import com.binance.connector.client.convert.rest.model.OrderStatusResponse;
import com.binance.connector.client.convert.rest.model.PlaceLimitOrderRequest;
import com.binance.connector.client.convert.rest.model.PlaceLimitOrderResponse;
import com.binance.connector.client.convert.rest.model.QueryLimitOpenOrdersRequest;
import com.binance.connector.client.convert.rest.model.QueryLimitOpenOrdersResponse;
import com.binance.connector.client.convert.rest.model.SendQuoteRequestRequest;
import com.binance.connector.client.convert.rest.model.SendQuoteRequestResponse;
import jakarta.validation.constraints.*;
import okhttp3.Call;
import okhttp3.Request;
import org.bouncycastle.crypto.CryptoException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

/** API tests for TradeApi */
public class TradeApiTest {

    private TradeApi api;
    private ApiClient apiClientSpy;
    private SignatureGenerator signatureGeneratorSpy;

    @BeforeEach
    public void initApiClient() throws ApiException {
        ClientConfiguration clientConfiguration = new ClientConfiguration();
        clientConfiguration.setUrl("http://localhost:8080");
        SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
        signatureConfiguration.setApiKey("apiKey");
        signatureConfiguration.setSecretKey("secretKey");
        clientConfiguration.setSignatureConfiguration(signatureConfiguration);

        HmacSignatureGenerator signatureGenerator =
                new HmacSignatureGenerator(signatureConfiguration.getSecretKey());
        signatureGeneratorSpy = Mockito.spy(signatureGenerator);
        SignatureAuthentication signatureAuthentication =
                new SignatureAuthentication(
                        signatureConfiguration.getApiKey(), signatureGeneratorSpy);
        SignatureAuthentication authenticationSpy = Mockito.spy(signatureAuthentication);
        Mockito.doReturn("1736393892000").when(authenticationSpy).buildTimestamp();

        BinanceAuthenticationFactory factoryMock = Mockito.mock(BinanceAuthenticationFactory.class);
        Mockito.doReturn(authenticationSpy)
                .when(factoryMock)
                .getAuthentication(signatureConfiguration);

        ApiClient apiClient = new ApiClient(clientConfiguration, factoryMock);

        apiClientSpy = Mockito.spy(apiClient);
        Mockito.doReturn(new ApiResponse<>(200, null))
                .when(apiClientSpy)
                .execute(Mockito.any(), Mockito.any(java.lang.reflect.Type.class));
        Mockito.doReturn(new ApiResponse<>(200, null)).when(apiClientSpy).execute(Mockito.any());
        Mockito.doReturn("1736393892000").when(apiClientSpy).buildTimestamp();

        api = new TradeApi(apiClientSpy);
    }

    /**
     * Accept Quote (TRADE)
     *
     * <p>Accept the offered quote by quote ID. Weight: 500(UID)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void acceptQuoteTest() throws ApiException, CryptoException {
        AcceptQuoteRequest acceptQuoteRequest = new AcceptQuoteRequest();

        acceptQuoteRequest.quoteId("1");

        ApiResponse<AcceptQuoteResponse> response = api.acceptQuote(acceptQuoteRequest);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals("timestamp=1736393892000quoteId=1", signInputCaptor.getValue());
        assertEquals(
                "0624eea4af8a8321e2c84e368ed873d71a9a5c971e629175b93556bd22fc325d",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/sapi/v1/convert/acceptQuote", actualRequest.url().encodedPath());
    }

    /**
     * Cancel limit order (USER_DATA)
     *
     * <p>Enable users to cancel a limit order Weight: 200(UID)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelLimitOrderTest() throws ApiException, CryptoException {
        CancelLimitOrderRequest cancelLimitOrderRequest = new CancelLimitOrderRequest();

        cancelLimitOrderRequest.orderId("1");

        ApiResponse<CancelLimitOrderResponse> response =
                api.cancelLimitOrder(cancelLimitOrderRequest);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals("timestamp=1736393892000orderId=1", signInputCaptor.getValue());
        assertEquals(
                "ad8bc32c069fb75b8afba1bc7d8f4dc63cd336877366a3b3bc88918201410d88",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/sapi/v1/convert/limit/cancelOrder", actualRequest.url().encodedPath());
    }

    /**
     * Get Convert Trade History(USER_DATA)
     *
     * <p>Get Convert Trade History * The max interval between startTime and endTime is 30 days.
     * Weight: 3000
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConvertTradeHistoryTest() throws ApiException, CryptoException {
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 100L;
        Long recvWindow = 5000L;
        ApiResponse<GetConvertTradeHistoryResponse> response =
                api.getConvertTradeHistory(startTime, endTime, limit, recvWindow);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals(
                "startTime=1623319461670&endTime=1641782889000&limit=100&recvWindow=5000&timestamp=1736393892000",
                signInputCaptor.getValue());
        assertEquals(
                "23689f3330f331d9db9c46c9dc87d2217486442f1746adfdda02c10e3dbde13e",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/sapi/v1/convert/tradeFlow", actualRequest.url().encodedPath());
    }

    /**
     * Order status(USER_DATA)
     *
     * <p>Query order status by order ID. Weight: 100(UID)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void orderStatusTest() throws ApiException, CryptoException {
        String orderId = "1";
        String quoteId = "1";
        ApiResponse<OrderStatusResponse> response = api.orderStatus(orderId, quoteId);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals("orderId=1&quoteId=1&timestamp=1736393892000", signInputCaptor.getValue());
        assertEquals(
                "c8ea02b290636497dfc9f4f59d01ea6ceff503bf1955b020615bd7bb133a81c4",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/sapi/v1/convert/orderStatus", actualRequest.url().encodedPath());
    }

    /**
     * Place limit order (USER_DATA)
     *
     * <p>Enable users to place a limit order * &#x60;baseAsset&#x60; or &#x60;quoteAsset&#x60; can
     * be determined via &#x60;exchangeInfo&#x60; endpoint. * Limit price is defined from
     * &#x60;baseAsset&#x60; to &#x60;quoteAsset&#x60;. * Either &#x60;baseAmount&#x60; or
     * &#x60;quoteAmount&#x60; is used. Weight: 500(UID)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void placeLimitOrderTest() throws ApiException, CryptoException {
        PlaceLimitOrderRequest placeLimitOrderRequest = new PlaceLimitOrderRequest();

        placeLimitOrderRequest.baseAsset("");
        placeLimitOrderRequest.quoteAsset("");
        placeLimitOrderRequest.limitPrice(1d);
        placeLimitOrderRequest.side("BUY");
        placeLimitOrderRequest.expiredType("");

        ApiResponse<PlaceLimitOrderResponse> response = api.placeLimitOrder(placeLimitOrderRequest);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals(
                "timestamp=1736393892000side=BUY&expiredType=&limitPrice=1&baseAsset=&quoteAsset=",
                signInputCaptor.getValue());
        assertEquals(
                "0b0040dc5224dd86dca84f3c74daab95c4ea74140366237133aac2bf814f1f91",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/sapi/v1/convert/limit/placeOrder", actualRequest.url().encodedPath());
    }

    /**
     * Query limit open orders (USER_DATA)
     *
     * <p>Request a quote for the requested token pairs Weight: 3000(UID)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queryLimitOpenOrdersTest() throws ApiException, CryptoException {
        QueryLimitOpenOrdersRequest queryLimitOpenOrdersRequest = new QueryLimitOpenOrdersRequest();

        ApiResponse<QueryLimitOpenOrdersResponse> response =
                api.queryLimitOpenOrders(queryLimitOpenOrdersRequest);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals("timestamp=1736393892000", signInputCaptor.getValue());
        assertEquals(
                "53668e00dc92eb93de0b253c301e9fc0c20042b13db384a0ad94b38688a5a84c",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/sapi/v1/convert/limit/queryOpenOrders", actualRequest.url().encodedPath());
    }

    /**
     * Send Quote Request(USER_DATA)
     *
     * <p>Request a quote for the requested token pairs * Either fromAmount or toAmount should be
     * sent * &#x60;quoteId&#x60; will be returned only if you have enough funds to convert Weight:
     * 200(UID)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendQuoteRequestTest() throws ApiException, CryptoException {
        SendQuoteRequestRequest sendQuoteRequestRequest = new SendQuoteRequestRequest();

        sendQuoteRequestRequest.fromAsset("");
        sendQuoteRequestRequest.toAsset("");

        ApiResponse<SendQuoteRequestResponse> response =
                api.sendQuoteRequest(sendQuoteRequestRequest);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals("timestamp=1736393892000toAsset=&fromAsset=", signInputCaptor.getValue());
        assertEquals(
                "b018f458ed01eaa557ea9adbacf293f684bee81ed29da077d1a5e54a264000c3",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/sapi/v1/convert/getQuote", actualRequest.url().encodedPath());
    }
}
