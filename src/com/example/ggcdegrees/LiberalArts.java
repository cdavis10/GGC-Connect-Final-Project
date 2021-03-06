package com.example.ggcdegrees;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class LiberalArts extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_liberal_arts);
		
		Button criminal_justice = (Button) findViewById(R.id.criminal_justice_major);
		criminal_justice.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{
				Intent intent = new Intent(LiberalArts.this, CriminalJustice.class);
				LiberalArts.this.startActivity(intent);
				
				Toast toast = Toast.makeText(getApplicationContext(), 
						"Loading Criminal Justice Programs...", Toast.LENGTH_LONG);
				toast.setGravity(Gravity.CENTER_HORIZONTAL, 10, 20);
				toast.show();
			}
			
		});
		
		Button english = (Button) findViewById(R.id.english_major);
		english.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{
				Intent intent = new Intent(LiberalArts.this, LiberalArts_English.class);
				LiberalArts.this.startActivity(intent);
				
				Toast toast = Toast.makeText(getApplicationContext(), 
						"Loading English Programs...", Toast.LENGTH_LONG);
				toast.setGravity(Gravity.CENTER_HORIZONTAL, 10, 20);
				toast.show();
			}
			
		});
		
		Button history = (Button) findViewById(R.id.history_major);
		history.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{
				Intent intent = new Intent(LiberalArts.this, LiberalArts_History.class);
				LiberalArts.this.startActivity(intent);
				
				Toast toast = Toast.makeText(getApplicationContext(), 
						"Loading History Programs...", Toast.LENGTH_LONG);
				toast.setGravity(Gravity.CENTER_HORIZONTAL, 10, 20);
				toast.show();
			}
			
		});
		
		Button political_science = (Button) findViewById(R.id.political_science_major);
		political_science.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{
				Intent intent = new Intent(LiberalArts.this, LiberalArts_PoliticalScience.class);
				LiberalArts.this.startActivity(intent);
				
				Toast toast = Toast.makeText(getApplicationContext(), 
						"Loading Political Science Programs...", Toast.LENGTH_LONG);
				toast.setGravity(Gravity.CENTER_HORIZONTAL, 10, 20);
				toast.show();
			}
			
		});
		
		Button psychology = (Button) findViewById(R.id.psychology_major);
		psychology.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{
				String pdfurl = "http://www.ggc.edu/about-ggc/departments/registrar/docs/program-plans/2011-2012/2011-12-psych.pdf";
				String googleDocsUrl = "http://docs.google.com/viewer?url=" + pdfurl;
				Intent pdf_intent = new Intent(Intent.ACTION_VIEW);
				pdf_intent.setDataAndType(Uri.parse(googleDocsUrl), "text/html");
				startActivity(pdf_intent);
				
				Toast toast = Toast.makeText(getApplicationContext(), 
						"Loading Psychology Program...", Toast.LENGTH_LONG);
				toast.setGravity(Gravity.CENTER_HORIZONTAL, 10, 20);
				toast.show();
			}
			
		});
		
		Button go_back_button = (Button) findViewById(R.id.liberal_arts_back);
		go_back_button.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{
				Intent intent = new Intent(LiberalArts.this, Schools.class);
				LiberalArts.this.startActivity(intent);
				
				Toast toast = Toast.makeText(getApplicationContext(), 
						"Taking You Back...", Toast.LENGTH_LONG);
				toast.setGravity(Gravity.CENTER_HORIZONTAL, 10, 20);
				toast.show();
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.liberal_arts, menu);
		return true;
	}

}
