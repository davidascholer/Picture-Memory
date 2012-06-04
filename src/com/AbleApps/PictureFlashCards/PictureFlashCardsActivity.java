package com.AbleApps.PictureFlashCards;

import java.io.IOException;
import java.util.ArrayList;

import com.wheel.widget.OnWheelChangedListener;
import com.wheel.widget.OnWheelScrollListener;
import com.wheel.widget.WheelView;
import com.wheel.widget.adapters.AbstractWheelTextAdapter;
import com.wheel.widget.adapters.ArrayWheelAdapter;

import org.xmlpull.v1.XmlPullParserException;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PictureFlashCardsActivity extends Activity {

	// ArrayList<Integer> imagesArrayList = new ArrayList<Integer>();
	ArrayList<String> stringsArrayList = new ArrayList<String>();
	ArrayList<String> engArrayList = new ArrayList<String>();
	boolean engBoolean = true;
	int currentWordInList = 0;

	public final String[] languages = { "Afrikaans", "Albanian", "Arabic",
			"Armenian", "Basque", "Bulgarian", "Catalan", "Chinese", "Creole",
			"Croatian", "Czech", "Danish", "Dutch", "Esperanto", "Estonian",
			"Filipino", "Finnish", "French", "Galician", "Georgian", "German",
			"Greek", "Hebrew", "Hindi", "Hungarian", "Icelandic", "Indonesian",
			"Irish", "Italian", "Japanese", "Korean", "Latin", "Latvian",
			"Lithuanian", "Macedonian", "Malay", "Maltese", "Norwegian",
			"Persian", "Polish", "Portuguese", "Romanian", "Russian",
			"Serbian", "Slovak", "Spanish", "Swahili", "Swedish", "Tamil",
			"Thai", "Turkish", "Urdu", "Vietnamese", "Welsh" };
	public final String[] categories = { "agriculture", "anatomy", "animal",
			"art", "astronomy", "bird", "boat", "building", "business", "car",
			"cat", "chemical_element", "chemical_compound", "city", "clothes",
			"computers", "container", "dog", "device", "drink", "electronics",
			"fish", "flower", "food", "fruit", "furniture", "geography",
			"geometry", "house", "insect", "jewelry", "kitchen", "material",
			"measuring_device", "metal", "military", "mineral", "music",
			"mythology", "physics", "plane", "plant", "profession", "raptor",
			"reptile", "science", "sports", "tool", "tourism", "transport",
			"tree", "vehicle", "vegetable", "weapon", "weather" };

	private boolean scrolling = false;
	int catIndex = 0;
	int langIndex = 0;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);

		final TextView button = (TextView) findViewById(R.id.button1);
		final Button leftButton = (Button) findViewById(R.id.leftButton);
		final Button rightButton = (Button) findViewById(R.id.rightButton);

		setStrings();

		final WheelView country = (WheelView) findViewById(R.id.country);
		country.setVisibleItems(4);
		country.setViewAdapter(new CountryAdapter(this));

		final WheelView city = (WheelView) findViewById(R.id.city);
		city.setVisibleItems(4);
		updateCities(city, capitalizeArray(categories), 0);

		country.addChangingListener(new OnWheelChangedListener() {
			public void onChanged(WheelView wheel, int oldValue, int newValue) {
				if (!scrolling) {
					updateCities(city, capitalizeArray(categories), newValue);
				}
			}
		});

		country.addScrollingListener(new OnWheelScrollListener() {
			public void onScrollingStarted(WheelView wheel) {
				scrolling = true;
			}

			public void onScrollingFinished(WheelView wheel) {
				scrolling = false;
				updateCities(city, capitalizeArray(categories),
						country.getCurrentItem());
				langIndex = country.getCurrentItem();
				setStrings();
			}
		});
		city.addChangingListener(new OnWheelChangedListener() {
			public void onChanged(WheelView wheel, int oldValue, int newValue) {
				if (!scrolling) {
					catIndex = city.getCurrentItem();
					langIndex = country.getCurrentItem();
				}
			}
		});

		city.addScrollingListener(new OnWheelScrollListener() {
			public void onScrollingStarted(WheelView wheel) {
				scrolling = true;
			}

			public void onScrollingFinished(WheelView wheel) {
				scrolling = false;
				catIndex = city.getCurrentItem();
				setStrings();

			}
		});

		country.setCurrentItem(0);
		city.setCurrentItem(0);

		button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (engBoolean == false) {
					engBoolean = true;
				} else {
					engBoolean = false;
				}
				buttonAnimation();
			}
		});
		leftButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				moveLeft();
			}
		});
		rightButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				moveRight();
			}
		});

		DisplayMetrics metrics = new DisplayMetrics();
		String metric = "";
		getWindowManager().getDefaultDisplay().getMetrics(metrics);
		ImageView iv = (ImageView) findViewById(R.id.imageView1);
		DisplayMetrics dm = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(dm);
		double x = Math.pow(dm.widthPixels / dm.xdpi, 2);
		double y = Math.pow(dm.heightPixels / dm.ydpi, 2);
		double screenInches = Math.sqrt(x + y);

		if(screenInches<4){
			iv.setPadding(10, 10, 10, 10);
		}else if(screenInches<7){
			iv.setPadding(100, 100, 100, 100);
		}else{
			iv.setPadding(200, 200, 200, 200);
		}
		leftButton.setClickable(true);
		rightButton.setClickable(true);
		
