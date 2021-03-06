package com.xiyi.pojo;

public class WxPaySendData {
	//appid
		public String appid ;
		//商户号
		public String mch_id ; 
		//设备号
		public String device_info = "WEB";
		//随机字符串
		public String nonce_str;
		//签名
		public String sign;
		//商品描述
		public String body;
		//商品详情
		public String detail;
		//附加数据
		public String attach;
		//商户订单号
		public String out_trade_no;
		//货币类型
		public String fee_type = "CNY";
		//总金额
		public String total_fee;
		public String spbill_create_ip;
		//交易起始时间
		public String time_start;
		//订单失效时间
		public String time_expire;
		//商品标记
		public String goods_tag;
		//通知地址
		public String notify_url;
		//交易类型
		public String trade_type = "APP";
		public String product_id;
		public String limit_pay;
		public String openid;
		
		public String getAppid() {
			return appid;
		}
		public void setAppid(String appid) {
			this.appid = appid;
		}
		public String getMch_id() {
			return mch_id;
		}
		public void setMch_id(String mch_id) {
			this.mch_id = mch_id;
		}
		public String getDevice_info() {
			return device_info;
		}
		public void setDevice_info(String device_info) {
			this.device_info = device_info;
		}
		public String getNonce_str() {
			return nonce_str;
		}
		public void setNonce_str(String nonce_str) {
			this.nonce_str = nonce_str;
		}
		public String getSign() {
			return sign;
		}
		public void setSign(String sign) {
			this.sign = sign;
		}
		public String getBody() {
			return body;
		}
		public void setBody(String body) {
			this.body = body;
		}
		public String getDetail() {
			return detail;
		}
		public void setDetail(String detail) {
			this.detail = detail;
		}
		public String getAttach() {
			return attach;
		}
		public void setAttach(String attach) {
			this.attach = attach;
		}
		public String getOut_trade_no() {
			return out_trade_no;
		}
		public void setOut_trade_no(String out_trade_no) {
			this.out_trade_no = out_trade_no;
		}
		public String getFee_type() {
			return fee_type;
		}
		public void setFee_type(String fee_type) {
			this.fee_type = fee_type;
		}
		public String getTotal_fee() {
			return total_fee;
		}
		public void setTotal_fee(String total_fee) {
			this.total_fee = total_fee;
		}
		public String getSpbill_create_ip() {
			return spbill_create_ip;
		}
		public void setSpbill_create_ip(String spbill_create_ip) {
			this.spbill_create_ip = spbill_create_ip;
		}
		public String getTime_start() {
			return time_start;
		}
		public void setTime_start(String time_start) {
			this.time_start = time_start;
		}
		public String getTime_expire() {
			return time_expire;
		}
		public void setTime_expire(String time_expire) {
			this.time_expire = time_expire;
		}
		public String getGoods_tag() {
			return goods_tag;
		}
		public void setGoods_tag(String goods_tag) {
			this.goods_tag = goods_tag;
		}
		public String getNotify_url() {
			return notify_url;
		}
		public void setNotify_url(String notify_url) {
			this.notify_url = notify_url;
		}
		public String getTrade_type() {
			return trade_type;
		}
		public void setTrade_type(String trade_type) {
			this.trade_type = trade_type;
		}
		public String getProduct_id() {
			return product_id;
		}
		public void setProduct_id(String product_id) {
			this.product_id = product_id;
		}
		public String getLimit_pay() {
			return limit_pay;
		}
		public void setLimit_pay(String limit_pay) {
			this.limit_pay = limit_pay;
		}
		public String getOpenid() {
			return openid;
		}
		public void setOpenid(String openid) {
			this.openid = openid;
		}
}
