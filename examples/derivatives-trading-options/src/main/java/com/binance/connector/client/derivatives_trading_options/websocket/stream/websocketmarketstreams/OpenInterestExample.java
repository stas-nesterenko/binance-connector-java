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

package com.binance.connector.client.derivatives_trading_options.websocket.stream.websocketmarketstreams;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.DerivativesTradingOptionsWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.api.DerivativesTradingOptionsWebSocketStreams;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.OpenInterestRequest;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.model.OpenInterestResponse;

/** API examples for WebsocketMarketStreamsApi */
public class OpenInterestExample {
    private DerivativesTradingOptionsWebSocketStreams api;

    public DerivativesTradingOptionsWebSocketStreams getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    DerivativesTradingOptionsWebSocketStreamsUtil.getClientConfiguration();
            api = new DerivativesTradingOptionsWebSocketStreams(clientConfiguration);
        }
        return api;
    }

    /**
     * Open Interest
     *
     * <p>Option open interest for specific underlying asset on specific expiration date.
     * E.g.[ETH@openInterest@221125](wss://nbstream.binance.com/eoptions/stream?streams&#x3D;ETH@openInterest@221125)
     * Update Speed: 60s
     *
     * @throws ApiException if the Api call fails
     */
    public void openInterestExample() throws ApiException, InterruptedException {
        OpenInterestRequest openInterestRequest = new OpenInterestRequest();
        openInterestRequest.underlyingAsset("ETH");
        openInterestRequest.expirationDate("220930");
        StreamBlockingQueueWrapper<OpenInterestResponse> response =
                getApi().openInterest(openInterestRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
