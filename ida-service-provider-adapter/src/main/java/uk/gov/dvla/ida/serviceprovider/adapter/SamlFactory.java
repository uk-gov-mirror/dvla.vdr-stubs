package uk.gov.dvla.ida.serviceprovider.adapter;

import org.opensaml.xml.ConfigurationException;
import uk.gov.dvla.ida.serviceprovider.adapter.config.SamlConfiguration;
import uk.gov.dvla.services.io.ResourceReader;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;

public class SamlFactory {

    private static SamlConfiguration samlConfiguration;


    public SamlFactory(SamlConfiguration samlConfiguration, ResourceReader reader) throws ConfigurationException, InvalidKeySpecException,
            CertificateException, NoSuchAlgorithmException, IOException {

    }

    public AuthnRequestBuilder getAuthnRequestBuilder() {
        return new AuthnRequestBuilder();
    }
    public AuthnResponseValidator getAuthnResponseValidator() {
        return new AuthnResponseValidator();
    }
}