package com.example.android.azkyatelisha_1202153371_modul5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class add_menu extends AppCompatActivity {
    EditText ToDo, Description, Priority;
    database dtbase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_menu);
        setTitle("Add To Do");

        //mengakses id edit text pada layout
        ToDo = (EditText) findViewById(R.id.txtTodo);
        Description = (EditText) findViewById(R.id.txtDesc);
        Priority = (EditText) findViewById(R.id.txtPrior);
        dtbase = new database(this);
    }

    @Override
    public void onBackPressed() {
        //intent dari add to do menuju list to do
        Intent intent = new Intent(add_menu.this, MainActivity.class);
        //memulai intent
        startActivity(intent);
        //menutup aktivitas setelah intent dijalankan
        this.finish();
    }

    //method yang dijalanan ketika tombol tambah to do di klik
    public void tambah(View view) {
        //apabila data todoname, deskripsi dan prioritas di isi,
        if (dtbase.inputdata(new list_todo(ToDo.getText().toString(), Description.getText().toString(), Priority.getText().toString()))) {
            //maka akan menampilkan toast bawha data berhasil di tambahkan ke dalam list
            Toast.makeText(this, "To Do List added!", Toast.LENGTH_SHORT).show();
            //berpindah dari add to do ke list to do
            startActivity(new Intent(add_menu.this, MainActivity.class));
            //menutup aktivitas agar tidak kembali ke activity yang dijalankan setelah intent
            this.finish();
        } else {
            //apabila edit text kosong maka akan muncul toast bahwa tidak bisa menambah ke dalam list
            Toast.makeText(this, "Cannot add the list", Toast.LENGTH_SHORT).show();
            //set semua edit text menjadi kosong
            ToDo.setText(null);
            Description.setText(null);
            Priority.setText(null);
        }
    }
}
