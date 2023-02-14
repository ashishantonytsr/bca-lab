public class MainActivity extends AppCompatActivity {
	Spinner spinner;
	Button btn;
	String[] friends = { "Thomas Shelby", "Walter White", "Johny Deep" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);

			btn = (Button) findViewById(R.id.btn);
			spinner = (Spinner) findViewById(R.id.spinner);

			ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_item, friends);
			adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinner.setAdapter(adapter);
			
			spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					@Override
					public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
							btn.setOnClickListener(new View.OnClickListener() {
									@Override
									public void onClick(View view) {
											Toast.makeText(MainActivity.this, "You have selected "+ friends[i], Toast.LENGTH_SHORT).show();
									}
							});
					}

					@Override
					public void onNothingSelected(AdapterView<?> adapterView) {
							// Nothing Here
					}
			});
	}
}