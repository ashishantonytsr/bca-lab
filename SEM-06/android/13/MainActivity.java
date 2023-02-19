public class MainActivity extends AppCompatActivity {
	ListView list;
	String[] listItems;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);

			list = (ListView) findViewById(R.id.list);
			listItems = getResources().getStringArray(R.array.friends);

			ArrayAdapter adapter = new ArrayAdapter(
				MainActivity.this, 
				android.R.layout.simple_list_item1, 
				android.R.id.text1, 
				listItems
			);
			list.setAdapter(adapter);

			list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
					@Override
					public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
							Toast.makeText(MainActivity.this, "You have selected "+ adapter.getItem(i), Toast.LENGTH_SHORT).show();
					}
			});
	}
}