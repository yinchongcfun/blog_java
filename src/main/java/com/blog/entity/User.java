package com.blog.entity;

import com.alibaba.druid.stat.TableStat;
import lombok.Data;

import javax.naming.Name;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author cfun
 * @description 用户
 * @date 2019-11-06
 */

@Data
@Entity
@Table(name = "users" )
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Date created_at;
    private Date updated_at;
}
