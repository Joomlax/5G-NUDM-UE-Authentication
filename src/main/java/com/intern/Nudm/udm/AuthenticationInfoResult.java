package com.intern.Nudm.udm;

public class AuthenticationInfoResult {
    private AuthType authType;
    private String supportedFeatures;
    private AuthenticationVector authenticationVector;
    private String supi;
    private String akaInd;

    public AuthenticationInfoResult(AuthType authType) {
        this.authType = authType;
    }

    public AuthenticationInfoResult(AuthType authType, String supportedFeatures) {
        this.authType = authType;
        this.supportedFeatures = supportedFeatures;
    }

    public AuthenticationInfoResult(AuthType authType, String supportedFeatures, AuthenticationVector authenticationVector) {
        this.authType = authType;
        this.supportedFeatures = supportedFeatures;
        this.authenticationVector = authenticationVector;
    }

    public AuthenticationInfoResult(AuthType authType, String supportedFeatures, AuthenticationVector authenticationVector, String supi) {
        this.authType = authType;
        this.supportedFeatures = supportedFeatures;
        this.authenticationVector = authenticationVector;
        this.supi = supi;
    }

    public AuthenticationInfoResult(AuthType authType, String supportedFeatures, AuthenticationVector authenticationVector, String supi, String akaInd) {
        this.authType = authType;
        this.supportedFeatures = supportedFeatures;
        this.authenticationVector = authenticationVector;
        this.supi = supi;
        this.akaInd = akaInd;
    }

    public AuthenticationInfoResult(AuthType authType, AuthenticationVector authenticationVector) {
        this.authType = authType;
        this.authenticationVector = authenticationVector;
    }

    public AuthType getAuthType() {
        return authType;
    }

    public void setAuthType(AuthType authType) {
        this.authType = authType;
    }

    public String getSupportedFeatures() {
        return supportedFeatures;
    }

    public void setSupportedFeatures(String supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
    }

    public AuthenticationVector getAuthenticationVector() {
        return authenticationVector;
    }

    public void setAuthenticationVector(AuthenticationVector authenticationVector) {
        this.authenticationVector = authenticationVector;
    }

    public String getSupi() {
        return supi;
    }

    public void setSupi(String supi) {
        this.supi = supi;
    }

    public String getAkaInd() {
        return akaInd;
    }

    public void setAkaInd(String akaInd) {
        this.akaInd = akaInd;
    }

    @Override
    public String toString() {
        return "AuthenticationInfoResult{" +
                "authType=" + authType +
                ", supportedFeatures='" + supportedFeatures + '\'' +
                ", authenticationVector=" + authenticationVector +
                ", supi='" + supi + '\'' +
                ", akaInd='" + akaInd + '\'' +
                '}';
    }
}
