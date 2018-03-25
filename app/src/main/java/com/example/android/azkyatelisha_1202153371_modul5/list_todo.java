package com.example.android.azkyatelisha_1202153371_modul5;

/**
 * Created by Azkya Telisha Harton on 3/25/2018.
 */

public class list_todo {
    private String todo, desc, prior;

    //  Konstruktor dari variabel yang sudah di deklarasi
    public list_todo(String todo, String desc, String prior) {
        this.todo = todo;
        this.desc = desc;
        this.prior = prior;
    }
    // Method setter getter untuk mengatur dan mendapatkan nilai dari variabel yang sudah di deklarasikan

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
