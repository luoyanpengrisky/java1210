package com.offcn.demo;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePrecreateRequest;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.response.AlipayTradePrecreateResponse;
import com.alipay.api.response.AlipayTradeQueryResponse;

public class GetPayStatus {

	public static void main(String[] args) throws AlipayApiException {
		String url = "https://openapi.alipaydev.com/gateway.do";
		String app_id = "2016092900624384";
		String out_trade_no = "1132930236357394432";
		String private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCQeSI4bE8d9vebqNkf7ckonlhR7jT0vfwAeT+KjFIUgUozWb3LzTxS7aajWsYaaFCkHZy30xFM+4KuEBu2+GCG7cyesZRlrvYShNhS9W0sPqMTdrdGmqzfLEnfgQzWNInkI/rrn/kUGXWCyg9B9MPD3sDCWux8NsqnGTJhomvN+CHXjnilTkX5w1AA8N9bvUPek/QsccIygMTrvLGTnkellH3Zyw4466qmaJlceJtax3D9efhvHTOSvdr4ratXyq0ZHAIV3aCPZLHfysj7aHGHgFXZ+6+Ao9u859znb6XmTV2QhPo7po9tJMhN7q4ib0pCpmdZFNr0zuhAK1M3HsyVAgMBAAECggEAIdct69d65MLvlteDHFZ/cvM8LtzELLu/poDAIHzj0QfD0Klpqq5FPguKp+LgWlkq4nZJOknHWKflIU6Gn2IoghJ7hoSEBRlpbEcPwMbaLq3xVuLM5U3fxlrCZwb8ccRWtEi1QrHzDwEzpFIeJs3leSDZN+1CTYosB94ADhyUcecccFc/BZ6EAXevWFRrJh1zO4a4A4fMbUEqdQ0uVG9QRB/bFXyKguEQ5qT0JjjSxpwnZSmV6/pprPm4afB7rO5aVfXEqNn+K+Uz1FdhV8c6C/nK5p1I4vEnt36NCXyD1puZuCV3rVE8oieOnt1KDa+Bs2NhH2YHVUi5NDTCGOBgdQKBgQDqbLR/uReyCo18EUkOPxiAjSszdZ3o0eN9j8hDqRwrc0ysuZ4NTro/3QbqzPZjfHpHIw8fJy/78g0dj+UjP31MhuDKCAdAvPN71KVwYW9zMv3gDRkz6NdcSPJzfnDXUwmxrceVVCek4MDEnAOWyKa01UwGN8bxQkt4f++08X6MPwKBgQCdxROERfTyFwFiM925Sf5Xzi7gZS7NmlrgwxrHX/diQ3SKJSKMJ/PzklXHQWWNLYQDIA76EvkuGVZ7AmiMaD+l6Bi4xOaER1I21b6TEP/iPl2wz7u36Gl6ltujRtl2hYhF2MfnO/ae2Pc4mjBzK+4/1Cl1eqMzXlz49z/EAAtCKwKBgQC7c6M9wo79Ek0imVvWpYN9P+T8qB9WDYegXrnfyLk60V7Nezu0HnD2IlKmrLCUyvOoMJOl8JsBFwN/0RGEBv+1kuDrDFJoZO855MdJvs/0ySCS6UZu6NBU/gvJaKDovYCx8Gj4sqtkv0fFr497IgWT8j9xdWaCguWAfKT8BmOP1wKBgG0/W11bp9q/TWj360/zydh5YIJn7jnW6Zj74R4v+LilZxyFzF9rBwUhzp4UTcKtwtz7JQPLgZqHVxgEueqIAZLbncrMJadxT5/C8J0bx2SdtPjLT/xwRiHqNprgY5MrsgpTq1EWd5bVPJOISYZm5Cp0umSsEDhw3kZTx2bsdN9TAoGBAIUlWIIMT4bEzw6ycHjdyIhYSzh9gGAhzTEoBpo/D3DflOekiNfih3oC/GHkL/dxT2x4nyJ41UHXoBjHbCnFjhRYOkSwHVLNiO6PXkqSs3dfNuOph2FKRwLxQfPDK+HmE1cVtNPA4CsVQuZmbJvUYPE0mZ/7R6DpdQNFVvV8sSmU";
		String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjIHcSHGNY3e3YknRd6eHLHMbYlhGic3tlSw0PlkkKwPsoKIAlgUcnKGnWkYcODBZqMq2r9LFN2rNLcQg198RFxtmu9w6GBQUfjwVRVb5VvVdOdAFhOwBs7Zk2tatuP+Y841pqhLnf/GrfN/p6frroUpBI++7p430ftw2aGBdjiJj98zEmxVGw+EoWxhxHA6tlJpxEVZFBzlAKWeXiokh6YL8bgG4+HG1C1AH++RQx09PI0Oz6lI/EeDJj3vjUb9B8KI0Y0Iq6kWaFNttNepPtWtAXa4Pa4vjf7StmeqPWZo6nn9GWy/WMN+J8SJVve1q93tNeywpX0JQl1+YtSueTwIDAQAB";
		AlipayClient alipayClient = new DefaultAlipayClient(url,app_id,private_key,"json","GBK",alipay_public_key,"RSA2");
		AlipayTradeQueryRequest request = new AlipayTradeQueryRequest();
		request.setBizContent("{" +
				"\"out_trade_no\":\""+out_trade_no+"\"," +
				"\"trade_no\":\"\"" +
				"  }");
		try {
			AlipayTradeQueryResponse response = alipayClient.execute(request);
			System.out.println(response.getBody());
		} catch (AlipayApiException e) {
			e.printStackTrace();
		}
		
	}
}
