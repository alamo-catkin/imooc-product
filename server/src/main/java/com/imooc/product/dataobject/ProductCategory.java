package com.imooc.product.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Catkin
 * 2020-06-11 15:25
 */
@Entity
@Data
@DynamicUpdate
public class ProductCategory implements Serializable {

    private static final long serialVersionUID = -5860842728936729832L;

    /* 类目id */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /* 类目名字 */
    private String categoryName;

    /* 类目编号 */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

}
