package com.taurus.emin.customadapterexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.taurus.emin.customadapterexample.adapters.CustomListViewAdapter;
import com.taurus.emin.customadapterexample.models.Person;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Person> persons;
    private ListView listView;
    private CustomListViewAdapter listViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
        fillArrayList(persons);

    }

    private void initialize() {
        persons = new ArrayList<Person>();
        listView = (ListView) findViewById(R.id.person_list_view);
        listViewAdapter = new CustomListViewAdapter(MainActivity.this,persons);
        listView.setAdapter(listViewAdapter);
    }

    private void fillArrayList(ArrayList<Person>persons){
        for (int index = 0; index < 20; index++) {
            Person person = new Person("Mr. Android " + index, "Nowhere", R.drawable.android_icon);
            persons.add(person);
        }

    }
}
