package com.giri.orderstream;

public record OrderEvent(String orderId, String product, int quantity, double price) {}
