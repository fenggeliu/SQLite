package com.fenggeliu.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText liusInput;
    TextView liusText;
    MyDBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        liusInput = (EditText) findViewById(R.id.liusInput);
        liusText = (TextView) findViewById(R.id.liusText);
        dbHandler = new MyDBHandler(this, null, null, 1);
        printDatabase();
    }

    //Add a product to the database
    public void addButtonClicked(View view) {
        Product product = new Product(liusInput.getText().toString());
        dbHandler.addProduct(product);
        printDatabase();
    }

    //Delete items
    public void deleteButtonClicked(View view) {
        String inputText = liusInput.getText().toString();
        dbHandler.deleteProduct(inputText);
        printDatabase();
    }

    public void printDatabase() {
        String dbString = dbHandler.databaseToString();
        liusText.setText(dbString);
        liusInput.setText("");
    }
}
