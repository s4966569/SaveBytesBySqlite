package com.csctek.sqlitedemo;

import java.io.Serializable;

/**
 * author:  sunpeng
 * date:    2016/4/22
 * 此类定义：
 */
public class OrderInfo implements Serializable {

    private String orderId = "";
    // 电商的订单ID
    private String appOrderNo = "";
    private String orderName = "";
    private String orderDes = "";
    private String paymentAmount = "";
    private String favAmount = "";
    private String userId = "";
    private String linkMan = "";
    private String telphone = "";
    private String createDate = "";
    private String verifyDate = "";
    private String failureTime = "";

    private String partnerName = "";// <!-- 商户名称 -->
    private String sourceDes = ""; // <!-- 订单来源二级-->
    private String sourceDesName = "";// <!-- 订单来源二级名称 -->
    private String payChannel = "";// <!-- 支付渠道 -->
    private String payChannelName = "";// <!-- 支付渠道名称 -->
    private String orderType = "";// <!-- 订单类型
    // 0：普通订单；(注：可撤单，电商）1：机票订单(注：不可撤单)；2：系统订单；(注：不可撤单)
    // -->
    private String orderTypeName = "";// <!-- 订单类型名称-->
    private String orderStatus = "";// <!-- 0：已生成 1：已取消 2：已支付
    // 3：已完成 4：申请撤单 5：撤单处理中
    // 6：撤单成功 7：撤单失败 8：支付中
    // 9：待支付-->
    private String orderResult = "";
    private String sourceName = "";
    private String sourceChannel = "";
    private String payIntegral = "0";// <!-- 支付积分-->
    private String addIntegral = "0";// <!-- 获得积分-->
    private String recordTime = "";

    /*******
     *
     * update 2014-1-2 新增字段
     *
     *
     * *******/

    private String appId = "";// <!-- 应用id-->
    private String appName = "";// <!-- 应用名称 -->
    private String partnerId = "";// <!-- 合作伙伴ID-->
    private String userName = "";// <!-- 使用账户名称-->
    private String cardType = "";// <!-- 证件类型-->
    private String cardNumber = "";// <!-- 身份证号-->
    private String payMoney = "";// <!-- 实际支付金额-->
    private String paymentIntegral = "";// <!-- 积分价格-->


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getAppOrderNo() {
        return appOrderNo;
    }

    public void setAppOrderNo(String appOrderNo) {
        this.appOrderNo = appOrderNo;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderDes() {
        return orderDes;
    }

    public void setOrderDes(String orderDes) {
        this.orderDes = orderDes;
    }

    public String getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getFavAmount() {
        return favAmount;
    }

    public void setFavAmount(String favAmount) {
        this.favAmount = favAmount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getVerifyDate() {
        return verifyDate;
    }

    public void setVerifyDate(String verifyDate) {
        this.verifyDate = verifyDate;
    }

    public String getFailureTime() {
        return failureTime;
    }

    public void setFailureTime(String failureTime) {
        this.failureTime = failureTime;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getSourceDes() {
        return sourceDes;
    }

    public void setSourceDes(String sourceDes) {
        this.sourceDes = sourceDes;
    }

    public String getSourceDesName() {
        return sourceDesName;
    }

    public void setSourceDesName(String sourceDesName) {
        this.sourceDesName = sourceDesName;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public String getPayChannelName() {
        return payChannelName;
    }

    public void setPayChannelName(String payChannelName) {
        this.payChannelName = payChannelName;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderTypeName() {
        return orderTypeName;
    }

    public void setOrderTypeName(String orderTypeName) {
        this.orderTypeName = orderTypeName;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderResult() {
        return orderResult;
    }

    public void setOrderResult(String orderResult) {
        this.orderResult = orderResult;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceChannel() {
        return sourceChannel;
    }

    public void setSourceChannel(String sourceChannel) {
        this.sourceChannel = sourceChannel;
    }

    public String getPayIntegral() {
        return payIntegral;
    }

    public void setPayIntegral(String payIntegral) {
        this.payIntegral = payIntegral;
    }

    public String getAddIntegral() {
        return addIntegral;
    }

    public void setAddIntegral(String addIntegral) {
        this.addIntegral = addIntegral;
    }

    public String getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(String payMoney) {
        this.payMoney = payMoney;
    }

    public String getPaymentIntegral() {
        return paymentIntegral;
    }

    public void setPaymentIntegral(String paymentIntegral) {
        this.paymentIntegral = paymentIntegral;
    }
}
