package com.Faris.Domain;

import java.io.Serializable;

public class Equipment implements Serializable {
    private Integer id;
    private String name;
    private Integer total_amount;
    private Integer lend_amount;
    private Integer remain_amount;
    private Integer equipment_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Integer total_amount) {
        this.total_amount = total_amount;
    }

    public Integer getLend_amount() {
        return lend_amount;
    }

    public void setLend_amount(Integer lend_amount) {
        this.lend_amount = lend_amount;
    }

    public Integer getRemain_amount() {
        return remain_amount;
    }

    public void setRemain_amount(Integer remain_amount) {
        this.remain_amount = remain_amount;
    }

    public Integer getEquipment_id() {
        return equipment_id;
    }

    public void setEquipment_id(Integer equipment_id) {
        this.equipment_id = equipment_id;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", total_amount=" + total_amount +
                ", lend_amount=" + lend_amount +
                ", remain_amount=" + remain_amount +
                ", equipment_id=" + equipment_id +
                '}';
    }
}
