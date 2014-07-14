package uk.gov.dvla.ida.serviceprovider.adapter.config;

public class SamlConfiguration {

    private String txnIssuerId;

    private String matchingIssuerId;

    private String appPrivateKey;

    private String appPublicKey;

    private String idaPublicKey;

    private String idaUrl;

    private String appLoginUrl;


    public String getTxnIssuerId() {
        return txnIssuerId;
    }

    public void setTxnIssuerId(String txnIssuerId) {
        this.txnIssuerId = txnIssuerId;
    }

    public String getMatchingIssuerId() {
        return matchingIssuerId;
    }

    public void setMatchingIssuerId(String matchingIssuerId) {
        this.matchingIssuerId = matchingIssuerId;
    }

    public String getAppPrivateKey() {
        return appPrivateKey;
    }

    public void setAppPrivateKey(String appPrivateKey) {
        this.appPrivateKey = appPrivateKey;
    }

    public String getAppPublicKey() {
        return appPublicKey;
    }

    public void setAppPublicKey(String appPublicKey) {
        this.appPublicKey = appPublicKey;
    }

    public String getIdaPublicKey() {
        return idaPublicKey;
    }

    public void setIdaPublicKey(String idaPublicKey) {
        this.idaPublicKey = idaPublicKey;
    }

    public String getIdaUrl() {
        return idaUrl;
    }

    public void setIdaUrl(String idaUrl) {
        this.idaUrl = idaUrl;
    }

    public String getAppLoginUrl() {
        return appLoginUrl;
    }

    public void setAppLoginUrl(String appLoginUrl) {
        this.appLoginUrl = appLoginUrl;
    }
}
