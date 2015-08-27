package io.federecio.dropwizard.swagger;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SwaggerUIConfiguration {
    @JsonProperty
    String authName = "api_key";

    @JsonProperty
    String authKey = "api_key";

    @JsonProperty
    String authKeyLocation = "query";

    @JsonProperty
    String assetPrefix = "/";

    public String getAuthName() {
      return authName;
    }

    public void setAuthName(String authName) {
      this.authName = authName;
    }

    public String getAuthKey() {
      return authKey;
    }

    public void setAuthKey(String authKey) {
      this.authKey = authKey;
    }

    public String getAuthKeyLocation() {
      return authKeyLocation;
    }

    public void setAuthKeyLocation(String authKeyLocation) {
      this.authKeyLocation = authKeyLocation;
    }

    public String getAssetPrefix() {
      return assetPrefix;
    }

    public void setAssetPrefix(String assetPrefix) {
      this.assetPrefix = assetPrefix;
    }
}
