package uk.gov.dvla.nino;

import uk.gov.dvla.domain.authentication.nino.NinoAuthenticationToken;

import java.rmi.RemoteException;

public interface INinoGatewayClient {

    void start() throws Exception;

    void authenticate(NinoAuthenticationToken authToken) throws RemoteException;
}
