package com.cyb.url;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.cyb.file.FileUtils;

@SuppressWarnings("deprecation")
public class HttpClientEntity  {
	static String charset = "gbk";//"gb2312"
    @SuppressWarnings("resource")
	public static void downLoadContent(String url,String toDir){
    	 try {
			 HttpClient hc = new DefaultHttpClient();
			 HttpGet hg = new HttpGet(url);
			 HttpResponse response = hc.execute(hg);
			 HttpEntity entity = response.getEntity();
			 InputStream htm_in = null;
			 if(entity != null){
			     htm_in = entity.getContent();
			     StringBuffer htm_str = new StringBuffer(FileUtils.inputStream2String(htm_in));
			     FileUtils.overideString2File(htm_str.toString(),toDir);
			 }
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
