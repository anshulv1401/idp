/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */
package io.mosip.idp.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class OauthRespDto {

    private String transactionId;
    private String authFactors;
    private List<String> essentialClaims;
    private List<String> optionalClaims;
    private Map<String, String> configs;

}