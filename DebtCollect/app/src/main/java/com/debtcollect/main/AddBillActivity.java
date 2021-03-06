package com.debtcollect.main;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.debtcollect.cards.BillAdapter;
import com.debtcollect.database.DBHandler;
import com.debtcollect.database.User;

public class AddBillActivity extends Activity {

    BillAdapter adapter;
    EditText contact;
    EditText value;
    EditText description;
    private static final String tag = AddBillActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(tag, "add_bill created");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_bill);

        contact = (EditText)findViewById(R.id.name);
        value = (EditText)findViewById(R.id.amount);
        description = (EditText)findViewById(R.id.note);
    }

    public void confirm (View text){
        Log.d(tag, "Confirm created");
        String name = contact.getText().toString();
        if (name == null || value.getText() == null){
            Toast.makeText(this, "Please enter information in the required fields", Toast.LENGTH_LONG);
            return;
        }
        double amount = Double.parseDouble(value.getText().toString());
        String note = description.getText().toString();

        User person = new User(name,amount,note);

        DBHandler dbHandler = new DBHandler(this, null, null, 1);
        dbHandler.createTransaction(person);

        // send to database code here......
        super.onBackPressed();
    }

}