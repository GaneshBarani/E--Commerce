package com.vietquan.security.request;

import com.vietquan.security.enumPackage.Size;
import lombok.Data;

@Data
public class CartItemsRequest {
    private Integer cartId;
    private Double price;
    private Integer quantity;
    private Integer productId;
    private String productName;
    private byte[] img;
    private Integer userId;
    private Size size;
}
