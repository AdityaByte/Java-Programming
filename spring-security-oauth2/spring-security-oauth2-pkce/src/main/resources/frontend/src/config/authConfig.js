import { UserManager, WebStorageStateStore } from "oidc-client-ts"

const oicdConfig = {
    authority: 'http://localhost:8180/realms/oauth2-demo-realm',
    client_id: 'oauth2-demo-pkce-client',
    redirect_uri: window.location.origin,
    post_logout_redirect_uri: window.location.origin,
    response_type: 'code',
    scope: 'openid profile email offline_access',
    loadUserInfo: true,
    userStore: new WebStorageStateStore({ store: window.localStorage }),
    filterProtocolClaims: true,
}

const userManager = new UserManager(oicdConfig);

export function useOAuth() {
    const login = () => {
        userManager.signinRedirect();
    }

    const logout = () => {
        userManager.signoutRedirect()
    }

    const configureOAuth = async () => {
        try {
            const user = await userManager.getUser();
            if (!user) {
                await userManager.signinRedirectCallback();
            }
        } catch (error) {
            console.error("OAuth2 login failed", error)
        }
    }

    return { login, logout, configureOAuth }
}

export {userManager, oicdConfig};