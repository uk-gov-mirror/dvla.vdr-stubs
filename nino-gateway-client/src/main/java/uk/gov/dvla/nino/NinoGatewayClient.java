package uk.gov.dvla.nino;


import uk.gov.dvla.domain.authentication.nino.NinoAuthenticationToken;

import java.rmi.RemoteException;

public class NinoGatewayClient implements INinoGatewayClient{

    public NinoGatewayClient(String applicationId, String transactionId, String dwpEndpoint) {
    }

    public void authenticate(NinoAuthenticationToken authToken) throws RemoteException {


    }

    public void start() throws Exception {
    }
}