//		switch (metrics.densityDpi) {
//		case DisplayMetrics.DENSITY_LOW:
//			iv.setPadding(10, 10, 10, 10);
//			metric = "low";
//			break;
//		case DisplayMetrics.DENSITY_MEDIUM:
//			iv.setPadding(100, 100, 100, 100);
//			metric = "medium";
//			break;
//		case DisplayMetrics.DENSITY_HIGH:
//			iv.setPadding(200, 200, 200, 200);
//			metric = "high";
//			break;
//		}
//
//		int windowHeight = getWindowManager().getDefaultDisplay().getHeight();
//		int windowWidth = getWindowManager().getDefaultDisplay().getWidth();

	}

	private Drawable getPicture() {

		PictureChanger pc = new PictureChanger();
		Drawable returnPic = pc.getPicture(engArrayList.get(currentWordInList),
				this);
		return returnPic;

	}

	private void setPicture() {
		ImageView iv = (ImageView) findViewById(R.id.imageView1);
		iv.setImageDrawable(getPicture());

	}

	/**
	 * Updates the city wheel
	 */
	private void updateCities(WheelView city, String cities[], int index) {
		ArrayWheelAdapter<String> adapter = new ArrayWheelAdapter<String>(this,
				cities);
		adapter.setTextSize(18);
		city.setViewAdapter(adapter);
		city.setCurrentItem(catIndex);
	}

	private void setStrings() {
		PictureChanger pc = new PictureChanger();
		try {
			engArrayList = pc.getText(langIndex, catIndex, true,
					PictureFlashCardsActivity.this);
			stringsArrayList = pc.getText(langIndex, catIndex, false,
					PictureFlashCardsActivity.this);
			currentWordInList = 0;
			setButtonText();
		} catch (XmlPullParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void setButtonText() {
		final TextView button = (TextView) findViewById(R.id.button1);

		if (engBoolean == false) {
			button.setText(stringsArrayList.get(currentWordInList));
		} else {
			button.setText(engArrayList.get(currentWordInList));
		}
		setPicture();
	}

	private void moveRight() {
		if (currentWordInList == 0) {
			currentWordInList = engArrayList.size() - 1;
		} else {
			currentWordInList--;
		}
		imageAnimation(false);
	}

	private void moveLeft() {
		if (currentWordInList == engArrayList.size() - 1) {
			currentWordInList = 0;
		} else {
			currentWordInList++;
		}
		imageAnimation(true);
	}

	/**
	 * Adapter for countries
	 */
	private class CountryAdapter extends AbstractWheelTextAdapter {
		// Countries names
		private String countries[] = languages;

		// Countries flags

		/**
		 * Constructor
		 */
		protected CountryAdapter(Context context) {
			super(context, R.layout.language_layout, NO_RESOURCE);

			setItemTextResource(R.id.country_name);
		}

		@Override
		public View getItem(int index, View cachedView, ViewGroup parent) {
			View view = super.getItem(index, cachedView, parent);
			return view;
		}

		@Override
		public int getItemsCount() {
			return countries.length;
		}

		@Override
		protected CharSequence getItemText(int index) {
			return countries[index];
		}
	}

	private static String[] capitalizeArray(String[] sArray) {

		String[] returnArray = new String[sArray.length];
		for (int x = 0; x < sArray.length; x++) {
			returnArray[x] = capitalizeString(sArray[x]);
		}

		return sArray;
	}

	private static String capitalizeString(String string) {
		char[] chars = string.toLowerCase().toCharArray();
		boolean found = false;
		for (int i = 0; i < chars.length; i++) {
			if (!found && Character.isLetter(chars[i])) {
				chars[i] = Character.toUpperCase(chars[i]);
				found = true;
			} else if (Character.isWhitespace(chars[i]) || chars[i] == '.'
					|| chars[i] == '\'') { // You can add other chars here
				found = false;
			}
		}
		return String.valueOf(chars);
	}

	private void buttonAnimation() {

		final TextView button = (TextView) findViewById(R.id.button1);
		final Animation card_out_left = AnimationUtils.loadAnimation(this,
				R.anim.cardout_left);
		final Animation card_in_left = AnimationUtils.loadAnimation(this,
				R.anim.cardin_left);
		final Animation card_out_right = AnimationUtils.loadAnimation(this,
				R.anim.cardout_right);
		final Animation card_in_right = AnimationUtils.loadAnimation(this,
				R.anim.cardin_right);

		if (engBoolean == false) {
			button.startAnimation(card_out_left);
		} else {
			button.startAnimation(card_out_right);
		}
		card_out_right.setAnimationListener(new AnimationListener() {
			public void onAnimationEnd(Animation animation) {
				setButtonText();
				button.startAnimation(card_in_right);

			}

			@Override
			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub

			}
		});
		card_out_left.setAnimationListener(new AnimationListener() {
			public void onAnimationEnd(Animation animation) {
				setButtonText();
				button.startAnimation(card_in_left);

			}

			@Override
			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub

			}
		});

	}

	private void imageAnimation(boolean right) {

		final ImageView iv = (ImageView) findViewById(R.id.imageView1);
		final Animation card_out_left = AnimationUtils.loadAnimation(this,
				R.anim.cardout_left);
		final Animation card_in_left = AnimationUtils.loadAnimation(this,
				R.anim.cardin_left);
		final Animation card_out_right = AnimationUtils.loadAnimation(this,
				R.anim.cardout_right);
		final Animation card_in_right = AnimationUtils.loadAnimation(this,
				R.anim.cardin_right);

		if (right == false) {
			iv.startAnimation(card_out_left);
		} else {
			iv.startAnimation(card_out_right);
		}
		card_out_right.setAnimationListener(new AnimationListener() {
			public void onAnimationEnd(Animation animation) {
				setButtonText();
				iv.startAnimation(card_in_left);

			}

			@Override
			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub

			}
		});
		card_out_left.setAnimationListener(new AnimationListener() {
			public void onAnimationEnd(Animation animation) {
				setButtonText();
				iv.startAnimation(card_in_right);

			}

			@Override
			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub

			}
		});

	}

}