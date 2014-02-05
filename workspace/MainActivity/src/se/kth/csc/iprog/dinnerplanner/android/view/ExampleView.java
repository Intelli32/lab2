package se.kth.csc.iprog.dinnerplanner.android.view;

import java.util.Set;

import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.model.Ingredient;
import android.view.View;
import android.widget.TextView;

public class ExampleView {

	View view;

	private DinnerModel model = new DinnerModel();
	
	public ExampleView(View view) {
		String lolette = "";
		model.setNumberOfGuests(4);
		int banan = model.getNumberOfGuests();
		String lol = Integer.toString(banan);
		Set<Ingredient> apple = model.getAllIngredients();
		for(Ingredient ing:apple){lolette = lolette +"\n"+ ing.getName();};
		float price = model.getTotalMenuPrice();
		String plice = Float.toString(price);
		// store in the class the reference to the Android View
		this.view = view;
		
		TextView example = (TextView) view.findViewById(R.id.example_text);
		example.setText(plice);
		
		TextView example2 = (TextView) view.findViewById(R.id.lole);
		example2.setText(lol);


		// Setup the rest of the view layout
	}

}
