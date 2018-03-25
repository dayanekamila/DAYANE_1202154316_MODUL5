package com.example.bimoabdn.dayane_1202154316_modul5;

/**
 * Created by bimoabdn on 03/25/18.
 */

public class ItemToDo {
    //mendeklarasikan variable yang digunakan
    String todo, desc, prior;

    //konstruktor
    public ItemToDo(String todo, String desc, String prior) {
        this.todo = todo;
        this.desc = desc;
        this.prior = prior;
    }
    //method setter dan getter to do, description dan priority
    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrior() {
        return prior;
    }

    public void setPrior(String prior) {
        this.prior = prior;
    }
}