package uk.gov.dvla.ida.serviceprovider.adapter;

import org.joda.time.DateTime;
import org.opensaml.saml2.core.AuthnRequest;
import org.opensaml.xml.io.MarshallingException;
import org.opensaml.xml.signature.SignatureException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public class AuthnRequestBuilder {

    public String build(String id, DateTime issueInstant) throws MarshallingException,
            SignatureException, IOException, NoSuchAlgorithmException, InvalidKeySpecException, ParserConfigurationException {
        return null;
    }


    private AuthnRequest createAuthnRequest(String id, DateTime issueInstant) {
        return null;
    }
}