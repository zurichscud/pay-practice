package org.lai.pay;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.junit.jupiter.api.Test;
import org.lai.pay.model.Product;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TestJWT {
    @Test
    public void test1() {
        HashMap<String, Object> claims = new HashMap<>();
        claims.put("id", "1");
        claims.put("username", "张三");
        String token = JWT.create()
                .withClaim("user", claims)
                .withExpiresAt(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 12))
                .sign(Algorithm.HMAC256("lai"));
        System.out.println(token);
    }

    @Test
    public void testReadToken() {
        String token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                ".1eyJ1c2VyIjp7ImlkIjoiMSIsInVzZXJuYW1lIjoi5byg5LiJIn0sImV4cCI6MTcyNjIzMjkzMX0" +
                ".nmUyZcXIYZFt3yeG8z6VG0eYfD3uc4Jh_WmQWADA76I";
        JWTVerifier verifier = JWT.require(Algorithm.HMAC256("lai")).build();
        DecodedJWT decodedJWT = verifier.verify(token);
        Map<String, Claim> claims = decodedJWT.getClaims();
        System.out.println(claims.get("user"));

    }
}
