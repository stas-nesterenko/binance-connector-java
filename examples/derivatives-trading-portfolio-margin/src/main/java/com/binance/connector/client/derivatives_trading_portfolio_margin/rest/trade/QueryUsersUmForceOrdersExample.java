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

package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.AutoCloseType;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryUsersUmForceOrdersResponse;

/** API examples for TradeApi */
public class QueryUsersUmForceOrdersExample {
    private DerivativesTradingPortfolioMarginRestApi api;

    public DerivativesTradingPortfolioMarginRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingPortfolioMarginRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingPortfolioMarginRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Query User&#39;s UM Force Orders (USER_DATA)
     *
     * <p>Query User&#39;s UM Force Orders * If &#x60;autoCloseType&#x60; is not sent, orders with
     * both of the types will be returned * If &#x60;startTime&#x60; is not sent, data within 7 days
     * before &#x60;endTime&#x60; can be queried Weight: 20 with symbol, 50 without symbol
     *
     * @throws ApiException if the Api call fails
     */
    public void queryUsersUmForceOrdersExample() throws ApiException {
        String symbol = "";
        AutoCloseType autoCloseType = AutoCloseType.LIQUIDATION;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 100L;
        Long recvWindow = 5000L;
        ApiResponse<QueryUsersUmForceOrdersResponse> response =
                getApi().queryUsersUmForceOrders(
                                symbol, autoCloseType, startTime, endTime, limit, recvWindow);
        System.out.println(response.getData());
    }
}
