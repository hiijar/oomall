package xmu.oomall.controller.vo;


import xmu.oomall.domain.Product;

import java.util.List;

/**
 * admin端 GET /goods/{id}/products的返回值VO
 */
public class AdminProductsResponseVo {


    /**
     * 属于某个商品的产品集合
     */
    private List<ProductVo> products;


    private  class ProductVo{

        /**
         * 这个产品自己的product信息
         */
        private Product product;

        /**
         * 团购商品的其他组合产品信息
         */
        private List<Product> subProducts;

        @Override
        public String toString() {
            return "ProductVo{" +
                    "product=" + product +
                    ", subProducts=" + subProducts +
                    '}';
        }

        public Product getProduct() {
            return product;
        }

        public void setProduct(Product product) {
            this.product = product;
        }

        public List<Product> getSubProducts() {
            return subProducts;
        }

        public void setSubProducts(List<Product> subProducts) {
            this.subProducts = subProducts;
        }
    }

    @Override
    public String toString() {
        return "AdminProductsResponseVo{" +
                "products=" + products +
                '}';
    }

    public List<ProductVo> getProducts() {
        return products;
    }

    public void setProducts(List<ProductVo> products) {
        this.products = products;
    }
}
