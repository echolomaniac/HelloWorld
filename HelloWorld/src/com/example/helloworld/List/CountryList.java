package com.example.helloworld.List;



import java.util.ArrayList;

import com.example.helloworld.R;
import com.example.helloworld.models.Country;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.SimpleCursorAdapter;

public class CountryList extends ListActivity {
	ListView countryList; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.country_list);
		
		String[] countries = getResources().getStringArray(R.array.list_countries);
		int[] flags = getResources().getIntArray(R.array.list_flags);
		Country country;
		
		int j = 0;
		ArrayList<Country> data = new ArrayList<Country>();
		for(int i = 0; i < countries.length; i++) {
			if(j<3) {
				country = new Country(flags[j], countries[i].toString());
				data.add(country);
				j++;
			}
			else {
				j = 0;
			}
			
		}
		

		CountryListAdapter adapter = new CountryListAdapter(this,
				R.layout.listview_item_row, data);
		
		setListAdapter(adapter);
	}
	
	


}
