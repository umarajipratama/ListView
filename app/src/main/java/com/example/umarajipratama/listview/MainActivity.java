package com.example.umarajipratama.listview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    String[] listArray ={"Asus","Acer","Aple","Samsung","Thoshiba","Sony","Xiaomi","Motorolla"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.activity_listview,listArray);

        ListView listview = (ListView) findViewById(R.id.array_list);
        listview.setAdapter(adapter);
    }
}
