public class MainActivity extends AppCompatActivity {
	EditText editText;
	Button btn;
	TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		editText = (EditText) findViewById(R.id.editText);
		btn = (Button) findViewById(R.id.btn);
		textView = (TextView) findViewById(R.id.textView);

		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				String getText = editText.getText().toString();
				textView.setText(getText.toString());
			}
		});
	}
}