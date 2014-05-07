package com.example.helloworld.List;



import java.util.ArrayList;

import com.example.helloworld.R;
import com.example.helloworld.models.Country;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;

public class CountryList extends ListActivity {
	ListView countryList; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.country_list);
		
		String[] countries = getResources().getStringArray(R.array.list_countries);
		int[] flags = getResources().getIntArray(R.array.list_flags);
		String[] continents = getResources().getStringArray(R.array.list_continents);
		Country country;	

		int j = 0; //image counter
		int k = 0; //continent counter
		ArrayList<Country> data = new ArrayList<Country>();
		for(int i = 0; i < countries.length; i++) {
			if(j<10) { //10 images
				if(k < 7) {
					country = new Country(flags[j], countries[i].toString(), continents[k]);
					data.add(country);
					k++; //continent 
				}
				else {
					k = 0;
				}
				
				j++; //image
			}
			else { //reset image counter = 0
				j = 0;
			}
			
		}
		

		CountryListAdapter adapter = new CountryListAdapter(this,
				R.layout.listview_item_row, data);
		
		setListAdapter(adapter);
	}
	
	


}
