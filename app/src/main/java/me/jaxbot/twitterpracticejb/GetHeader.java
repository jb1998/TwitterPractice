package me.jaxbot.twitterpracticejb;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.util.HashMap;

/**
 * Created by pc on 4/3/2017.
 */

public class GetHeader {

    String header;
    OAuthClass oAuthClass=new OAuthClass();
    public GetHeader(String URL, String method, HashMap<String,String> querymap, HashMap<String,String> bodymap) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        header=oAuthClass
                .setConsumersecret("6qNeepcE3doRCvJl4ti9ezaHxpKBGGy04OyQUJdAWiISGEwTH8")//These 4 should be fetched from Shared Prefrence
                .setTokensecret("sMTQNzzDJLt4l7DKIY9KpzwDHbg0gYoAYkkgWEgJVOUtG")
                .setOauth_consumer_key("DneYP2Fb0Hdlbks1wgRIKFcWS")
                .setOauth_token("843811768258445313-g79rpIwugxbMFoibTnqQFTsUIQzdZbu")
                .setOauth_signature_method("HMAC-SHA1")
                .setOauth_version("1.0")

                .setOauth_nonce(randomString())//should be a random string everytime
                .setOauth_timestamp(System.currentTimeMillis()/1000+"") //current epoch time
                .setBody(null) //set to null if there is no request body
                .setQuery(querymap)
                .setBaseurl(URL)
                .setMethod(method)
                .getAuthheader();
    }

    public String randomString(){
        SecureRandom random = new SecureRandom();
        return new BigInteger(130, random).toString(32);

    }
}
