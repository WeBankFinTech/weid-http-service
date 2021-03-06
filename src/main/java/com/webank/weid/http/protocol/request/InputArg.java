/*
 *       Copyright© (2019) WeBank Co., Ltd.
 *
 *       This file is part of weid-http-service.
 *
 *       weid-http-service is free software: you can redistribute it and/or modify
 *       it under the terms of the GNU Lesser General Public License as published by
 *       the Free Software Foundation, either version 3 of the License, or
 *       (at your option) any later version.
 *
 *       weid-http-service is distributed in the hope that it will be useful,
 *       but WITHOUT ANY WARRANTY; without even the implied warranty of
 *       MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *       GNU Lesser General Public License for more details.
 *
 *       You should have received a copy of the GNU Lesser General Public License
 *       along with weid-http-service.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.webank.weid.http.protocol.request;

import lombok.Data;

/**
 * The common input argument for all Service API.
 *
 * @author chaoxinhu
 **/
@Data
public class InputArg {

    /**
     * Required: the function related arguments.
     */
    String functionArg;

    /**
     * Required: the transaction related arguments.
     */
    String transactionArg;

    /**
     * Required: the function name to be called.
     */
    String functionName;

    /**
     * Required: the API version.
     */
    String v;
}
