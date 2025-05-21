package com.example.k22411csampleproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.models.Customer;

public class CustomerDetailActivity extends AppCompatActivity {
    EditText edtCustomerID;
    EditText edtCustomerName;
    EditText edtCustomerEmail;
    EditText edtCustomerPhone;
    EditText edtCustomerUsername;
    EditText edtCustomerPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_customer_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        addView();
    }

    private void addView() {
        edtCustomerID = findViewById(R.id.edtCustomerID);
        edtCustomerName = findViewById(R.id.edtCustomerName);
        edtCustomerEmail = findViewById(R.id.edtCustomerEmail);
        edtCustomerPhone = findViewById(R.id.edtCustomerPhone);
        edtCustomerUsername = findViewById(R.id.edtCustomerUsername);
        edtCustomerPassword = findViewById(R.id.edtCustomerPassword);
        display_infor();
    }

    private void display_infor() {
        //lấy intent từ CMA gửi qua
        Intent intent = getIntent();
        //Lấy dữ liệu selected từ intent
        Customer c = (Customer) intent.getSerializableExtra("SELECTED_CUSTOMER");
        if (c == null)
            return;
        edtCustomerID.setText(c.getId()+"");
        edtCustomerName.setText(c.getName());
        edtCustomerEmail.setText(c.getEmail());
        edtCustomerPhone.setText(c.getPhone());
        edtCustomerUsername.setText(c.getUsername());
        edtCustomerPassword.setText(c.getPassword());
    }
}