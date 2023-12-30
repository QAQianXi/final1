package com.zxc.lims.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Description 登陆信息
 * Author: zxc
 * Date2019/10/21 20:58
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
  private String id;
  private String username;
  private String password;
  private String passwordAgain;
  private String realName;
  private Integer level;
  private String school;
  private String admissionTime;
  private String email;
  private String profession;
  private String phone;
  private Integer sex;
  private String grade;
  private Date createTime;
  private String token;
  private String refreshToken;
  private Integer state;
}
