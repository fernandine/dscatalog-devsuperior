package com.projetodevsuperior.sdcatalog.tests;

import java.time.Instant;

import com.projetodevsuperior.sdcatalog.DTOs.ProductDTO;
import com.projetodevsuperior.sdcatalog.entities.Category;
import com.projetodevsuperior.sdcatalog.entities.Product;

public class Factory {

	public static Product createProduct() {
		Product product = new Product(1L, "Phone", "Good Phone", 800.0, "https://img.com/img.png",
				Instant.parse("2020-10-20T03:00:00Z"));
		product.getCategories().add(new Category(2L, "Eletronics"));
		return product;
	}

	public static ProductDTO createProductDTO() {

		Product product = createProduct();
		return new ProductDTO(product, product.getCategories());

	}
}