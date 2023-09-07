package com.github.eddykaya;

import org.keycloak.broker.provider.AuthenticationRequest;
import org.keycloak.models.KeycloakSession;
import javax.ws.rs.core.UriBuilder;
import org.keycloak.social.google.GoogleIdentityProvider;
import org.keycloak.social.google.GoogleIdentityProviderConfig;

public class CustomGoogleIdentityProvider extends GoogleIdentityProvider {
    public CustomGoogleIdentityProvider(KeycloakSession session, GoogleIdentityProviderConfig config) {
        super(session, config);
    }
    @Override
    protected UriBuilder createAuthorizationUrl(AuthenticationRequest request) {
        return super.createAuthorizationUrl(request).queryParam("prompt","select_account");
    }
}