package com.wildmouse.springbootmysqldocker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "personal")
public class Personal {
    @Id
    @Column(name = "id")
    Integer id;

    @Column(name = "name")
    String name;
}

