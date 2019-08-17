package store.marathon.backend.security;

public class Constants {

    public static final String LOGIN_URL = "/login";
    public static final String HEADER_AUTHORIZACION_KEY = "Authorization";
    public static final String TOKEN_BEARER_PREFIX = "Bearer ";

    public static final String ISSUER_INFO = "marathon.store";
    public static final String SUPER_SECRET_KEY = "1q2w3e4r5t6y7u8i9o0p";
    public static final long TOKEN_EXPIRATION_TIME = 864_000_000; // 10 day


}
