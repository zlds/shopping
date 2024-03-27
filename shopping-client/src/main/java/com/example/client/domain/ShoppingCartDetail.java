package com.example.client.domain;


import lombok.Data;

import javax.persistence.Table;

/**
 * 购物车明细表
 * @author: hanchaowei
 * @date 2024/2/15
 * @description:
 */
@Table(name = "t_shopping_cart_details")
@Data
public class ShoppingCartDetail extends Base {
    /**
     * 主键
     */
    private String id;

    /**
     * 关联购物车ID
     */
    private String cartId;

    /**
     * 商品ID
     */
    private String productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 单价
     */
    private Long price;

    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 金额
     */
    private Long totalAmount;



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

}