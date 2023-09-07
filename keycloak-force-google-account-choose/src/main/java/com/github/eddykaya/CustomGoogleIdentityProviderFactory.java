package com.github.eddykaya;


import org.keycloak.models.IdentityProviderModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.social.google.GoogleIdentityProvider;
import org.keycloak.social.google.GoogleIdentityProviderConfig;
import org.keycloak.social.google.GoogleIdentityProviderFactory;

public class CustomGoogleIdentityProviderFactory extends GoogleIdentityProviderFactory {
    @Override
    public GoogleIdentityProvider create(KeycloakSession session, IdentityProviderModel model) {
        return new CustomGoogleIdentityProvider(session, new GoogleIdentityProviderConfig(model));
    }
}
