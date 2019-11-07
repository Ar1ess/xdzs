package model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : Ar1es
 * @date : 2019/7/30
 * @since : Java 8
 */
@Data
public class User implements Serializable {

    private Integer userId;

    private String userName;

    private String password;

    private String phone;
}
