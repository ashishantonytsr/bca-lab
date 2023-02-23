public class MainActivity extends AppCompatActivity {
	EditText number1, number2;
	TextView result;
	Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		number1 = (EditText) findViewById(R.id.number1);
		number2 = (EditText) findViewById(R.id.number2);
		btn = (Button) findViewById(R.id.btn);
		result = (TextView) findViewById(R.id.result);

		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Double n1 = Double.parseDouble(number1.getText().toString());
				Double n2 = Double.parseDouble(number2.getText().toString());
				Double sum = n1 + n2;
				result.setText(Double.toString(sum));
			}
		});
	}
}