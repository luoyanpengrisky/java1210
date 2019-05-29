package com.offcn.demo;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.request.AlipayTradePrecreateRequest;
import com.alipay.api.response.AlipayTradePrecreateResponse;

public class TwoCode {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		String url = "https://openapi.alipaydev.com/gateway.do";
		String app_id = "2016092900624384";
		String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjIHcSHGNY3e3YknRd6eHLHMbYlhGic3tlSw0PlkkKwPsoKIAlgUcnKGnWkYcODBZqMq2r9LFN2rNLcQg198RFxtmu9w6GBQUfjwVRVb5VvVdOdAFhOwBs7Zk2tatuP+Y841pqhLnf/GrfN/p6frroUpBI++7p430ftw2aGBdjiJj98zEmxVGw+EoWxhxHA6tlJpxEVZFBzlAKWeXiokh6YL8bgG4+HG1C1AH++RQx09PI0Oz6lI/EeDJj3vjUb9B8KI0Y0Iq6kWaFNttNepPtWtAXa4Pa4vjf7StmeqPWZo6nn9GWy/WMN+J8SJVve1q93tNeywpX0JQl1+YtSueTwIDAQAB";
		String private_key="MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDOr55I51EMRKQNyVN7wmWa4ER2KzSXv4oMnAsdKsa9oYTBk65raZVyKoxUBj9V0T/jR+kdy2Yju0EX9M+BAPhSoQA0SaAHRN5YEYtnA1ofqys20yDZTAdEZxB7m7dRQyvnxMdEi2RgUOQ8Or6vC5fGVyf8dBwqP0wfaIfyY3z2WxDfV2Arh/9EPEy9yVRbaZ5qfUsAlh2tQo2QPZKzBJ9IxFWtRKUcWvoQkKDLtkyIVqfBJwvt1M78JW+eEUtvRSM2BtQgCnBpK8JFoO/tvivL+m0XpIg1Cj8CnchbLKaFIgyyoY8oQFuIFHLjd8At5gFmicISV2hyfTkeJ1p9VLjpAgMBAAECggEARxKM03T3ochYwYTheEU4uzEzWY8x3py20+80wyrafIr2I7qs17LO+Rs4dgxP6yqxVW588wnmbZMOpzY/xJSYz5EdiN1ochd0fcRKs3mrnAg4K/od6ZsDRLpMKLU7LG50wpYgD6n/Mj+evDdXKspJvqJp1Z33sW9itco0NV2QswWu9k/47Z/SwoyNKqAWNt26s23saps7hsm14c0or4LQxw2llMU1LqTQaQQWJgJQ0QqEtKXLzVMURl4nCxtLwvfteLLyCCw+3AK3TZ9uv2YNDwUPdcSBj1a7eYk909eeSQatQTQ3uKIyFQSJD7O5qQHQSbhuvI3tv0J/AzUa+vFEAQKBgQD4TnLVpO5qx2GKLs1etQ7dj5qyfw/72GD2Xbie8vGtAwdRdTtFaFXqgGJd88k0iZ1C6IJt6Nbr04HbtQ1MxCZoyLr9mBVjo/8CV8A+4L5wG2HFQFb0Y9++QHpiy+NaNoclS/Ezbeh/A5e1PUqvN1iVMrw4JRYhN2htmrLjgckWeQKBgQDVFwn9sarAWrFSyhXZlK36jHOLxvU0cDiY+ZiNpH+hu/yrIdS75kCBRlZwKszvyhGR7j5I7GB4c/LCydF66rEgM6z0TaJFp/xGVQmJWdOEMoat5cxbs887DYMwKELSV9FzFIT/4yAIPPugbfW08Sa3lwg9cVY+oSIVJlmtPErZ8QKBgQCXrFO47OY1k1Shc7U/BJnv/KgiIDtDOwj/dIAxl3TImfD+cP2jh/fzJjjv6tocnXLSS/Rf7rpZkvjfm9hj6+0KVJLkFOH721EJvVBRGDc7g35VXte+sMMbE4eukZxunqAuyBSttZUvAKLKsoXMQaJ6gGM4aG78GzxOtxBOqBiNAQKBgHNbqJ39y9mcf3i5TEDhO5py5K6cA+zif9FY9hxgHHRbR7sBcqBSU0No56yLjyyVMRPWbUOfK86pvpdzGIO5gDBVqWEMkjexbGJK8QG5bkeX7s8/o3VVj2+Bri6o7RvgTNRHHIVG2PV8xiAgxy6wimxDSEOzEqSPKNtYSp39EOyRAoGAG/J7XT1jeyYqpEuYKkBIi+F9u7z+RKHyIysQTQDspxztkDHxKl0OtmdU6uMlGkTQzSPbkirWPVvlv1+ozQiq0L0XjHQgNbETU7AxPNHV2f6SZyPtGlhCORcDvt7NcyvCkCeDN2knKlu0LnjNHGcFRdAMwOt+4q66xvCyGo6QzjE=";
		
		AlipayClient alipayClient = new DefaultAlipayClient(url,app_id,private_key,"json","GBK",alipay_public_key,"RSA2");
		AlipayTradePrecreateRequest request = new AlipayTradePrecreateRequest();
		request.setBizContent("{" +
				"\"out_trade_no\":\"20150320010101001\"," +
				"\"total_amount\":88.88," +
				"\"subject\":\"Iphone6 16G\"" +
				"  }");
		AlipayTradePrecreateResponse response;
		try {
			response = alipayClient.execute(request);
			System.out.println(response.getBody()+"===lalal");
//			System.out.println(response.getMsg());
			if(response.getCode().equals("10000")){
				// 请求成功
				// 请求成功返回二维码的字符串
				map.put("qr_code", response.getQrCode());
				map.put("out_trade_no", response.getOutTradeNo());
			}else{
				System.out.println("下单失败，无法生成二维码字符串");
			}
			
		} catch (AlipayApiException e) {
			e.printStackTrace();
		}
		
	}
}
