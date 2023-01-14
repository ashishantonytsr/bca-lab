public class MainActivity extends AppCompatActivity {
	EditText number, limit;
	TextView result;
	Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);

			number = (EditText) findViewById(R.id.number);
			limit = (EditText) findViewById(R.id.limit);
			result = (TextView) findViewById(R.id.result);
			btn = (Button) findViewById(R.id.btn);
			btn.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View view) {
							if (view.getId() == R.id.btn) {
									StringBuffer buffer = new StringBuffer();

									int num = Integer.parseInt(number.getText().toString());
									int lim = Integer.parseInt(limit.getText().toString());

									for (int i=1; i<=lim; i++) {
											buffer.append(num + "x" + i + " = " + i*num + "\n");
									}
									result.setText(buffer);
							}
					}
			});
	}
}