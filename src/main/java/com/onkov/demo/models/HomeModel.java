package com.onkov.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HomeModel {

    private String value1 ;
    private Integer id ;

//    public String getValue1() {
//        return value1;
//    }
//
//    public void setValue1(String value1) {
//        this.value1 = value1;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        HomeModel homeModel = (HomeModel) o;
//        return Objects.equals(value1, homeModel.value1) &&
//                Objects.equals(id, homeModel.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(value1, id);
//    }
}
