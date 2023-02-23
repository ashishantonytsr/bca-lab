public class MainActivity extends AppCompatActivity {
	Button btn;
	Spinner spinner;
	EditText editText;
	String[] spinnerItems = { "ANDROID", "PHP" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		spinner = (Spinner) findViewById(R.id.spinner);
		editText = (EditText) findViewById(R.id.editText);
		btn = (Button) findViewById(R.id.btn);

		List stringList = new ArrayList(Arrays.asList(spinnerItems));
		ArrayAdapter adapter = new ArrayAdapter(
			MainActivity.this, 
			android.R.layout.simple_spinner_item, 
			stringList
		);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(adapter);

		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				String getText = editText.getText().toString();
				stringList.add(getText);
				adapter.notifyDataSetChanged();
				Toast.makeText(MainActivity.this, "Item Added", Toast.LENGTH_SHORT).show();
			}
		});
	}
}