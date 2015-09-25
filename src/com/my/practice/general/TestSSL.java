package com.my.practice.general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import org.apache.http.HttpEntity;
import org.apache.http.client.CookieStore;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class TestSSL {
	public static void main(String[] args) throws Exception {

		String returnedPage = "";
		returnedPage = sendGET();
		System.out.println("Output : " + returnedPage);
	}
	private static String sendGET() throws IOException, KeyManagementException, NoSuchAlgorithmException {
       /* CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("https://wizzair.com/en-GB/Search");
        CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
 
        System.out.println("GET Response Status:: "
                + httpResponse.getStatusLine().getStatusCode());
 
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                httpResponse.getEntity().getContent()));
 
        String inputLine;
        StringBuffer response = new StringBuffer();
 
        while ((inputLine = reader.readLine()) != null) {
            response.append(inputLine);
        }
        reader.close();
 
        // print result
        String returnPage = response.toString();
        httpClient.close();
        return returnPage;*/
		
		RequestConfig globalConfig = RequestConfig.custom().setCookieSpec(CookieSpecs.BEST_MATCH).build();
        CookieStore cookieStore = new BasicCookieStore();
        HttpClientContext context = HttpClientContext.create();
        context.setCookieStore(cookieStore);

        CloseableHttpClient httpClient = HttpClients.custom().setDefaultRequestConfig(globalConfig).setDefaultCookieStore(cookieStore).setSslcontext(SSLContexts.custom().useProtocol("TLSv1.1").build()).build();
        HttpGet httpGet = new HttpGet("https://secure2.lionair.co.id/lionairibe/OnlineBooking.aspx");
        CloseableHttpResponse response = httpClient.execute(httpGet,context);
        HttpEntity entity = response.getEntity();
	    String optionsPage = EntityUtils.toString(entity);
	    System.out.println(optionsPage);
        System.out.println(context.getCookieStore().getCookies());
        response.close();
        return optionsPage ;
    }
}
