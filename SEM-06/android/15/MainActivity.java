public class MainActivity extends AppCompatActivity {
	ImageView imgView;
	Button btn1, btn2, btn3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		imgView= (ImageView) findViewById(R.id.imgView);
		btn1= (Button) findViewById(R.id.btn1);
		btn2= (Button) findViewById(R.id.btn2);
		btn3= (Button) findViewById(R.id.btn3);

		btn1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				imgView.setImageResource(R.drawable.img1);
			}
		});

		btn2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				imgView.setImageResource(R.drawable.img2);
			}
		});

		btn3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				imgView.setImageResource(R.drawable.img3);
			}
		});
	}
}