package com.myb.springbootdemo.model;

import lombok.*;
import lombok.experimental.Accessors;


import org.springframework.data.annotation.Id;

import javax.persistence.*;


/**
 * 用户类
 */
@Data
@Entity
@Table(name = "t_user")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class User {

    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;


}
