package org.rxjava.service.goods.form;

import lombok.Data;

import java.util.List;

/**
 * @author happy 2019-03-23 00:21
 */
@Data
public class GoodsListForm {
    /**
     * 类目Id
     */
    private String categoryId;
    /**
     * 品牌Id
     */
    private String brandId;
}
