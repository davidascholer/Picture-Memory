package com.AbleApps.PictureFlashCards;

import java.io.IOException;
import java.util.ArrayList;

import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;

public class PictureChanger {

	XmlResourceParser xrp;
	XmlPullParserFactory factory;

	public ArrayList<String> getText(int langPosition, int catPosition,
			boolean engBoolean, Context ctxt) throws XmlPullParserException,
			IOException {

		ArrayList<String> returnList = new ArrayList<String>();
		if(langPosition<=27){
			returnList = getTextOne(langPosition, catPosition,
					engBoolean, ctxt);
		}else{
			returnList = getTextTwo(langPosition, catPosition,
					engBoolean, ctxt);
		}
		return returnList;
	}


	public ArrayList<String> getTextOne(int langPosition, int catPosition,
			boolean engBoolean, Context ctxt) throws XmlPullParserException,
			IOException {

		ArrayList<String> returnList = new ArrayList<String>();
		factory = XmlPullParserFactory.newInstance();
		factory.setNamespaceAware(true);

		switch (langPosition) {
		/**
		 * case 0: xrp = ctxt.getResources().getXml(R.xml.afrikaans); switch
		 * (catPosition) { case 0: if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_agriculture"); } else { returnList =
		 * XmlParse("english_afrikaans_agriculture"); } break; case 1: if
		 * (engBoolean == false) { returnList = XmlParse("afrikaans_anatomy"); }
		 * else { returnList = XmlParse("english_afrikaans_anatomy"); } break;
		 * case 2: if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_animal"); } else { returnList =
		 * XmlParse("english_afrikaans_animal"); } break; case 3: if (engBoolean
		 * == false) { returnList = XmlParse("afrikaans_art"); } else {
		 * returnList = XmlParse("english_afrikaans_art"); } break; case 4: if
		 * (engBoolean == false) { returnList = XmlParse("afrikaans_astronomy");
		 * } else { returnList = XmlParse("english_afrikaans_astronomy"); }
		 * break; case 5: if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_bird"); } else { returnList =
		 * XmlParse("english_afrikaans_bird"); } break; case 6: if (engBoolean
		 * == false) { returnList = XmlParse("afrikaans_boat"); } else {
		 * returnList = XmlParse("english_afrikaans_boat"); } break; case 7: if
		 * (engBoolean == false) { returnList = XmlParse("afrikaans_building");
		 * } else { returnList = XmlParse("english_afrikaans_building"); }
		 * break; case 8: if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_business"); } else { returnList =
		 * XmlParse("english_afrikaans_business"); } break; case 9: if
		 * (engBoolean == false) { returnList = XmlParse("afrikaans_car"); }
		 * else { returnList = XmlParse("english_afrikaans_car"); } break; case
		 * 10: if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_cat"); } else { returnList =
		 * XmlParse("english_afrikaans_cat"); } break; case 11: if (engBoolean
		 * == false) { returnList = XmlParse("afrikaans_chemical_element"); }
		 * else { returnList = XmlParse("english_afrikaans_chemical_element"); }
		 * break; case 12: if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_chemical_compound"); } else { returnList =
		 * XmlParse("english_afrikaans_chemical_compound"); } break; case 13: if
		 * (engBoolean == false) { returnList = XmlParse("afrikaans_city"); }
		 * else { returnList = XmlParse("english_afrikaans_city"); } break; case
		 * 14: if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_clothes"); } else { returnList =
		 * XmlParse("english_afrikaans_clothes"); } break; case 15: if
		 * (engBoolean == false) { returnList = XmlParse("afrikaans_computers");
		 * } else { returnList = XmlParse("english_afrikaans_computers"); }
		 * break; case 16: if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_container"); } else { returnList =
		 * XmlParse("english_afrikaans_container"); } break; case 17: if
		 * (engBoolean == false) { returnList = XmlParse("afrikaans_dog"); }
		 * else { returnList = XmlParse("english_afrikaans_dog"); } break; case
		 * 18: if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_device"); } else { returnList =
		 * XmlParse("english_afrikaans_device"); } break; case 19: if
		 * (engBoolean == false) { returnList = XmlParse("afrikaans_drink"); }
		 * else { returnList = XmlParse("english_afrikaans_drink"); } break;
		 * case 20: if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_electronics"); } else { returnList =
		 * XmlParse("english_afrikaans_electronics"); } break; case 21: if
		 * (engBoolean == false) { returnList = XmlParse("afrikaans_fish"); }
		 * else { returnList = XmlParse("english_afrikaans_fish"); } break; case
		 * 22: if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_flower"); } else { returnList =
		 * XmlParse("english_afrikaans_flower"); } break; case 23: if
		 * (engBoolean == false) { returnList = XmlParse("afrikaans_food"); }
		 * else { returnList = XmlParse("english_afrikaans_food"); } break; case
		 * 24: if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_fruit"); } else { returnList =
		 * XmlParse("english_afrikaans_fruit"); } break; case 25: if (engBoolean
		 * == false) { returnList = XmlParse("afrikaans_furniture"); } else {
		 * returnList = XmlParse("english_afrikaans_furniture"); } break; case
		 * 26: if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_geography"); } else { returnList =
		 * XmlParse("english_afrikaans_geography"); } break; case 27: if
		 * (engBoolean == false) { returnList = XmlParse("afrikaans_geometry");
		 * } else { returnList = XmlParse("english_afrikaans_geometry"); }
		 * break; case 28: if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_house"); } else { returnList =
		 * XmlParse("english_afrikaans_house"); } break; case 29: if (engBoolean
		 * == false) { returnList = XmlParse("afrikaans_insect"); } else {
		 * returnList = XmlParse("english_afrikaans_insect"); } break; case 30:
		 * if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_jewelry"); } else { returnList =
		 * XmlParse("english_afrikaans_jewelry"); } break; case 31: if
		 * (engBoolean == false) { returnList = XmlParse("afrikaans_kitchen"); }
		 * else { returnList = XmlParse("english_afrikaans_kitchen"); } break;
		 * case 32: if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_material"); } else { returnList =
		 * XmlParse("english_afrikaans_material"); } break; case 33: if
		 * (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_measuring_device"); } else { returnList =
		 * XmlParse("english_afrikaans_measuring_device"); } break; case 34: if
		 * (engBoolean == false) { returnList = XmlParse("afrikaans_metal"); }
		 * else { returnList = XmlParse("english_afrikaans_metal"); } break;
		 * case 35: if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_military"); } else { returnList =
		 * XmlParse("english_afrikaans_military"); } break; case 36: if
		 * (engBoolean == false) { returnList = XmlParse("afrikaans_mineral"); }
		 * else { returnList = XmlParse("english_afrikaans_mineral"); } break;
		 * case 37: if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_music"); } else { returnList =
		 * XmlParse("english_afrikaans_music"); } break; case 38: if (engBoolean
		 * == false) { returnList = XmlParse("afrikaans_mythology"); } else {
		 * returnList = XmlParse("english_afrikaans_mythology"); } break; case
		 * 39: if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_physics"); } else { returnList =
		 * XmlParse("english_afrikaans_physics"); } break; case 40: if
		 * (engBoolean == false) { returnList = XmlParse("afrikaans_plane"); }
		 * else { returnList = XmlParse("english_afrikaans_plane"); } break;
		 * case 41: if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_plant"); } else { returnList =
		 * XmlParse("english_afrikaans_plant"); } break; case 42: if (engBoolean
		 * == false) { returnList = XmlParse("afrikaans_profession"); } else {
		 * returnList = XmlParse("english_afrikaans_profession"); } break; case
		 * 43: if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_raptor"); } else { returnList =
		 * XmlParse("english_afrikaans_raptor"); } break; case 44: if
		 * (engBoolean == false) { returnList = XmlParse("afrikaans_reptile"); }
		 * else { returnList = XmlParse("english_afrikaans_reptile"); } break;
		 * case 45: if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_science"); } else { returnList =
		 * XmlParse("english_afrikaans_science"); } break; case 46: if
		 * (engBoolean == false) { returnList = XmlParse("afrikaans_sports"); }
		 * else { returnList = XmlParse("english_afrikaans_sports"); } break;
		 * case 47: if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_tool"); } else { returnList =
		 * XmlParse("english_afrikaans_tool"); } break; case 48: if (engBoolean
		 * == false) { returnList = XmlParse("afrikaans_tourism"); } else {
		 * returnList = XmlParse("english_afrikaans_tourism"); } break; case 49:
		 * if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_transport"); } else { returnList =
		 * XmlParse("english_afrikaans_transport"); } break; case 50: if
		 * (engBoolean == false) { returnList = XmlParse("afrikaans_tree"); }
		 * else { returnList = XmlParse("english_afrikaans_tree"); } break; case
		 * 51: if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_vehicle"); } else { returnList =
		 * XmlParse("english_afrikaans_vehicle"); } break; case 52: if
		 * (engBoolean == false) { returnList = XmlParse("afrikaans_vegetable");
		 * } else { returnList = XmlParse("english_afrikaans_vegetable"); }
		 * break; case 53: if (engBoolean == false) { returnList =
		 * XmlParse("afrikaans_weapon"); } else { returnList =
		 * XmlParse("english_afrikaans_weapon"); } break; case 54: if
		 * (engBoolean == false) { returnList = XmlParse("afrikaans_weather"); }
		 * else { returnList = XmlParse("english_afrikaans_weather"); } break;
		 * default: } break;
		 **/
		case 1:
			xrp = ctxt.getResources().getXml(R.xml.albanian);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_agriculture");
				} else {
					returnList = XmlParse("english_albanian_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_anatomy");
				} else {
					returnList = XmlParse("english_albanian_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_animal");
				} else {
					returnList = XmlParse("english_albanian_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_art");
				} else {
					returnList = XmlParse("english_albanian_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_astronomy");
				} else {
					returnList = XmlParse("english_albanian_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_bird");
				} else {
					returnList = XmlParse("english_albanian_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_boat");
				} else {
					returnList = XmlParse("english_albanian_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_building");
				} else {
					returnList = XmlParse("english_albanian_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_business");
				} else {
					returnList = XmlParse("english_albanian_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_car");
				} else {
					returnList = XmlParse("english_albanian_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_cat");
				} else {
					returnList = XmlParse("english_albanian_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_chemical_element");
				} else {
					returnList = XmlParse("english_albanian_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_chemical_compound");
				} else {
					returnList = XmlParse("english_albanian_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_city");
				} else {
					returnList = XmlParse("english_albanian_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_clothes");
				} else {
					returnList = XmlParse("english_albanian_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_computers");
				} else {
					returnList = XmlParse("english_albanian_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_container");
				} else {
					returnList = XmlParse("english_albanian_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_dog");
				} else {
					returnList = XmlParse("english_albanian_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_device");
				} else {
					returnList = XmlParse("english_albanian_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_drink");
				} else {
					returnList = XmlParse("english_albanian_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_electronics");
				} else {
					returnList = XmlParse("english_albanian_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_fish");
				} else {
					returnList = XmlParse("english_albanian_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_flower");
				} else {
					returnList = XmlParse("english_albanian_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_food");
				} else {
					returnList = XmlParse("english_albanian_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_fruit");
				} else {
					returnList = XmlParse("english_albanian_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_furniture");
				} else {
					returnList = XmlParse("english_albanian_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_geography");
				} else {
					returnList = XmlParse("english_albanian_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_geometry");
				} else {
					returnList = XmlParse("english_albanian_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_house");
				} else {
					returnList = XmlParse("english_albanian_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_insect");
				} else {
					returnList = XmlParse("english_albanian_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_jewelry");
				} else {
					returnList = XmlParse("english_albanian_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_kitchen");
				} else {
					returnList = XmlParse("english_albanian_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_material");
				} else {
					returnList = XmlParse("english_albanian_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_measuring_device");
				} else {
					returnList = XmlParse("english_albanian_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_metal");
				} else {
					returnList = XmlParse("english_albanian_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_military");
				} else {
					returnList = XmlParse("english_albanian_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_mineral");
				} else {
					returnList = XmlParse("english_albanian_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_music");
				} else {
					returnList = XmlParse("english_albanian_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_mythology");
				} else {
					returnList = XmlParse("english_albanian_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_physics");
				} else {
					returnList = XmlParse("english_albanian_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_plane");
				} else {
					returnList = XmlParse("english_albanian_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_plant");
				} else {
					returnList = XmlParse("english_albanian_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_profession");
				} else {
					returnList = XmlParse("english_albanian_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_raptor");
				} else {
					returnList = XmlParse("english_albanian_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_reptile");
				} else {
					returnList = XmlParse("english_albanian_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_science");
				} else {
					returnList = XmlParse("english_albanian_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_sports");
				} else {
					returnList = XmlParse("english_albanian_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_tool");
				} else {
					returnList = XmlParse("english_albanian_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_tourism");
				} else {
					returnList = XmlParse("english_albanian_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_transport");
				} else {
					returnList = XmlParse("english_albanian_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_tree");
				} else {
					returnList = XmlParse("english_albanian_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_vehicle");
				} else {
					returnList = XmlParse("english_albanian_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_vegetable");
				} else {
					returnList = XmlParse("english_albanian_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_weapon");
				} else {
					returnList = XmlParse("english_albanian_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("albanian_weather");
				} else {
					returnList = XmlParse("english_albanian_weather");
				}
				break;
			default:
			}
			break;
		case 2:
			xrp = ctxt.getResources().getXml(R.xml.arabic);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_agriculture");
				} else {
					returnList = XmlParse("english_arabic_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_anatomy");
				} else {
					returnList = XmlParse("english_arabic_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_animal");
				} else {
					returnList = XmlParse("english_arabic_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_art");
				} else {
					returnList = XmlParse("english_arabic_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_astronomy");
				} else {
					returnList = XmlParse("english_arabic_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_bird");
				} else {
					returnList = XmlParse("english_arabic_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_boat");
				} else {
					returnList = XmlParse("english_arabic_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_building");
				} else {
					returnList = XmlParse("english_arabic_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_business");
				} else {
					returnList = XmlParse("english_arabic_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_car");
				} else {
					returnList = XmlParse("english_arabic_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_cat");
				} else {
					returnList = XmlParse("english_arabic_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_chemical_element");
				} else {
					returnList = XmlParse("english_arabic_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_chemical_compound");
				} else {
					returnList = XmlParse("english_arabic_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_city");
				} else {
					returnList = XmlParse("english_arabic_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_clothes");
				} else {
					returnList = XmlParse("english_arabic_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_computers");
				} else {
					returnList = XmlParse("english_arabic_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_container");
				} else {
					returnList = XmlParse("english_arabic_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_dog");
				} else {
					returnList = XmlParse("english_arabic_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_device");
				} else {
					returnList = XmlParse("english_arabic_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_drink");
				} else {
					returnList = XmlParse("english_arabic_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_electronics");
				} else {
					returnList = XmlParse("english_arabic_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_fish");
				} else {
					returnList = XmlParse("english_arabic_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_flower");
				} else {
					returnList = XmlParse("english_arabic_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_food");
				} else {
					returnList = XmlParse("english_arabic_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_fruit");
				} else {
					returnList = XmlParse("english_arabic_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_furniture");
				} else {
					returnList = XmlParse("english_arabic_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_geography");
				} else {
					returnList = XmlParse("english_arabic_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_geometry");
				} else {
					returnList = XmlParse("english_arabic_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_house");
				} else {
					returnList = XmlParse("english_arabic_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_insect");
				} else {
					returnList = XmlParse("english_arabic_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_jewelry");
				} else {
					returnList = XmlParse("english_arabic_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_kitchen");
				} else {
					returnList = XmlParse("english_arabic_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_material");
				} else {
					returnList = XmlParse("english_arabic_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_measuring_device");
				} else {
					returnList = XmlParse("english_arabic_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_metal");
				} else {
					returnList = XmlParse("english_arabic_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_military");
				} else {
					returnList = XmlParse("english_arabic_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_mineral");
				} else {
					returnList = XmlParse("english_arabic_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_music");
				} else {
					returnList = XmlParse("english_arabic_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_mythology");
				} else {
					returnList = XmlParse("english_arabic_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_physics");
				} else {
					returnList = XmlParse("english_arabic_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_plane");
				} else {
					returnList = XmlParse("english_arabic_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_plant");
				} else {
					returnList = XmlParse("english_arabic_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_profession");
				} else {
					returnList = XmlParse("english_arabic_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_raptor");
				} else {
					returnList = XmlParse("english_arabic_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_reptile");
				} else {
					returnList = XmlParse("english_arabic_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_science");
				} else {
					returnList = XmlParse("english_arabic_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_sports");
				} else {
					returnList = XmlParse("english_arabic_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_tool");
				} else {
					returnList = XmlParse("english_arabic_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_tourism");
				} else {
					returnList = XmlParse("english_arabic_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_transport");
				} else {
					returnList = XmlParse("english_arabic_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_tree");
				} else {
					returnList = XmlParse("english_arabic_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_vehicle");
				} else {
					returnList = XmlParse("english_arabic_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_vegetable");
				} else {
					returnList = XmlParse("english_arabic_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_weapon");
				} else {
					returnList = XmlParse("english_arabic_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("arabic_weather");
				} else {
					returnList = XmlParse("english_arabic_weather");
				}
				break;
			default:
			}
			break;
		case 3:
			xrp = ctxt.getResources().getXml(R.xml.armenian);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_agriculture");
				} else {
					returnList = XmlParse("english_armenian_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_anatomy");
				} else {
					returnList = XmlParse("english_armenian_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_animal");
				} else {
					returnList = XmlParse("english_armenian_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_art");
				} else {
					returnList = XmlParse("english_armenian_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_astronomy");
				} else {
					returnList = XmlParse("english_armenian_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_bird");
				} else {
					returnList = XmlParse("english_armenian_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_boat");
				} else {
					returnList = XmlParse("english_armenian_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_building");
				} else {
					returnList = XmlParse("english_armenian_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_business");
				} else {
					returnList = XmlParse("english_armenian_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_car");
				} else {
					returnList = XmlParse("english_armenian_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_cat");
				} else {
					returnList = XmlParse("english_armenian_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_chemical_element");
				} else {
					returnList = XmlParse("english_armenian_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_chemical_compound");
				} else {
					returnList = XmlParse("english_armenian_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_city");
				} else {
					returnList = XmlParse("english_armenian_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_clothes");
				} else {
					returnList = XmlParse("english_armenian_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_computers");
				} else {
					returnList = XmlParse("english_armenian_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_container");
				} else {
					returnList = XmlParse("english_armenian_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_dog");
				} else {
					returnList = XmlParse("english_armenian_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_device");
				} else {
					returnList = XmlParse("english_armenian_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_drink");
				} else {
					returnList = XmlParse("english_armenian_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_electronics");
				} else {
					returnList = XmlParse("english_armenian_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_fish");
				} else {
					returnList = XmlParse("english_armenian_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_flower");
				} else {
					returnList = XmlParse("english_armenian_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_food");
				} else {
					returnList = XmlParse("english_armenian_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_fruit");
				} else {
					returnList = XmlParse("english_armenian_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_furniture");
				} else {
					returnList = XmlParse("english_armenian_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_geography");
				} else {
					returnList = XmlParse("english_armenian_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_geometry");
				} else {
					returnList = XmlParse("english_armenian_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_house");
				} else {
					returnList = XmlParse("english_armenian_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_insect");
				} else {
					returnList = XmlParse("english_armenian_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_jewelry");
				} else {
					returnList = XmlParse("english_armenian_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_kitchen");
				} else {
					returnList = XmlParse("english_armenian_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_material");
				} else {
					returnList = XmlParse("english_armenian_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_measuring_device");
				} else {
					returnList = XmlParse("english_armenian_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_metal");
				} else {
					returnList = XmlParse("english_armenian_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_military");
				} else {
					returnList = XmlParse("english_armenian_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_mineral");
				} else {
					returnList = XmlParse("english_armenian_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_music");
				} else {
					returnList = XmlParse("english_armenian_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_mythology");
				} else {
					returnList = XmlParse("english_armenian_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_physics");
				} else {
					returnList = XmlParse("english_armenian_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_plane");
				} else {
					returnList = XmlParse("english_armenian_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_plant");
				} else {
					returnList = XmlParse("english_armenian_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_profession");
				} else {
					returnList = XmlParse("english_armenian_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_raptor");
				} else {
					returnList = XmlParse("english_armenian_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_reptile");
				} else {
					returnList = XmlParse("english_armenian_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_science");
				} else {
					returnList = XmlParse("english_armenian_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_sports");
				} else {
					returnList = XmlParse("english_armenian_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_tool");
				} else {
					returnList = XmlParse("english_armenian_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_tourism");
				} else {
					returnList = XmlParse("english_armenian_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_transport");
				} else {
					returnList = XmlParse("english_armenian_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_tree");
				} else {
					returnList = XmlParse("english_armenian_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_vehicle");
				} else {
					returnList = XmlParse("english_armenian_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_vegetable");
				} else {
					returnList = XmlParse("english_armenian_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_weapon");
				} else {
					returnList = XmlParse("english_armenian_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("armenian_weather");
				} else {
					returnList = XmlParse("english_armenian_weather");
				}
				break;
			default:
			}
			break;
		case 4:
			xrp = ctxt.getResources().getXml(R.xml.basque);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("basque_agriculture");
				} else {
					returnList = XmlParse("english_basque_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("basque_anatomy");
				} else {
					returnList = XmlParse("english_basque_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("basque_animal");
				} else {
					returnList = XmlParse("english_basque_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("basque_art");
				} else {
					returnList = XmlParse("english_basque_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("basque_astronomy");
				} else {
					returnList = XmlParse("english_basque_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("basque_bird");
				} else {
					returnList = XmlParse("english_basque_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("basque_boat");
				} else {
					returnList = XmlParse("english_basque_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("basque_building");
				} else {
					returnList = XmlParse("english_basque_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("basque_business");
				} else {
					returnList = XmlParse("english_basque_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("basque_car");
				} else {
					returnList = XmlParse("english_basque_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("basque_cat");
				} else {
					returnList = XmlParse("english_basque_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("basque_chemical_element");
				} else {
					returnList = XmlParse("english_basque_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("basque_chemical_compound");
				} else {
					returnList = XmlParse("english_basque_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("basque_city");
				} else {
					returnList = XmlParse("english_basque_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("basque_clothes");
				} else {
					returnList = XmlParse("english_basque_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("basque_computers");
				} else {
					returnList = XmlParse("english_basque_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("basque_container");
				} else {
					returnList = XmlParse("english_basque_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("basque_dog");
				} else {
					returnList = XmlParse("english_basque_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("basque_device");
				} else {
					returnList = XmlParse("english_basque_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("basque_drink");
				} else {
					returnList = XmlParse("english_basque_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("basque_electronics");
				} else {
					returnList = XmlParse("english_basque_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("basque_fish");
				} else {
					returnList = XmlParse("english_basque_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("basque_flower");
				} else {
					returnList = XmlParse("english_basque_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("basque_food");
				} else {
					returnList = XmlParse("english_basque_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("basque_fruit");
				} else {
					returnList = XmlParse("english_basque_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("basque_furniture");
				} else {
					returnList = XmlParse("english_basque_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("basque_geography");
				} else {
					returnList = XmlParse("english_basque_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("basque_geometry");
				} else {
					returnList = XmlParse("english_basque_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("basque_house");
				} else {
					returnList = XmlParse("english_basque_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("basque_insect");
				} else {
					returnList = XmlParse("english_basque_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("basque_jewelry");
				} else {
					returnList = XmlParse("english_basque_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("basque_kitchen");
				} else {
					returnList = XmlParse("english_basque_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("basque_material");
				} else {
					returnList = XmlParse("english_basque_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("basque_measuring_device");
				} else {
					returnList = XmlParse("english_basque_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("basque_metal");
				} else {
					returnList = XmlParse("english_basque_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("basque_military");
				} else {
					returnList = XmlParse("english_basque_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("basque_mineral");
				} else {
					returnList = XmlParse("english_basque_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("basque_music");
				} else {
					returnList = XmlParse("english_basque_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("basque_mythology");
				} else {
					returnList = XmlParse("english_basque_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("basque_physics");
				} else {
					returnList = XmlParse("english_basque_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("basque_plane");
				} else {
					returnList = XmlParse("english_basque_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("basque_plant");
				} else {
					returnList = XmlParse("english_basque_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("basque_profession");
				} else {
					returnList = XmlParse("english_basque_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("basque_raptor");
				} else {
					returnList = XmlParse("english_basque_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("basque_reptile");
				} else {
					returnList = XmlParse("english_basque_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("basque_science");
				} else {
					returnList = XmlParse("english_basque_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("basque_sports");
				} else {
					returnList = XmlParse("english_basque_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("basque_tool");
				} else {
					returnList = XmlParse("english_basque_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("basque_tourism");
				} else {
					returnList = XmlParse("english_basque_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("basque_transport");
				} else {
					returnList = XmlParse("english_basque_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("basque_tree");
				} else {
					returnList = XmlParse("english_basque_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("basque_vehicle");
				} else {
					returnList = XmlParse("english_basque_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("basque_vegetable");
				} else {
					returnList = XmlParse("english_basque_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("basque_weapon");
				} else {
					returnList = XmlParse("english_basque_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("basque_weather");
				} else {
					returnList = XmlParse("english_basque_weather");
				}
				break;
			default:
			}
			break;
		case 5:
			xrp = ctxt.getResources().getXml(R.xml.bulgarian);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_agriculture");
				} else {
					returnList = XmlParse("english_bulgarian_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_anatomy");
				} else {
					returnList = XmlParse("english_bulgarian_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_animal");
				} else {
					returnList = XmlParse("english_bulgarian_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_art");
				} else {
					returnList = XmlParse("english_bulgarian_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_astronomy");
				} else {
					returnList = XmlParse("english_bulgarian_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_bird");
				} else {
					returnList = XmlParse("english_bulgarian_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_boat");
				} else {
					returnList = XmlParse("english_bulgarian_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_building");
				} else {
					returnList = XmlParse("english_bulgarian_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_business");
				} else {
					returnList = XmlParse("english_bulgarian_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_car");
				} else {
					returnList = XmlParse("english_bulgarian_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_cat");
				} else {
					returnList = XmlParse("english_bulgarian_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_chemical_element");
				} else {
					returnList = XmlParse("english_bulgarian_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_chemical_compound");
				} else {
					returnList = XmlParse("english_bulgarian_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_city");
				} else {
					returnList = XmlParse("english_bulgarian_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_clothes");
				} else {
					returnList = XmlParse("english_bulgarian_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_computers");
				} else {
					returnList = XmlParse("english_bulgarian_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_container");
				} else {
					returnList = XmlParse("english_bulgarian_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_dog");
				} else {
					returnList = XmlParse("english_bulgarian_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_device");
				} else {
					returnList = XmlParse("english_bulgarian_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_drink");
				} else {
					returnList = XmlParse("english_bulgarian_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_electronics");
				} else {
					returnList = XmlParse("english_bulgarian_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_fish");
				} else {
					returnList = XmlParse("english_bulgarian_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_flower");
				} else {
					returnList = XmlParse("english_bulgarian_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_food");
				} else {
					returnList = XmlParse("english_bulgarian_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_fruit");
				} else {
					returnList = XmlParse("english_bulgarian_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_furniture");
				} else {
					returnList = XmlParse("english_bulgarian_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_geography");
				} else {
					returnList = XmlParse("english_bulgarian_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_geometry");
				} else {
					returnList = XmlParse("english_bulgarian_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_house");
				} else {
					returnList = XmlParse("english_bulgarian_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_insect");
				} else {
					returnList = XmlParse("english_bulgarian_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_jewelry");
				} else {
					returnList = XmlParse("english_bulgarian_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_kitchen");
				} else {
					returnList = XmlParse("english_bulgarian_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_material");
				} else {
					returnList = XmlParse("english_bulgarian_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_measuring_device");
				} else {
					returnList = XmlParse("english_bulgarian_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_metal");
				} else {
					returnList = XmlParse("english_bulgarian_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_military");
				} else {
					returnList = XmlParse("english_bulgarian_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_mineral");
				} else {
					returnList = XmlParse("english_bulgarian_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_music");
				} else {
					returnList = XmlParse("english_bulgarian_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_mythology");
				} else {
					returnList = XmlParse("english_bulgarian_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_physics");
				} else {
					returnList = XmlParse("english_bulgarian_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_plane");
				} else {
					returnList = XmlParse("english_bulgarian_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_plant");
				} else {
					returnList = XmlParse("english_bulgarian_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_profession");
				} else {
					returnList = XmlParse("english_bulgarian_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_raptor");
				} else {
					returnList = XmlParse("english_bulgarian_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_reptile");
				} else {
					returnList = XmlParse("english_bulgarian_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_science");
				} else {
					returnList = XmlParse("english_bulgarian_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_sports");
				} else {
					returnList = XmlParse("english_bulgarian_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_tool");
				} else {
					returnList = XmlParse("english_bulgarian_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_tourism");
				} else {
					returnList = XmlParse("english_bulgarian_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_transport");
				} else {
					returnList = XmlParse("english_bulgarian_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_tree");
				} else {
					returnList = XmlParse("english_bulgarian_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_vehicle");
				} else {
					returnList = XmlParse("english_bulgarian_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_vegetable");
				} else {
					returnList = XmlParse("english_bulgarian_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_weapon");
				} else {
					returnList = XmlParse("english_bulgarian_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("bulgarian_weather");
				} else {
					returnList = XmlParse("english_bulgarian_weather");
				}
				break;
			default:
			}
			break;
		case 6:
			xrp = ctxt.getResources().getXml(R.xml.catalan);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_agriculture");
				} else {
					returnList = XmlParse("english_catalan_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_anatomy");
				} else {
					returnList = XmlParse("english_catalan_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_animal");
				} else {
					returnList = XmlParse("english_catalan_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_art");
				} else {
					returnList = XmlParse("english_catalan_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_astronomy");
				} else {
					returnList = XmlParse("english_catalan_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_bird");
				} else {
					returnList = XmlParse("english_catalan_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_boat");
				} else {
					returnList = XmlParse("english_catalan_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_building");
				} else {
					returnList = XmlParse("english_catalan_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_business");
				} else {
					returnList = XmlParse("english_catalan_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_car");
				} else {
					returnList = XmlParse("english_catalan_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_cat");
				} else {
					returnList = XmlParse("english_catalan_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_chemical_element");
				} else {
					returnList = XmlParse("english_catalan_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_chemical_compound");
				} else {
					returnList = XmlParse("english_catalan_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_city");
				} else {
					returnList = XmlParse("english_catalan_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_clothes");
				} else {
					returnList = XmlParse("english_catalan_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_computers");
				} else {
					returnList = XmlParse("english_catalan_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_container");
				} else {
					returnList = XmlParse("english_catalan_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_dog");
				} else {
					returnList = XmlParse("english_catalan_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_device");
				} else {
					returnList = XmlParse("english_catalan_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_drink");
				} else {
					returnList = XmlParse("english_catalan_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_electronics");
				} else {
					returnList = XmlParse("english_catalan_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_fish");
				} else {
					returnList = XmlParse("english_catalan_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_flower");
				} else {
					returnList = XmlParse("english_catalan_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_food");
				} else {
					returnList = XmlParse("english_catalan_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_fruit");
				} else {
					returnList = XmlParse("english_catalan_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_furniture");
				} else {
					returnList = XmlParse("english_catalan_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_geography");
				} else {
					returnList = XmlParse("english_catalan_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_geometry");
				} else {
					returnList = XmlParse("english_catalan_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_house");
				} else {
					returnList = XmlParse("english_catalan_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_insect");
				} else {
					returnList = XmlParse("english_catalan_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_jewelry");
				} else {
					returnList = XmlParse("english_catalan_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_kitchen");
				} else {
					returnList = XmlParse("english_catalan_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_material");
				} else {
					returnList = XmlParse("english_catalan_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_measuring_device");
				} else {
					returnList = XmlParse("english_catalan_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_metal");
				} else {
					returnList = XmlParse("english_catalan_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_military");
				} else {
					returnList = XmlParse("english_catalan_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_mineral");
				} else {
					returnList = XmlParse("english_catalan_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_music");
				} else {
					returnList = XmlParse("english_catalan_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_mythology");
				} else {
					returnList = XmlParse("english_catalan_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_physics");
				} else {
					returnList = XmlParse("english_catalan_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_plane");
				} else {
					returnList = XmlParse("english_catalan_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_plant");
				} else {
					returnList = XmlParse("english_catalan_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_profession");
				} else {
					returnList = XmlParse("english_catalan_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_raptor");
				} else {
					returnList = XmlParse("english_catalan_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_reptile");
				} else {
					returnList = XmlParse("english_catalan_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_science");
				} else {
					returnList = XmlParse("english_catalan_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_sports");
				} else {
					returnList = XmlParse("english_catalan_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_tool");
				} else {
					returnList = XmlParse("english_catalan_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_tourism");
				} else {
					returnList = XmlParse("english_catalan_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_transport");
				} else {
					returnList = XmlParse("english_catalan_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_tree");
				} else {
					returnList = XmlParse("english_catalan_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_vehicle");
				} else {
					returnList = XmlParse("english_catalan_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_vegetable");
				} else {
					returnList = XmlParse("english_catalan_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_weapon");
				} else {
					returnList = XmlParse("english_catalan_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("catalan_weather");
				} else {
					returnList = XmlParse("english_catalan_weather");
				}
				break;
			default:
			}
			break;
		case 7:
			xrp = ctxt.getResources().getXml(R.xml.chinese);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_agriculture");
				} else {
					returnList = XmlParse("english_chinese_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_anatomy");
				} else {
					returnList = XmlParse("english_chinese_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_animal");
				} else {
					returnList = XmlParse("english_chinese_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_art");
				} else {
					returnList = XmlParse("english_chinese_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_astronomy");
				} else {
					returnList = XmlParse("english_chinese_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_bird");
				} else {
					returnList = XmlParse("english_chinese_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_boat");
				} else {
					returnList = XmlParse("english_chinese_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_building");
				} else {
					returnList = XmlParse("english_chinese_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_business");
				} else {
					returnList = XmlParse("english_chinese_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_car");
				} else {
					returnList = XmlParse("english_chinese_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_cat");
				} else {
					returnList = XmlParse("english_chinese_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_chemical_element");
				} else {
					returnList = XmlParse("english_chinese_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_chemical_compound");
				} else {
					returnList = XmlParse("english_chinese_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_city");
				} else {
					returnList = XmlParse("english_chinese_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_clothes");
				} else {
					returnList = XmlParse("english_chinese_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_computers");
				} else {
					returnList = XmlParse("english_chinese_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_container");
				} else {
					returnList = XmlParse("english_chinese_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_dog");
				} else {
					returnList = XmlParse("english_chinese_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_device");
				} else {
					returnList = XmlParse("english_chinese_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_drink");
				} else {
					returnList = XmlParse("english_chinese_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_electronics");
				} else {
					returnList = XmlParse("english_chinese_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_fish");
				} else {
					returnList = XmlParse("english_chinese_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_flower");
				} else {
					returnList = XmlParse("english_chinese_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_food");
				} else {
					returnList = XmlParse("english_chinese_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_fruit");
				} else {
					returnList = XmlParse("english_chinese_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_furniture");
				} else {
					returnList = XmlParse("english_chinese_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_geography");
				} else {
					returnList = XmlParse("english_chinese_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_geometry");
				} else {
					returnList = XmlParse("english_chinese_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_house");
				} else {
					returnList = XmlParse("english_chinese_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_insect");
				} else {
					returnList = XmlParse("english_chinese_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_jewelry");
				} else {
					returnList = XmlParse("english_chinese_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_kitchen");
				} else {
					returnList = XmlParse("english_chinese_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_material");
				} else {
					returnList = XmlParse("english_chinese_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_measuring_device");
				} else {
					returnList = XmlParse("english_chinese_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_metal");
				} else {
					returnList = XmlParse("english_chinese_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_military");
				} else {
					returnList = XmlParse("english_chinese_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_mineral");
				} else {
					returnList = XmlParse("english_chinese_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_music");
				} else {
					returnList = XmlParse("english_chinese_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_mythology");
				} else {
					returnList = XmlParse("english_chinese_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_physics");
				} else {
					returnList = XmlParse("english_chinese_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_plane");
				} else {
					returnList = XmlParse("english_chinese_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_plant");
				} else {
					returnList = XmlParse("english_chinese_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_profession");
				} else {
					returnList = XmlParse("english_chinese_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_raptor");
				} else {
					returnList = XmlParse("english_chinese_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_reptile");
				} else {
					returnList = XmlParse("english_chinese_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_science");
				} else {
					returnList = XmlParse("english_chinese_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_sports");
				} else {
					returnList = XmlParse("english_chinese_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_tool");
				} else {
					returnList = XmlParse("english_chinese_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_tourism");
				} else {
					returnList = XmlParse("english_chinese_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_transport");
				} else {
					returnList = XmlParse("english_chinese_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_tree");
				} else {
					returnList = XmlParse("english_chinese_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_vehicle");
				} else {
					returnList = XmlParse("english_chinese_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_vegetable");
				} else {
					returnList = XmlParse("english_chinese_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_weapon");
				} else {
					returnList = XmlParse("english_chinese_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("chinese_weather");
				} else {
					returnList = XmlParse("english_chinese_weather");
				}
				break;
			default:
			}
			break;
		case 8:
			xrp = ctxt.getResources().getXml(R.xml.creole);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("creole_agriculture");
				} else {
					returnList = XmlParse("english_creole_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("creole_anatomy");
				} else {
					returnList = XmlParse("english_creole_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("creole_animal");
				} else {
					returnList = XmlParse("english_creole_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("creole_art");
				} else {
					returnList = XmlParse("english_creole_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("creole_astronomy");
				} else {
					returnList = XmlParse("english_creole_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("creole_bird");
				} else {
					returnList = XmlParse("english_creole_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("creole_boat");
				} else {
					returnList = XmlParse("english_creole_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("creole_building");
				} else {
					returnList = XmlParse("english_creole_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("creole_business");
				} else {
					returnList = XmlParse("english_creole_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("creole_car");
				} else {
					returnList = XmlParse("english_creole_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("creole_cat");
				} else {
					returnList = XmlParse("english_creole_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("creole_chemical_element");
				} else {
					returnList = XmlParse("english_creole_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("creole_chemical_compound");
				} else {
					returnList = XmlParse("english_creole_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("creole_city");
				} else {
					returnList = XmlParse("english_creole_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("creole_clothes");
				} else {
					returnList = XmlParse("english_creole_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("creole_computers");
				} else {
					returnList = XmlParse("english_creole_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("creole_container");
				} else {
					returnList = XmlParse("english_creole_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("creole_dog");
				} else {
					returnList = XmlParse("english_creole_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("creole_device");
				} else {
					returnList = XmlParse("english_creole_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("creole_drink");
				} else {
					returnList = XmlParse("english_creole_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("creole_electronics");
				} else {
					returnList = XmlParse("english_creole_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("creole_fish");
				} else {
					returnList = XmlParse("english_creole_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("creole_flower");
				} else {
					returnList = XmlParse("english_creole_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("creole_food");
				} else {
					returnList = XmlParse("english_creole_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("creole_fruit");
				} else {
					returnList = XmlParse("english_creole_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("creole_furniture");
				} else {
					returnList = XmlParse("english_creole_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("creole_geography");
				} else {
					returnList = XmlParse("english_creole_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("creole_geometry");
				} else {
					returnList = XmlParse("english_creole_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("creole_house");
				} else {
					returnList = XmlParse("english_creole_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("creole_insect");
				} else {
					returnList = XmlParse("english_creole_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("creole_jewelry");
				} else {
					returnList = XmlParse("english_creole_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("creole_kitchen");
				} else {
					returnList = XmlParse("english_creole_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("creole_material");
				} else {
					returnList = XmlParse("english_creole_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("creole_measuring_device");
				} else {
					returnList = XmlParse("english_creole_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("creole_metal");
				} else {
					returnList = XmlParse("english_creole_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("creole_military");
				} else {
					returnList = XmlParse("english_creole_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("creole_mineral");
				} else {
					returnList = XmlParse("english_creole_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("creole_music");
				} else {
					returnList = XmlParse("english_creole_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("creole_mythology");
				} else {
					returnList = XmlParse("english_creole_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("creole_physics");
				} else {
					returnList = XmlParse("english_creole_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("creole_plane");
				} else {
					returnList = XmlParse("english_creole_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("creole_plant");
				} else {
					returnList = XmlParse("english_creole_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("creole_profession");
				} else {
					returnList = XmlParse("english_creole_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("creole_raptor");
				} else {
					returnList = XmlParse("english_creole_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("creole_reptile");
				} else {
					returnList = XmlParse("english_creole_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("creole_science");
				} else {
					returnList = XmlParse("english_creole_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("creole_sports");
				} else {
					returnList = XmlParse("english_creole_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("creole_tool");
				} else {
					returnList = XmlParse("english_creole_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("creole_tourism");
				} else {
					returnList = XmlParse("english_creole_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("creole_transport");
				} else {
					returnList = XmlParse("english_creole_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("creole_tree");
				} else {
					returnList = XmlParse("english_creole_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("creole_vehicle");
				} else {
					returnList = XmlParse("english_creole_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("creole_vegetable");
				} else {
					returnList = XmlParse("english_creole_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("creole_weapon");
				} else {
					returnList = XmlParse("english_creole_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("creole_weather");
				} else {
					returnList = XmlParse("english_creole_weather");
				}
				break;
			default:
			}
			break;
		case 9:
			xrp = ctxt.getResources().getXml(R.xml.croatian);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_agriculture");
				} else {
					returnList = XmlParse("english_croatian_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_anatomy");
				} else {
					returnList = XmlParse("english_croatian_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_animal");
				} else {
					returnList = XmlParse("english_croatian_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_art");
				} else {
					returnList = XmlParse("english_croatian_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_astronomy");
				} else {
					returnList = XmlParse("english_croatian_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_bird");
				} else {
					returnList = XmlParse("english_croatian_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_boat");
				} else {
					returnList = XmlParse("english_croatian_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_building");
				} else {
					returnList = XmlParse("english_croatian_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_business");
				} else {
					returnList = XmlParse("english_croatian_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_car");
				} else {
					returnList = XmlParse("english_croatian_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_cat");
				} else {
					returnList = XmlParse("english_croatian_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_chemical_element");
				} else {
					returnList = XmlParse("english_croatian_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_chemical_compound");
				} else {
					returnList = XmlParse("english_croatian_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_city");
				} else {
					returnList = XmlParse("english_croatian_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_clothes");
				} else {
					returnList = XmlParse("english_croatian_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_computers");
				} else {
					returnList = XmlParse("english_croatian_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_container");
				} else {
					returnList = XmlParse("english_croatian_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_dog");
				} else {
					returnList = XmlParse("english_croatian_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_device");
				} else {
					returnList = XmlParse("english_croatian_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_drink");
				} else {
					returnList = XmlParse("english_croatian_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_electronics");
				} else {
					returnList = XmlParse("english_croatian_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_fish");
				} else {
					returnList = XmlParse("english_croatian_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_flower");
				} else {
					returnList = XmlParse("english_croatian_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_food");
				} else {
					returnList = XmlParse("english_croatian_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_fruit");
				} else {
					returnList = XmlParse("english_croatian_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_furniture");
				} else {
					returnList = XmlParse("english_croatian_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_geography");
				} else {
					returnList = XmlParse("english_croatian_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_geometry");
				} else {
					returnList = XmlParse("english_croatian_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_house");
				} else {
					returnList = XmlParse("english_croatian_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_insect");
				} else {
					returnList = XmlParse("english_croatian_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_jewelry");
				} else {
					returnList = XmlParse("english_croatian_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_kitchen");
				} else {
					returnList = XmlParse("english_croatian_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_material");
				} else {
					returnList = XmlParse("english_croatian_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_measuring_device");
				} else {
					returnList = XmlParse("english_croatian_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_metal");
				} else {
					returnList = XmlParse("english_croatian_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_military");
				} else {
					returnList = XmlParse("english_croatian_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_mineral");
				} else {
					returnList = XmlParse("english_croatian_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_music");
				} else {
					returnList = XmlParse("english_croatian_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_mythology");
				} else {
					returnList = XmlParse("english_croatian_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_physics");
				} else {
					returnList = XmlParse("english_croatian_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_plane");
				} else {
					returnList = XmlParse("english_croatian_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_plant");
				} else {
					returnList = XmlParse("english_croatian_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_profession");
				} else {
					returnList = XmlParse("english_croatian_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_raptor");
				} else {
					returnList = XmlParse("english_croatian_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_reptile");
				} else {
					returnList = XmlParse("english_croatian_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_science");
				} else {
					returnList = XmlParse("english_croatian_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_sports");
				} else {
					returnList = XmlParse("english_croatian_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_tool");
				} else {
					returnList = XmlParse("english_croatian_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_tourism");
				} else {
					returnList = XmlParse("english_croatian_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_transport");
				} else {
					returnList = XmlParse("english_croatian_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_tree");
				} else {
					returnList = XmlParse("english_croatian_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_vehicle");
				} else {
					returnList = XmlParse("english_croatian_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_vegetable");
				} else {
					returnList = XmlParse("english_croatian_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_weapon");
				} else {
					returnList = XmlParse("english_croatian_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("croatian_weather");
				} else {
					returnList = XmlParse("english_croatian_weather");
				}
				break;
			default:
			}
			break;
		case 10:
			xrp = ctxt.getResources().getXml(R.xml.czech);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("czech_agriculture");
				} else {
					returnList = XmlParse("english_czech_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("czech_anatomy");
				} else {
					returnList = XmlParse("english_czech_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("czech_animal");
				} else {
					returnList = XmlParse("english_czech_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("czech_art");
				} else {
					returnList = XmlParse("english_czech_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("czech_astronomy");
				} else {
					returnList = XmlParse("english_czech_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("czech_bird");
				} else {
					returnList = XmlParse("english_czech_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("czech_boat");
				} else {
					returnList = XmlParse("english_czech_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("czech_building");
				} else {
					returnList = XmlParse("english_czech_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("czech_business");
				} else {
					returnList = XmlParse("english_czech_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("czech_car");
				} else {
					returnList = XmlParse("english_czech_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("czech_cat");
				} else {
					returnList = XmlParse("english_czech_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("czech_chemical_element");
				} else {
					returnList = XmlParse("english_czech_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("czech_chemical_compound");
				} else {
					returnList = XmlParse("english_czech_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("czech_city");
				} else {
					returnList = XmlParse("english_czech_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("czech_clothes");
				} else {
					returnList = XmlParse("english_czech_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("czech_computers");
				} else {
					returnList = XmlParse("english_czech_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("czech_container");
				} else {
					returnList = XmlParse("english_czech_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("czech_dog");
				} else {
					returnList = XmlParse("english_czech_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("czech_device");
				} else {
					returnList = XmlParse("english_czech_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("czech_drink");
				} else {
					returnList = XmlParse("english_czech_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("czech_electronics");
				} else {
					returnList = XmlParse("english_czech_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("czech_fish");
				} else {
					returnList = XmlParse("english_czech_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("czech_flower");
				} else {
					returnList = XmlParse("english_czech_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("czech_food");
				} else {
					returnList = XmlParse("english_czech_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("czech_fruit");
				} else {
					returnList = XmlParse("english_czech_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("czech_furniture");
				} else {
					returnList = XmlParse("english_czech_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("czech_geography");
				} else {
					returnList = XmlParse("english_czech_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("czech_geometry");
				} else {
					returnList = XmlParse("english_czech_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("czech_house");
				} else {
					returnList = XmlParse("english_czech_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("czech_insect");
				} else {
					returnList = XmlParse("english_czech_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("czech_jewelry");
				} else {
					returnList = XmlParse("english_czech_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("czech_kitchen");
				} else {
					returnList = XmlParse("english_czech_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("czech_material");
				} else {
					returnList = XmlParse("english_czech_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("czech_measuring_device");
				} else {
					returnList = XmlParse("english_czech_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("czech_metal");
				} else {
					returnList = XmlParse("english_czech_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("czech_military");
				} else {
					returnList = XmlParse("english_czech_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("czech_mineral");
				} else {
					returnList = XmlParse("english_czech_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("czech_music");
				} else {
					returnList = XmlParse("english_czech_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("czech_mythology");
				} else {
					returnList = XmlParse("english_czech_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("czech_physics");
				} else {
					returnList = XmlParse("english_czech_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("czech_plane");
				} else {
					returnList = XmlParse("english_czech_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("czech_plant");
				} else {
					returnList = XmlParse("english_czech_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("czech_profession");
				} else {
					returnList = XmlParse("english_czech_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("czech_raptor");
				} else {
					returnList = XmlParse("english_czech_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("czech_reptile");
				} else {
					returnList = XmlParse("english_czech_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("czech_science");
				} else {
					returnList = XmlParse("english_czech_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("czech_sports");
				} else {
					returnList = XmlParse("english_czech_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("czech_tool");
				} else {
					returnList = XmlParse("english_czech_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("czech_tourism");
				} else {
					returnList = XmlParse("english_czech_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("czech_transport");
				} else {
					returnList = XmlParse("english_czech_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("czech_tree");
				} else {
					returnList = XmlParse("english_czech_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("czech_vehicle");
				} else {
					returnList = XmlParse("english_czech_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("czech_vegetable");
				} else {
					returnList = XmlParse("english_czech_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("czech_weapon");
				} else {
					returnList = XmlParse("english_czech_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("czech_weather");
				} else {
					returnList = XmlParse("english_czech_weather");
				}
				break;
			default:
			}
			break;
		/**
		 * case 11: xrp = ctxt.getResources().getXml(R.xml.danish); switch
		 * (catPosition) { case 0: if (engBoolean == false) { returnList =
		 * XmlParse("danish_agriculture"); } else { returnList =
		 * XmlParse("english_danish_agriculture"); } break; case 1: if
		 * (engBoolean == false) { returnList = XmlParse("danish_anatomy"); }
		 * else { returnList = XmlParse("english_danish_anatomy"); } break; case
		 * 2: if (engBoolean == false) { returnList = XmlParse("danish_animal");
		 * } else { returnList = XmlParse("english_danish_animal"); } break;
		 * case 3: if (engBoolean == false) { returnList =
		 * XmlParse("danish_art"); } else { returnList =
		 * XmlParse("english_danish_art"); } break; case 4: if (engBoolean ==
		 * false) { returnList = XmlParse("danish_astronomy"); } else {
		 * returnList = XmlParse("english_danish_astronomy"); } break; case 5:
		 * if (engBoolean == false) { returnList = XmlParse("danish_bird"); }
		 * else { returnList = XmlParse("english_danish_bird"); } break; case 6:
		 * if (engBoolean == false) { returnList = XmlParse("danish_boat"); }
		 * else { returnList = XmlParse("english_danish_boat"); } break; case 7:
		 * if (engBoolean == false) { returnList = XmlParse("danish_building");
		 * } else { returnList = XmlParse("english_danish_building"); } break;
		 * case 8: if (engBoolean == false) { returnList =
		 * XmlParse("danish_business"); } else { returnList =
		 * XmlParse("english_danish_business"); } break; case 9: if (engBoolean
		 * == false) { returnList = XmlParse("danish_car"); } else { returnList
		 * = XmlParse("english_danish_car"); } break; case 10: if (engBoolean ==
		 * false) { returnList = XmlParse("danish_cat"); } else { returnList =
		 * XmlParse("english_danish_cat"); } break; case 11: if (engBoolean ==
		 * false) { returnList = XmlParse("danish_chemical_element"); } else {
		 * returnList = XmlParse("english_danish_chemical_element"); } break;
		 * case 12: if (engBoolean == false) { returnList =
		 * XmlParse("danish_chemical_compound"); } else { returnList =
		 * XmlParse("english_danish_chemical_compound"); } break; case 13: if
		 * (engBoolean == false) { returnList = XmlParse("danish_city"); } else
		 * { returnList = XmlParse("english_danish_city"); } break; case 14: if
		 * (engBoolean == false) { returnList = XmlParse("danish_clothes"); }
		 * else { returnList = XmlParse("english_danish_clothes"); } break; case
		 * 15: if (engBoolean == false) { returnList =
		 * XmlParse("danish_computers"); } else { returnList =
		 * XmlParse("english_danish_computers"); } break; case 16: if
		 * (engBoolean == false) { returnList = XmlParse("danish_container"); }
		 * else { returnList = XmlParse("english_danish_container"); } break;
		 * case 17: if (engBoolean == false) { returnList =
		 * XmlParse("danish_dog"); } else { returnList =
		 * XmlParse("english_danish_dog"); } break; case 18: if (engBoolean ==
		 * false) { returnList = XmlParse("danish_device"); } else { returnList
		 * = XmlParse("english_danish_device"); } break; case 19: if (engBoolean
		 * == false) { returnList = XmlParse("danish_drink"); } else {
		 * returnList = XmlParse("english_danish_drink"); } break; case 20: if
		 * (engBoolean == false) { returnList = XmlParse("danish_electronics");
		 * } else { returnList = XmlParse("english_danish_electronics"); }
		 * break; case 21: if (engBoolean == false) { returnList =
		 * XmlParse("danish_fish"); } else { returnList =
		 * XmlParse("english_danish_fish"); } break; case 22: if (engBoolean ==
		 * false) { returnList = XmlParse("danish_flower"); } else { returnList
		 * = XmlParse("english_danish_flower"); } break; case 23: if (engBoolean
		 * == false) { returnList = XmlParse("danish_food"); } else { returnList
		 * = XmlParse("english_danish_food"); } break; case 24: if (engBoolean
		 * == false) { returnList = XmlParse("danish_fruit"); } else {
		 * returnList = XmlParse("english_danish_fruit"); } break; case 25: if
		 * (engBoolean == false) { returnList = XmlParse("danish_furniture"); }
		 * else { returnList = XmlParse("english_danish_furniture"); } break;
		 * case 26: if (engBoolean == false) { returnList =
		 * XmlParse("danish_geography"); } else { returnList =
		 * XmlParse("english_danish_geography"); } break; case 27: if
		 * (engBoolean == false) { returnList = XmlParse("danish_geometry"); }
		 * else { returnList = XmlParse("english_danish_geometry"); } break;
		 * case 28: if (engBoolean == false) { returnList =
		 * XmlParse("danish_house"); } else { returnList =
		 * XmlParse("english_danish_house"); } break; case 29: if (engBoolean ==
		 * false) { returnList = XmlParse("danish_insect"); } else { returnList
		 * = XmlParse("english_danish_insect"); } break; case 30: if (engBoolean
		 * == false) { returnList = XmlParse("danish_jewelry"); } else {
		 * returnList = XmlParse("english_danish_jewelry"); } break; case 31: if
		 * (engBoolean == false) { returnList = XmlParse("danish_kitchen"); }
		 * else { returnList = XmlParse("english_danish_kitchen"); } break; case
		 * 32: if (engBoolean == false) { returnList =
		 * XmlParse("danish_material"); } else { returnList =
		 * XmlParse("english_danish_material"); } break; case 33: if (engBoolean
		 * == false) { returnList = XmlParse("danish_measuring_device"); } else
		 * { returnList = XmlParse("english_danish_measuring_device"); } break;
		 * case 34: if (engBoolean == false) { returnList =
		 * XmlParse("danish_metal"); } else { returnList =
		 * XmlParse("english_danish_metal"); } break; case 35: if (engBoolean ==
		 * false) { returnList = XmlParse("danish_military"); } else {
		 * returnList = XmlParse("english_danish_military"); } break; case 36:
		 * if (engBoolean == false) { returnList = XmlParse("danish_mineral"); }
		 * else { returnList = XmlParse("english_danish_mineral"); } break; case
		 * 37: if (engBoolean == false) { returnList = XmlParse("danish_music");
		 * } else { returnList = XmlParse("english_danish_music"); } break; case
		 * 38: if (engBoolean == false) { returnList =
		 * XmlParse("danish_mythology"); } else { returnList =
		 * XmlParse("english_danish_mythology"); } break; case 39: if
		 * (engBoolean == false) { returnList = XmlParse("danish_physics"); }
		 * else { returnList = XmlParse("english_danish_physics"); } break; case
		 * 40: if (engBoolean == false) { returnList = XmlParse("danish_plane");
		 * } else { returnList = XmlParse("english_danish_plane"); } break; case
		 * 41: if (engBoolean == false) { returnList = XmlParse("danish_plant");
		 * } else { returnList = XmlParse("english_danish_plant"); } break; case
		 * 42: if (engBoolean == false) { returnList =
		 * XmlParse("danish_profession"); } else { returnList =
		 * XmlParse("english_danish_profession"); } break; case 43: if
		 * (engBoolean == false) { returnList = XmlParse("danish_raptor"); }
		 * else { returnList = XmlParse("english_danish_raptor"); } break; case
		 * 44: if (engBoolean == false) { returnList =
		 * XmlParse("danish_reptile"); } else { returnList =
		 * XmlParse("english_danish_reptile"); } break; case 45: if (engBoolean
		 * == false) { returnList = XmlParse("danish_science"); } else {
		 * returnList = XmlParse("english_danish_science"); } break; case 46: if
		 * (engBoolean == false) { returnList = XmlParse("danish_sports"); }
		 * else { returnList = XmlParse("english_danish_sports"); } break; case
		 * 47: if (engBoolean == false) { returnList = XmlParse("danish_tool");
		 * } else { returnList = XmlParse("english_danish_tool"); } break; case
		 * 48: if (engBoolean == false) { returnList =
		 * XmlParse("danish_tourism"); } else { returnList =
		 * XmlParse("english_danish_tourism"); } break; case 49: if (engBoolean
		 * == false) { returnList = XmlParse("danish_transport"); } else {
		 * returnList = XmlParse("english_danish_transport"); } break; case 50:
		 * if (engBoolean == false) { returnList = XmlParse("danish_tree"); }
		 * else { returnList = XmlParse("english_danish_tree"); } break; case
		 * 51: if (engBoolean == false) { returnList =
		 * XmlParse("danish_vehicle"); } else { returnList =
		 * XmlParse("english_danish_vehicle"); } break; case 52: if (engBoolean
		 * == false) { returnList = XmlParse("danish_vegetable"); } else {
		 * returnList = XmlParse("english_danish_vegetable"); } break; case 53:
		 * if (engBoolean == false) { returnList = XmlParse("danish_weapon"); }
		 * else { returnList = XmlParse("english_danish_weapon"); } break; case
		 * 54: if (engBoolean == false) { returnList =
		 * XmlParse("danish_weather"); } else { returnList =
		 * XmlParse("english_danish_weather"); } break; default: } break; case
		 * 12: xrp = ctxt.getResources().getXml(R.xml.dutch); switch
		 * (catPosition) { case 0: if (engBoolean == false) { returnList =
		 * XmlParse("dutch_agriculture"); } else { returnList =
		 * XmlParse("english_dutch_agriculture"); } break; case 1: if
		 * (engBoolean == false) { returnList = XmlParse("dutch_anatomy"); }
		 * else { returnList = XmlParse("english_dutch_anatomy"); } break; case
		 * 2: if (engBoolean == false) { returnList = XmlParse("dutch_animal");
		 * } else { returnList = XmlParse("english_dutch_animal"); } break; case
		 * 3: if (engBoolean == false) { returnList = XmlParse("dutch_art"); }
		 * else { returnList = XmlParse("english_dutch_art"); } break; case 4:
		 * if (engBoolean == false) { returnList = XmlParse("dutch_astronomy");
		 * } else { returnList = XmlParse("english_dutch_astronomy"); } break;
		 * case 5: if (engBoolean == false) { returnList =
		 * XmlParse("dutch_bird"); } else { returnList =
		 * XmlParse("english_dutch_bird"); } break; case 6: if (engBoolean ==
		 * false) { returnList = XmlParse("dutch_boat"); } else { returnList =
		 * XmlParse("english_dutch_boat"); } break; case 7: if (engBoolean ==
		 * false) { returnList = XmlParse("dutch_building"); } else { returnList
		 * = XmlParse("english_dutch_building"); } break; case 8: if (engBoolean
		 * == false) { returnList = XmlParse("dutch_business"); } else {
		 * returnList = XmlParse("english_dutch_business"); } break; case 9: if
		 * (engBoolean == false) { returnList = XmlParse("dutch_car"); } else {
		 * returnList = XmlParse("english_dutch_car"); } break; case 10: if
		 * (engBoolean == false) { returnList = XmlParse("dutch_cat"); } else {
		 * returnList = XmlParse("english_dutch_cat"); } break; case 11: if
		 * (engBoolean == false) { returnList =
		 * XmlParse("dutch_chemical_element"); } else { returnList =
		 * XmlParse("english_dutch_chemical_element"); } break; case 12: if
		 * (engBoolean == false) { returnList =
		 * XmlParse("dutch_chemical_compound"); } else { returnList =
		 * XmlParse("english_dutch_chemical_compound"); } break; case 13: if
		 * (engBoolean == false) { returnList = XmlParse("dutch_city"); } else {
		 * returnList = XmlParse("english_dutch_city"); } break; case 14: if
		 * (engBoolean == false) { returnList = XmlParse("dutch_clothes"); }
		 * else { returnList = XmlParse("english_dutch_clothes"); } break; case
		 * 15: if (engBoolean == false) { returnList =
		 * XmlParse("dutch_computers"); } else { returnList =
		 * XmlParse("english_dutch_computers"); } break; case 16: if (engBoolean
		 * == false) { returnList = XmlParse("dutch_container"); } else {
		 * returnList = XmlParse("english_dutch_container"); } break; case 17:
		 * if (engBoolean == false) { returnList = XmlParse("dutch_dog"); } else
		 * { returnList = XmlParse("english_dutch_dog"); } break; case 18: if
		 * (engBoolean == false) { returnList = XmlParse("dutch_device"); } else
		 * { returnList = XmlParse("english_dutch_device"); } break; case 19: if
		 * (engBoolean == false) { returnList = XmlParse("dutch_drink"); } else
		 * { returnList = XmlParse("english_dutch_drink"); } break; case 20: if
		 * (engBoolean == false) { returnList = XmlParse("dutch_electronics"); }
		 * else { returnList = XmlParse("english_dutch_electronics"); } break;
		 * case 21: if (engBoolean == false) { returnList =
		 * XmlParse("dutch_fish"); } else { returnList =
		 * XmlParse("english_dutch_fish"); } break; case 22: if (engBoolean ==
		 * false) { returnList = XmlParse("dutch_flower"); } else { returnList =
		 * XmlParse("english_dutch_flower"); } break; case 23: if (engBoolean ==
		 * false) { returnList = XmlParse("dutch_food"); } else { returnList =
		 * XmlParse("english_dutch_food"); } break; case 24: if (engBoolean ==
		 * false) { returnList = XmlParse("dutch_fruit"); } else { returnList =
		 * XmlParse("english_dutch_fruit"); } break; case 25: if (engBoolean ==
		 * false) { returnList = XmlParse("dutch_furniture"); } else {
		 * returnList = XmlParse("english_dutch_furniture"); } break; case 26:
		 * if (engBoolean == false) { returnList = XmlParse("dutch_geography");
		 * } else { returnList = XmlParse("english_dutch_geography"); } break;
		 * case 27: if (engBoolean == false) { returnList =
		 * XmlParse("dutch_geometry"); } else { returnList =
		 * XmlParse("english_dutch_geometry"); } break; case 28: if (engBoolean
		 * == false) { returnList = XmlParse("dutch_house"); } else { returnList
		 * = XmlParse("english_dutch_house"); } break; case 29: if (engBoolean
		 * == false) { returnList = XmlParse("dutch_insect"); } else {
		 * returnList = XmlParse("english_dutch_insect"); } break; case 30: if
		 * (engBoolean == false) { returnList = XmlParse("dutch_jewelry"); }
		 * else { returnList = XmlParse("english_dutch_jewelry"); } break; case
		 * 31: if (engBoolean == false) { returnList =
		 * XmlParse("dutch_kitchen"); } else { returnList =
		 * XmlParse("english_dutch_kitchen"); } break; case 32: if (engBoolean
		 * == false) { returnList = XmlParse("dutch_material"); } else {
		 * returnList = XmlParse("english_dutch_material"); } break; case 33: if
		 * (engBoolean == false) { returnList =
		 * XmlParse("dutch_measuring_device"); } else { returnList =
		 * XmlParse("english_dutch_measuring_device"); } break; case 34: if
		 * (engBoolean == false) { returnList = XmlParse("dutch_metal"); } else
		 * { returnList = XmlParse("english_dutch_metal"); } break; case 35: if
		 * (engBoolean == false) { returnList = XmlParse("dutch_military"); }
		 * else { returnList = XmlParse("english_dutch_military"); } break; case
		 * 36: if (engBoolean == false) { returnList =
		 * XmlParse("dutch_mineral"); } else { returnList =
		 * XmlParse("english_dutch_mineral"); } break; case 37: if (engBoolean
		 * == false) { returnList = XmlParse("dutch_music"); } else { returnList
		 * = XmlParse("english_dutch_music"); } break; case 38: if (engBoolean
		 * == false) { returnList = XmlParse("dutch_mythology"); } else {
		 * returnList = XmlParse("english_dutch_mythology"); } break; case 39:
		 * if (engBoolean == false) { returnList = XmlParse("dutch_physics"); }
		 * else { returnList = XmlParse("english_dutch_physics"); } break; case
		 * 40: if (engBoolean == false) { returnList = XmlParse("dutch_plane");
		 * } else { returnList = XmlParse("english_dutch_plane"); } break; case
		 * 41: if (engBoolean == false) { returnList = XmlParse("dutch_plant");
		 * } else { returnList = XmlParse("english_dutch_plant"); } break; case
		 * 42: if (engBoolean == false) { returnList =
		 * XmlParse("dutch_profession"); } else { returnList =
		 * XmlParse("english_dutch_profession"); } break; case 43: if
		 * (engBoolean == false) { returnList = XmlParse("dutch_raptor"); } else
		 * { returnList = XmlParse("english_dutch_raptor"); } break; case 44: if
		 * (engBoolean == false) { returnList = XmlParse("dutch_reptile"); }
		 * else { returnList = XmlParse("english_dutch_reptile"); } break; case
		 * 45: if (engBoolean == false) { returnList =
		 * XmlParse("dutch_science"); } else { returnList =
		 * XmlParse("english_dutch_science"); } break; case 46: if (engBoolean
		 * == false) { returnList = XmlParse("dutch_sports"); } else {
		 * returnList = XmlParse("english_dutch_sports"); } break; case 47: if
		 * (engBoolean == false) { returnList = XmlParse("dutch_tool"); } else {
		 * returnList = XmlParse("english_dutch_tool"); } break; case 48: if
		 * (engBoolean == false) { returnList = XmlParse("dutch_tourism"); }
		 * else { returnList = XmlParse("english_dutch_tourism"); } break; case
		 * 49: if (engBoolean == false) { returnList =
		 * XmlParse("dutch_transport"); } else { returnList =
		 * XmlParse("english_dutch_transport"); } break; case 50: if (engBoolean
		 * == false) { returnList = XmlParse("dutch_tree"); } else { returnList
		 * = XmlParse("english_dutch_tree"); } break; case 51: if (engBoolean ==
		 * false) { returnList = XmlParse("dutch_vehicle"); } else { returnList
		 * = XmlParse("english_dutch_vehicle"); } break; case 52: if (engBoolean
		 * == false) { returnList = XmlParse("dutch_vegetable"); } else {
		 * returnList = XmlParse("english_dutch_vegetable"); } break; case 53:
		 * if (engBoolean == false) { returnList = XmlParse("dutch_weapon"); }
		 * else { returnList = XmlParse("english_dutch_weapon"); } break; case
		 * 54: if (engBoolean == false) { returnList =
		 * XmlParse("dutch_weather"); } else { returnList =
		 * XmlParse("english_dutch_weather"); } break; default: } break; case
		 * 13: xrp = ctxt.getResources().getXml(R.xml.esperanto); switch
		 * (catPosition) { case 0: if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_agriculture"); } else { returnList =
		 * XmlParse("english_esperanto_agriculture"); } break; case 1: if
		 * (engBoolean == false) { returnList = XmlParse("esperanto_anatomy"); }
		 * else { returnList = XmlParse("english_esperanto_anatomy"); } break;
		 * case 2: if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_animal"); } else { returnList =
		 * XmlParse("english_esperanto_animal"); } break; case 3: if (engBoolean
		 * == false) { returnList = XmlParse("esperanto_art"); } else {
		 * returnList = XmlParse("english_esperanto_art"); } break; case 4: if
		 * (engBoolean == false) { returnList = XmlParse("esperanto_astronomy");
		 * } else { returnList = XmlParse("english_esperanto_astronomy"); }
		 * break; case 5: if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_bird"); } else { returnList =
		 * XmlParse("english_esperanto_bird"); } break; case 6: if (engBoolean
		 * == false) { returnList = XmlParse("esperanto_boat"); } else {
		 * returnList = XmlParse("english_esperanto_boat"); } break; case 7: if
		 * (engBoolean == false) { returnList = XmlParse("esperanto_building");
		 * } else { returnList = XmlParse("english_esperanto_building"); }
		 * break; case 8: if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_business"); } else { returnList =
		 * XmlParse("english_esperanto_business"); } break; case 9: if
		 * (engBoolean == false) { returnList = XmlParse("esperanto_car"); }
		 * else { returnList = XmlParse("english_esperanto_car"); } break; case
		 * 10: if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_cat"); } else { returnList =
		 * XmlParse("english_esperanto_cat"); } break; case 11: if (engBoolean
		 * == false) { returnList = XmlParse("esperanto_chemical_element"); }
		 * else { returnList = XmlParse("english_esperanto_chemical_element"); }
		 * break; case 12: if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_chemical_compound"); } else { returnList =
		 * XmlParse("english_esperanto_chemical_compound"); } break; case 13: if
		 * (engBoolean == false) { returnList = XmlParse("esperanto_city"); }
		 * else { returnList = XmlParse("english_esperanto_city"); } break; case
		 * 14: if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_clothes"); } else { returnList =
		 * XmlParse("english_esperanto_clothes"); } break; case 15: if
		 * (engBoolean == false) { returnList = XmlParse("esperanto_computers");
		 * } else { returnList = XmlParse("english_esperanto_computers"); }
		 * break; case 16: if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_container"); } else { returnList =
		 * XmlParse("english_esperanto_container"); } break; case 17: if
		 * (engBoolean == false) { returnList = XmlParse("esperanto_dog"); }
		 * else { returnList = XmlParse("english_esperanto_dog"); } break; case
		 * 18: if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_device"); } else { returnList =
		 * XmlParse("english_esperanto_device"); } break; case 19: if
		 * (engBoolean == false) { returnList = XmlParse("esperanto_drink"); }
		 * else { returnList = XmlParse("english_esperanto_drink"); } break;
		 * case 20: if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_electronics"); } else { returnList =
		 * XmlParse("english_esperanto_electronics"); } break; case 21: if
		 * (engBoolean == false) { returnList = XmlParse("esperanto_fish"); }
		 * else { returnList = XmlParse("english_esperanto_fish"); } break; case
		 * 22: if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_flower"); } else { returnList =
		 * XmlParse("english_esperanto_flower"); } break; case 23: if
		 * (engBoolean == false) { returnList = XmlParse("esperanto_food"); }
		 * else { returnList = XmlParse("english_esperanto_food"); } break; case
		 * 24: if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_fruit"); } else { returnList =
		 * XmlParse("english_esperanto_fruit"); } break; case 25: if (engBoolean
		 * == false) { returnList = XmlParse("esperanto_furniture"); } else {
		 * returnList = XmlParse("english_esperanto_furniture"); } break; case
		 * 26: if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_geography"); } else { returnList =
		 * XmlParse("english_esperanto_geography"); } break; case 27: if
		 * (engBoolean == false) { returnList = XmlParse("esperanto_geometry");
		 * } else { returnList = XmlParse("english_esperanto_geometry"); }
		 * break; case 28: if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_house"); } else { returnList =
		 * XmlParse("english_esperanto_house"); } break; case 29: if (engBoolean
		 * == false) { returnList = XmlParse("esperanto_insect"); } else {
		 * returnList = XmlParse("english_esperanto_insect"); } break; case 30:
		 * if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_jewelry"); } else { returnList =
		 * XmlParse("english_esperanto_jewelry"); } break; case 31: if
		 * (engBoolean == false) { returnList = XmlParse("esperanto_kitchen"); }
		 * else { returnList = XmlParse("english_esperanto_kitchen"); } break;
		 * case 32: if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_material"); } else { returnList =
		 * XmlParse("english_esperanto_material"); } break; case 33: if
		 * (engBoolean == false) { returnList =
		 * XmlParse("esperanto_measuring_device"); } else { returnList =
		 * XmlParse("english_esperanto_measuring_device"); } break; case 34: if
		 * (engBoolean == false) { returnList = XmlParse("esperanto_metal"); }
		 * else { returnList = XmlParse("english_esperanto_metal"); } break;
		 * case 35: if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_military"); } else { returnList =
		 * XmlParse("english_esperanto_military"); } break; case 36: if
		 * (engBoolean == false) { returnList = XmlParse("esperanto_mineral"); }
		 * else { returnList = XmlParse("english_esperanto_mineral"); } break;
		 * case 37: if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_music"); } else { returnList =
		 * XmlParse("english_esperanto_music"); } break; case 38: if (engBoolean
		 * == false) { returnList = XmlParse("esperanto_mythology"); } else {
		 * returnList = XmlParse("english_esperanto_mythology"); } break; case
		 * 39: if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_physics"); } else { returnList =
		 * XmlParse("english_esperanto_physics"); } break; case 40: if
		 * (engBoolean == false) { returnList = XmlParse("esperanto_plane"); }
		 * else { returnList = XmlParse("english_esperanto_plane"); } break;
		 * case 41: if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_plant"); } else { returnList =
		 * XmlParse("english_esperanto_plant"); } break; case 42: if (engBoolean
		 * == false) { returnList = XmlParse("esperanto_profession"); } else {
		 * returnList = XmlParse("english_esperanto_profession"); } break; case
		 * 43: if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_raptor"); } else { returnList =
		 * XmlParse("english_esperanto_raptor"); } break; case 44: if
		 * (engBoolean == false) { returnList = XmlParse("esperanto_reptile"); }
		 * else { returnList = XmlParse("english_esperanto_reptile"); } break;
		 * case 45: if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_science"); } else { returnList =
		 * XmlParse("english_esperanto_science"); } break; case 46: if
		 * (engBoolean == false) { returnList = XmlParse("esperanto_sports"); }
		 * else { returnList = XmlParse("english_esperanto_sports"); } break;
		 * case 47: if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_tool"); } else { returnList =
		 * XmlParse("english_esperanto_tool"); } break; case 48: if (engBoolean
		 * == false) { returnList = XmlParse("esperanto_tourism"); } else {
		 * returnList = XmlParse("english_esperanto_tourism"); } break; case 49:
		 * if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_transport"); } else { returnList =
		 * XmlParse("english_esperanto_transport"); } break; case 50: if
		 * (engBoolean == false) { returnList = XmlParse("esperanto_tree"); }
		 * else { returnList = XmlParse("english_esperanto_tree"); } break; case
		 * 51: if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_vehicle"); } else { returnList =
		 * XmlParse("english_esperanto_vehicle"); } break; case 52: if
		 * (engBoolean == false) { returnList = XmlParse("esperanto_vegetable");
		 * } else { returnList = XmlParse("english_esperanto_vegetable"); }
		 * break; case 53: if (engBoolean == false) { returnList =
		 * XmlParse("esperanto_weapon"); } else { returnList =
		 * XmlParse("english_esperanto_weapon"); } break; case 54: if
		 * (engBoolean == false) { returnList = XmlParse("esperanto_weather"); }
		 * else { returnList = XmlParse("english_esperanto_weather"); } break;
		 * default: } break; case 14: xrp =
		 * ctxt.getResources().getXml(R.xml.estonian); switch (catPosition) {
		 * case 0: if (engBoolean == false) { returnList =
		 * XmlParse("estonian_agriculture"); } else { returnList =
		 * XmlParse("english_estonian_agriculture"); } break; case 1: if
		 * (engBoolean == false) { returnList = XmlParse("estonian_anatomy"); }
		 * else { returnList = XmlParse("english_estonian_anatomy"); } break;
		 * case 2: if (engBoolean == false) { returnList =
		 * XmlParse("estonian_animal"); } else { returnList =
		 * XmlParse("english_estonian_animal"); } break; case 3: if (engBoolean
		 * == false) { returnList = XmlParse("estonian_art"); } else {
		 * returnList = XmlParse("english_estonian_art"); } break; case 4: if
		 * (engBoolean == false) { returnList = XmlParse("estonian_astronomy");
		 * } else { returnList = XmlParse("english_estonian_astronomy"); }
		 * break; case 5: if (engBoolean == false) { returnList =
		 * XmlParse("estonian_bird"); } else { returnList =
		 * XmlParse("english_estonian_bird"); } break; case 6: if (engBoolean ==
		 * false) { returnList = XmlParse("estonian_boat"); } else { returnList
		 * = XmlParse("english_estonian_boat"); } break; case 7: if (engBoolean
		 * == false) { returnList = XmlParse("estonian_building"); } else {
		 * returnList = XmlParse("english_estonian_building"); } break; case 8:
		 * if (engBoolean == false) { returnList =
		 * XmlParse("estonian_business"); } else { returnList =
		 * XmlParse("english_estonian_business"); } break; case 9: if
		 * (engBoolean == false) { returnList = XmlParse("estonian_car"); } else
		 * { returnList = XmlParse("english_estonian_car"); } break; case 10: if
		 * (engBoolean == false) { returnList = XmlParse("estonian_cat"); } else
		 * { returnList = XmlParse("english_estonian_cat"); } break; case 11: if
		 * (engBoolean == false) { returnList =
		 * XmlParse("estonian_chemical_element"); } else { returnList =
		 * XmlParse("english_estonian_chemical_element"); } break; case 12: if
		 * (engBoolean == false) { returnList =
		 * XmlParse("estonian_chemical_compound"); } else { returnList =
		 * XmlParse("english_estonian_chemical_compound"); } break; case 13: if
		 * (engBoolean == false) { returnList = XmlParse("estonian_city"); }
		 * else { returnList = XmlParse("english_estonian_city"); } break; case
		 * 14: if (engBoolean == false) { returnList =
		 * XmlParse("estonian_clothes"); } else { returnList =
		 * XmlParse("english_estonian_clothes"); } break; case 15: if
		 * (engBoolean == false) { returnList = XmlParse("estonian_computers");
		 * } else { returnList = XmlParse("english_estonian_computers"); }
		 * break; case 16: if (engBoolean == false) { returnList =
		 * XmlParse("estonian_container"); } else { returnList =
		 * XmlParse("english_estonian_container"); } break; case 17: if
		 * (engBoolean == false) { returnList = XmlParse("estonian_dog"); } else
		 * { returnList = XmlParse("english_estonian_dog"); } break; case 18: if
		 * (engBoolean == false) { returnList = XmlParse("estonian_device"); }
		 * else { returnList = XmlParse("english_estonian_device"); } break;
		 * case 19: if (engBoolean == false) { returnList =
		 * XmlParse("estonian_drink"); } else { returnList =
		 * XmlParse("english_estonian_drink"); } break; case 20: if (engBoolean
		 * == false) { returnList = XmlParse("estonian_electronics"); } else {
		 * returnList = XmlParse("english_estonian_electronics"); } break; case
		 * 21: if (engBoolean == false) { returnList =
		 * XmlParse("estonian_fish"); } else { returnList =
		 * XmlParse("english_estonian_fish"); } break; case 22: if (engBoolean
		 * == false) { returnList = XmlParse("estonian_flower"); } else {
		 * returnList = XmlParse("english_estonian_flower"); } break; case 23:
		 * if (engBoolean == false) { returnList = XmlParse("estonian_food"); }
		 * else { returnList = XmlParse("english_estonian_food"); } break; case
		 * 24: if (engBoolean == false) { returnList =
		 * XmlParse("estonian_fruit"); } else { returnList =
		 * XmlParse("english_estonian_fruit"); } break; case 25: if (engBoolean
		 * == false) { returnList = XmlParse("estonian_furniture"); } else {
		 * returnList = XmlParse("english_estonian_furniture"); } break; case
		 * 26: if (engBoolean == false) { returnList =
		 * XmlParse("estonian_geography"); } else { returnList =
		 * XmlParse("english_estonian_geography"); } break; case 27: if
		 * (engBoolean == false) { returnList = XmlParse("estonian_geometry"); }
		 * else { returnList = XmlParse("english_estonian_geometry"); } break;
		 * case 28: if (engBoolean == false) { returnList =
		 * XmlParse("estonian_house"); } else { returnList =
		 * XmlParse("english_estonian_house"); } break; case 29: if (engBoolean
		 * == false) { returnList = XmlParse("estonian_insect"); } else {
		 * returnList = XmlParse("english_estonian_insect"); } break; case 30:
		 * if (engBoolean == false) { returnList = XmlParse("estonian_jewelry");
		 * } else { returnList = XmlParse("english_estonian_jewelry"); } break;
		 * case 31: if (engBoolean == false) { returnList =
		 * XmlParse("estonian_kitchen"); } else { returnList =
		 * XmlParse("english_estonian_kitchen"); } break; case 32: if
		 * (engBoolean == false) { returnList = XmlParse("estonian_material"); }
		 * else { returnList = XmlParse("english_estonian_material"); } break;
		 * case 33: if (engBoolean == false) { returnList =
		 * XmlParse("estonian_measuring_device"); } else { returnList =
		 * XmlParse("english_estonian_measuring_device"); } break; case 34: if
		 * (engBoolean == false) { returnList = XmlParse("estonian_metal"); }
		 * else { returnList = XmlParse("english_estonian_metal"); } break; case
		 * 35: if (engBoolean == false) { returnList =
		 * XmlParse("estonian_military"); } else { returnList =
		 * XmlParse("english_estonian_military"); } break; case 36: if
		 * (engBoolean == false) { returnList = XmlParse("estonian_mineral"); }
		 * else { returnList = XmlParse("english_estonian_mineral"); } break;
		 * case 37: if (engBoolean == false) { returnList =
		 * XmlParse("estonian_music"); } else { returnList =
		 * XmlParse("english_estonian_music"); } break; case 38: if (engBoolean
		 * == false) { returnList = XmlParse("estonian_mythology"); } else {
		 * returnList = XmlParse("english_estonian_mythology"); } break; case
		 * 39: if (engBoolean == false) { returnList =
		 * XmlParse("estonian_physics"); } else { returnList =
		 * XmlParse("english_estonian_physics"); } break; case 40: if
		 * (engBoolean == false) { returnList = XmlParse("estonian_plane"); }
		 * else { returnList = XmlParse("english_estonian_plane"); } break; case
		 * 41: if (engBoolean == false) { returnList =
		 * XmlParse("estonian_plant"); } else { returnList =
		 * XmlParse("english_estonian_plant"); } break; case 42: if (engBoolean
		 * == false) { returnList = XmlParse("estonian_profession"); } else {
		 * returnList = XmlParse("english_estonian_profession"); } break; case
		 * 43: if (engBoolean == false) { returnList =
		 * XmlParse("estonian_raptor"); } else { returnList =
		 * XmlParse("english_estonian_raptor"); } break; case 44: if (engBoolean
		 * == false) { returnList = XmlParse("estonian_reptile"); } else {
		 * returnList = XmlParse("english_estonian_reptile"); } break; case 45:
		 * if (engBoolean == false) { returnList = XmlParse("estonian_science");
		 * } else { returnList = XmlParse("english_estonian_science"); } break;
		 * case 46: if (engBoolean == false) { returnList =
		 * XmlParse("estonian_sports"); } else { returnList =
		 * XmlParse("english_estonian_sports"); } break; case 47: if (engBoolean
		 * == false) { returnList = XmlParse("estonian_tool"); } else {
		 * returnList = XmlParse("english_estonian_tool"); } break; case 48: if
		 * (engBoolean == false) { returnList = XmlParse("estonian_tourism"); }
		 * else { returnList = XmlParse("english_estonian_tourism"); } break;
		 * case 49: if (engBoolean == false) { returnList =
		 * XmlParse("estonian_transport"); } else { returnList =
		 * XmlParse("english_estonian_transport"); } break; case 50: if
		 * (engBoolean == false) { returnList = XmlParse("estonian_tree"); }
		 * else { returnList = XmlParse("english_estonian_tree"); } break; case
		 * 51: if (engBoolean == false) { returnList =
		 * XmlParse("estonian_vehicle"); } else { returnList =
		 * XmlParse("english_estonian_vehicle"); } break; case 52: if
		 * (engBoolean == false) { returnList = XmlParse("estonian_vegetable");
		 * } else { returnList = XmlParse("english_estonian_vegetable"); }
		 * break; case 53: if (engBoolean == false) { returnList =
		 * XmlParse("estonian_weapon"); } else { returnList =
		 * XmlParse("english_estonian_weapon"); } break; case 54: if (engBoolean
		 * == false) { returnList = XmlParse("estonian_weather"); } else {
		 * returnList = XmlParse("english_estonian_weather"); } break; default:
		 * } break; case 15: xrp = ctxt.getResources().getXml(R.xml.filipino);
		 * switch (catPosition) { case 0: if (engBoolean == false) { returnList
		 * = XmlParse("filipino_agriculture"); } else { returnList =
		 * XmlParse("english_filipino_agriculture"); } break; case 1: if
		 * (engBoolean == false) { returnList = XmlParse("filipino_anatomy"); }
		 * else { returnList = XmlParse("english_filipino_anatomy"); } break;
		 * case 2: if (engBoolean == false) { returnList =
		 * XmlParse("filipino_animal"); } else { returnList =
		 * XmlParse("english_filipino_animal"); } break; case 3: if (engBoolean
		 * == false) { returnList = XmlParse("filipino_art"); } else {
		 * returnList = XmlParse("english_filipino_art"); } break; case 4: if
		 * (engBoolean == false) { returnList = XmlParse("filipino_astronomy");
		 * } else { returnList = XmlParse("english_filipino_astronomy"); }
		 * break; case 5: if (engBoolean == false) { returnList =
		 * XmlParse("filipino_bird"); } else { returnList =
		 * XmlParse("english_filipino_bird"); } break; case 6: if (engBoolean ==
		 * false) { returnList = XmlParse("filipino_boat"); } else { returnList
		 * = XmlParse("english_filipino_boat"); } break; case 7: if (engBoolean
		 * == false) { returnList = XmlParse("filipino_building"); } else {
		 * returnList = XmlParse("english_filipino_building"); } break; case 8:
		 * if (engBoolean == false) { returnList =
		 * XmlParse("filipino_business"); } else { returnList =
		 * XmlParse("english_filipino_business"); } break; case 9: if
		 * (engBoolean == false) { returnList = XmlParse("filipino_car"); } else
		 * { returnList = XmlParse("english_filipino_car"); } break; case 10: if
		 * (engBoolean == false) { returnList = XmlParse("filipino_cat"); } else
		 * { returnList = XmlParse("english_filipino_cat"); } break; case 11: if
		 * (engBoolean == false) { returnList =
		 * XmlParse("filipino_chemical_element"); } else { returnList =
		 * XmlParse("english_filipino_chemical_element"); } break; case 12: if
		 * (engBoolean == false) { returnList =
		 * XmlParse("filipino_chemical_compound"); } else { returnList =
		 * XmlParse("english_filipino_chemical_compound"); } break; case 13: if
		 * (engBoolean == false) { returnList = XmlParse("filipino_city"); }
		 * else { returnList = XmlParse("english_filipino_city"); } break; case
		 * 14: if (engBoolean == false) { returnList =
		 * XmlParse("filipino_clothes"); } else { returnList =
		 * XmlParse("english_filipino_clothes"); } break; case 15: if
		 * (engBoolean == false) { returnList = XmlParse("filipino_computers");
		 * } else { returnList = XmlParse("english_filipino_computers"); }
		 * break; case 16: if (engBoolean == false) { returnList =
		 * XmlParse("filipino_container"); } else { returnList =
		 * XmlParse("english_filipino_container"); } break; case 17: if
		 * (engBoolean == false) { returnList = XmlParse("filipino_dog"); } else
		 * { returnList = XmlParse("english_filipino_dog"); } break; case 18: if
		 * (engBoolean == false) { returnList = XmlParse("filipino_device"); }
		 * else { returnList = XmlParse("english_filipino_device"); } break;
		 * case 19: if (engBoolean == false) { returnList =
		 * XmlParse("filipino_drink"); } else { returnList =
		 * XmlParse("english_filipino_drink"); } break; case 20: if (engBoolean
		 * == false) { returnList = XmlParse("filipino_electronics"); } else {
		 * returnList = XmlParse("english_filipino_electronics"); } break; case
		 * 21: if (engBoolean == false) { returnList =
		 * XmlParse("filipino_fish"); } else { returnList =
		 * XmlParse("english_filipino_fish"); } break; case 22: if (engBoolean
		 * == false) { returnList = XmlParse("filipino_flower"); } else {
		 * returnList = XmlParse("english_filipino_flower"); } break; case 23:
		 * if (engBoolean == false) { returnList = XmlParse("filipino_food"); }
		 * else { returnList = XmlParse("english_filipino_food"); } break; case
		 * 24: if (engBoolean == false) { returnList =
		 * XmlParse("filipino_fruit"); } else { returnList =
		 * XmlParse("english_filipino_fruit"); } break; case 25: if (engBoolean
		 * == false) { returnList = XmlParse("filipino_furniture"); } else {
		 * returnList = XmlParse("english_filipino_furniture"); } break; case
		 * 26: if (engBoolean == false) { returnList =
		 * XmlParse("filipino_geography"); } else { returnList =
		 * XmlParse("english_filipino_geography"); } break; case 27: if
		 * (engBoolean == false) { returnList = XmlParse("filipino_geometry"); }
		 * else { returnList = XmlParse("english_filipino_geometry"); } break;
		 * case 28: if (engBoolean == false) { returnList =
		 * XmlParse("filipino_house"); } else { returnList =
		 * XmlParse("english_filipino_house"); } break; case 29: if (engBoolean
		 * == false) { returnList = XmlParse("filipino_insect"); } else {
		 * returnList = XmlParse("english_filipino_insect"); } break; case 30:
		 * if (engBoolean == false) { returnList = XmlParse("filipino_jewelry");
		 * } else { returnList = XmlParse("english_filipino_jewelry"); } break;
		 * case 31: if (engBoolean == false) { returnList =
		 * XmlParse("filipino_kitchen"); } else { returnList =
		 * XmlParse("english_filipino_kitchen"); } break; case 32: if
		 * (engBoolean == false) { returnList = XmlParse("filipino_material"); }
		 * else { returnList = XmlParse("english_filipino_material"); } break;
		 * case 33: if (engBoolean == false) { returnList =
		 * XmlParse("filipino_measuring_device"); } else { returnList =
		 * XmlParse("english_filipino_measuring_device"); } break; case 34: if
		 * (engBoolean == false) { returnList = XmlParse("filipino_metal"); }
		 * else { returnList = XmlParse("english_filipino_metal"); } break; case
		 * 35: if (engBoolean == false) { returnList =
		 * XmlParse("filipino_military"); } else { returnList =
		 * XmlParse("english_filipino_military"); } break; case 36: if
		 * (engBoolean == false) { returnList = XmlParse("filipino_mineral"); }
		 * else { returnList = XmlParse("english_filipino_mineral"); } break;
		 * case 37: if (engBoolean == false) { returnList =
		 * XmlParse("filipino_music"); } else { returnList =
		 * XmlParse("english_filipino_music"); } break; case 38: if (engBoolean
		 * == false) { returnList = XmlParse("filipino_mythology"); } else {
		 * returnList = XmlParse("english_filipino_mythology"); } break; case
		 * 39: if (engBoolean == false) { returnList =
		 * XmlParse("filipino_physics"); } else { returnList =
		 * XmlParse("english_filipino_physics"); } break; case 40: if
		 * (engBoolean == false) { returnList = XmlParse("filipino_plane"); }
		 * else { returnList = XmlParse("english_filipino_plane"); } break; case
		 * 41: if (engBoolean == false) { returnList =
		 * XmlParse("filipino_plant"); } else { returnList =
		 * XmlParse("english_filipino_plant"); } break; case 42: if (engBoolean
		 * == false) { returnList = XmlParse("filipino_profession"); } else {
		 * returnList = XmlParse("english_filipino_profession"); } break; case
		 * 43: if (engBoolean == false) { returnList =
		 * XmlParse("filipino_raptor"); } else { returnList =
		 * XmlParse("english_filipino_raptor"); } break; case 44: if (engBoolean
		 * == false) { returnList = XmlParse("filipino_reptile"); } else {
		 * returnList = XmlParse("english_filipino_reptile"); } break; case 45:
		 * if (engBoolean == false) { returnList = XmlParse("filipino_science");
		 * } else { returnList = XmlParse("english_filipino_science"); } break;
		 * case 46: if (engBoolean == false) { returnList =
		 * XmlParse("filipino_sports"); } else { returnList =
		 * XmlParse("english_filipino_sports"); } break; case 47: if (engBoolean
		 * == false) { returnList = XmlParse("filipino_tool"); } else {
		 * returnList = XmlParse("english_filipino_tool"); } break; case 48: if
		 * (engBoolean == false) { returnList = XmlParse("filipino_tourism"); }
		 * else { returnList = XmlParse("english_filipino_tourism"); } break;
		 * case 49: if (engBoolean == false) { returnList =
		 * XmlParse("filipino_transport"); } else { returnList =
		 * XmlParse("english_filipino_transport"); } break; case 50: if
		 * (engBoolean == false) { returnList = XmlParse("filipino_tree"); }
		 * else { returnList = XmlParse("english_filipino_tree"); } break; case
		 * 51: if (engBoolean == false) { returnList =
		 * XmlParse("filipino_vehicle"); } else { returnList =
		 * XmlParse("english_filipino_vehicle"); } break; case 52: if
		 * (engBoolean == false) { returnList = XmlParse("filipino_vegetable");
		 * } else { returnList = XmlParse("english_filipino_vegetable"); }
		 * break; case 53: if (engBoolean == false) { returnList =
		 * XmlParse("filipino_weapon"); } else { returnList =
		 * XmlParse("english_filipino_weapon"); } break; case 54: if (engBoolean
		 * == false) { returnList = XmlParse("filipino_weather"); } else {
		 * returnList = XmlParse("english_filipino_weather"); } break; default:
		 * } break; case 16: xrp = ctxt.getResources().getXml(R.xml.finnish);
		 * switch (catPosition) { case 0: if (engBoolean == false) { returnList
		 * = XmlParse("finnish_agriculture"); } else { returnList =
		 * XmlParse("english_finnish_agriculture"); } break; case 1: if
		 * (engBoolean == false) { returnList = XmlParse("finnish_anatomy"); }
		 * else { returnList = XmlParse("english_finnish_anatomy"); } break;
		 * case 2: if (engBoolean == false) { returnList =
		 * XmlParse("finnish_animal"); } else { returnList =
		 * XmlParse("english_finnish_animal"); } break; case 3: if (engBoolean
		 * == false) { returnList = XmlParse("finnish_art"); } else { returnList
		 * = XmlParse("english_finnish_art"); } break; case 4: if (engBoolean ==
		 * false) { returnList = XmlParse("finnish_astronomy"); } else {
		 * returnList = XmlParse("english_finnish_astronomy"); } break; case 5:
		 * if (engBoolean == false) { returnList = XmlParse("finnish_bird"); }
		 * else { returnList = XmlParse("english_finnish_bird"); } break; case
		 * 6: if (engBoolean == false) { returnList = XmlParse("finnish_boat");
		 * } else { returnList = XmlParse("english_finnish_boat"); } break; case
		 * 7: if (engBoolean == false) { returnList =
		 * XmlParse("finnish_building"); } else { returnList =
		 * XmlParse("english_finnish_building"); } break; case 8: if (engBoolean
		 * == false) { returnList = XmlParse("finnish_business"); } else {
		 * returnList = XmlParse("english_finnish_business"); } break; case 9:
		 * if (engBoolean == false) { returnList = XmlParse("finnish_car"); }
		 * else { returnList = XmlParse("english_finnish_car"); } break; case
		 * 10: if (engBoolean == false) { returnList = XmlParse("finnish_cat");
		 * } else { returnList = XmlParse("english_finnish_cat"); } break; case
		 * 11: if (engBoolean == false) { returnList =
		 * XmlParse("finnish_chemical_element"); } else { returnList =
		 * XmlParse("english_finnish_chemical_element"); } break; case 12: if
		 * (engBoolean == false) { returnList =
		 * XmlParse("finnish_chemical_compound"); } else { returnList =
		 * XmlParse("english_finnish_chemical_compound"); } break; case 13: if
		 * (engBoolean == false) { returnList = XmlParse("finnish_city"); } else
		 * { returnList = XmlParse("english_finnish_city"); } break; case 14: if
		 * (engBoolean == false) { returnList = XmlParse("finnish_clothes"); }
		 * else { returnList = XmlParse("english_finnish_clothes"); } break;
		 * case 15: if (engBoolean == false) { returnList =
		 * XmlParse("finnish_computers"); } else { returnList =
		 * XmlParse("english_finnish_computers"); } break; case 16: if
		 * (engBoolean == false) { returnList = XmlParse("finnish_container"); }
		 * else { returnList = XmlParse("english_finnish_container"); } break;
		 * case 17: if (engBoolean == false) { returnList =
		 * XmlParse("finnish_dog"); } else { returnList =
		 * XmlParse("english_finnish_dog"); } break; case 18: if (engBoolean ==
		 * false) { returnList = XmlParse("finnish_device"); } else { returnList
		 * = XmlParse("english_finnish_device"); } break; case 19: if
		 * (engBoolean == false) { returnList = XmlParse("finnish_drink"); }
		 * else { returnList = XmlParse("english_finnish_drink"); } break; case
		 * 20: if (engBoolean == false) { returnList =
		 * XmlParse("finnish_electronics"); } else { returnList =
		 * XmlParse("english_finnish_electronics"); } break; case 21: if
		 * (engBoolean == false) { returnList = XmlParse("finnish_fish"); } else
		 * { returnList = XmlParse("english_finnish_fish"); } break; case 22: if
		 * (engBoolean == false) { returnList = XmlParse("finnish_flower"); }
		 * else { returnList = XmlParse("english_finnish_flower"); } break; case
		 * 23: if (engBoolean == false) { returnList = XmlParse("finnish_food");
		 * } else { returnList = XmlParse("english_finnish_food"); } break; case
		 * 24: if (engBoolean == false) { returnList =
		 * XmlParse("finnish_fruit"); } else { returnList =
		 * XmlParse("english_finnish_fruit"); } break; case 25: if (engBoolean
		 * == false) { returnList = XmlParse("finnish_furniture"); } else {
		 * returnList = XmlParse("english_finnish_furniture"); } break; case 26:
		 * if (engBoolean == false) { returnList =
		 * XmlParse("finnish_geography"); } else { returnList =
		 * XmlParse("english_finnish_geography"); } break; case 27: if
		 * (engBoolean == false) { returnList = XmlParse("finnish_geometry"); }
		 * else { returnList = XmlParse("english_finnish_geometry"); } break;
		 * case 28: if (engBoolean == false) { returnList =
		 * XmlParse("finnish_house"); } else { returnList =
		 * XmlParse("english_finnish_house"); } break; case 29: if (engBoolean
		 * == false) { returnList = XmlParse("finnish_insect"); } else {
		 * returnList = XmlParse("english_finnish_insect"); } break; case 30: if
		 * (engBoolean == false) { returnList = XmlParse("finnish_jewelry"); }
		 * else { returnList = XmlParse("english_finnish_jewelry"); } break;
		 * case 31: if (engBoolean == false) { returnList =
		 * XmlParse("finnish_kitchen"); } else { returnList =
		 * XmlParse("english_finnish_kitchen"); } break; case 32: if (engBoolean
		 * == false) { returnList = XmlParse("finnish_material"); } else {
		 * returnList = XmlParse("english_finnish_material"); } break; case 33:
		 * if (engBoolean == false) { returnList =
		 * XmlParse("finnish_measuring_device"); } else { returnList =
		 * XmlParse("english_finnish_measuring_device"); } break; case 34: if
		 * (engBoolean == false) { returnList = XmlParse("finnish_metal"); }
		 * else { returnList = XmlParse("english_finnish_metal"); } break; case
		 * 35: if (engBoolean == false) { returnList =
		 * XmlParse("finnish_military"); } else { returnList =
		 * XmlParse("english_finnish_military"); } break; case 36: if
		 * (engBoolean == false) { returnList = XmlParse("finnish_mineral"); }
		 * else { returnList = XmlParse("english_finnish_mineral"); } break;
		 * case 37: if (engBoolean == false) { returnList =
		 * XmlParse("finnish_music"); } else { returnList =
		 * XmlParse("english_finnish_music"); } break; case 38: if (engBoolean
		 * == false) { returnList = XmlParse("finnish_mythology"); } else {
		 * returnList = XmlParse("english_finnish_mythology"); } break; case 39:
		 * if (engBoolean == false) { returnList = XmlParse("finnish_physics");
		 * } else { returnList = XmlParse("english_finnish_physics"); } break;
		 * case 40: if (engBoolean == false) { returnList =
		 * XmlParse("finnish_plane"); } else { returnList =
		 * XmlParse("english_finnish_plane"); } break; case 41: if (engBoolean
		 * == false) { returnList = XmlParse("finnish_plant"); } else {
		 * returnList = XmlParse("english_finnish_plant"); } break; case 42: if
		 * (engBoolean == false) { returnList = XmlParse("finnish_profession");
		 * } else { returnList = XmlParse("english_finnish_profession"); }
		 * break; case 43: if (engBoolean == false) { returnList =
		 * XmlParse("finnish_raptor"); } else { returnList =
		 * XmlParse("english_finnish_raptor"); } break; case 44: if (engBoolean
		 * == false) { returnList = XmlParse("finnish_reptile"); } else {
		 * returnList = XmlParse("english_finnish_reptile"); } break; case 45:
		 * if (engBoolean == false) { returnList = XmlParse("finnish_science");
		 * } else { returnList = XmlParse("english_finnish_science"); } break;
		 * case 46: if (engBoolean == false) { returnList =
		 * XmlParse("finnish_sports"); } else { returnList =
		 * XmlParse("english_finnish_sports"); } break; case 47: if (engBoolean
		 * == false) { returnList = XmlParse("finnish_tool"); } else {
		 * returnList = XmlParse("english_finnish_tool"); } break; case 48: if
		 * (engBoolean == false) { returnList = XmlParse("finnish_tourism"); }
		 * else { returnList = XmlParse("english_finnish_tourism"); } break;
		 * case 49: if (engBoolean == false) { returnList =
		 * XmlParse("finnish_transport"); } else { returnList =
		 * XmlParse("english_finnish_transport"); } break; case 50: if
		 * (engBoolean == false) { returnList = XmlParse("finnish_tree"); } else
		 * { returnList = XmlParse("english_finnish_tree"); } break; case 51: if
		 * (engBoolean == false) { returnList = XmlParse("finnish_vehicle"); }
		 * else { returnList = XmlParse("english_finnish_vehicle"); } break;
		 * case 52: if (engBoolean == false) { returnList =
		 * XmlParse("finnish_vegetable"); } else { returnList =
		 * XmlParse("english_finnish_vegetable"); } break; case 53: if
		 * (engBoolean == false) { returnList = XmlParse("finnish_weapon"); }
		 * else { returnList = XmlParse("english_finnish_weapon"); } break; case
		 * 54: if (engBoolean == false) { returnList =
		 * XmlParse("finnish_weather"); } else { returnList =
		 * XmlParse("english_finnish_weather"); } break; default: } break;
		 **/
		case 17:
			xrp = ctxt.getResources().getXml(R.xml.french);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("french_agriculture");
				} else {
					returnList = XmlParse("english_french_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("french_anatomy");
				} else {
					returnList = XmlParse("english_french_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("french_animal");
				} else {
					returnList = XmlParse("english_french_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("french_art");
				} else {
					returnList = XmlParse("english_french_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("french_astronomy");
				} else {
					returnList = XmlParse("english_french_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("french_bird");
				} else {
					returnList = XmlParse("english_french_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("french_boat");
				} else {
					returnList = XmlParse("english_french_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("french_building");
				} else {
					returnList = XmlParse("english_french_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("french_business");
				} else {
					returnList = XmlParse("english_french_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("french_car");
				} else {
					returnList = XmlParse("english_french_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("french_cat");
				} else {
					returnList = XmlParse("english_french_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("french_chemical_element");
				} else {
					returnList = XmlParse("english_french_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("french_chemical_compound");
				} else {
					returnList = XmlParse("english_french_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("french_city");
				} else {
					returnList = XmlParse("english_french_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("french_clothes");
				} else {
					returnList = XmlParse("english_french_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("french_computers");
				} else {
					returnList = XmlParse("english_french_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("french_container");
				} else {
					returnList = XmlParse("english_french_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("french_dog");
				} else {
					returnList = XmlParse("english_french_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("french_device");
				} else {
					returnList = XmlParse("english_french_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("french_drink");
				} else {
					returnList = XmlParse("english_french_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("french_electronics");
				} else {
					returnList = XmlParse("english_french_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("french_fish");
				} else {
					returnList = XmlParse("english_french_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("french_flower");
				} else {
					returnList = XmlParse("english_french_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("french_food");
				} else {
					returnList = XmlParse("english_french_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("french_fruit");
				} else {
					returnList = XmlParse("english_french_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("french_furniture");
				} else {
					returnList = XmlParse("english_french_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("french_geography");
				} else {
					returnList = XmlParse("english_french_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("french_geometry");
				} else {
					returnList = XmlParse("english_french_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("french_house");
				} else {
					returnList = XmlParse("english_french_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("french_insect");
				} else {
					returnList = XmlParse("english_french_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("french_jewelry");
				} else {
					returnList = XmlParse("english_french_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("french_kitchen");
				} else {
					returnList = XmlParse("english_french_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("french_material");
				} else {
					returnList = XmlParse("english_french_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("french_measuring_device");
				} else {
					returnList = XmlParse("english_french_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("french_metal");
				} else {
					returnList = XmlParse("english_french_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("french_military");
				} else {
					returnList = XmlParse("english_french_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("french_mineral");
				} else {
					returnList = XmlParse("english_french_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("french_music");
				} else {
					returnList = XmlParse("english_french_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("french_mythology");
				} else {
					returnList = XmlParse("english_french_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("french_physics");
				} else {
					returnList = XmlParse("english_french_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("french_plane");
				} else {
					returnList = XmlParse("english_french_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("french_plant");
				} else {
					returnList = XmlParse("english_french_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("french_profession");
				} else {
					returnList = XmlParse("english_french_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("french_raptor");
				} else {
					returnList = XmlParse("english_french_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("french_reptile");
				} else {
					returnList = XmlParse("english_french_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("french_science");
				} else {
					returnList = XmlParse("english_french_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("french_sports");
				} else {
					returnList = XmlParse("english_french_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("french_tool");
				} else {
					returnList = XmlParse("english_french_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("french_tourism");
				} else {
					returnList = XmlParse("english_french_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("french_transport");
				} else {
					returnList = XmlParse("english_french_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("french_tree");
				} else {
					returnList = XmlParse("english_french_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("french_vehicle");
				} else {
					returnList = XmlParse("english_french_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("french_vegetable");
				} else {
					returnList = XmlParse("english_french_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("french_weapon");
				} else {
					returnList = XmlParse("english_french_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("french_weather");
				} else {
					returnList = XmlParse("english_french_weather");
				}
				break;
			default:
			}
			break;
		/**
		 * case 18: xrp = ctxt.getResources().getXml(R.xml.galician); switch
		 * (catPosition) { case 0: if (engBoolean == false) { returnList =
		 * XmlParse("galician_agriculture"); } else { returnList =
		 * XmlParse("english_galician_agriculture"); } break; case 1: if
		 * (engBoolean == false) { returnList = XmlParse("galician_anatomy"); }
		 * else { returnList = XmlParse("english_galician_anatomy"); } break;
		 * case 2: if (engBoolean == false) { returnList =
		 * XmlParse("galician_animal"); } else { returnList =
		 * XmlParse("english_galician_animal"); } break; case 3: if (engBoolean
		 * == false) { returnList = XmlParse("galician_art"); } else {
		 * returnList = XmlParse("english_galician_art"); } break; case 4: if
		 * (engBoolean == false) { returnList = XmlParse("galician_astronomy");
		 * } else { returnList = XmlParse("english_galician_astronomy"); }
		 * break; case 5: if (engBoolean == false) { returnList =
		 * XmlParse("galician_bird"); } else { returnList =
		 * XmlParse("english_galician_bird"); } break; case 6: if (engBoolean ==
		 * false) { returnList = XmlParse("galician_boat"); } else { returnList
		 * = XmlParse("english_galician_boat"); } break; case 7: if (engBoolean
		 * == false) { returnList = XmlParse("galician_building"); } else {
		 * returnList = XmlParse("english_galician_building"); } break; case 8:
		 * if (engBoolean == false) { returnList =
		 * XmlParse("galician_business"); } else { returnList =
		 * XmlParse("english_galician_business"); } break; case 9: if
		 * (engBoolean == false) { returnList = XmlParse("galician_car"); } else
		 * { returnList = XmlParse("english_galician_car"); } break; case 10: if
		 * (engBoolean == false) { returnList = XmlParse("galician_cat"); } else
		 * { returnList = XmlParse("english_galician_cat"); } break; case 11: if
		 * (engBoolean == false) { returnList =
		 * XmlParse("galician_chemical_element"); } else { returnList =
		 * XmlParse("english_galician_chemical_element"); } break; case 12: if
		 * (engBoolean == false) { returnList =
		 * XmlParse("galician_chemical_compound"); } else { returnList =
		 * XmlParse("english_galician_chemical_compound"); } break; case 13: if
		 * (engBoolean == false) { returnList = XmlParse("galician_city"); }
		 * else { returnList = XmlParse("english_galician_city"); } break; case
		 * 14: if (engBoolean == false) { returnList =
		 * XmlParse("galician_clothes"); } else { returnList =
		 * XmlParse("english_galician_clothes"); } break; case 15: if
		 * (engBoolean == false) { returnList = XmlParse("galician_computers");
		 * } else { returnList = XmlParse("english_galician_computers"); }
		 * break; case 16: if (engBoolean == false) { returnList =
		 * XmlParse("galician_container"); } else { returnList =
		 * XmlParse("english_galician_container"); } break; case 17: if
		 * (engBoolean == false) { returnList = XmlParse("galician_dog"); } else
		 * { returnList = XmlParse("english_galician_dog"); } break; case 18: if
		 * (engBoolean == false) { returnList = XmlParse("galician_device"); }
		 * else { returnList = XmlParse("english_galician_device"); } break;
		 * case 19: if (engBoolean == false) { returnList =
		 * XmlParse("galician_drink"); } else { returnList =
		 * XmlParse("english_galician_drink"); } break; case 20: if (engBoolean
		 * == false) { returnList = XmlParse("galician_electronics"); } else {
		 * returnList = XmlParse("english_galician_electronics"); } break; case
		 * 21: if (engBoolean == false) { returnList =
		 * XmlParse("galician_fish"); } else { returnList =
		 * XmlParse("english_galician_fish"); } break; case 22: if (engBoolean
		 * == false) { returnList = XmlParse("galician_flower"); } else {
		 * returnList = XmlParse("english_galician_flower"); } break; case 23:
		 * if (engBoolean == false) { returnList = XmlParse("galician_food"); }
		 * else { returnList = XmlParse("english_galician_food"); } break; case
		 * 24: if (engBoolean == false) { returnList =
		 * XmlParse("galician_fruit"); } else { returnList =
		 * XmlParse("english_galician_fruit"); } break; case 25: if (engBoolean
		 * == false) { returnList = XmlParse("galician_furniture"); } else {
		 * returnList = XmlParse("english_galician_furniture"); } break; case
		 * 26: if (engBoolean == false) { returnList =
		 * XmlParse("galician_geography"); } else { returnList =
		 * XmlParse("english_galician_geography"); } break; case 27: if
		 * (engBoolean == false) { returnList = XmlParse("galician_geometry"); }
		 * else { returnList = XmlParse("english_galician_geometry"); } break;
		 * case 28: if (engBoolean == false) { returnList =
		 * XmlParse("galician_house"); } else { returnList =
		 * XmlParse("english_galician_house"); } break; case 29: if (engBoolean
		 * == false) { returnList = XmlParse("galician_insect"); } else {
		 * returnList = XmlParse("english_galician_insect"); } break; case 30:
		 * if (engBoolean == false) { returnList = XmlParse("galician_jewelry");
		 * } else { returnList = XmlParse("english_galician_jewelry"); } break;
		 * case 31: if (engBoolean == false) { returnList =
		 * XmlParse("galician_kitchen"); } else { returnList =
		 * XmlParse("english_galician_kitchen"); } break; case 32: if
		 * (engBoolean == false) { returnList = XmlParse("galician_material"); }
		 * else { returnList = XmlParse("english_galician_material"); } break;
		 * case 33: if (engBoolean == false) { returnList =
		 * XmlParse("galician_measuring_device"); } else { returnList =
		 * XmlParse("english_galician_measuring_device"); } break; case 34: if
		 * (engBoolean == false) { returnList = XmlParse("galician_metal"); }
		 * else { returnList = XmlParse("english_galician_metal"); } break; case
		 * 35: if (engBoolean == false) { returnList =
		 * XmlParse("galician_military"); } else { returnList =
		 * XmlParse("english_galician_military"); } break; case 36: if
		 * (engBoolean == false) { returnList = XmlParse("galician_mineral"); }
		 * else { returnList = XmlParse("english_galician_mineral"); } break;
		 * case 37: if (engBoolean == false) { returnList =
		 * XmlParse("galician_music"); } else { returnList =
		 * XmlParse("english_galician_music"); } break; case 38: if (engBoolean
		 * == false) { returnList = XmlParse("galician_mythology"); } else {
		 * returnList = XmlParse("english_galician_mythology"); } break; case
		 * 39: if (engBoolean == false) { returnList =
		 * XmlParse("galician_physics"); } else { returnList =
		 * XmlParse("english_galician_physics"); } break; case 40: if
		 * (engBoolean == false) { returnList = XmlParse("galician_plane"); }
		 * else { returnList = XmlParse("english_galician_plane"); } break; case
		 * 41: if (engBoolean == false) { returnList =
		 * XmlParse("galician_plant"); } else { returnList =
		 * XmlParse("english_galician_plant"); } break; case 42: if (engBoolean
		 * == false) { returnList = XmlParse("galician_profession"); } else {
		 * returnList = XmlParse("english_galician_profession"); } break; case
		 * 43: if (engBoolean == false) { returnList =
		 * XmlParse("galician_raptor"); } else { returnList =
		 * XmlParse("english_galician_raptor"); } break; case 44: if (engBoolean
		 * == false) { returnList = XmlParse("galician_reptile"); } else {
		 * returnList = XmlParse("english_galician_reptile"); } break; case 45:
		 * if (engBoolean == false) { returnList = XmlParse("galician_science");
		 * } else { returnList = XmlParse("english_galician_science"); } break;
		 * case 46: if (engBoolean == false) { returnList =
		 * XmlParse("galician_sports"); } else { returnList =
		 * XmlParse("english_galician_sports"); } break; case 47: if (engBoolean
		 * == false) { returnList = XmlParse("galician_tool"); } else {
		 * returnList = XmlParse("english_galician_tool"); } break; case 48: if
		 * (engBoolean == false) { returnList = XmlParse("galician_tourism"); }
		 * else { returnList = XmlParse("english_galician_tourism"); } break;
		 * case 49: if (engBoolean == false) { returnList =
		 * XmlParse("galician_transport"); } else { returnList =
		 * XmlParse("english_galician_transport"); } break; case 50: if
		 * (engBoolean == false) { returnList = XmlParse("galician_tree"); }
		 * else { returnList = XmlParse("english_galician_tree"); } break; case
		 * 51: if (engBoolean == false) { returnList =
		 * XmlParse("galician_vehicle"); } else { returnList =
		 * XmlParse("english_galician_vehicle"); } break; case 52: if
		 * (engBoolean == false) { returnList = XmlParse("galician_vegetable");
		 * } else { returnList = XmlParse("english_galician_vegetable"); }
		 * break; case 53: if (engBoolean == false) { returnList =
		 * XmlParse("galician_weapon"); } else { returnList =
		 * XmlParse("english_galician_weapon"); } break; case 54: if (engBoolean
		 * == false) { returnList = XmlParse("galician_weather"); } else {
		 * returnList = XmlParse("english_galician_weather"); } break; default:
		 * } break; case 19: xrp = ctxt.getResources().getXml(R.xml.georgian);
		 * switch (catPosition) { case 0: if (engBoolean == false) { returnList
		 * = XmlParse("georgian_agriculture"); } else { returnList =
		 * XmlParse("english_georgian_agriculture"); } break; case 1: if
		 * (engBoolean == false) { returnList = XmlParse("georgian_anatomy"); }
		 * else { returnList = XmlParse("english_georgian_anatomy"); } break;
		 * case 2: if (engBoolean == false) { returnList =
		 * XmlParse("georgian_animal"); } else { returnList =
		 * XmlParse("english_georgian_animal"); } break; case 3: if (engBoolean
		 * == false) { returnList = XmlParse("georgian_art"); } else {
		 * returnList = XmlParse("english_georgian_art"); } break; case 4: if
		 * (engBoolean == false) { returnList = XmlParse("georgian_astronomy");
		 * } else { returnList = XmlParse("english_georgian_astronomy"); }
		 * break; case 5: if (engBoolean == false) { returnList =
		 * XmlParse("georgian_bird"); } else { returnList =
		 * XmlParse("english_georgian_bird"); } break; case 6: if (engBoolean ==
		 * false) { returnList = XmlParse("georgian_boat"); } else { returnList
		 * = XmlParse("english_georgian_boat"); } break; case 7: if (engBoolean
		 * == false) { returnList = XmlParse("georgian_building"); } else {
		 * returnList = XmlParse("english_georgian_building"); } break; case 8:
		 * if (engBoolean == false) { returnList =
		 * XmlParse("georgian_business"); } else { returnList =
		 * XmlParse("english_georgian_business"); } break; case 9: if
		 * (engBoolean == false) { returnList = XmlParse("georgian_car"); } else
		 * { returnList = XmlParse("english_georgian_car"); } break; case 10: if
		 * (engBoolean == false) { returnList = XmlParse("georgian_cat"); } else
		 * { returnList = XmlParse("english_georgian_cat"); } break; case 11: if
		 * (engBoolean == false) { returnList =
		 * XmlParse("georgian_chemical_element"); } else { returnList =
		 * XmlParse("english_georgian_chemical_element"); } break; case 12: if
		 * (engBoolean == false) { returnList =
		 * XmlParse("georgian_chemical_compound"); } else { returnList =
		 * XmlParse("english_georgian_chemical_compound"); } break; case 13: if
		 * (engBoolean == false) { returnList = XmlParse("georgian_city"); }
		 * else { returnList = XmlParse("english_georgian_city"); } break; case
		 * 14: if (engBoolean == false) { returnList =
		 * XmlParse("georgian_clothes"); } else { returnList =
		 * XmlParse("english_georgian_clothes"); } break; case 15: if
		 * (engBoolean == false) { returnList = XmlParse("georgian_computers");
		 * } else { returnList = XmlParse("english_georgian_computers"); }
		 * break; case 16: if (engBoolean == false) { returnList =
		 * XmlParse("georgian_container"); } else { returnList =
		 * XmlParse("english_georgian_container"); } break; case 17: if
		 * (engBoolean == false) { returnList = XmlParse("georgian_dog"); } else
		 * { returnList = XmlParse("english_georgian_dog"); } break; case 18: if
		 * (engBoolean == false) { returnList = XmlParse("georgian_device"); }
		 * else { returnList = XmlParse("english_georgian_device"); } break;
		 * case 19: if (engBoolean == false) { returnList =
		 * XmlParse("georgian_drink"); } else { returnList =
		 * XmlParse("english_georgian_drink"); } break; case 20: if (engBoolean
		 * == false) { returnList = XmlParse("georgian_electronics"); } else {
		 * returnList = XmlParse("english_georgian_electronics"); } break; case
		 * 21: if (engBoolean == false) { returnList =
		 * XmlParse("georgian_fish"); } else { returnList =
		 * XmlParse("english_georgian_fish"); } break; case 22: if (engBoolean
		 * == false) { returnList = XmlParse("georgian_flower"); } else {
		 * returnList = XmlParse("english_georgian_flower"); } break; case 23:
		 * if (engBoolean == false) { returnList = XmlParse("georgian_food"); }
		 * else { returnList = XmlParse("english_georgian_food"); } break; case
		 * 24: if (engBoolean == false) { returnList =
		 * XmlParse("georgian_fruit"); } else { returnList =
		 * XmlParse("english_georgian_fruit"); } break; case 25: if (engBoolean
		 * == false) { returnList = XmlParse("georgian_furniture"); } else {
		 * returnList = XmlParse("english_georgian_furniture"); } break; case
		 * 26: if (engBoolean == false) { returnList =
		 * XmlParse("georgian_geography"); } else { returnList =
		 * XmlParse("english_georgian_geography"); } break; case 27: if
		 * (engBoolean == false) { returnList = XmlParse("georgian_geometry"); }
		 * else { returnList = XmlParse("english_georgian_geometry"); } break;
		 * case 28: if (engBoolean == false) { returnList =
		 * XmlParse("georgian_house"); } else { returnList =
		 * XmlParse("english_georgian_house"); } break; case 29: if (engBoolean
		 * == false) { returnList = XmlParse("georgian_insect"); } else {
		 * returnList = XmlParse("english_georgian_insect"); } break; case 30:
		 * if (engBoolean == false) { returnList = XmlParse("georgian_jewelry");
		 * } else { returnList = XmlParse("english_georgian_jewelry"); } break;
		 * case 31: if (engBoolean == false) { returnList =
		 * XmlParse("georgian_kitchen"); } else { returnList =
		 * XmlParse("english_georgian_kitchen"); } break; case 32: if
		 * (engBoolean == false) { returnList = XmlParse("georgian_material"); }
		 * else { returnList = XmlParse("english_georgian_material"); } break;
		 * case 33: if (engBoolean == false) { returnList =
		 * XmlParse("georgian_measuring_device"); } else { returnList =
		 * XmlParse("english_georgian_measuring_device"); } break; case 34: if
		 * (engBoolean == false) { returnList = XmlParse("georgian_metal"); }
		 * else { returnList = XmlParse("english_georgian_metal"); } break; case
		 * 35: if (engBoolean == false) { returnList =
		 * XmlParse("georgian_military"); } else { returnList =
		 * XmlParse("english_georgian_military"); } break; case 36: if
		 * (engBoolean == false) { returnList = XmlParse("georgian_mineral"); }
		 * else { returnList = XmlParse("english_georgian_mineral"); } break;
		 * case 37: if (engBoolean == false) { returnList =
		 * XmlParse("georgian_music"); } else { returnList =
		 * XmlParse("english_georgian_music"); } break; case 38: if (engBoolean
		 * == false) { returnList = XmlParse("georgian_mythology"); } else {
		 * returnList = XmlParse("english_georgian_mythology"); } break; case
		 * 39: if (engBoolean == false) { returnList =
		 * XmlParse("georgian_physics"); } else { returnList =
		 * XmlParse("english_georgian_physics"); } break; case 40: if
		 * (engBoolean == false) { returnList = XmlParse("georgian_plane"); }
		 * else { returnList = XmlParse("english_georgian_plane"); } break; case
		 * 41: if (engBoolean == false) { returnList =
		 * XmlParse("georgian_plant"); } else { returnList =
		 * XmlParse("english_georgian_plant"); } break; case 42: if (engBoolean
		 * == false) { returnList = XmlParse("georgian_profession"); } else {
		 * returnList = XmlParse("english_georgian_profession"); } break; case
		 * 43: if (engBoolean == false) { returnList =
		 * XmlParse("georgian_raptor"); } else { returnList =
		 * XmlParse("english_georgian_raptor"); } break; case 44: if (engBoolean
		 * == false) { returnList = XmlParse("georgian_reptile"); } else {
		 * returnList = XmlParse("english_georgian_reptile"); } break; case 45:
		 * if (engBoolean == false) { returnList = XmlParse("georgian_science");
		 * } else { returnList = XmlParse("english_georgian_science"); } break;
		 * case 46: if (engBoolean == false) { returnList =
		 * XmlParse("georgian_sports"); } else { returnList =
		 * XmlParse("english_georgian_sports"); } break; case 47: if (engBoolean
		 * == false) { returnList = XmlParse("georgian_tool"); } else {
		 * returnList = XmlParse("english_georgian_tool"); } break; case 48: if
		 * (engBoolean == false) { returnList = XmlParse("georgian_tourism"); }
		 * else { returnList = XmlParse("english_georgian_tourism"); } break;
		 * case 49: if (engBoolean == false) { returnList =
		 * XmlParse("georgian_transport"); } else { returnList =
		 * XmlParse("english_georgian_transport"); } break; case 50: if
		 * (engBoolean == false) { returnList = XmlParse("georgian_tree"); }
		 * else { returnList = XmlParse("english_georgian_tree"); } break; case
		 * 51: if (engBoolean == false) { returnList =
		 * XmlParse("georgian_vehicle"); } else { returnList =
		 * XmlParse("english_georgian_vehicle"); } break; case 52: if
		 * (engBoolean == false) { returnList = XmlParse("georgian_vegetable");
		 * } else { returnList = XmlParse("english_georgian_vegetable"); }
		 * break; case 53: if (engBoolean == false) { returnList =
		 * XmlParse("georgian_weapon"); } else { returnList =
		 * XmlParse("english_georgian_weapon"); } break; case 54: if (engBoolean
		 * == false) { returnList = XmlParse("georgian_weather"); } else {
		 * returnList = XmlParse("english_georgian_weather"); } break; default:
		 * } break;
		 **/
		case 20:
			xrp = ctxt.getResources().getXml(R.xml.german);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("german_agriculture");
				} else {
					returnList = XmlParse("english_german_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("german_anatomy");
				} else {
					returnList = XmlParse("english_german_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("german_animal");
				} else {
					returnList = XmlParse("english_german_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("german_art");
				} else {
					returnList = XmlParse("english_german_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("german_astronomy");
				} else {
					returnList = XmlParse("english_german_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("german_bird");
				} else {
					returnList = XmlParse("english_german_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("german_boat");
				} else {
					returnList = XmlParse("english_german_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("german_building");
				} else {
					returnList = XmlParse("english_german_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("german_business");
				} else {
					returnList = XmlParse("english_german_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("german_car");
				} else {
					returnList = XmlParse("english_german_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("german_cat");
				} else {
					returnList = XmlParse("english_german_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("german_chemical_element");
				} else {
					returnList = XmlParse("english_german_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("german_chemical_compound");
				} else {
					returnList = XmlParse("english_german_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("german_city");
				} else {
					returnList = XmlParse("english_german_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("german_clothes");
				} else {
					returnList = XmlParse("english_german_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("german_computers");
				} else {
					returnList = XmlParse("english_german_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("german_container");
				} else {
					returnList = XmlParse("english_german_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("german_dog");
				} else {
					returnList = XmlParse("english_german_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("german_device");
				} else {
					returnList = XmlParse("english_german_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("german_drink");
				} else {
					returnList = XmlParse("english_german_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("german_electronics");
				} else {
					returnList = XmlParse("english_german_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("german_fish");
				} else {
					returnList = XmlParse("english_german_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("german_flower");
				} else {
					returnList = XmlParse("english_german_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("german_food");
				} else {
					returnList = XmlParse("english_german_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("german_fruit");
				} else {
					returnList = XmlParse("english_german_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("german_furniture");
				} else {
					returnList = XmlParse("english_german_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("german_geography");
				} else {
					returnList = XmlParse("english_german_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("german_geometry");
				} else {
					returnList = XmlParse("english_german_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("german_house");
				} else {
					returnList = XmlParse("english_german_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("german_insect");
				} else {
					returnList = XmlParse("english_german_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("german_jewelry");
				} else {
					returnList = XmlParse("english_german_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("german_kitchen");
				} else {
					returnList = XmlParse("english_german_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("german_material");
				} else {
					returnList = XmlParse("english_german_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("german_measuring_device");
				} else {
					returnList = XmlParse("english_german_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("german_metal");
				} else {
					returnList = XmlParse("english_german_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("german_military");
				} else {
					returnList = XmlParse("english_german_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("german_mineral");
				} else {
					returnList = XmlParse("english_german_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("german_music");
				} else {
					returnList = XmlParse("english_german_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("german_mythology");
				} else {
					returnList = XmlParse("english_german_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("german_physics");
				} else {
					returnList = XmlParse("english_german_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("german_plane");
				} else {
					returnList = XmlParse("english_german_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("german_plant");
				} else {
					returnList = XmlParse("english_german_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("german_profession");
				} else {
					returnList = XmlParse("english_german_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("german_raptor");
				} else {
					returnList = XmlParse("english_german_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("german_reptile");
				} else {
					returnList = XmlParse("english_german_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("german_science");
				} else {
					returnList = XmlParse("english_german_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("german_sports");
				} else {
					returnList = XmlParse("english_german_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("german_tool");
				} else {
					returnList = XmlParse("english_german_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("german_tourism");
				} else {
					returnList = XmlParse("english_german_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("german_transport");
				} else {
					returnList = XmlParse("english_german_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("german_tree");
				} else {
					returnList = XmlParse("english_german_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("german_vehicle");
				} else {
					returnList = XmlParse("english_german_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("german_vegetable");
				} else {
					returnList = XmlParse("english_german_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("german_weapon");
				} else {
					returnList = XmlParse("english_german_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("german_weather");
				} else {
					returnList = XmlParse("english_german_weather");
				}
				break;
			default:
			}
			break;
		case 21:
			xrp = ctxt.getResources().getXml(R.xml.greek);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("greek_agriculture");
				} else {
					returnList = XmlParse("english_greek_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("greek_anatomy");
				} else {
					returnList = XmlParse("english_greek_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("greek_animal");
				} else {
					returnList = XmlParse("english_greek_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("greek_art");
				} else {
					returnList = XmlParse("english_greek_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("greek_astronomy");
				} else {
					returnList = XmlParse("english_greek_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("greek_bird");
				} else {
					returnList = XmlParse("english_greek_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("greek_boat");
				} else {
					returnList = XmlParse("english_greek_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("greek_building");
				} else {
					returnList = XmlParse("english_greek_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("greek_business");
				} else {
					returnList = XmlParse("english_greek_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("greek_car");
				} else {
					returnList = XmlParse("english_greek_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("greek_cat");
				} else {
					returnList = XmlParse("english_greek_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("greek_chemical_element");
				} else {
					returnList = XmlParse("english_greek_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("greek_chemical_compound");
				} else {
					returnList = XmlParse("english_greek_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("greek_city");
				} else {
					returnList = XmlParse("english_greek_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("greek_clothes");
				} else {
					returnList = XmlParse("english_greek_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("greek_computers");
				} else {
					returnList = XmlParse("english_greek_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("greek_container");
				} else {
					returnList = XmlParse("english_greek_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("greek_dog");
				} else {
					returnList = XmlParse("english_greek_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("greek_device");
				} else {
					returnList = XmlParse("english_greek_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("greek_drink");
				} else {
					returnList = XmlParse("english_greek_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("greek_electronics");
				} else {
					returnList = XmlParse("english_greek_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("greek_fish");
				} else {
					returnList = XmlParse("english_greek_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("greek_flower");
				} else {
					returnList = XmlParse("english_greek_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("greek_food");
				} else {
					returnList = XmlParse("english_greek_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("greek_fruit");
				} else {
					returnList = XmlParse("english_greek_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("greek_furniture");
				} else {
					returnList = XmlParse("english_greek_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("greek_geography");
				} else {
					returnList = XmlParse("english_greek_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("greek_geometry");
				} else {
					returnList = XmlParse("english_greek_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("greek_house");
				} else {
					returnList = XmlParse("english_greek_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("greek_insect");
				} else {
					returnList = XmlParse("english_greek_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("greek_jewelry");
				} else {
					returnList = XmlParse("english_greek_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("greek_kitchen");
				} else {
					returnList = XmlParse("english_greek_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("greek_material");
				} else {
					returnList = XmlParse("english_greek_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("greek_measuring_device");
				} else {
					returnList = XmlParse("english_greek_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("greek_metal");
				} else {
					returnList = XmlParse("english_greek_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("greek_military");
				} else {
					returnList = XmlParse("english_greek_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("greek_mineral");
				} else {
					returnList = XmlParse("english_greek_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("greek_music");
				} else {
					returnList = XmlParse("english_greek_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("greek_mythology");
				} else {
					returnList = XmlParse("english_greek_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("greek_physics");
				} else {
					returnList = XmlParse("english_greek_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("greek_plane");
				} else {
					returnList = XmlParse("english_greek_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("greek_plant");
				} else {
					returnList = XmlParse("english_greek_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("greek_profession");
				} else {
					returnList = XmlParse("english_greek_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("greek_raptor");
				} else {
					returnList = XmlParse("english_greek_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("greek_reptile");
				} else {
					returnList = XmlParse("english_greek_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("greek_science");
				} else {
					returnList = XmlParse("english_greek_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("greek_sports");
				} else {
					returnList = XmlParse("english_greek_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("greek_tool");
				} else {
					returnList = XmlParse("english_greek_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("greek_tourism");
				} else {
					returnList = XmlParse("english_greek_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("greek_transport");
				} else {
					returnList = XmlParse("english_greek_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("greek_tree");
				} else {
					returnList = XmlParse("english_greek_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("greek_vehicle");
				} else {
					returnList = XmlParse("english_greek_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("greek_vegetable");
				} else {
					returnList = XmlParse("english_greek_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("greek_weapon");
				} else {
					returnList = XmlParse("english_greek_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("greek_weather");
				} else {
					returnList = XmlParse("english_greek_weather");
				}
				break;
			default:
			}
			break;
		case 22:
			xrp = ctxt.getResources().getXml(R.xml.hebrew);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_agriculture");
				} else {
					returnList = XmlParse("english_hebrew_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_anatomy");
				} else {
					returnList = XmlParse("english_hebrew_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_animal");
				} else {
					returnList = XmlParse("english_hebrew_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_art");
				} else {
					returnList = XmlParse("english_hebrew_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_astronomy");
				} else {
					returnList = XmlParse("english_hebrew_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_bird");
				} else {
					returnList = XmlParse("english_hebrew_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_boat");
				} else {
					returnList = XmlParse("english_hebrew_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_building");
				} else {
					returnList = XmlParse("english_hebrew_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_business");
				} else {
					returnList = XmlParse("english_hebrew_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_car");
				} else {
					returnList = XmlParse("english_hebrew_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_cat");
				} else {
					returnList = XmlParse("english_hebrew_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_chemical_element");
				} else {
					returnList = XmlParse("english_hebrew_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_chemical_compound");
				} else {
					returnList = XmlParse("english_hebrew_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_city");
				} else {
					returnList = XmlParse("english_hebrew_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_clothes");
				} else {
					returnList = XmlParse("english_hebrew_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_computers");
				} else {
					returnList = XmlParse("english_hebrew_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_container");
				} else {
					returnList = XmlParse("english_hebrew_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_dog");
				} else {
					returnList = XmlParse("english_hebrew_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_device");
				} else {
					returnList = XmlParse("english_hebrew_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_drink");
				} else {
					returnList = XmlParse("english_hebrew_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_electronics");
				} else {
					returnList = XmlParse("english_hebrew_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_fish");
				} else {
					returnList = XmlParse("english_hebrew_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_flower");
				} else {
					returnList = XmlParse("english_hebrew_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_food");
				} else {
					returnList = XmlParse("english_hebrew_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_fruit");
				} else {
					returnList = XmlParse("english_hebrew_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_furniture");
				} else {
					returnList = XmlParse("english_hebrew_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_geography");
				} else {
					returnList = XmlParse("english_hebrew_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_geometry");
				} else {
					returnList = XmlParse("english_hebrew_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_house");
				} else {
					returnList = XmlParse("english_hebrew_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_insect");
				} else {
					returnList = XmlParse("english_hebrew_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_jewelry");
				} else {
					returnList = XmlParse("english_hebrew_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_kitchen");
				} else {
					returnList = XmlParse("english_hebrew_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_material");
				} else {
					returnList = XmlParse("english_hebrew_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_measuring_device");
				} else {
					returnList = XmlParse("english_hebrew_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_metal");
				} else {
					returnList = XmlParse("english_hebrew_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_military");
				} else {
					returnList = XmlParse("english_hebrew_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_mineral");
				} else {
					returnList = XmlParse("english_hebrew_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_music");
				} else {
					returnList = XmlParse("english_hebrew_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_mythology");
				} else {
					returnList = XmlParse("english_hebrew_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_physics");
				} else {
					returnList = XmlParse("english_hebrew_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_plane");
				} else {
					returnList = XmlParse("english_hebrew_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_plant");
				} else {
					returnList = XmlParse("english_hebrew_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_profession");
				} else {
					returnList = XmlParse("english_hebrew_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_raptor");
				} else {
					returnList = XmlParse("english_hebrew_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_reptile");
				} else {
					returnList = XmlParse("english_hebrew_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_science");
				} else {
					returnList = XmlParse("english_hebrew_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_sports");
				} else {
					returnList = XmlParse("english_hebrew_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_tool");
				} else {
					returnList = XmlParse("english_hebrew_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_tourism");
				} else {
					returnList = XmlParse("english_hebrew_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_transport");
				} else {
					returnList = XmlParse("english_hebrew_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_tree");
				} else {
					returnList = XmlParse("english_hebrew_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_vehicle");
				} else {
					returnList = XmlParse("english_hebrew_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_vegetable");
				} else {
					returnList = XmlParse("english_hebrew_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_weapon");
				} else {
					returnList = XmlParse("english_hebrew_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("hebrew_weather");
				} else {
					returnList = XmlParse("english_hebrew_weather");
				}
				break;
			default:
			}
			break;
		case 23:
			xrp = ctxt.getResources().getXml(R.xml.hindi);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_agriculture");
				} else {
					returnList = XmlParse("english_hindi_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_anatomy");
				} else {
					returnList = XmlParse("english_hindi_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_animal");
				} else {
					returnList = XmlParse("english_hindi_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_art");
				} else {
					returnList = XmlParse("english_hindi_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_astronomy");
				} else {
					returnList = XmlParse("english_hindi_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_bird");
				} else {
					returnList = XmlParse("english_hindi_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_boat");
				} else {
					returnList = XmlParse("english_hindi_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_building");
				} else {
					returnList = XmlParse("english_hindi_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_business");
				} else {
					returnList = XmlParse("english_hindi_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_car");
				} else {
					returnList = XmlParse("english_hindi_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_cat");
				} else {
					returnList = XmlParse("english_hindi_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_chemical_element");
				} else {
					returnList = XmlParse("english_hindi_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_chemical_compound");
				} else {
					returnList = XmlParse("english_hindi_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_city");
				} else {
					returnList = XmlParse("english_hindi_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_clothes");
				} else {
					returnList = XmlParse("english_hindi_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_computers");
				} else {
					returnList = XmlParse("english_hindi_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_container");
				} else {
					returnList = XmlParse("english_hindi_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_dog");
				} else {
					returnList = XmlParse("english_hindi_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_device");
				} else {
					returnList = XmlParse("english_hindi_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_drink");
				} else {
					returnList = XmlParse("english_hindi_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_electronics");
				} else {
					returnList = XmlParse("english_hindi_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_fish");
				} else {
					returnList = XmlParse("english_hindi_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_flower");
				} else {
					returnList = XmlParse("english_hindi_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_food");
				} else {
					returnList = XmlParse("english_hindi_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_fruit");
				} else {
					returnList = XmlParse("english_hindi_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_furniture");
				} else {
					returnList = XmlParse("english_hindi_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_geography");
				} else {
					returnList = XmlParse("english_hindi_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_geometry");
				} else {
					returnList = XmlParse("english_hindi_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_house");
				} else {
					returnList = XmlParse("english_hindi_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_insect");
				} else {
					returnList = XmlParse("english_hindi_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_jewelry");
				} else {
					returnList = XmlParse("english_hindi_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_kitchen");
				} else {
					returnList = XmlParse("english_hindi_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_material");
				} else {
					returnList = XmlParse("english_hindi_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_measuring_device");
				} else {
					returnList = XmlParse("english_hindi_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_metal");
				} else {
					returnList = XmlParse("english_hindi_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_military");
				} else {
					returnList = XmlParse("english_hindi_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_mineral");
				} else {
					returnList = XmlParse("english_hindi_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_music");
				} else {
					returnList = XmlParse("english_hindi_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_mythology");
				} else {
					returnList = XmlParse("english_hindi_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_physics");
				} else {
					returnList = XmlParse("english_hindi_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_plane");
				} else {
					returnList = XmlParse("english_hindi_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_plant");
				} else {
					returnList = XmlParse("english_hindi_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_profession");
				} else {
					returnList = XmlParse("english_hindi_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_raptor");
				} else {
					returnList = XmlParse("english_hindi_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_reptile");
				} else {
					returnList = XmlParse("english_hindi_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_science");
				} else {
					returnList = XmlParse("english_hindi_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_sports");
				} else {
					returnList = XmlParse("english_hindi_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_tool");
				} else {
					returnList = XmlParse("english_hindi_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_tourism");
				} else {
					returnList = XmlParse("english_hindi_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_transport");
				} else {
					returnList = XmlParse("english_hindi_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_tree");
				} else {
					returnList = XmlParse("english_hindi_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_vehicle");
				} else {
					returnList = XmlParse("english_hindi_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_vegetable");
				} else {
					returnList = XmlParse("english_hindi_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_weapon");
				} else {
					returnList = XmlParse("english_hindi_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("hindi_weather");
				} else {
					returnList = XmlParse("english_hindi_weather");
				}
				break;
			default:
			}
			break;
		case 24:
			xrp = ctxt.getResources().getXml(R.xml.hungarian);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_agriculture");
				} else {
					returnList = XmlParse("english_hungarian_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_anatomy");
				} else {
					returnList = XmlParse("english_hungarian_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_animal");
				} else {
					returnList = XmlParse("english_hungarian_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_art");
				} else {
					returnList = XmlParse("english_hungarian_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_astronomy");
				} else {
					returnList = XmlParse("english_hungarian_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_bird");
				} else {
					returnList = XmlParse("english_hungarian_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_boat");
				} else {
					returnList = XmlParse("english_hungarian_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_building");
				} else {
					returnList = XmlParse("english_hungarian_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_business");
				} else {
					returnList = XmlParse("english_hungarian_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_car");
				} else {
					returnList = XmlParse("english_hungarian_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_cat");
				} else {
					returnList = XmlParse("english_hungarian_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_chemical_element");
				} else {
					returnList = XmlParse("english_hungarian_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_chemical_compound");
				} else {
					returnList = XmlParse("english_hungarian_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_city");
				} else {
					returnList = XmlParse("english_hungarian_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_clothes");
				} else {
					returnList = XmlParse("english_hungarian_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_computers");
				} else {
					returnList = XmlParse("english_hungarian_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_container");
				} else {
					returnList = XmlParse("english_hungarian_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_dog");
				} else {
					returnList = XmlParse("english_hungarian_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_device");
				} else {
					returnList = XmlParse("english_hungarian_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_drink");
				} else {
					returnList = XmlParse("english_hungarian_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_electronics");
				} else {
					returnList = XmlParse("english_hungarian_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_fish");
				} else {
					returnList = XmlParse("english_hungarian_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_flower");
				} else {
					returnList = XmlParse("english_hungarian_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_food");
				} else {
					returnList = XmlParse("english_hungarian_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_fruit");
				} else {
					returnList = XmlParse("english_hungarian_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_furniture");
				} else {
					returnList = XmlParse("english_hungarian_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_geography");
				} else {
					returnList = XmlParse("english_hungarian_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_geometry");
				} else {
					returnList = XmlParse("english_hungarian_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_house");
				} else {
					returnList = XmlParse("english_hungarian_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_insect");
				} else {
					returnList = XmlParse("english_hungarian_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_jewelry");
				} else {
					returnList = XmlParse("english_hungarian_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_kitchen");
				} else {
					returnList = XmlParse("english_hungarian_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_material");
				} else {
					returnList = XmlParse("english_hungarian_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_measuring_device");
				} else {
					returnList = XmlParse("english_hungarian_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_metal");
				} else {
					returnList = XmlParse("english_hungarian_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_military");
				} else {
					returnList = XmlParse("english_hungarian_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_mineral");
				} else {
					returnList = XmlParse("english_hungarian_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_music");
				} else {
					returnList = XmlParse("english_hungarian_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_mythology");
				} else {
					returnList = XmlParse("english_hungarian_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_physics");
				} else {
					returnList = XmlParse("english_hungarian_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_plane");
				} else {
					returnList = XmlParse("english_hungarian_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_plant");
				} else {
					returnList = XmlParse("english_hungarian_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_profession");
				} else {
					returnList = XmlParse("english_hungarian_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_raptor");
				} else {
					returnList = XmlParse("english_hungarian_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_reptile");
				} else {
					returnList = XmlParse("english_hungarian_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_science");
				} else {
					returnList = XmlParse("english_hungarian_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_sports");
				} else {
					returnList = XmlParse("english_hungarian_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_tool");
				} else {
					returnList = XmlParse("english_hungarian_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_tourism");
				} else {
					returnList = XmlParse("english_hungarian_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_transport");
				} else {
					returnList = XmlParse("english_hungarian_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_tree");
				} else {
					returnList = XmlParse("english_hungarian_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_vehicle");
				} else {
					returnList = XmlParse("english_hungarian_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_vegetable");
				} else {
					returnList = XmlParse("english_hungarian_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_weapon");
				} else {
					returnList = XmlParse("english_hungarian_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("hungarian_weather");
				} else {
					returnList = XmlParse("english_hungarian_weather");
				}
				break;
			default:
			}
			break;
		case 25:
			xrp = ctxt.getResources().getXml(R.xml.icelandic);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_agriculture");
				} else {
					returnList = XmlParse("english_icelandic_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_anatomy");
				} else {
					returnList = XmlParse("english_icelandic_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_animal");
				} else {
					returnList = XmlParse("english_icelandic_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_art");
				} else {
					returnList = XmlParse("english_icelandic_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_astronomy");
				} else {
					returnList = XmlParse("english_icelandic_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_bird");
				} else {
					returnList = XmlParse("english_icelandic_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_boat");
				} else {
					returnList = XmlParse("english_icelandic_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_building");
				} else {
					returnList = XmlParse("english_icelandic_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_business");
				} else {
					returnList = XmlParse("english_icelandic_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_car");
				} else {
					returnList = XmlParse("english_icelandic_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_cat");
				} else {
					returnList = XmlParse("english_icelandic_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_chemical_element");
				} else {
					returnList = XmlParse("english_icelandic_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_chemical_compound");
				} else {
					returnList = XmlParse("english_icelandic_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_city");
				} else {
					returnList = XmlParse("english_icelandic_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_clothes");
				} else {
					returnList = XmlParse("english_icelandic_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_computers");
				} else {
					returnList = XmlParse("english_icelandic_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_container");
				} else {
					returnList = XmlParse("english_icelandic_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_dog");
				} else {
					returnList = XmlParse("english_icelandic_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_device");
				} else {
					returnList = XmlParse("english_icelandic_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_drink");
				} else {
					returnList = XmlParse("english_icelandic_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_electronics");
				} else {
					returnList = XmlParse("english_icelandic_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_fish");
				} else {
					returnList = XmlParse("english_icelandic_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_flower");
				} else {
					returnList = XmlParse("english_icelandic_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_food");
				} else {
					returnList = XmlParse("english_icelandic_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_fruit");
				} else {
					returnList = XmlParse("english_icelandic_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_furniture");
				} else {
					returnList = XmlParse("english_icelandic_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_geography");
				} else {
					returnList = XmlParse("english_icelandic_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_geometry");
				} else {
					returnList = XmlParse("english_icelandic_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_house");
				} else {
					returnList = XmlParse("english_icelandic_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_insect");
				} else {
					returnList = XmlParse("english_icelandic_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_jewelry");
				} else {
					returnList = XmlParse("english_icelandic_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_kitchen");
				} else {
					returnList = XmlParse("english_icelandic_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_material");
				} else {
					returnList = XmlParse("english_icelandic_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_measuring_device");
				} else {
					returnList = XmlParse("english_icelandic_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_metal");
				} else {
					returnList = XmlParse("english_icelandic_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_military");
				} else {
					returnList = XmlParse("english_icelandic_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_mineral");
				} else {
					returnList = XmlParse("english_icelandic_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_music");
				} else {
					returnList = XmlParse("english_icelandic_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_mythology");
				} else {
					returnList = XmlParse("english_icelandic_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_physics");
				} else {
					returnList = XmlParse("english_icelandic_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_plane");
				} else {
					returnList = XmlParse("english_icelandic_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_plant");
				} else {
					returnList = XmlParse("english_icelandic_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_profession");
				} else {
					returnList = XmlParse("english_icelandic_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_raptor");
				} else {
					returnList = XmlParse("english_icelandic_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_reptile");
				} else {
					returnList = XmlParse("english_icelandic_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_science");
				} else {
					returnList = XmlParse("english_icelandic_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_sports");
				} else {
					returnList = XmlParse("english_icelandic_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_tool");
				} else {
					returnList = XmlParse("english_icelandic_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_tourism");
				} else {
					returnList = XmlParse("english_icelandic_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_transport");
				} else {
					returnList = XmlParse("english_icelandic_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_tree");
				} else {
					returnList = XmlParse("english_icelandic_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_vehicle");
				} else {
					returnList = XmlParse("english_icelandic_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_vegetable");
				} else {
					returnList = XmlParse("english_icelandic_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_weapon");
				} else {
					returnList = XmlParse("english_icelandic_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("icelandic_weather");
				} else {
					returnList = XmlParse("english_icelandic_weather");
				}
				break;
			default:
			}
			break;
		case 26:
			xrp = ctxt.getResources().getXml(R.xml.indonesian);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_agriculture");
				} else {
					returnList = XmlParse("english_indonesian_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_anatomy");
				} else {
					returnList = XmlParse("english_indonesian_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_animal");
				} else {
					returnList = XmlParse("english_indonesian_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_art");
				} else {
					returnList = XmlParse("english_indonesian_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_astronomy");
				} else {
					returnList = XmlParse("english_indonesian_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_bird");
				} else {
					returnList = XmlParse("english_indonesian_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_boat");
				} else {
					returnList = XmlParse("english_indonesian_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_building");
				} else {
					returnList = XmlParse("english_indonesian_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_business");
				} else {
					returnList = XmlParse("english_indonesian_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_car");
				} else {
					returnList = XmlParse("english_indonesian_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_cat");
				} else {
					returnList = XmlParse("english_indonesian_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_chemical_element");
				} else {
					returnList = XmlParse("english_indonesian_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_chemical_compound");
				} else {
					returnList = XmlParse("english_indonesian_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_city");
				} else {
					returnList = XmlParse("english_indonesian_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_clothes");
				} else {
					returnList = XmlParse("english_indonesian_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_computers");
				} else {
					returnList = XmlParse("english_indonesian_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_container");
				} else {
					returnList = XmlParse("english_indonesian_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_dog");
				} else {
					returnList = XmlParse("english_indonesian_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_device");
				} else {
					returnList = XmlParse("english_indonesian_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_drink");
				} else {
					returnList = XmlParse("english_indonesian_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_electronics");
				} else {
					returnList = XmlParse("english_indonesian_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_fish");
				} else {
					returnList = XmlParse("english_indonesian_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_flower");
				} else {
					returnList = XmlParse("english_indonesian_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_food");
				} else {
					returnList = XmlParse("english_indonesian_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_fruit");
				} else {
					returnList = XmlParse("english_indonesian_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_furniture");
				} else {
					returnList = XmlParse("english_indonesian_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_geography");
				} else {
					returnList = XmlParse("english_indonesian_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_geometry");
				} else {
					returnList = XmlParse("english_indonesian_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_house");
				} else {
					returnList = XmlParse("english_indonesian_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_insect");
				} else {
					returnList = XmlParse("english_indonesian_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_jewelry");
				} else {
					returnList = XmlParse("english_indonesian_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_kitchen");
				} else {
					returnList = XmlParse("english_indonesian_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_material");
				} else {
					returnList = XmlParse("english_indonesian_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_measuring_device");
				} else {
					returnList = XmlParse("english_indonesian_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_metal");
				} else {
					returnList = XmlParse("english_indonesian_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_military");
				} else {
					returnList = XmlParse("english_indonesian_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_mineral");
				} else {
					returnList = XmlParse("english_indonesian_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_music");
				} else {
					returnList = XmlParse("english_indonesian_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_mythology");
				} else {
					returnList = XmlParse("english_indonesian_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_physics");
				} else {
					returnList = XmlParse("english_indonesian_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_plane");
				} else {
					returnList = XmlParse("english_indonesian_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_plant");
				} else {
					returnList = XmlParse("english_indonesian_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_profession");
				} else {
					returnList = XmlParse("english_indonesian_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_raptor");
				} else {
					returnList = XmlParse("english_indonesian_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_reptile");
				} else {
					returnList = XmlParse("english_indonesian_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_science");
				} else {
					returnList = XmlParse("english_indonesian_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_sports");
				} else {
					returnList = XmlParse("english_indonesian_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_tool");
				} else {
					returnList = XmlParse("english_indonesian_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_tourism");
				} else {
					returnList = XmlParse("english_indonesian_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_transport");
				} else {
					returnList = XmlParse("english_indonesian_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_tree");
				} else {
					returnList = XmlParse("english_indonesian_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_vehicle");
				} else {
					returnList = XmlParse("english_indonesian_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_vegetable");
				} else {
					returnList = XmlParse("english_indonesian_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_weapon");
				} else {
					returnList = XmlParse("english_indonesian_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("indonesian_weather");
				} else {
					returnList = XmlParse("english_indonesian_weather");
				}
				break;
			default:
			}
			break;
		case 27:
			xrp = ctxt.getResources().getXml(R.xml.irish);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("irish_agriculture");
				} else {
					returnList = XmlParse("english_irish_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("irish_anatomy");
				} else {
					returnList = XmlParse("english_irish_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("irish_animal");
				} else {
					returnList = XmlParse("english_irish_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("irish_art");
				} else {
					returnList = XmlParse("english_irish_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("irish_astronomy");
				} else {
					returnList = XmlParse("english_irish_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("irish_bird");
				} else {
					returnList = XmlParse("english_irish_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("irish_boat");
				} else {
					returnList = XmlParse("english_irish_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("irish_building");
				} else {
					returnList = XmlParse("english_irish_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("irish_business");
				} else {
					returnList = XmlParse("english_irish_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("irish_car");
				} else {
					returnList = XmlParse("english_irish_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("irish_cat");
				} else {
					returnList = XmlParse("english_irish_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("irish_chemical_element");
				} else {
					returnList = XmlParse("english_irish_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("irish_chemical_compound");
				} else {
					returnList = XmlParse("english_irish_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("irish_city");
				} else {
					returnList = XmlParse("english_irish_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("irish_clothes");
				} else {
					returnList = XmlParse("english_irish_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("irish_computers");
				} else {
					returnList = XmlParse("english_irish_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("irish_container");
				} else {
					returnList = XmlParse("english_irish_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("irish_dog");
				} else {
					returnList = XmlParse("english_irish_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("irish_device");
				} else {
					returnList = XmlParse("english_irish_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("irish_drink");
				} else {
					returnList = XmlParse("english_irish_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("irish_electronics");
				} else {
					returnList = XmlParse("english_irish_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("irish_fish");
				} else {
					returnList = XmlParse("english_irish_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("irish_flower");
				} else {
					returnList = XmlParse("english_irish_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("irish_food");
				} else {
					returnList = XmlParse("english_irish_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("irish_fruit");
				} else {
					returnList = XmlParse("english_irish_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("irish_furniture");
				} else {
					returnList = XmlParse("english_irish_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("irish_geography");
				} else {
					returnList = XmlParse("english_irish_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("irish_geometry");
				} else {
					returnList = XmlParse("english_irish_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("irish_house");
				} else {
					returnList = XmlParse("english_irish_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("irish_insect");
				} else {
					returnList = XmlParse("english_irish_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("irish_jewelry");
				} else {
					returnList = XmlParse("english_irish_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("irish_kitchen");
				} else {
					returnList = XmlParse("english_irish_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("irish_material");
				} else {
					returnList = XmlParse("english_irish_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("irish_measuring_device");
				} else {
					returnList = XmlParse("english_irish_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("irish_metal");
				} else {
					returnList = XmlParse("english_irish_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("irish_military");
				} else {
					returnList = XmlParse("english_irish_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("irish_mineral");
				} else {
					returnList = XmlParse("english_irish_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("irish_music");
				} else {
					returnList = XmlParse("english_irish_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("irish_mythology");
				} else {
					returnList = XmlParse("english_irish_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("irish_physics");
				} else {
					returnList = XmlParse("english_irish_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("irish_plane");
				} else {
					returnList = XmlParse("english_irish_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("irish_plant");
				} else {
					returnList = XmlParse("english_irish_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("irish_profession");
				} else {
					returnList = XmlParse("english_irish_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("irish_raptor");
				} else {
					returnList = XmlParse("english_irish_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("irish_reptile");
				} else {
					returnList = XmlParse("english_irish_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("irish_science");
				} else {
					returnList = XmlParse("english_irish_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("irish_sports");
				} else {
					returnList = XmlParse("english_irish_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("irish_tool");
				} else {
					returnList = XmlParse("english_irish_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("irish_tourism");
				} else {
					returnList = XmlParse("english_irish_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("irish_transport");
				} else {
					returnList = XmlParse("english_irish_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("irish_tree");
				} else {
					returnList = XmlParse("english_irish_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("irish_vehicle");
				} else {
					returnList = XmlParse("english_irish_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("irish_vegetable");
				} else {
					returnList = XmlParse("english_irish_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("irish_weapon");
				} else {
					returnList = XmlParse("english_irish_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("irish_weather");
				} else {
					returnList = XmlParse("english_irish_weather");
				}
				break;
			default:
			}
			break;
		default:
			returnList.add("error");
			break;
		}

		return returnList;

	}
	
	public ArrayList<String> getTextTwo(int langPosition, int catPosition,
			boolean engBoolean, Context ctxt) throws XmlPullParserException,
			IOException {

		ArrayList<String> returnList = new ArrayList<String>();
		factory = XmlPullParserFactory.newInstance();
		factory.setNamespaceAware(true);

		switch (langPosition) {
		case 28:
			xrp = ctxt.getResources().getXml(R.xml.italian);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("italian_agriculture");
				} else {
					returnList = XmlParse("english_italian_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("italian_anatomy");
				} else {
					returnList = XmlParse("english_italian_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("italian_animal");
				} else {
					returnList = XmlParse("english_italian_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("italian_art");
				} else {
					returnList = XmlParse("english_italian_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("italian_astronomy");
				} else {
					returnList = XmlParse("english_italian_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("italian_bird");
				} else {
					returnList = XmlParse("english_italian_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("italian_boat");
				} else {
					returnList = XmlParse("english_italian_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("italian_building");
				} else {
					returnList = XmlParse("english_italian_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("italian_business");
				} else {
					returnList = XmlParse("english_italian_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("italian_car");
				} else {
					returnList = XmlParse("english_italian_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("italian_cat");
				} else {
					returnList = XmlParse("english_italian_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("italian_chemical_element");
				} else {
					returnList = XmlParse("english_italian_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("italian_chemical_compound");
				} else {
					returnList = XmlParse("english_italian_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("italian_city");
				} else {
					returnList = XmlParse("english_italian_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("italian_clothes");
				} else {
					returnList = XmlParse("english_italian_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("italian_computers");
				} else {
					returnList = XmlParse("english_italian_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("italian_container");
				} else {
					returnList = XmlParse("english_italian_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("italian_dog");
				} else {
					returnList = XmlParse("english_italian_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("italian_device");
				} else {
					returnList = XmlParse("english_italian_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("italian_drink");
				} else {
					returnList = XmlParse("english_italian_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("italian_electronics");
				} else {
					returnList = XmlParse("english_italian_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("italian_fish");
				} else {
					returnList = XmlParse("english_italian_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("italian_flower");
				} else {
					returnList = XmlParse("english_italian_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("italian_food");
				} else {
					returnList = XmlParse("english_italian_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("italian_fruit");
				} else {
					returnList = XmlParse("english_italian_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("italian_furniture");
				} else {
					returnList = XmlParse("english_italian_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("italian_geography");
				} else {
					returnList = XmlParse("english_italian_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("italian_geometry");
				} else {
					returnList = XmlParse("english_italian_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("italian_house");
				} else {
					returnList = XmlParse("english_italian_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("italian_insect");
				} else {
					returnList = XmlParse("english_italian_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("italian_jewelry");
				} else {
					returnList = XmlParse("english_italian_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("italian_kitchen");
				} else {
					returnList = XmlParse("english_italian_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("italian_material");
				} else {
					returnList = XmlParse("english_italian_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("italian_measuring_device");
				} else {
					returnList = XmlParse("english_italian_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("italian_metal");
				} else {
					returnList = XmlParse("english_italian_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("italian_military");
				} else {
					returnList = XmlParse("english_italian_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("italian_mineral");
				} else {
					returnList = XmlParse("english_italian_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("italian_music");
				} else {
					returnList = XmlParse("english_italian_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("italian_mythology");
				} else {
					returnList = XmlParse("english_italian_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("italian_physics");
				} else {
					returnList = XmlParse("english_italian_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("italian_plane");
				} else {
					returnList = XmlParse("english_italian_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("italian_plant");
				} else {
					returnList = XmlParse("english_italian_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("italian_profession");
				} else {
					returnList = XmlParse("english_italian_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("italian_raptor");
				} else {
					returnList = XmlParse("english_italian_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("italian_reptile");
				} else {
					returnList = XmlParse("english_italian_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("italian_science");
				} else {
					returnList = XmlParse("english_italian_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("italian_sports");
				} else {
					returnList = XmlParse("english_italian_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("italian_tool");
				} else {
					returnList = XmlParse("english_italian_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("italian_tourism");
				} else {
					returnList = XmlParse("english_italian_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("italian_transport");
				} else {
					returnList = XmlParse("english_italian_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("italian_tree");
				} else {
					returnList = XmlParse("english_italian_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("italian_vehicle");
				} else {
					returnList = XmlParse("english_italian_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("italian_vegetable");
				} else {
					returnList = XmlParse("english_italian_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("italian_weapon");
				} else {
					returnList = XmlParse("english_italian_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("italian_weather");
				} else {
					returnList = XmlParse("english_italian_weather");
				}
				break;
			default:
			}
			break;
		case 29:
			xrp = ctxt.getResources().getXml(R.xml.japanese);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_agriculture");
				} else {
					returnList = XmlParse("english_japanese_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_anatomy");
				} else {
					returnList = XmlParse("english_japanese_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_animal");
				} else {
					returnList = XmlParse("english_japanese_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_art");
				} else {
					returnList = XmlParse("english_japanese_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_astronomy");
				} else {
					returnList = XmlParse("english_japanese_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_bird");
				} else {
					returnList = XmlParse("english_japanese_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_boat");
				} else {
					returnList = XmlParse("english_japanese_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_building");
				} else {
					returnList = XmlParse("english_japanese_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_business");
				} else {
					returnList = XmlParse("english_japanese_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_car");
				} else {
					returnList = XmlParse("english_japanese_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_cat");
				} else {
					returnList = XmlParse("english_japanese_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_chemical_element");
				} else {
					returnList = XmlParse("english_japanese_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_chemical_compound");
				} else {
					returnList = XmlParse("english_japanese_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_city");
				} else {
					returnList = XmlParse("english_japanese_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_clothes");
				} else {
					returnList = XmlParse("english_japanese_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_computers");
				} else {
					returnList = XmlParse("english_japanese_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_container");
				} else {
					returnList = XmlParse("english_japanese_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_dog");
				} else {
					returnList = XmlParse("english_japanese_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_device");
				} else {
					returnList = XmlParse("english_japanese_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_drink");
				} else {
					returnList = XmlParse("english_japanese_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_electronics");
				} else {
					returnList = XmlParse("english_japanese_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_fish");
				} else {
					returnList = XmlParse("english_japanese_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_flower");
				} else {
					returnList = XmlParse("english_japanese_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_food");
				} else {
					returnList = XmlParse("english_japanese_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_fruit");
				} else {
					returnList = XmlParse("english_japanese_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_furniture");
				} else {
					returnList = XmlParse("english_japanese_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_geography");
				} else {
					returnList = XmlParse("english_japanese_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_geometry");
				} else {
					returnList = XmlParse("english_japanese_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_house");
				} else {
					returnList = XmlParse("english_japanese_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_insect");
				} else {
					returnList = XmlParse("english_japanese_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_jewelry");
				} else {
					returnList = XmlParse("english_japanese_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_kitchen");
				} else {
					returnList = XmlParse("english_japanese_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_material");
				} else {
					returnList = XmlParse("english_japanese_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_measuring_device");
				} else {
					returnList = XmlParse("english_japanese_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_metal");
				} else {
					returnList = XmlParse("english_japanese_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_military");
				} else {
					returnList = XmlParse("english_japanese_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_mineral");
				} else {
					returnList = XmlParse("english_japanese_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_music");
				} else {
					returnList = XmlParse("english_japanese_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_mythology");
				} else {
					returnList = XmlParse("english_japanese_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_physics");
				} else {
					returnList = XmlParse("english_japanese_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_plane");
				} else {
					returnList = XmlParse("english_japanese_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_plant");
				} else {
					returnList = XmlParse("english_japanese_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_profession");
				} else {
					returnList = XmlParse("english_japanese_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_raptor");
				} else {
					returnList = XmlParse("english_japanese_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_reptile");
				} else {
					returnList = XmlParse("english_japanese_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_science");
				} else {
					returnList = XmlParse("english_japanese_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_sports");
				} else {
					returnList = XmlParse("english_japanese_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_tool");
				} else {
					returnList = XmlParse("english_japanese_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_tourism");
				} else {
					returnList = XmlParse("english_japanese_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_transport");
				} else {
					returnList = XmlParse("english_japanese_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_tree");
				} else {
					returnList = XmlParse("english_japanese_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_vehicle");
				} else {
					returnList = XmlParse("english_japanese_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_vegetable");
				} else {
					returnList = XmlParse("english_japanese_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_weapon");
				} else {
					returnList = XmlParse("english_japanese_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("japanese_weather");
				} else {
					returnList = XmlParse("english_japanese_weather");
				}
				break;
			default:
			}
			break;
		case 30:
			xrp = ctxt.getResources().getXml(R.xml.korean);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("korean_agriculture");
				} else {
					returnList = XmlParse("english_korean_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("korean_anatomy");
				} else {
					returnList = XmlParse("english_korean_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("korean_animal");
				} else {
					returnList = XmlParse("english_korean_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("korean_art");
				} else {
					returnList = XmlParse("english_korean_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("korean_astronomy");
				} else {
					returnList = XmlParse("english_korean_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("korean_bird");
				} else {
					returnList = XmlParse("english_korean_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("korean_boat");
				} else {
					returnList = XmlParse("english_korean_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("korean_building");
				} else {
					returnList = XmlParse("english_korean_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("korean_business");
				} else {
					returnList = XmlParse("english_korean_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("korean_car");
				} else {
					returnList = XmlParse("english_korean_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("korean_cat");
				} else {
					returnList = XmlParse("english_korean_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("korean_chemical_element");
				} else {
					returnList = XmlParse("english_korean_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("korean_chemical_compound");
				} else {
					returnList = XmlParse("english_korean_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("korean_city");
				} else {
					returnList = XmlParse("english_korean_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("korean_clothes");
				} else {
					returnList = XmlParse("english_korean_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("korean_computers");
				} else {
					returnList = XmlParse("english_korean_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("korean_container");
				} else {
					returnList = XmlParse("english_korean_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("korean_dog");
				} else {
					returnList = XmlParse("english_korean_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("korean_device");
				} else {
					returnList = XmlParse("english_korean_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("korean_drink");
				} else {
					returnList = XmlParse("english_korean_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("korean_electronics");
				} else {
					returnList = XmlParse("english_korean_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("korean_fish");
				} else {
					returnList = XmlParse("english_korean_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("korean_flower");
				} else {
					returnList = XmlParse("english_korean_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("korean_food");
				} else {
					returnList = XmlParse("english_korean_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("korean_fruit");
				} else {
					returnList = XmlParse("english_korean_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("korean_furniture");
				} else {
					returnList = XmlParse("english_korean_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("korean_geography");
				} else {
					returnList = XmlParse("english_korean_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("korean_geometry");
				} else {
					returnList = XmlParse("english_korean_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("korean_house");
				} else {
					returnList = XmlParse("english_korean_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("korean_insect");
				} else {
					returnList = XmlParse("english_korean_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("korean_jewelry");
				} else {
					returnList = XmlParse("english_korean_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("korean_kitchen");
				} else {
					returnList = XmlParse("english_korean_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("korean_material");
				} else {
					returnList = XmlParse("english_korean_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("korean_measuring_device");
				} else {
					returnList = XmlParse("english_korean_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("korean_metal");
				} else {
					returnList = XmlParse("english_korean_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("korean_military");
				} else {
					returnList = XmlParse("english_korean_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("korean_mineral");
				} else {
					returnList = XmlParse("english_korean_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("korean_music");
				} else {
					returnList = XmlParse("english_korean_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("korean_mythology");
				} else {
					returnList = XmlParse("english_korean_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("korean_physics");
				} else {
					returnList = XmlParse("english_korean_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("korean_plane");
				} else {
					returnList = XmlParse("english_korean_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("korean_plant");
				} else {
					returnList = XmlParse("english_korean_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("korean_profession");
				} else {
					returnList = XmlParse("english_korean_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("korean_raptor");
				} else {
					returnList = XmlParse("english_korean_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("korean_reptile");
				} else {
					returnList = XmlParse("english_korean_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("korean_science");
				} else {
					returnList = XmlParse("english_korean_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("korean_sports");
				} else {
					returnList = XmlParse("english_korean_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("korean_tool");
				} else {
					returnList = XmlParse("english_korean_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("korean_tourism");
				} else {
					returnList = XmlParse("english_korean_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("korean_transport");
				} else {
					returnList = XmlParse("english_korean_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("korean_tree");
				} else {
					returnList = XmlParse("english_korean_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("korean_vehicle");
				} else {
					returnList = XmlParse("english_korean_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("korean_vegetable");
				} else {
					returnList = XmlParse("english_korean_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("korean_weapon");
				} else {
					returnList = XmlParse("english_korean_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("korean_weather");
				} else {
					returnList = XmlParse("english_korean_weather");
				}
				break;
			default:
			}
			break;
		case 31:
			xrp = ctxt.getResources().getXml(R.xml.latin);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("latin_agriculture");
				} else {
					returnList = XmlParse("english_latin_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("latin_anatomy");
				} else {
					returnList = XmlParse("english_latin_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("latin_animal");
				} else {
					returnList = XmlParse("english_latin_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("latin_art");
				} else {
					returnList = XmlParse("english_latin_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("latin_astronomy");
				} else {
					returnList = XmlParse("english_latin_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("latin_bird");
				} else {
					returnList = XmlParse("english_latin_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("latin_boat");
				} else {
					returnList = XmlParse("english_latin_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("latin_building");
				} else {
					returnList = XmlParse("english_latin_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("latin_business");
				} else {
					returnList = XmlParse("english_latin_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("latin_car");
				} else {
					returnList = XmlParse("english_latin_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("latin_cat");
				} else {
					returnList = XmlParse("english_latin_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("latin_chemical_element");
				} else {
					returnList = XmlParse("english_latin_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("latin_chemical_compound");
				} else {
					returnList = XmlParse("english_latin_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("latin_city");
				} else {
					returnList = XmlParse("english_latin_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("latin_clothes");
				} else {
					returnList = XmlParse("english_latin_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("latin_computers");
				} else {
					returnList = XmlParse("english_latin_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("latin_container");
				} else {
					returnList = XmlParse("english_latin_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("latin_dog");
				} else {
					returnList = XmlParse("english_latin_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("latin_device");
				} else {
					returnList = XmlParse("english_latin_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("latin_drink");
				} else {
					returnList = XmlParse("english_latin_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("latin_electronics");
				} else {
					returnList = XmlParse("english_latin_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("latin_fish");
				} else {
					returnList = XmlParse("english_latin_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("latin_flower");
				} else {
					returnList = XmlParse("english_latin_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("latin_food");
				} else {
					returnList = XmlParse("english_latin_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("latin_fruit");
				} else {
					returnList = XmlParse("english_latin_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("latin_furniture");
				} else {
					returnList = XmlParse("english_latin_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("latin_geography");
				} else {
					returnList = XmlParse("english_latin_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("latin_geometry");
				} else {
					returnList = XmlParse("english_latin_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("latin_house");
				} else {
					returnList = XmlParse("english_latin_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("latin_insect");
				} else {
					returnList = XmlParse("english_latin_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("latin_jewelry");
				} else {
					returnList = XmlParse("english_latin_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("latin_kitchen");
				} else {
					returnList = XmlParse("english_latin_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("latin_material");
				} else {
					returnList = XmlParse("english_latin_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("latin_measuring_device");
				} else {
					returnList = XmlParse("english_latin_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("latin_metal");
				} else {
					returnList = XmlParse("english_latin_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("latin_military");
				} else {
					returnList = XmlParse("english_latin_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("latin_mineral");
				} else {
					returnList = XmlParse("english_latin_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("latin_music");
				} else {
					returnList = XmlParse("english_latin_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("latin_mythology");
				} else {
					returnList = XmlParse("english_latin_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("latin_physics");
				} else {
					returnList = XmlParse("english_latin_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("latin_plane");
				} else {
					returnList = XmlParse("english_latin_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("latin_plant");
				} else {
					returnList = XmlParse("english_latin_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("latin_profession");
				} else {
					returnList = XmlParse("english_latin_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("latin_raptor");
				} else {
					returnList = XmlParse("english_latin_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("latin_reptile");
				} else {
					returnList = XmlParse("english_latin_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("latin_science");
				} else {
					returnList = XmlParse("english_latin_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("latin_sports");
				} else {
					returnList = XmlParse("english_latin_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("latin_tool");
				} else {
					returnList = XmlParse("english_latin_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("latin_tourism");
				} else {
					returnList = XmlParse("english_latin_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("latin_transport");
				} else {
					returnList = XmlParse("english_latin_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("latin_tree");
				} else {
					returnList = XmlParse("english_latin_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("latin_vehicle");
				} else {
					returnList = XmlParse("english_latin_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("latin_vegetable");
				} else {
					returnList = XmlParse("english_latin_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("latin_weapon");
				} else {
					returnList = XmlParse("english_latin_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("latin_weather");
				} else {
					returnList = XmlParse("english_latin_weather");
				}
				break;
			default:
			}
			break;
		case 32:
			xrp = ctxt.getResources().getXml(R.xml.latvian);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_agriculture");
				} else {
					returnList = XmlParse("english_latvian_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_anatomy");
				} else {
					returnList = XmlParse("english_latvian_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_animal");
				} else {
					returnList = XmlParse("english_latvian_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_art");
				} else {
					returnList = XmlParse("english_latvian_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_astronomy");
				} else {
					returnList = XmlParse("english_latvian_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_bird");
				} else {
					returnList = XmlParse("english_latvian_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_boat");
				} else {
					returnList = XmlParse("english_latvian_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_building");
				} else {
					returnList = XmlParse("english_latvian_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_business");
				} else {
					returnList = XmlParse("english_latvian_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_car");
				} else {
					returnList = XmlParse("english_latvian_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_cat");
				} else {
					returnList = XmlParse("english_latvian_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_chemical_element");
				} else {
					returnList = XmlParse("english_latvian_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_chemical_compound");
				} else {
					returnList = XmlParse("english_latvian_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_city");
				} else {
					returnList = XmlParse("english_latvian_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_clothes");
				} else {
					returnList = XmlParse("english_latvian_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_computers");
				} else {
					returnList = XmlParse("english_latvian_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_container");
				} else {
					returnList = XmlParse("english_latvian_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_dog");
				} else {
					returnList = XmlParse("english_latvian_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_device");
				} else {
					returnList = XmlParse("english_latvian_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_drink");
				} else {
					returnList = XmlParse("english_latvian_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_electronics");
				} else {
					returnList = XmlParse("english_latvian_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_fish");
				} else {
					returnList = XmlParse("english_latvian_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_flower");
				} else {
					returnList = XmlParse("english_latvian_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_food");
				} else {
					returnList = XmlParse("english_latvian_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_fruit");
				} else {
					returnList = XmlParse("english_latvian_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_furniture");
				} else {
					returnList = XmlParse("english_latvian_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_geography");
				} else {
					returnList = XmlParse("english_latvian_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_geometry");
				} else {
					returnList = XmlParse("english_latvian_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_house");
				} else {
					returnList = XmlParse("english_latvian_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_insect");
				} else {
					returnList = XmlParse("english_latvian_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_jewelry");
				} else {
					returnList = XmlParse("english_latvian_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_kitchen");
				} else {
					returnList = XmlParse("english_latvian_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_material");
				} else {
					returnList = XmlParse("english_latvian_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_measuring_device");
				} else {
					returnList = XmlParse("english_latvian_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_metal");
				} else {
					returnList = XmlParse("english_latvian_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_military");
				} else {
					returnList = XmlParse("english_latvian_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_mineral");
				} else {
					returnList = XmlParse("english_latvian_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_music");
				} else {
					returnList = XmlParse("english_latvian_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_mythology");
				} else {
					returnList = XmlParse("english_latvian_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_physics");
				} else {
					returnList = XmlParse("english_latvian_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_plane");
				} else {
					returnList = XmlParse("english_latvian_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_plant");
				} else {
					returnList = XmlParse("english_latvian_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_profession");
				} else {
					returnList = XmlParse("english_latvian_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_raptor");
				} else {
					returnList = XmlParse("english_latvian_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_reptile");
				} else {
					returnList = XmlParse("english_latvian_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_science");
				} else {
					returnList = XmlParse("english_latvian_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_sports");
				} else {
					returnList = XmlParse("english_latvian_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_tool");
				} else {
					returnList = XmlParse("english_latvian_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_tourism");
				} else {
					returnList = XmlParse("english_latvian_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_transport");
				} else {
					returnList = XmlParse("english_latvian_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_tree");
				} else {
					returnList = XmlParse("english_latvian_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_vehicle");
				} else {
					returnList = XmlParse("english_latvian_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_vegetable");
				} else {
					returnList = XmlParse("english_latvian_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_weapon");
				} else {
					returnList = XmlParse("english_latvian_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("latvian_weather");
				} else {
					returnList = XmlParse("english_latvian_weather");
				}
				break;
			default:
			}
			break;
		case 33:
			xrp = ctxt.getResources().getXml(R.xml.lithuanian);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_agriculture");
				} else {
					returnList = XmlParse("english_lithuanian_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_anatomy");
				} else {
					returnList = XmlParse("english_lithuanian_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_animal");
				} else {
					returnList = XmlParse("english_lithuanian_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_art");
				} else {
					returnList = XmlParse("english_lithuanian_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_astronomy");
				} else {
					returnList = XmlParse("english_lithuanian_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_bird");
				} else {
					returnList = XmlParse("english_lithuanian_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_boat");
				} else {
					returnList = XmlParse("english_lithuanian_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_building");
				} else {
					returnList = XmlParse("english_lithuanian_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_business");
				} else {
					returnList = XmlParse("english_lithuanian_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_car");
				} else {
					returnList = XmlParse("english_lithuanian_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_cat");
				} else {
					returnList = XmlParse("english_lithuanian_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_chemical_element");
				} else {
					returnList = XmlParse("english_lithuanian_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_chemical_compound");
				} else {
					returnList = XmlParse("english_lithuanian_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_city");
				} else {
					returnList = XmlParse("english_lithuanian_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_clothes");
				} else {
					returnList = XmlParse("english_lithuanian_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_computers");
				} else {
					returnList = XmlParse("english_lithuanian_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_container");
				} else {
					returnList = XmlParse("english_lithuanian_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_dog");
				} else {
					returnList = XmlParse("english_lithuanian_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_device");
				} else {
					returnList = XmlParse("english_lithuanian_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_drink");
				} else {
					returnList = XmlParse("english_lithuanian_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_electronics");
				} else {
					returnList = XmlParse("english_lithuanian_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_fish");
				} else {
					returnList = XmlParse("english_lithuanian_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_flower");
				} else {
					returnList = XmlParse("english_lithuanian_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_food");
				} else {
					returnList = XmlParse("english_lithuanian_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_fruit");
				} else {
					returnList = XmlParse("english_lithuanian_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_furniture");
				} else {
					returnList = XmlParse("english_lithuanian_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_geography");
				} else {
					returnList = XmlParse("english_lithuanian_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_geometry");
				} else {
					returnList = XmlParse("english_lithuanian_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_house");
				} else {
					returnList = XmlParse("english_lithuanian_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_insect");
				} else {
					returnList = XmlParse("english_lithuanian_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_jewelry");
				} else {
					returnList = XmlParse("english_lithuanian_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_kitchen");
				} else {
					returnList = XmlParse("english_lithuanian_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_material");
				} else {
					returnList = XmlParse("english_lithuanian_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_measuring_device");
				} else {
					returnList = XmlParse("english_lithuanian_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_metal");
				} else {
					returnList = XmlParse("english_lithuanian_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_military");
				} else {
					returnList = XmlParse("english_lithuanian_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_mineral");
				} else {
					returnList = XmlParse("english_lithuanian_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_music");
				} else {
					returnList = XmlParse("english_lithuanian_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_mythology");
				} else {
					returnList = XmlParse("english_lithuanian_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_physics");
				} else {
					returnList = XmlParse("english_lithuanian_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_plane");
				} else {
					returnList = XmlParse("english_lithuanian_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_plant");
				} else {
					returnList = XmlParse("english_lithuanian_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_profession");
				} else {
					returnList = XmlParse("english_lithuanian_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_raptor");
				} else {
					returnList = XmlParse("english_lithuanian_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_reptile");
				} else {
					returnList = XmlParse("english_lithuanian_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_science");
				} else {
					returnList = XmlParse("english_lithuanian_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_sports");
				} else {
					returnList = XmlParse("english_lithuanian_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_tool");
				} else {
					returnList = XmlParse("english_lithuanian_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_tourism");
				} else {
					returnList = XmlParse("english_lithuanian_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_transport");
				} else {
					returnList = XmlParse("english_lithuanian_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_tree");
				} else {
					returnList = XmlParse("english_lithuanian_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_vehicle");
				} else {
					returnList = XmlParse("english_lithuanian_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_vegetable");
				} else {
					returnList = XmlParse("english_lithuanian_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_weapon");
				} else {
					returnList = XmlParse("english_lithuanian_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("lithuanian_weather");
				} else {
					returnList = XmlParse("english_lithuanian_weather");
				}
				break;
			default:
			}
			break;
		case 34:
			xrp = ctxt.getResources().getXml(R.xml.macedonian);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_agriculture");
				} else {
					returnList = XmlParse("english_macedonian_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_anatomy");
				} else {
					returnList = XmlParse("english_macedonian_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_animal");
				} else {
					returnList = XmlParse("english_macedonian_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_art");
				} else {
					returnList = XmlParse("english_macedonian_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_astronomy");
				} else {
					returnList = XmlParse("english_macedonian_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_bird");
				} else {
					returnList = XmlParse("english_macedonian_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_boat");
				} else {
					returnList = XmlParse("english_macedonian_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_building");
				} else {
					returnList = XmlParse("english_macedonian_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_business");
				} else {
					returnList = XmlParse("english_macedonian_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_car");
				} else {
					returnList = XmlParse("english_macedonian_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_cat");
				} else {
					returnList = XmlParse("english_macedonian_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_chemical_element");
				} else {
					returnList = XmlParse("english_macedonian_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_chemical_compound");
				} else {
					returnList = XmlParse("english_macedonian_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_city");
				} else {
					returnList = XmlParse("english_macedonian_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_clothes");
				} else {
					returnList = XmlParse("english_macedonian_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_computers");
				} else {
					returnList = XmlParse("english_macedonian_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_container");
				} else {
					returnList = XmlParse("english_macedonian_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_dog");
				} else {
					returnList = XmlParse("english_macedonian_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_device");
				} else {
					returnList = XmlParse("english_macedonian_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_drink");
				} else {
					returnList = XmlParse("english_macedonian_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_electronics");
				} else {
					returnList = XmlParse("english_macedonian_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_fish");
				} else {
					returnList = XmlParse("english_macedonian_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_flower");
				} else {
					returnList = XmlParse("english_macedonian_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_food");
				} else {
					returnList = XmlParse("english_macedonian_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_fruit");
				} else {
					returnList = XmlParse("english_macedonian_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_furniture");
				} else {
					returnList = XmlParse("english_macedonian_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_geography");
				} else {
					returnList = XmlParse("english_macedonian_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_geometry");
				} else {
					returnList = XmlParse("english_macedonian_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_house");
				} else {
					returnList = XmlParse("english_macedonian_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_insect");
				} else {
					returnList = XmlParse("english_macedonian_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_jewelry");
				} else {
					returnList = XmlParse("english_macedonian_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_kitchen");
				} else {
					returnList = XmlParse("english_macedonian_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_material");
				} else {
					returnList = XmlParse("english_macedonian_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_measuring_device");
				} else {
					returnList = XmlParse("english_macedonian_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_metal");
				} else {
					returnList = XmlParse("english_macedonian_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_military");
				} else {
					returnList = XmlParse("english_macedonian_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_mineral");
				} else {
					returnList = XmlParse("english_macedonian_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_music");
				} else {
					returnList = XmlParse("english_macedonian_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_mythology");
				} else {
					returnList = XmlParse("english_macedonian_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_physics");
				} else {
					returnList = XmlParse("english_macedonian_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_plane");
				} else {
					returnList = XmlParse("english_macedonian_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_plant");
				} else {
					returnList = XmlParse("english_macedonian_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_profession");
				} else {
					returnList = XmlParse("english_macedonian_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_raptor");
				} else {
					returnList = XmlParse("english_macedonian_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_reptile");
				} else {
					returnList = XmlParse("english_macedonian_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_science");
				} else {
					returnList = XmlParse("english_macedonian_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_sports");
				} else {
					returnList = XmlParse("english_macedonian_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_tool");
				} else {
					returnList = XmlParse("english_macedonian_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_tourism");
				} else {
					returnList = XmlParse("english_macedonian_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_transport");
				} else {
					returnList = XmlParse("english_macedonian_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_tree");
				} else {
					returnList = XmlParse("english_macedonian_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_vehicle");
				} else {
					returnList = XmlParse("english_macedonian_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_vegetable");
				} else {
					returnList = XmlParse("english_macedonian_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_weapon");
				} else {
					returnList = XmlParse("english_macedonian_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("macedonian_weather");
				} else {
					returnList = XmlParse("english_macedonian_weather");
				}
				break;
			default:
			}
			break;
		case 35:
			xrp = ctxt.getResources().getXml(R.xml.malay);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("malay_agriculture");
				} else {
					returnList = XmlParse("english_malay_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("malay_anatomy");
				} else {
					returnList = XmlParse("english_malay_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("malay_animal");
				} else {
					returnList = XmlParse("english_malay_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("malay_art");
				} else {
					returnList = XmlParse("english_malay_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("malay_astronomy");
				} else {
					returnList = XmlParse("english_malay_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("malay_bird");
				} else {
					returnList = XmlParse("english_malay_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("malay_boat");
				} else {
					returnList = XmlParse("english_malay_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("malay_building");
				} else {
					returnList = XmlParse("english_malay_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("malay_business");
				} else {
					returnList = XmlParse("english_malay_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("malay_car");
				} else {
					returnList = XmlParse("english_malay_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("malay_cat");
				} else {
					returnList = XmlParse("english_malay_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("malay_chemical_element");
				} else {
					returnList = XmlParse("english_malay_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("malay_chemical_compound");
				} else {
					returnList = XmlParse("english_malay_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("malay_city");
				} else {
					returnList = XmlParse("english_malay_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("malay_clothes");
				} else {
					returnList = XmlParse("english_malay_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("malay_computers");
				} else {
					returnList = XmlParse("english_malay_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("malay_container");
				} else {
					returnList = XmlParse("english_malay_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("malay_dog");
				} else {
					returnList = XmlParse("english_malay_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("malay_device");
				} else {
					returnList = XmlParse("english_malay_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("malay_drink");
				} else {
					returnList = XmlParse("english_malay_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("malay_electronics");
				} else {
					returnList = XmlParse("english_malay_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("malay_fish");
				} else {
					returnList = XmlParse("english_malay_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("malay_flower");
				} else {
					returnList = XmlParse("english_malay_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("malay_food");
				} else {
					returnList = XmlParse("english_malay_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("malay_fruit");
				} else {
					returnList = XmlParse("english_malay_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("malay_furniture");
				} else {
					returnList = XmlParse("english_malay_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("malay_geography");
				} else {
					returnList = XmlParse("english_malay_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("malay_geometry");
				} else {
					returnList = XmlParse("english_malay_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("malay_house");
				} else {
					returnList = XmlParse("english_malay_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("malay_insect");
				} else {
					returnList = XmlParse("english_malay_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("malay_jewelry");
				} else {
					returnList = XmlParse("english_malay_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("malay_kitchen");
				} else {
					returnList = XmlParse("english_malay_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("malay_material");
				} else {
					returnList = XmlParse("english_malay_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("malay_measuring_device");
				} else {
					returnList = XmlParse("english_malay_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("malay_metal");
				} else {
					returnList = XmlParse("english_malay_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("malay_military");
				} else {
					returnList = XmlParse("english_malay_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("malay_mineral");
				} else {
					returnList = XmlParse("english_malay_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("malay_music");
				} else {
					returnList = XmlParse("english_malay_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("malay_mythology");
				} else {
					returnList = XmlParse("english_malay_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("malay_physics");
				} else {
					returnList = XmlParse("english_malay_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("malay_plane");
				} else {
					returnList = XmlParse("english_malay_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("malay_plant");
				} else {
					returnList = XmlParse("english_malay_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("malay_profession");
				} else {
					returnList = XmlParse("english_malay_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("malay_raptor");
				} else {
					returnList = XmlParse("english_malay_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("malay_reptile");
				} else {
					returnList = XmlParse("english_malay_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("malay_science");
				} else {
					returnList = XmlParse("english_malay_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("malay_sports");
				} else {
					returnList = XmlParse("english_malay_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("malay_tool");
				} else {
					returnList = XmlParse("english_malay_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("malay_tourism");
				} else {
					returnList = XmlParse("english_malay_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("malay_transport");
				} else {
					returnList = XmlParse("english_malay_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("malay_tree");
				} else {
					returnList = XmlParse("english_malay_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("malay_vehicle");
				} else {
					returnList = XmlParse("english_malay_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("malay_vegetable");
				} else {
					returnList = XmlParse("english_malay_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("malay_weapon");
				} else {
					returnList = XmlParse("english_malay_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("malay_weather");
				} else {
					returnList = XmlParse("english_malay_weather");
				}
				break;
			default:
			}
			break;
		case 36:
			xrp = ctxt.getResources().getXml(R.xml.maltese);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_agriculture");
				} else {
					returnList = XmlParse("english_maltese_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_anatomy");
				} else {
					returnList = XmlParse("english_maltese_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_animal");
				} else {
					returnList = XmlParse("english_maltese_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_art");
				} else {
					returnList = XmlParse("english_maltese_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_astronomy");
				} else {
					returnList = XmlParse("english_maltese_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_bird");
				} else {
					returnList = XmlParse("english_maltese_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_boat");
				} else {
					returnList = XmlParse("english_maltese_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_building");
				} else {
					returnList = XmlParse("english_maltese_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_business");
				} else {
					returnList = XmlParse("english_maltese_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_car");
				} else {
					returnList = XmlParse("english_maltese_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_cat");
				} else {
					returnList = XmlParse("english_maltese_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_chemical_element");
				} else {
					returnList = XmlParse("english_maltese_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_chemical_compound");
				} else {
					returnList = XmlParse("english_maltese_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_city");
				} else {
					returnList = XmlParse("english_maltese_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_clothes");
				} else {
					returnList = XmlParse("english_maltese_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_computers");
				} else {
					returnList = XmlParse("english_maltese_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_container");
				} else {
					returnList = XmlParse("english_maltese_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_dog");
				} else {
					returnList = XmlParse("english_maltese_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_device");
				} else {
					returnList = XmlParse("english_maltese_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_drink");
				} else {
					returnList = XmlParse("english_maltese_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_electronics");
				} else {
					returnList = XmlParse("english_maltese_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_fish");
				} else {
					returnList = XmlParse("english_maltese_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_flower");
				} else {
					returnList = XmlParse("english_maltese_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_food");
				} else {
					returnList = XmlParse("english_maltese_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_fruit");
				} else {
					returnList = XmlParse("english_maltese_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_furniture");
				} else {
					returnList = XmlParse("english_maltese_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_geography");
				} else {
					returnList = XmlParse("english_maltese_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_geometry");
				} else {
					returnList = XmlParse("english_maltese_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_house");
				} else {
					returnList = XmlParse("english_maltese_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_insect");
				} else {
					returnList = XmlParse("english_maltese_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_jewelry");
				} else {
					returnList = XmlParse("english_maltese_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_kitchen");
				} else {
					returnList = XmlParse("english_maltese_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_material");
				} else {
					returnList = XmlParse("english_maltese_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_measuring_device");
				} else {
					returnList = XmlParse("english_maltese_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_metal");
				} else {
					returnList = XmlParse("english_maltese_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_military");
				} else {
					returnList = XmlParse("english_maltese_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_mineral");
				} else {
					returnList = XmlParse("english_maltese_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_music");
				} else {
					returnList = XmlParse("english_maltese_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_mythology");
				} else {
					returnList = XmlParse("english_maltese_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_physics");
				} else {
					returnList = XmlParse("english_maltese_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_plane");
				} else {
					returnList = XmlParse("english_maltese_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_plant");
				} else {
					returnList = XmlParse("english_maltese_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_profession");
				} else {
					returnList = XmlParse("english_maltese_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_raptor");
				} else {
					returnList = XmlParse("english_maltese_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_reptile");
				} else {
					returnList = XmlParse("english_maltese_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_science");
				} else {
					returnList = XmlParse("english_maltese_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_sports");
				} else {
					returnList = XmlParse("english_maltese_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_tool");
				} else {
					returnList = XmlParse("english_maltese_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_tourism");
				} else {
					returnList = XmlParse("english_maltese_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_transport");
				} else {
					returnList = XmlParse("english_maltese_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_tree");
				} else {
					returnList = XmlParse("english_maltese_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_vehicle");
				} else {
					returnList = XmlParse("english_maltese_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_vegetable");
				} else {
					returnList = XmlParse("english_maltese_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_weapon");
				} else {
					returnList = XmlParse("english_maltese_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("maltese_weather");
				} else {
					returnList = XmlParse("english_maltese_weather");
				}
				break;
			default:
			}
			break;
		/**
		 * case 37: xrp = ctxt.getResources().getXml(R.xml.norwegian); switch
		 * (catPosition) { case 0: if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_agriculture"); } else { returnList =
		 * XmlParse("english_norwegian_agriculture"); } break; case 1: if
		 * (engBoolean == false) { returnList = XmlParse("norwegian_anatomy"); }
		 * else { returnList = XmlParse("english_norwegian_anatomy"); } break;
		 * case 2: if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_animal"); } else { returnList =
		 * XmlParse("english_norwegian_animal"); } break; case 3: if (engBoolean
		 * == false) { returnList = XmlParse("norwegian_art"); } else {
		 * returnList = XmlParse("english_norwegian_art"); } break; case 4: if
		 * (engBoolean == false) { returnList = XmlParse("norwegian_astronomy");
		 * } else { returnList = XmlParse("english_norwegian_astronomy"); }
		 * break; case 5: if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_bird"); } else { returnList =
		 * XmlParse("english_norwegian_bird"); } break; case 6: if (engBoolean
		 * == false) { returnList = XmlParse("norwegian_boat"); } else {
		 * returnList = XmlParse("english_norwegian_boat"); } break; case 7: if
		 * (engBoolean == false) { returnList = XmlParse("norwegian_building");
		 * } else { returnList = XmlParse("english_norwegian_building"); }
		 * break; case 8: if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_business"); } else { returnList =
		 * XmlParse("english_norwegian_business"); } break; case 9: if
		 * (engBoolean == false) { returnList = XmlParse("norwegian_car"); }
		 * else { returnList = XmlParse("english_norwegian_car"); } break; case
		 * 10: if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_cat"); } else { returnList =
		 * XmlParse("english_norwegian_cat"); } break; case 11: if (engBoolean
		 * == false) { returnList = XmlParse("norwegian_chemical_element"); }
		 * else { returnList = XmlParse("english_norwegian_chemical_element"); }
		 * break; case 12: if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_chemical_compound"); } else { returnList =
		 * XmlParse("english_norwegian_chemical_compound"); } break; case 13: if
		 * (engBoolean == false) { returnList = XmlParse("norwegian_city"); }
		 * else { returnList = XmlParse("english_norwegian_city"); } break; case
		 * 14: if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_clothes"); } else { returnList =
		 * XmlParse("english_norwegian_clothes"); } break; case 15: if
		 * (engBoolean == false) { returnList = XmlParse("norwegian_computers");
		 * } else { returnList = XmlParse("english_norwegian_computers"); }
		 * break; case 16: if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_container"); } else { returnList =
		 * XmlParse("english_norwegian_container"); } break; case 17: if
		 * (engBoolean == false) { returnList = XmlParse("norwegian_dog"); }
		 * else { returnList = XmlParse("english_norwegian_dog"); } break; case
		 * 18: if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_device"); } else { returnList =
		 * XmlParse("english_norwegian_device"); } break; case 19: if
		 * (engBoolean == false) { returnList = XmlParse("norwegian_drink"); }
		 * else { returnList = XmlParse("english_norwegian_drink"); } break;
		 * case 20: if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_electronics"); } else { returnList =
		 * XmlParse("english_norwegian_electronics"); } break; case 21: if
		 * (engBoolean == false) { returnList = XmlParse("norwegian_fish"); }
		 * else { returnList = XmlParse("english_norwegian_fish"); } break; case
		 * 22: if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_flower"); } else { returnList =
		 * XmlParse("english_norwegian_flower"); } break; case 23: if
		 * (engBoolean == false) { returnList = XmlParse("norwegian_food"); }
		 * else { returnList = XmlParse("english_norwegian_food"); } break; case
		 * 24: if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_fruit"); } else { returnList =
		 * XmlParse("english_norwegian_fruit"); } break; case 25: if (engBoolean
		 * == false) { returnList = XmlParse("norwegian_furniture"); } else {
		 * returnList = XmlParse("english_norwegian_furniture"); } break; case
		 * 26: if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_geography"); } else { returnList =
		 * XmlParse("english_norwegian_geography"); } break; case 27: if
		 * (engBoolean == false) { returnList = XmlParse("norwegian_geometry");
		 * } else { returnList = XmlParse("english_norwegian_geometry"); }
		 * break; case 28: if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_house"); } else { returnList =
		 * XmlParse("english_norwegian_house"); } break; case 29: if (engBoolean
		 * == false) { returnList = XmlParse("norwegian_insect"); } else {
		 * returnList = XmlParse("english_norwegian_insect"); } break; case 30:
		 * if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_jewelry"); } else { returnList =
		 * XmlParse("english_norwegian_jewelry"); } break; case 31: if
		 * (engBoolean == false) { returnList = XmlParse("norwegian_kitchen"); }
		 * else { returnList = XmlParse("english_norwegian_kitchen"); } break;
		 * case 32: if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_material"); } else { returnList =
		 * XmlParse("english_norwegian_material"); } break; case 33: if
		 * (engBoolean == false) { returnList =
		 * XmlParse("norwegian_measuring_device"); } else { returnList =
		 * XmlParse("english_norwegian_measuring_device"); } break; case 34: if
		 * (engBoolean == false) { returnList = XmlParse("norwegian_metal"); }
		 * else { returnList = XmlParse("english_norwegian_metal"); } break;
		 * case 35: if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_military"); } else { returnList =
		 * XmlParse("english_norwegian_military"); } break; case 36: if
		 * (engBoolean == false) { returnList = XmlParse("norwegian_mineral"); }
		 * else { returnList = XmlParse("english_norwegian_mineral"); } break;
		 * case 37: if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_music"); } else { returnList =
		 * XmlParse("english_norwegian_music"); } break; case 38: if (engBoolean
		 * == false) { returnList = XmlParse("norwegian_mythology"); } else {
		 * returnList = XmlParse("english_norwegian_mythology"); } break; case
		 * 39: if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_physics"); } else { returnList =
		 * XmlParse("english_norwegian_physics"); } break; case 40: if
		 * (engBoolean == false) { returnList = XmlParse("norwegian_plane"); }
		 * else { returnList = XmlParse("english_norwegian_plane"); } break;
		 * case 41: if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_plant"); } else { returnList =
		 * XmlParse("english_norwegian_plant"); } break; case 42: if (engBoolean
		 * == false) { returnList = XmlParse("norwegian_profession"); } else {
		 * returnList = XmlParse("english_norwegian_profession"); } break; case
		 * 43: if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_raptor"); } else { returnList =
		 * XmlParse("english_norwegian_raptor"); } break; case 44: if
		 * (engBoolean == false) { returnList = XmlParse("norwegian_reptile"); }
		 * else { returnList = XmlParse("english_norwegian_reptile"); } break;
		 * case 45: if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_science"); } else { returnList =
		 * XmlParse("english_norwegian_science"); } break; case 46: if
		 * (engBoolean == false) { returnList = XmlParse("norwegian_sports"); }
		 * else { returnList = XmlParse("english_norwegian_sports"); } break;
		 * case 47: if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_tool"); } else { returnList =
		 * XmlParse("english_norwegian_tool"); } break; case 48: if (engBoolean
		 * == false) { returnList = XmlParse("norwegian_tourism"); } else {
		 * returnList = XmlParse("english_norwegian_tourism"); } break; case 49:
		 * if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_transport"); } else { returnList =
		 * XmlParse("english_norwegian_transport"); } break; case 50: if
		 * (engBoolean == false) { returnList = XmlParse("norwegian_tree"); }
		 * else { returnList = XmlParse("english_norwegian_tree"); } break; case
		 * 51: if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_vehicle"); } else { returnList =
		 * XmlParse("english_norwegian_vehicle"); } break; case 52: if
		 * (engBoolean == false) { returnList = XmlParse("norwegian_vegetable");
		 * } else { returnList = XmlParse("english_norwegian_vegetable"); }
		 * break; case 53: if (engBoolean == false) { returnList =
		 * XmlParse("norwegian_weapon"); } else { returnList =
		 * XmlParse("english_norwegian_weapon"); } break; case 54: if
		 * (engBoolean == false) { returnList = XmlParse("norwegian_weather"); }
		 * else { returnList = XmlParse("english_norwegian_weather"); } break;
		 * default: } break;
		 **/
		case 38:
			xrp = ctxt.getResources().getXml(R.xml.persian);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("persian_agriculture");
				} else {
					returnList = XmlParse("english_persian_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("persian_anatomy");
				} else {
					returnList = XmlParse("english_persian_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("persian_animal");
				} else {
					returnList = XmlParse("english_persian_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("persian_art");
				} else {
					returnList = XmlParse("english_persian_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("persian_astronomy");
				} else {
					returnList = XmlParse("english_persian_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("persian_bird");
				} else {
					returnList = XmlParse("english_persian_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("persian_boat");
				} else {
					returnList = XmlParse("english_persian_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("persian_building");
				} else {
					returnList = XmlParse("english_persian_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("persian_business");
				} else {
					returnList = XmlParse("english_persian_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("persian_car");
				} else {
					returnList = XmlParse("english_persian_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("persian_cat");
				} else {
					returnList = XmlParse("english_persian_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("persian_chemical_element");
				} else {
					returnList = XmlParse("english_persian_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("persian_chemical_compound");
				} else {
					returnList = XmlParse("english_persian_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("persian_city");
				} else {
					returnList = XmlParse("english_persian_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("persian_clothes");
				} else {
					returnList = XmlParse("english_persian_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("persian_computers");
				} else {
					returnList = XmlParse("english_persian_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("persian_container");
				} else {
					returnList = XmlParse("english_persian_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("persian_dog");
				} else {
					returnList = XmlParse("english_persian_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("persian_device");
				} else {
					returnList = XmlParse("english_persian_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("persian_drink");
				} else {
					returnList = XmlParse("english_persian_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("persian_electronics");
				} else {
					returnList = XmlParse("english_persian_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("persian_fish");
				} else {
					returnList = XmlParse("english_persian_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("persian_flower");
				} else {
					returnList = XmlParse("english_persian_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("persian_food");
				} else {
					returnList = XmlParse("english_persian_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("persian_fruit");
				} else {
					returnList = XmlParse("english_persian_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("persian_furniture");
				} else {
					returnList = XmlParse("english_persian_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("persian_geography");
				} else {
					returnList = XmlParse("english_persian_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("persian_geometry");
				} else {
					returnList = XmlParse("english_persian_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("persian_house");
				} else {
					returnList = XmlParse("english_persian_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("persian_insect");
				} else {
					returnList = XmlParse("english_persian_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("persian_jewelry");
				} else {
					returnList = XmlParse("english_persian_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("persian_kitchen");
				} else {
					returnList = XmlParse("english_persian_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("persian_material");
				} else {
					returnList = XmlParse("english_persian_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("persian_measuring_device");
				} else {
					returnList = XmlParse("english_persian_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("persian_metal");
				} else {
					returnList = XmlParse("english_persian_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("persian_military");
				} else {
					returnList = XmlParse("english_persian_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("persian_mineral");
				} else {
					returnList = XmlParse("english_persian_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("persian_music");
				} else {
					returnList = XmlParse("english_persian_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("persian_mythology");
				} else {
					returnList = XmlParse("english_persian_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("persian_physics");
				} else {
					returnList = XmlParse("english_persian_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("persian_plane");
				} else {
					returnList = XmlParse("english_persian_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("persian_plant");
				} else {
					returnList = XmlParse("english_persian_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("persian_profession");
				} else {
					returnList = XmlParse("english_persian_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("persian_raptor");
				} else {
					returnList = XmlParse("english_persian_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("persian_reptile");
				} else {
					returnList = XmlParse("english_persian_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("persian_science");
				} else {
					returnList = XmlParse("english_persian_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("persian_sports");
				} else {
					returnList = XmlParse("english_persian_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("persian_tool");
				} else {
					returnList = XmlParse("english_persian_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("persian_tourism");
				} else {
					returnList = XmlParse("english_persian_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("persian_transport");
				} else {
					returnList = XmlParse("english_persian_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("persian_tree");
				} else {
					returnList = XmlParse("english_persian_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("persian_vehicle");
				} else {
					returnList = XmlParse("english_persian_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("persian_vegetable");
				} else {
					returnList = XmlParse("english_persian_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("persian_weapon");
				} else {
					returnList = XmlParse("english_persian_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("persian_weather");
				} else {
					returnList = XmlParse("english_persian_weather");
				}
				break;
			default:
			}
			break;
		case 39:
			xrp = ctxt.getResources().getXml(R.xml.polish);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("polish_agriculture");
				} else {
					returnList = XmlParse("english_polish_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("polish_anatomy");
				} else {
					returnList = XmlParse("english_polish_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("polish_animal");
				} else {
					returnList = XmlParse("english_polish_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("polish_art");
				} else {
					returnList = XmlParse("english_polish_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("polish_astronomy");
				} else {
					returnList = XmlParse("english_polish_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("polish_bird");
				} else {
					returnList = XmlParse("english_polish_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("polish_boat");
				} else {
					returnList = XmlParse("english_polish_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("polish_building");
				} else {
					returnList = XmlParse("english_polish_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("polish_business");
				} else {
					returnList = XmlParse("english_polish_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("polish_car");
				} else {
					returnList = XmlParse("english_polish_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("polish_cat");
				} else {
					returnList = XmlParse("english_polish_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("polish_chemical_element");
				} else {
					returnList = XmlParse("english_polish_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("polish_chemical_compound");
				} else {
					returnList = XmlParse("english_polish_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("polish_city");
				} else {
					returnList = XmlParse("english_polish_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("polish_clothes");
				} else {
					returnList = XmlParse("english_polish_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("polish_computers");
				} else {
					returnList = XmlParse("english_polish_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("polish_container");
				} else {
					returnList = XmlParse("english_polish_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("polish_dog");
				} else {
					returnList = XmlParse("english_polish_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("polish_device");
				} else {
					returnList = XmlParse("english_polish_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("polish_drink");
				} else {
					returnList = XmlParse("english_polish_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("polish_electronics");
				} else {
					returnList = XmlParse("english_polish_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("polish_fish");
				} else {
					returnList = XmlParse("english_polish_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("polish_flower");
				} else {
					returnList = XmlParse("english_polish_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("polish_food");
				} else {
					returnList = XmlParse("english_polish_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("polish_fruit");
				} else {
					returnList = XmlParse("english_polish_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("polish_furniture");
				} else {
					returnList = XmlParse("english_polish_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("polish_geography");
				} else {
					returnList = XmlParse("english_polish_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("polish_geometry");
				} else {
					returnList = XmlParse("english_polish_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("polish_house");
				} else {
					returnList = XmlParse("english_polish_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("polish_insect");
				} else {
					returnList = XmlParse("english_polish_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("polish_jewelry");
				} else {
					returnList = XmlParse("english_polish_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("polish_kitchen");
				} else {
					returnList = XmlParse("english_polish_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("polish_material");
				} else {
					returnList = XmlParse("english_polish_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("polish_measuring_device");
				} else {
					returnList = XmlParse("english_polish_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("polish_metal");
				} else {
					returnList = XmlParse("english_polish_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("polish_military");
				} else {
					returnList = XmlParse("english_polish_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("polish_mineral");
				} else {
					returnList = XmlParse("english_polish_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("polish_music");
				} else {
					returnList = XmlParse("english_polish_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("polish_mythology");
				} else {
					returnList = XmlParse("english_polish_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("polish_physics");
				} else {
					returnList = XmlParse("english_polish_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("polish_plane");
				} else {
					returnList = XmlParse("english_polish_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("polish_plant");
				} else {
					returnList = XmlParse("english_polish_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("polish_profession");
				} else {
					returnList = XmlParse("english_polish_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("polish_raptor");
				} else {
					returnList = XmlParse("english_polish_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("polish_reptile");
				} else {
					returnList = XmlParse("english_polish_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("polish_science");
				} else {
					returnList = XmlParse("english_polish_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("polish_sports");
				} else {
					returnList = XmlParse("english_polish_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("polish_tool");
				} else {
					returnList = XmlParse("english_polish_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("polish_tourism");
				} else {
					returnList = XmlParse("english_polish_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("polish_transport");
				} else {
					returnList = XmlParse("english_polish_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("polish_tree");
				} else {
					returnList = XmlParse("english_polish_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("polish_vehicle");
				} else {
					returnList = XmlParse("english_polish_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("polish_vegetable");
				} else {
					returnList = XmlParse("english_polish_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("polish_weapon");
				} else {
					returnList = XmlParse("english_polish_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("polish_weather");
				} else {
					returnList = XmlParse("english_polish_weather");
				}
				break;
			default:
			}
			break;
		case 40:
			xrp = ctxt.getResources().getXml(R.xml.portuguese);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_agriculture");
				} else {
					returnList = XmlParse("english_portuguese_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_anatomy");
				} else {
					returnList = XmlParse("english_portuguese_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_animal");
				} else {
					returnList = XmlParse("english_portuguese_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_art");
				} else {
					returnList = XmlParse("english_portuguese_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_astronomy");
				} else {
					returnList = XmlParse("english_portuguese_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_bird");
				} else {
					returnList = XmlParse("english_portuguese_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_boat");
				} else {
					returnList = XmlParse("english_portuguese_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_building");
				} else {
					returnList = XmlParse("english_portuguese_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_business");
				} else {
					returnList = XmlParse("english_portuguese_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_car");
				} else {
					returnList = XmlParse("english_portuguese_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_cat");
				} else {
					returnList = XmlParse("english_portuguese_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_chemical_element");
				} else {
					returnList = XmlParse("english_portuguese_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_chemical_compound");
				} else {
					returnList = XmlParse("english_portuguese_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_city");
				} else {
					returnList = XmlParse("english_portuguese_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_clothes");
				} else {
					returnList = XmlParse("english_portuguese_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_computers");
				} else {
					returnList = XmlParse("english_portuguese_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_container");
				} else {
					returnList = XmlParse("english_portuguese_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_dog");
				} else {
					returnList = XmlParse("english_portuguese_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_device");
				} else {
					returnList = XmlParse("english_portuguese_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_drink");
				} else {
					returnList = XmlParse("english_portuguese_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_electronics");
				} else {
					returnList = XmlParse("english_portuguese_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_fish");
				} else {
					returnList = XmlParse("english_portuguese_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_flower");
				} else {
					returnList = XmlParse("english_portuguese_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_food");
				} else {
					returnList = XmlParse("english_portuguese_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_fruit");
				} else {
					returnList = XmlParse("english_portuguese_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_furniture");
				} else {
					returnList = XmlParse("english_portuguese_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_geography");
				} else {
					returnList = XmlParse("english_portuguese_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_geometry");
				} else {
					returnList = XmlParse("english_portuguese_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_house");
				} else {
					returnList = XmlParse("english_portuguese_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_insect");
				} else {
					returnList = XmlParse("english_portuguese_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_jewelry");
				} else {
					returnList = XmlParse("english_portuguese_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_kitchen");
				} else {
					returnList = XmlParse("english_portuguese_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_material");
				} else {
					returnList = XmlParse("english_portuguese_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_measuring_device");
				} else {
					returnList = XmlParse("english_portuguese_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_metal");
				} else {
					returnList = XmlParse("english_portuguese_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_military");
				} else {
					returnList = XmlParse("english_portuguese_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_mineral");
				} else {
					returnList = XmlParse("english_portuguese_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_music");
				} else {
					returnList = XmlParse("english_portuguese_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_mythology");
				} else {
					returnList = XmlParse("english_portuguese_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_physics");
				} else {
					returnList = XmlParse("english_portuguese_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_plane");
				} else {
					returnList = XmlParse("english_portuguese_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_plant");
				} else {
					returnList = XmlParse("english_portuguese_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_profession");
				} else {
					returnList = XmlParse("english_portuguese_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_raptor");
				} else {
					returnList = XmlParse("english_portuguese_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_reptile");
				} else {
					returnList = XmlParse("english_portuguese_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_science");
				} else {
					returnList = XmlParse("english_portuguese_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_sports");
				} else {
					returnList = XmlParse("english_portuguese_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_tool");
				} else {
					returnList = XmlParse("english_portuguese_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_tourism");
				} else {
					returnList = XmlParse("english_portuguese_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_transport");
				} else {
					returnList = XmlParse("english_portuguese_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_tree");
				} else {
					returnList = XmlParse("english_portuguese_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_vehicle");
				} else {
					returnList = XmlParse("english_portuguese_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_vegetable");
				} else {
					returnList = XmlParse("english_portuguese_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_weapon");
				} else {
					returnList = XmlParse("english_portuguese_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("portuguese_weather");
				} else {
					returnList = XmlParse("english_portuguese_weather");
				}
				break;
			default:
			}
			break;
		case 41:
			xrp = ctxt.getResources().getXml(R.xml.romanian);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_agriculture");
				} else {
					returnList = XmlParse("english_romanian_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_anatomy");
				} else {
					returnList = XmlParse("english_romanian_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_animal");
				} else {
					returnList = XmlParse("english_romanian_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_art");
				} else {
					returnList = XmlParse("english_romanian_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_astronomy");
				} else {
					returnList = XmlParse("english_romanian_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_bird");
				} else {
					returnList = XmlParse("english_romanian_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_boat");
				} else {
					returnList = XmlParse("english_romanian_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_building");
				} else {
					returnList = XmlParse("english_romanian_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_business");
				} else {
					returnList = XmlParse("english_romanian_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_car");
				} else {
					returnList = XmlParse("english_romanian_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_cat");
				} else {
					returnList = XmlParse("english_romanian_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_chemical_element");
				} else {
					returnList = XmlParse("english_romanian_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_chemical_compound");
				} else {
					returnList = XmlParse("english_romanian_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_city");
				} else {
					returnList = XmlParse("english_romanian_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_clothes");
				} else {
					returnList = XmlParse("english_romanian_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_computers");
				} else {
					returnList = XmlParse("english_romanian_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_container");
				} else {
					returnList = XmlParse("english_romanian_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_dog");
				} else {
					returnList = XmlParse("english_romanian_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_device");
				} else {
					returnList = XmlParse("english_romanian_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_drink");
				} else {
					returnList = XmlParse("english_romanian_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_electronics");
				} else {
					returnList = XmlParse("english_romanian_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_fish");
				} else {
					returnList = XmlParse("english_romanian_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_flower");
				} else {
					returnList = XmlParse("english_romanian_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_food");
				} else {
					returnList = XmlParse("english_romanian_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_fruit");
				} else {
					returnList = XmlParse("english_romanian_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_furniture");
				} else {
					returnList = XmlParse("english_romanian_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_geography");
				} else {
					returnList = XmlParse("english_romanian_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_geometry");
				} else {
					returnList = XmlParse("english_romanian_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_house");
				} else {
					returnList = XmlParse("english_romanian_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_insect");
				} else {
					returnList = XmlParse("english_romanian_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_jewelry");
				} else {
					returnList = XmlParse("english_romanian_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_kitchen");
				} else {
					returnList = XmlParse("english_romanian_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_material");
				} else {
					returnList = XmlParse("english_romanian_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_measuring_device");
				} else {
					returnList = XmlParse("english_romanian_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_metal");
				} else {
					returnList = XmlParse("english_romanian_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_military");
				} else {
					returnList = XmlParse("english_romanian_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_mineral");
				} else {
					returnList = XmlParse("english_romanian_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_music");
				} else {
					returnList = XmlParse("english_romanian_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_mythology");
				} else {
					returnList = XmlParse("english_romanian_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_physics");
				} else {
					returnList = XmlParse("english_romanian_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_plane");
				} else {
					returnList = XmlParse("english_romanian_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_plant");
				} else {
					returnList = XmlParse("english_romanian_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_profession");
				} else {
					returnList = XmlParse("english_romanian_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_raptor");
				} else {
					returnList = XmlParse("english_romanian_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_reptile");
				} else {
					returnList = XmlParse("english_romanian_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_science");
				} else {
					returnList = XmlParse("english_romanian_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_sports");
				} else {
					returnList = XmlParse("english_romanian_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_tool");
				} else {
					returnList = XmlParse("english_romanian_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_tourism");
				} else {
					returnList = XmlParse("english_romanian_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_transport");
				} else {
					returnList = XmlParse("english_romanian_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_tree");
				} else {
					returnList = XmlParse("english_romanian_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_vehicle");
				} else {
					returnList = XmlParse("english_romanian_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_vegetable");
				} else {
					returnList = XmlParse("english_romanian_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_weapon");
				} else {
					returnList = XmlParse("english_romanian_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("romanian_weather");
				} else {
					returnList = XmlParse("english_romanian_weather");
				}
				break;
			default:
			}
			break;
		case 42:
			xrp = ctxt.getResources().getXml(R.xml.russian);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("russian_agriculture");
				} else {
					returnList = XmlParse("english_russian_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("russian_anatomy");
				} else {
					returnList = XmlParse("english_russian_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("russian_animal");
				} else {
					returnList = XmlParse("english_russian_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("russian_art");
				} else {
					returnList = XmlParse("english_russian_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("russian_astronomy");
				} else {
					returnList = XmlParse("english_russian_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("russian_bird");
				} else {
					returnList = XmlParse("english_russian_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("russian_boat");
				} else {
					returnList = XmlParse("english_russian_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("russian_building");
				} else {
					returnList = XmlParse("english_russian_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("russian_business");
				} else {
					returnList = XmlParse("english_russian_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("russian_car");
				} else {
					returnList = XmlParse("english_russian_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("russian_cat");
				} else {
					returnList = XmlParse("english_russian_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("russian_chemical_element");
				} else {
					returnList = XmlParse("english_russian_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("russian_chemical_compound");
				} else {
					returnList = XmlParse("english_russian_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("russian_city");
				} else {
					returnList = XmlParse("english_russian_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("russian_clothes");
				} else {
					returnList = XmlParse("english_russian_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("russian_computers");
				} else {
					returnList = XmlParse("english_russian_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("russian_container");
				} else {
					returnList = XmlParse("english_russian_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("russian_dog");
				} else {
					returnList = XmlParse("english_russian_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("russian_device");
				} else {
					returnList = XmlParse("english_russian_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("russian_drink");
				} else {
					returnList = XmlParse("english_russian_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("russian_electronics");
				} else {
					returnList = XmlParse("english_russian_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("russian_fish");
				} else {
					returnList = XmlParse("english_russian_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("russian_flower");
				} else {
					returnList = XmlParse("english_russian_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("russian_food");
				} else {
					returnList = XmlParse("english_russian_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("russian_fruit");
				} else {
					returnList = XmlParse("english_russian_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("russian_furniture");
				} else {
					returnList = XmlParse("english_russian_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("russian_geography");
				} else {
					returnList = XmlParse("english_russian_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("russian_geometry");
				} else {
					returnList = XmlParse("english_russian_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("russian_house");
				} else {
					returnList = XmlParse("english_russian_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("russian_insect");
				} else {
					returnList = XmlParse("english_russian_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("russian_jewelry");
				} else {
					returnList = XmlParse("english_russian_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("russian_kitchen");
				} else {
					returnList = XmlParse("english_russian_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("russian_material");
				} else {
					returnList = XmlParse("english_russian_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("russian_measuring_device");
				} else {
					returnList = XmlParse("english_russian_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("russian_metal");
				} else {
					returnList = XmlParse("english_russian_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("russian_military");
				} else {
					returnList = XmlParse("english_russian_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("russian_mineral");
				} else {
					returnList = XmlParse("english_russian_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("russian_music");
				} else {
					returnList = XmlParse("english_russian_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("russian_mythology");
				} else {
					returnList = XmlParse("english_russian_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("russian_physics");
				} else {
					returnList = XmlParse("english_russian_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("russian_plane");
				} else {
					returnList = XmlParse("english_russian_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("russian_plant");
				} else {
					returnList = XmlParse("english_russian_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("russian_profession");
				} else {
					returnList = XmlParse("english_russian_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("russian_raptor");
				} else {
					returnList = XmlParse("english_russian_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("russian_reptile");
				} else {
					returnList = XmlParse("english_russian_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("russian_science");
				} else {
					returnList = XmlParse("english_russian_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("russian_sports");
				} else {
					returnList = XmlParse("english_russian_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("russian_tool");
				} else {
					returnList = XmlParse("english_russian_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("russian_tourism");
				} else {
					returnList = XmlParse("english_russian_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("russian_transport");
				} else {
					returnList = XmlParse("english_russian_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("russian_tree");
				} else {
					returnList = XmlParse("english_russian_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("russian_vehicle");
				} else {
					returnList = XmlParse("english_russian_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("russian_vegetable");
				} else {
					returnList = XmlParse("english_russian_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("russian_weapon");
				} else {
					returnList = XmlParse("english_russian_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("russian_weather");
				} else {
					returnList = XmlParse("english_russian_weather");
				}
				break;
			default:
			}
			break;
		case 43:
			xrp = ctxt.getResources().getXml(R.xml.serbian);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_agriculture");
				} else {
					returnList = XmlParse("english_serbian_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_anatomy");
				} else {
					returnList = XmlParse("english_serbian_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_animal");
				} else {
					returnList = XmlParse("english_serbian_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_art");
				} else {
					returnList = XmlParse("english_serbian_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_astronomy");
				} else {
					returnList = XmlParse("english_serbian_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_bird");
				} else {
					returnList = XmlParse("english_serbian_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_boat");
				} else {
					returnList = XmlParse("english_serbian_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_building");
				} else {
					returnList = XmlParse("english_serbian_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_business");
				} else {
					returnList = XmlParse("english_serbian_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_car");
				} else {
					returnList = XmlParse("english_serbian_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_cat");
				} else {
					returnList = XmlParse("english_serbian_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_chemical_element");
				} else {
					returnList = XmlParse("english_serbian_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_chemical_compound");
				} else {
					returnList = XmlParse("english_serbian_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_city");
				} else {
					returnList = XmlParse("english_serbian_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_clothes");
				} else {
					returnList = XmlParse("english_serbian_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_computers");
				} else {
					returnList = XmlParse("english_serbian_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_container");
				} else {
					returnList = XmlParse("english_serbian_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_dog");
				} else {
					returnList = XmlParse("english_serbian_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_device");
				} else {
					returnList = XmlParse("english_serbian_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_drink");
				} else {
					returnList = XmlParse("english_serbian_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_electronics");
				} else {
					returnList = XmlParse("english_serbian_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_fish");
				} else {
					returnList = XmlParse("english_serbian_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_flower");
				} else {
					returnList = XmlParse("english_serbian_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_food");
				} else {
					returnList = XmlParse("english_serbian_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_fruit");
				} else {
					returnList = XmlParse("english_serbian_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_furniture");
				} else {
					returnList = XmlParse("english_serbian_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_geography");
				} else {
					returnList = XmlParse("english_serbian_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_geometry");
				} else {
					returnList = XmlParse("english_serbian_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_house");
				} else {
					returnList = XmlParse("english_serbian_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_insect");
				} else {
					returnList = XmlParse("english_serbian_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_jewelry");
				} else {
					returnList = XmlParse("english_serbian_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_kitchen");
				} else {
					returnList = XmlParse("english_serbian_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_material");
				} else {
					returnList = XmlParse("english_serbian_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_measuring_device");
				} else {
					returnList = XmlParse("english_serbian_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_metal");
				} else {
					returnList = XmlParse("english_serbian_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_military");
				} else {
					returnList = XmlParse("english_serbian_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_mineral");
				} else {
					returnList = XmlParse("english_serbian_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_music");
				} else {
					returnList = XmlParse("english_serbian_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_mythology");
				} else {
					returnList = XmlParse("english_serbian_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_physics");
				} else {
					returnList = XmlParse("english_serbian_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_plane");
				} else {
					returnList = XmlParse("english_serbian_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_plant");
				} else {
					returnList = XmlParse("english_serbian_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_profession");
				} else {
					returnList = XmlParse("english_serbian_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_raptor");
				} else {
					returnList = XmlParse("english_serbian_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_reptile");
				} else {
					returnList = XmlParse("english_serbian_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_science");
				} else {
					returnList = XmlParse("english_serbian_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_sports");
				} else {
					returnList = XmlParse("english_serbian_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_tool");
				} else {
					returnList = XmlParse("english_serbian_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_tourism");
				} else {
					returnList = XmlParse("english_serbian_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_transport");
				} else {
					returnList = XmlParse("english_serbian_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_tree");
				} else {
					returnList = XmlParse("english_serbian_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_vehicle");
				} else {
					returnList = XmlParse("english_serbian_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_vegetable");
				} else {
					returnList = XmlParse("english_serbian_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_weapon");
				} else {
					returnList = XmlParse("english_serbian_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("serbian_weather");
				} else {
					returnList = XmlParse("english_serbian_weather");
				}
				break;
			default:
			}
			break;
		case 44:
			xrp = ctxt.getResources().getXml(R.xml.slovak);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_agriculture");
				} else {
					returnList = XmlParse("english_slovak_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_anatomy");
				} else {
					returnList = XmlParse("english_slovak_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_animal");
				} else {
					returnList = XmlParse("english_slovak_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_art");
				} else {
					returnList = XmlParse("english_slovak_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_astronomy");
				} else {
					returnList = XmlParse("english_slovak_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_bird");
				} else {
					returnList = XmlParse("english_slovak_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_boat");
				} else {
					returnList = XmlParse("english_slovak_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_building");
				} else {
					returnList = XmlParse("english_slovak_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_business");
				} else {
					returnList = XmlParse("english_slovak_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_car");
				} else {
					returnList = XmlParse("english_slovak_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_cat");
				} else {
					returnList = XmlParse("english_slovak_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_chemical_element");
				} else {
					returnList = XmlParse("english_slovak_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_chemical_compound");
				} else {
					returnList = XmlParse("english_slovak_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_city");
				} else {
					returnList = XmlParse("english_slovak_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_clothes");
				} else {
					returnList = XmlParse("english_slovak_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_computers");
				} else {
					returnList = XmlParse("english_slovak_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_container");
				} else {
					returnList = XmlParse("english_slovak_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_dog");
				} else {
					returnList = XmlParse("english_slovak_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_device");
				} else {
					returnList = XmlParse("english_slovak_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_drink");
				} else {
					returnList = XmlParse("english_slovak_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_electronics");
				} else {
					returnList = XmlParse("english_slovak_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_fish");
				} else {
					returnList = XmlParse("english_slovak_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_flower");
				} else {
					returnList = XmlParse("english_slovak_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_food");
				} else {
					returnList = XmlParse("english_slovak_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_fruit");
				} else {
					returnList = XmlParse("english_slovak_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_furniture");
				} else {
					returnList = XmlParse("english_slovak_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_geography");
				} else {
					returnList = XmlParse("english_slovak_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_geometry");
				} else {
					returnList = XmlParse("english_slovak_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_house");
				} else {
					returnList = XmlParse("english_slovak_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_insect");
				} else {
					returnList = XmlParse("english_slovak_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_jewelry");
				} else {
					returnList = XmlParse("english_slovak_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_kitchen");
				} else {
					returnList = XmlParse("english_slovak_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_material");
				} else {
					returnList = XmlParse("english_slovak_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_measuring_device");
				} else {
					returnList = XmlParse("english_slovak_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_metal");
				} else {
					returnList = XmlParse("english_slovak_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_military");
				} else {
					returnList = XmlParse("english_slovak_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_mineral");
				} else {
					returnList = XmlParse("english_slovak_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_music");
				} else {
					returnList = XmlParse("english_slovak_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_mythology");
				} else {
					returnList = XmlParse("english_slovak_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_physics");
				} else {
					returnList = XmlParse("english_slovak_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_plane");
				} else {
					returnList = XmlParse("english_slovak_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_plant");
				} else {
					returnList = XmlParse("english_slovak_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_profession");
				} else {
					returnList = XmlParse("english_slovak_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_raptor");
				} else {
					returnList = XmlParse("english_slovak_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_reptile");
				} else {
					returnList = XmlParse("english_slovak_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_science");
				} else {
					returnList = XmlParse("english_slovak_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_sports");
				} else {
					returnList = XmlParse("english_slovak_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_tool");
				} else {
					returnList = XmlParse("english_slovak_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_tourism");
				} else {
					returnList = XmlParse("english_slovak_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_transport");
				} else {
					returnList = XmlParse("english_slovak_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_tree");
				} else {
					returnList = XmlParse("english_slovak_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_vehicle");
				} else {
					returnList = XmlParse("english_slovak_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_vegetable");
				} else {
					returnList = XmlParse("english_slovak_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_weapon");
				} else {
					returnList = XmlParse("english_slovak_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("slovak_weather");
				} else {
					returnList = XmlParse("english_slovak_weather");
				}
				break;
			default:
			}
			break;
		case 45:
			xrp = ctxt.getResources().getXml(R.xml.spanish);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_agriculture");
				} else {
					returnList = XmlParse("english_spanish_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_anatomy");
				} else {
					returnList = XmlParse("english_spanish_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_animal");
				} else {
					returnList = XmlParse("english_spanish_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_art");
				} else {
					returnList = XmlParse("english_spanish_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_astronomy");
				} else {
					returnList = XmlParse("english_spanish_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_bird");
				} else {
					returnList = XmlParse("english_spanish_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_boat");
				} else {
					returnList = XmlParse("english_spanish_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_building");
				} else {
					returnList = XmlParse("english_spanish_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_business");
				} else {
					returnList = XmlParse("english_spanish_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_car");
				} else {
					returnList = XmlParse("english_spanish_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_cat");
				} else {
					returnList = XmlParse("english_spanish_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_chemical_element");
				} else {
					returnList = XmlParse("english_spanish_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_chemical_compound");
				} else {
					returnList = XmlParse("english_spanish_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_city");
				} else {
					returnList = XmlParse("english_spanish_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_clothes");
				} else {
					returnList = XmlParse("english_spanish_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_computers");
				} else {
					returnList = XmlParse("english_spanish_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_container");
				} else {
					returnList = XmlParse("english_spanish_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_dog");
				} else {
					returnList = XmlParse("english_spanish_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_device");
				} else {
					returnList = XmlParse("english_spanish_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_drink");
				} else {
					returnList = XmlParse("english_spanish_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_electronics");
				} else {
					returnList = XmlParse("english_spanish_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_fish");
				} else {
					returnList = XmlParse("english_spanish_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_flower");
				} else {
					returnList = XmlParse("english_spanish_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_food");
				} else {
					returnList = XmlParse("english_spanish_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_fruit");
				} else {
					returnList = XmlParse("english_spanish_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_furniture");
				} else {
					returnList = XmlParse("english_spanish_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_geography");
				} else {
					returnList = XmlParse("english_spanish_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_geometry");
				} else {
					returnList = XmlParse("english_spanish_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_house");
				} else {
					returnList = XmlParse("english_spanish_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_insect");
				} else {
					returnList = XmlParse("english_spanish_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_jewelry");
				} else {
					returnList = XmlParse("english_spanish_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_kitchen");
				} else {
					returnList = XmlParse("english_spanish_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_material");
				} else {
					returnList = XmlParse("english_spanish_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_measuring_device");
				} else {
					returnList = XmlParse("english_spanish_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_metal");
				} else {
					returnList = XmlParse("english_spanish_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_military");
				} else {
					returnList = XmlParse("english_spanish_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_mineral");
				} else {
					returnList = XmlParse("english_spanish_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_music");
				} else {
					returnList = XmlParse("english_spanish_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_mythology");
				} else {
					returnList = XmlParse("english_spanish_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_physics");
				} else {
					returnList = XmlParse("english_spanish_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_plane");
				} else {
					returnList = XmlParse("english_spanish_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_plant");
				} else {
					returnList = XmlParse("english_spanish_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_profession");
				} else {
					returnList = XmlParse("english_spanish_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_raptor");
				} else {
					returnList = XmlParse("english_spanish_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_reptile");
				} else {
					returnList = XmlParse("english_spanish_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_science");
				} else {
					returnList = XmlParse("english_spanish_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_sports");
				} else {
					returnList = XmlParse("english_spanish_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_tool");
				} else {
					returnList = XmlParse("english_spanish_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_tourism");
				} else {
					returnList = XmlParse("english_spanish_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_transport");
				} else {
					returnList = XmlParse("english_spanish_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_tree");
				} else {
					returnList = XmlParse("english_spanish_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_vehicle");
				} else {
					returnList = XmlParse("english_spanish_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_vegetable");
				} else {
					returnList = XmlParse("english_spanish_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_weapon");
				} else {
					returnList = XmlParse("english_spanish_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("spanish_weather");
				} else {
					returnList = XmlParse("english_spanish_weather");
				}
				break;
			default:
			}
			break;
		case 46:
			xrp = ctxt.getResources().getXml(R.xml.swahili);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_agriculture");
				} else {
					returnList = XmlParse("english_swahili_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_anatomy");
				} else {
					returnList = XmlParse("english_swahili_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_animal");
				} else {
					returnList = XmlParse("english_swahili_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_art");
				} else {
					returnList = XmlParse("english_swahili_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_astronomy");
				} else {
					returnList = XmlParse("english_swahili_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_bird");
				} else {
					returnList = XmlParse("english_swahili_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_boat");
				} else {
					returnList = XmlParse("english_swahili_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_building");
				} else {
					returnList = XmlParse("english_swahili_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_business");
				} else {
					returnList = XmlParse("english_swahili_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_car");
				} else {
					returnList = XmlParse("english_swahili_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_cat");
				} else {
					returnList = XmlParse("english_swahili_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_chemical_element");
				} else {
					returnList = XmlParse("english_swahili_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_chemical_compound");
				} else {
					returnList = XmlParse("english_swahili_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_city");
				} else {
					returnList = XmlParse("english_swahili_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_clothes");
				} else {
					returnList = XmlParse("english_swahili_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_computers");
				} else {
					returnList = XmlParse("english_swahili_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_container");
				} else {
					returnList = XmlParse("english_swahili_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_dog");
				} else {
					returnList = XmlParse("english_swahili_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_device");
				} else {
					returnList = XmlParse("english_swahili_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_drink");
				} else {
					returnList = XmlParse("english_swahili_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_electronics");
				} else {
					returnList = XmlParse("english_swahili_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_fish");
				} else {
					returnList = XmlParse("english_swahili_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_flower");
				} else {
					returnList = XmlParse("english_swahili_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_food");
				} else {
					returnList = XmlParse("english_swahili_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_fruit");
				} else {
					returnList = XmlParse("english_swahili_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_furniture");
				} else {
					returnList = XmlParse("english_swahili_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_geography");
				} else {
					returnList = XmlParse("english_swahili_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_geometry");
				} else {
					returnList = XmlParse("english_swahili_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_house");
				} else {
					returnList = XmlParse("english_swahili_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_insect");
				} else {
					returnList = XmlParse("english_swahili_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_jewelry");
				} else {
					returnList = XmlParse("english_swahili_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_kitchen");
				} else {
					returnList = XmlParse("english_swahili_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_material");
				} else {
					returnList = XmlParse("english_swahili_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_measuring_device");
				} else {
					returnList = XmlParse("english_swahili_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_metal");
				} else {
					returnList = XmlParse("english_swahili_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_military");
				} else {
					returnList = XmlParse("english_swahili_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_mineral");
				} else {
					returnList = XmlParse("english_swahili_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_music");
				} else {
					returnList = XmlParse("english_swahili_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_mythology");
				} else {
					returnList = XmlParse("english_swahili_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_physics");
				} else {
					returnList = XmlParse("english_swahili_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_plane");
				} else {
					returnList = XmlParse("english_swahili_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_plant");
				} else {
					returnList = XmlParse("english_swahili_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_profession");
				} else {
					returnList = XmlParse("english_swahili_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_raptor");
				} else {
					returnList = XmlParse("english_swahili_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_reptile");
				} else {
					returnList = XmlParse("english_swahili_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_science");
				} else {
					returnList = XmlParse("english_swahili_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_sports");
				} else {
					returnList = XmlParse("english_swahili_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_tool");
				} else {
					returnList = XmlParse("english_swahili_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_tourism");
				} else {
					returnList = XmlParse("english_swahili_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_transport");
				} else {
					returnList = XmlParse("english_swahili_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_tree");
				} else {
					returnList = XmlParse("english_swahili_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_vehicle");
				} else {
					returnList = XmlParse("english_swahili_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_vegetable");
				} else {
					returnList = XmlParse("english_swahili_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_weapon");
				} else {
					returnList = XmlParse("english_swahili_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("swahili_weather");
				} else {
					returnList = XmlParse("english_swahili_weather");
				}
				break;
			default:
			}
			break;
		case 47:
			xrp = ctxt.getResources().getXml(R.xml.swedish);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_agriculture");
				} else {
					returnList = XmlParse("english_swedish_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_anatomy");
				} else {
					returnList = XmlParse("english_swedish_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_animal");
				} else {
					returnList = XmlParse("english_swedish_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_art");
				} else {
					returnList = XmlParse("english_swedish_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_astronomy");
				} else {
					returnList = XmlParse("english_swedish_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_bird");
				} else {
					returnList = XmlParse("english_swedish_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_boat");
				} else {
					returnList = XmlParse("english_swedish_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_building");
				} else {
					returnList = XmlParse("english_swedish_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_business");
				} else {
					returnList = XmlParse("english_swedish_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_car");
				} else {
					returnList = XmlParse("english_swedish_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_cat");
				} else {
					returnList = XmlParse("english_swedish_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_chemical_element");
				} else {
					returnList = XmlParse("english_swedish_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_chemical_compound");
				} else {
					returnList = XmlParse("english_swedish_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_city");
				} else {
					returnList = XmlParse("english_swedish_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_clothes");
				} else {
					returnList = XmlParse("english_swedish_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_computers");
				} else {
					returnList = XmlParse("english_swedish_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_container");
				} else {
					returnList = XmlParse("english_swedish_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_dog");
				} else {
					returnList = XmlParse("english_swedish_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_device");
				} else {
					returnList = XmlParse("english_swedish_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_drink");
				} else {
					returnList = XmlParse("english_swedish_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_electronics");
				} else {
					returnList = XmlParse("english_swedish_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_fish");
				} else {
					returnList = XmlParse("english_swedish_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_flower");
				} else {
					returnList = XmlParse("english_swedish_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_food");
				} else {
					returnList = XmlParse("english_swedish_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_fruit");
				} else {
					returnList = XmlParse("english_swedish_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_furniture");
				} else {
					returnList = XmlParse("english_swedish_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_geography");
				} else {
					returnList = XmlParse("english_swedish_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_geometry");
				} else {
					returnList = XmlParse("english_swedish_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_house");
				} else {
					returnList = XmlParse("english_swedish_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_insect");
				} else {
					returnList = XmlParse("english_swedish_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_jewelry");
				} else {
					returnList = XmlParse("english_swedish_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_kitchen");
				} else {
					returnList = XmlParse("english_swedish_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_material");
				} else {
					returnList = XmlParse("english_swedish_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_measuring_device");
				} else {
					returnList = XmlParse("english_swedish_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_metal");
				} else {
					returnList = XmlParse("english_swedish_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_military");
				} else {
					returnList = XmlParse("english_swedish_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_mineral");
				} else {
					returnList = XmlParse("english_swedish_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_music");
				} else {
					returnList = XmlParse("english_swedish_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_mythology");
				} else {
					returnList = XmlParse("english_swedish_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_physics");
				} else {
					returnList = XmlParse("english_swedish_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_plane");
				} else {
					returnList = XmlParse("english_swedish_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_plant");
				} else {
					returnList = XmlParse("english_swedish_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_profession");
				} else {
					returnList = XmlParse("english_swedish_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_raptor");
				} else {
					returnList = XmlParse("english_swedish_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_reptile");
				} else {
					returnList = XmlParse("english_swedish_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_science");
				} else {
					returnList = XmlParse("english_swedish_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_sports");
				} else {
					returnList = XmlParse("english_swedish_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_tool");
				} else {
					returnList = XmlParse("english_swedish_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_tourism");
				} else {
					returnList = XmlParse("english_swedish_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_transport");
				} else {
					returnList = XmlParse("english_swedish_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_tree");
				} else {
					returnList = XmlParse("english_swedish_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_vehicle");
				} else {
					returnList = XmlParse("english_swedish_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_vegetable");
				} else {
					returnList = XmlParse("english_swedish_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_weapon");
				} else {
					returnList = XmlParse("english_swedish_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("swedish_weather");
				} else {
					returnList = XmlParse("english_swedish_weather");
				}
				break;
			default:
			}
			break;
		case 48:
			xrp = ctxt.getResources().getXml(R.xml.tamil);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_agriculture");
				} else {
					returnList = XmlParse("english_tamil_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_anatomy");
				} else {
					returnList = XmlParse("english_tamil_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_animal");
				} else {
					returnList = XmlParse("english_tamil_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_art");
				} else {
					returnList = XmlParse("english_tamil_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_astronomy");
				} else {
					returnList = XmlParse("english_tamil_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_bird");
				} else {
					returnList = XmlParse("english_tamil_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_boat");
				} else {
					returnList = XmlParse("english_tamil_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_building");
				} else {
					returnList = XmlParse("english_tamil_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_business");
				} else {
					returnList = XmlParse("english_tamil_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_car");
				} else {
					returnList = XmlParse("english_tamil_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_cat");
				} else {
					returnList = XmlParse("english_tamil_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_chemical_element");
				} else {
					returnList = XmlParse("english_tamil_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_chemical_compound");
				} else {
					returnList = XmlParse("english_tamil_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_city");
				} else {
					returnList = XmlParse("english_tamil_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_clothes");
				} else {
					returnList = XmlParse("english_tamil_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_computers");
				} else {
					returnList = XmlParse("english_tamil_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_container");
				} else {
					returnList = XmlParse("english_tamil_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_dog");
				} else {
					returnList = XmlParse("english_tamil_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_device");
				} else {
					returnList = XmlParse("english_tamil_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_drink");
				} else {
					returnList = XmlParse("english_tamil_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_electronics");
				} else {
					returnList = XmlParse("english_tamil_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_fish");
				} else {
					returnList = XmlParse("english_tamil_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_flower");
				} else {
					returnList = XmlParse("english_tamil_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_food");
				} else {
					returnList = XmlParse("english_tamil_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_fruit");
				} else {
					returnList = XmlParse("english_tamil_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_furniture");
				} else {
					returnList = XmlParse("english_tamil_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_geography");
				} else {
					returnList = XmlParse("english_tamil_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_geometry");
				} else {
					returnList = XmlParse("english_tamil_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_house");
				} else {
					returnList = XmlParse("english_tamil_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_insect");
				} else {
					returnList = XmlParse("english_tamil_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_jewelry");
				} else {
					returnList = XmlParse("english_tamil_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_kitchen");
				} else {
					returnList = XmlParse("english_tamil_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_material");
				} else {
					returnList = XmlParse("english_tamil_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_measuring_device");
				} else {
					returnList = XmlParse("english_tamil_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_metal");
				} else {
					returnList = XmlParse("english_tamil_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_military");
				} else {
					returnList = XmlParse("english_tamil_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_mineral");
				} else {
					returnList = XmlParse("english_tamil_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_music");
				} else {
					returnList = XmlParse("english_tamil_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_mythology");
				} else {
					returnList = XmlParse("english_tamil_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_physics");
				} else {
					returnList = XmlParse("english_tamil_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_plane");
				} else {
					returnList = XmlParse("english_tamil_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_plant");
				} else {
					returnList = XmlParse("english_tamil_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_profession");
				} else {
					returnList = XmlParse("english_tamil_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_raptor");
				} else {
					returnList = XmlParse("english_tamil_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_reptile");
				} else {
					returnList = XmlParse("english_tamil_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_science");
				} else {
					returnList = XmlParse("english_tamil_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_sports");
				} else {
					returnList = XmlParse("english_tamil_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_tool");
				} else {
					returnList = XmlParse("english_tamil_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_tourism");
				} else {
					returnList = XmlParse("english_tamil_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_transport");
				} else {
					returnList = XmlParse("english_tamil_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_tree");
				} else {
					returnList = XmlParse("english_tamil_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_vehicle");
				} else {
					returnList = XmlParse("english_tamil_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_vegetable");
				} else {
					returnList = XmlParse("english_tamil_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_weapon");
				} else {
					returnList = XmlParse("english_tamil_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("tamil_weather");
				} else {
					returnList = XmlParse("english_tamil_weather");
				}
				break;
			default:
			}
			break;
		case 49:
			xrp = ctxt.getResources().getXml(R.xml.thai);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("thai_agriculture");
				} else {
					returnList = XmlParse("english_thai_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("thai_anatomy");
				} else {
					returnList = XmlParse("english_thai_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("thai_animal");
				} else {
					returnList = XmlParse("english_thai_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("thai_art");
				} else {
					returnList = XmlParse("english_thai_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("thai_astronomy");
				} else {
					returnList = XmlParse("english_thai_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("thai_bird");
				} else {
					returnList = XmlParse("english_thai_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("thai_boat");
				} else {
					returnList = XmlParse("english_thai_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("thai_building");
				} else {
					returnList = XmlParse("english_thai_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("thai_business");
				} else {
					returnList = XmlParse("english_thai_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("thai_car");
				} else {
					returnList = XmlParse("english_thai_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("thai_cat");
				} else {
					returnList = XmlParse("english_thai_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("thai_chemical_element");
				} else {
					returnList = XmlParse("english_thai_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("thai_chemical_compound");
				} else {
					returnList = XmlParse("english_thai_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("thai_city");
				} else {
					returnList = XmlParse("english_thai_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("thai_clothes");
				} else {
					returnList = XmlParse("english_thai_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("thai_computers");
				} else {
					returnList = XmlParse("english_thai_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("thai_container");
				} else {
					returnList = XmlParse("english_thai_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("thai_dog");
				} else {
					returnList = XmlParse("english_thai_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("thai_device");
				} else {
					returnList = XmlParse("english_thai_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("thai_drink");
				} else {
					returnList = XmlParse("english_thai_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("thai_electronics");
				} else {
					returnList = XmlParse("english_thai_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("thai_fish");
				} else {
					returnList = XmlParse("english_thai_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("thai_flower");
				} else {
					returnList = XmlParse("english_thai_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("thai_food");
				} else {
					returnList = XmlParse("english_thai_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("thai_fruit");
				} else {
					returnList = XmlParse("english_thai_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("thai_furniture");
				} else {
					returnList = XmlParse("english_thai_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("thai_geography");
				} else {
					returnList = XmlParse("english_thai_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("thai_geometry");
				} else {
					returnList = XmlParse("english_thai_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("thai_house");
				} else {
					returnList = XmlParse("english_thai_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("thai_insect");
				} else {
					returnList = XmlParse("english_thai_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("thai_jewelry");
				} else {
					returnList = XmlParse("english_thai_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("thai_kitchen");
				} else {
					returnList = XmlParse("english_thai_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("thai_material");
				} else {
					returnList = XmlParse("english_thai_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("thai_measuring_device");
				} else {
					returnList = XmlParse("english_thai_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("thai_metal");
				} else {
					returnList = XmlParse("english_thai_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("thai_military");
				} else {
					returnList = XmlParse("english_thai_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("thai_mineral");
				} else {
					returnList = XmlParse("english_thai_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("thai_music");
				} else {
					returnList = XmlParse("english_thai_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("thai_mythology");
				} else {
					returnList = XmlParse("english_thai_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("thai_physics");
				} else {
					returnList = XmlParse("english_thai_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("thai_plane");
				} else {
					returnList = XmlParse("english_thai_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("thai_plant");
				} else {
					returnList = XmlParse("english_thai_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("thai_profession");
				} else {
					returnList = XmlParse("english_thai_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("thai_raptor");
				} else {
					returnList = XmlParse("english_thai_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("thai_reptile");
				} else {
					returnList = XmlParse("english_thai_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("thai_science");
				} else {
					returnList = XmlParse("english_thai_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("thai_sports");
				} else {
					returnList = XmlParse("english_thai_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("thai_tool");
				} else {
					returnList = XmlParse("english_thai_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("thai_tourism");
				} else {
					returnList = XmlParse("english_thai_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("thai_transport");
				} else {
					returnList = XmlParse("english_thai_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("thai_tree");
				} else {
					returnList = XmlParse("english_thai_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("thai_vehicle");
				} else {
					returnList = XmlParse("english_thai_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("thai_vegetable");
				} else {
					returnList = XmlParse("english_thai_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("thai_weapon");
				} else {
					returnList = XmlParse("english_thai_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("thai_weather");
				} else {
					returnList = XmlParse("english_thai_weather");
				}
				break;
			default:
			}
			break;
		case 50:
			xrp = ctxt.getResources().getXml(R.xml.turkish);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_agriculture");
				} else {
					returnList = XmlParse("english_turkish_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_anatomy");
				} else {
					returnList = XmlParse("english_turkish_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_animal");
				} else {
					returnList = XmlParse("english_turkish_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_art");
				} else {
					returnList = XmlParse("english_turkish_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_astronomy");
				} else {
					returnList = XmlParse("english_turkish_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_bird");
				} else {
					returnList = XmlParse("english_turkish_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_boat");
				} else {
					returnList = XmlParse("english_turkish_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_building");
				} else {
					returnList = XmlParse("english_turkish_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_business");
				} else {
					returnList = XmlParse("english_turkish_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_car");
				} else {
					returnList = XmlParse("english_turkish_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_cat");
				} else {
					returnList = XmlParse("english_turkish_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_chemical_element");
				} else {
					returnList = XmlParse("english_turkish_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_chemical_compound");
				} else {
					returnList = XmlParse("english_turkish_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_city");
				} else {
					returnList = XmlParse("english_turkish_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_clothes");
				} else {
					returnList = XmlParse("english_turkish_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_computers");
				} else {
					returnList = XmlParse("english_turkish_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_container");
				} else {
					returnList = XmlParse("english_turkish_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_dog");
				} else {
					returnList = XmlParse("english_turkish_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_device");
				} else {
					returnList = XmlParse("english_turkish_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_drink");
				} else {
					returnList = XmlParse("english_turkish_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_electronics");
				} else {
					returnList = XmlParse("english_turkish_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_fish");
				} else {
					returnList = XmlParse("english_turkish_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_flower");
				} else {
					returnList = XmlParse("english_turkish_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_food");
				} else {
					returnList = XmlParse("english_turkish_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_fruit");
				} else {
					returnList = XmlParse("english_turkish_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_furniture");
				} else {
					returnList = XmlParse("english_turkish_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_geography");
				} else {
					returnList = XmlParse("english_turkish_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_geometry");
				} else {
					returnList = XmlParse("english_turkish_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_house");
				} else {
					returnList = XmlParse("english_turkish_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_insect");
				} else {
					returnList = XmlParse("english_turkish_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_jewelry");
				} else {
					returnList = XmlParse("english_turkish_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_kitchen");
				} else {
					returnList = XmlParse("english_turkish_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_material");
				} else {
					returnList = XmlParse("english_turkish_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_measuring_device");
				} else {
					returnList = XmlParse("english_turkish_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_metal");
				} else {
					returnList = XmlParse("english_turkish_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_military");
				} else {
					returnList = XmlParse("english_turkish_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_mineral");
				} else {
					returnList = XmlParse("english_turkish_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_music");
				} else {
					returnList = XmlParse("english_turkish_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_mythology");
				} else {
					returnList = XmlParse("english_turkish_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_physics");
				} else {
					returnList = XmlParse("english_turkish_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_plane");
				} else {
					returnList = XmlParse("english_turkish_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_plant");
				} else {
					returnList = XmlParse("english_turkish_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_profession");
				} else {
					returnList = XmlParse("english_turkish_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_raptor");
				} else {
					returnList = XmlParse("english_turkish_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_reptile");
				} else {
					returnList = XmlParse("english_turkish_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_science");
				} else {
					returnList = XmlParse("english_turkish_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_sports");
				} else {
					returnList = XmlParse("english_turkish_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_tool");
				} else {
					returnList = XmlParse("english_turkish_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_tourism");
				} else {
					returnList = XmlParse("english_turkish_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_transport");
				} else {
					returnList = XmlParse("english_turkish_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_tree");
				} else {
					returnList = XmlParse("english_turkish_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_vehicle");
				} else {
					returnList = XmlParse("english_turkish_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_vegetable");
				} else {
					returnList = XmlParse("english_turkish_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_weapon");
				} else {
					returnList = XmlParse("english_turkish_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("turkish_weather");
				} else {
					returnList = XmlParse("english_turkish_weather");
				}
				break;
			default:
			}
			break;
		case 51:
			xrp = ctxt.getResources().getXml(R.xml.urdu);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_agriculture");
				} else {
					returnList = XmlParse("english_urdu_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_anatomy");
				} else {
					returnList = XmlParse("english_urdu_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_animal");
				} else {
					returnList = XmlParse("english_urdu_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_art");
				} else {
					returnList = XmlParse("english_urdu_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_astronomy");
				} else {
					returnList = XmlParse("english_urdu_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_bird");
				} else {
					returnList = XmlParse("english_urdu_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_boat");
				} else {
					returnList = XmlParse("english_urdu_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_building");
				} else {
					returnList = XmlParse("english_urdu_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_business");
				} else {
					returnList = XmlParse("english_urdu_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_car");
				} else {
					returnList = XmlParse("english_urdu_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_cat");
				} else {
					returnList = XmlParse("english_urdu_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_chemical_element");
				} else {
					returnList = XmlParse("english_urdu_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_chemical_compound");
				} else {
					returnList = XmlParse("english_urdu_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_city");
				} else {
					returnList = XmlParse("english_urdu_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_clothes");
				} else {
					returnList = XmlParse("english_urdu_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_computers");
				} else {
					returnList = XmlParse("english_urdu_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_container");
				} else {
					returnList = XmlParse("english_urdu_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_dog");
				} else {
					returnList = XmlParse("english_urdu_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_device");
				} else {
					returnList = XmlParse("english_urdu_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_drink");
				} else {
					returnList = XmlParse("english_urdu_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_electronics");
				} else {
					returnList = XmlParse("english_urdu_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_fish");
				} else {
					returnList = XmlParse("english_urdu_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_flower");
				} else {
					returnList = XmlParse("english_urdu_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_food");
				} else {
					returnList = XmlParse("english_urdu_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_fruit");
				} else {
					returnList = XmlParse("english_urdu_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_furniture");
				} else {
					returnList = XmlParse("english_urdu_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_geography");
				} else {
					returnList = XmlParse("english_urdu_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_geometry");
				} else {
					returnList = XmlParse("english_urdu_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_house");
				} else {
					returnList = XmlParse("english_urdu_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_insect");
				} else {
					returnList = XmlParse("english_urdu_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_jewelry");
				} else {
					returnList = XmlParse("english_urdu_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_kitchen");
				} else {
					returnList = XmlParse("english_urdu_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_material");
				} else {
					returnList = XmlParse("english_urdu_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_measuring_device");
				} else {
					returnList = XmlParse("english_urdu_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_metal");
				} else {
					returnList = XmlParse("english_urdu_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_military");
				} else {
					returnList = XmlParse("english_urdu_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_mineral");
				} else {
					returnList = XmlParse("english_urdu_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_music");
				} else {
					returnList = XmlParse("english_urdu_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_mythology");
				} else {
					returnList = XmlParse("english_urdu_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_physics");
				} else {
					returnList = XmlParse("english_urdu_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_plane");
				} else {
					returnList = XmlParse("english_urdu_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_plant");
				} else {
					returnList = XmlParse("english_urdu_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_profession");
				} else {
					returnList = XmlParse("english_urdu_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_raptor");
				} else {
					returnList = XmlParse("english_urdu_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_reptile");
				} else {
					returnList = XmlParse("english_urdu_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_science");
				} else {
					returnList = XmlParse("english_urdu_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_sports");
				} else {
					returnList = XmlParse("english_urdu_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_tool");
				} else {
					returnList = XmlParse("english_urdu_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_tourism");
				} else {
					returnList = XmlParse("english_urdu_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_transport");
				} else {
					returnList = XmlParse("english_urdu_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_tree");
				} else {
					returnList = XmlParse("english_urdu_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_vehicle");
				} else {
					returnList = XmlParse("english_urdu_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_vegetable");
				} else {
					returnList = XmlParse("english_urdu_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_weapon");
				} else {
					returnList = XmlParse("english_urdu_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("urdu_weather");
				} else {
					returnList = XmlParse("english_urdu_weather");
				}
				break;
			default:
			}
			break;
		case 52:
			xrp = ctxt.getResources().getXml(R.xml.vietnamese);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_agriculture");
				} else {
					returnList = XmlParse("english_vietnamese_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_anatomy");
				} else {
					returnList = XmlParse("english_vietnamese_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_animal");
				} else {
					returnList = XmlParse("english_vietnamese_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_art");
				} else {
					returnList = XmlParse("english_vietnamese_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_astronomy");
				} else {
					returnList = XmlParse("english_vietnamese_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_bird");
				} else {
					returnList = XmlParse("english_vietnamese_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_boat");
				} else {
					returnList = XmlParse("english_vietnamese_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_building");
				} else {
					returnList = XmlParse("english_vietnamese_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_business");
				} else {
					returnList = XmlParse("english_vietnamese_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_car");
				} else {
					returnList = XmlParse("english_vietnamese_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_cat");
				} else {
					returnList = XmlParse("english_vietnamese_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_chemical_element");
				} else {
					returnList = XmlParse("english_vietnamese_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_chemical_compound");
				} else {
					returnList = XmlParse("english_vietnamese_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_city");
				} else {
					returnList = XmlParse("english_vietnamese_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_clothes");
				} else {
					returnList = XmlParse("english_vietnamese_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_computers");
				} else {
					returnList = XmlParse("english_vietnamese_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_container");
				} else {
					returnList = XmlParse("english_vietnamese_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_dog");
				} else {
					returnList = XmlParse("english_vietnamese_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_device");
				} else {
					returnList = XmlParse("english_vietnamese_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_drink");
				} else {
					returnList = XmlParse("english_vietnamese_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_electronics");
				} else {
					returnList = XmlParse("english_vietnamese_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_fish");
				} else {
					returnList = XmlParse("english_vietnamese_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_flower");
				} else {
					returnList = XmlParse("english_vietnamese_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_food");
				} else {
					returnList = XmlParse("english_vietnamese_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_fruit");
				} else {
					returnList = XmlParse("english_vietnamese_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_furniture");
				} else {
					returnList = XmlParse("english_vietnamese_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_geography");
				} else {
					returnList = XmlParse("english_vietnamese_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_geometry");
				} else {
					returnList = XmlParse("english_vietnamese_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_house");
				} else {
					returnList = XmlParse("english_vietnamese_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_insect");
				} else {
					returnList = XmlParse("english_vietnamese_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_jewelry");
				} else {
					returnList = XmlParse("english_vietnamese_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_kitchen");
				} else {
					returnList = XmlParse("english_vietnamese_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_material");
				} else {
					returnList = XmlParse("english_vietnamese_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_measuring_device");
				} else {
					returnList = XmlParse("english_vietnamese_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_metal");
				} else {
					returnList = XmlParse("english_vietnamese_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_military");
				} else {
					returnList = XmlParse("english_vietnamese_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_mineral");
				} else {
					returnList = XmlParse("english_vietnamese_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_music");
				} else {
					returnList = XmlParse("english_vietnamese_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_mythology");
				} else {
					returnList = XmlParse("english_vietnamese_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_physics");
				} else {
					returnList = XmlParse("english_vietnamese_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_plane");
				} else {
					returnList = XmlParse("english_vietnamese_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_plant");
				} else {
					returnList = XmlParse("english_vietnamese_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_profession");
				} else {
					returnList = XmlParse("english_vietnamese_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_raptor");
				} else {
					returnList = XmlParse("english_vietnamese_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_reptile");
				} else {
					returnList = XmlParse("english_vietnamese_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_science");
				} else {
					returnList = XmlParse("english_vietnamese_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_sports");
				} else {
					returnList = XmlParse("english_vietnamese_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_tool");
				} else {
					returnList = XmlParse("english_vietnamese_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_tourism");
				} else {
					returnList = XmlParse("english_vietnamese_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_transport");
				} else {
					returnList = XmlParse("english_vietnamese_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_tree");
				} else {
					returnList = XmlParse("english_vietnamese_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_vehicle");
				} else {
					returnList = XmlParse("english_vietnamese_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_vegetable");
				} else {
					returnList = XmlParse("english_vietnamese_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_weapon");
				} else {
					returnList = XmlParse("english_vietnamese_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("vietnamese_weather");
				} else {
					returnList = XmlParse("english_vietnamese_weather");
				}
				break;
			default:
			}
			break;
		case 53:
			xrp = ctxt.getResources().getXml(R.xml.welsh);
			switch (catPosition) {
			case 0:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_agriculture");
				} else {
					returnList = XmlParse("english_welsh_agriculture");
				}
				break;
			case 1:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_anatomy");
				} else {
					returnList = XmlParse("english_welsh_anatomy");
				}
				break;
			case 2:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_animal");
				} else {
					returnList = XmlParse("english_welsh_animal");
				}
				break;
			case 3:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_art");
				} else {
					returnList = XmlParse("english_welsh_art");
				}
				break;
			case 4:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_astronomy");
				} else {
					returnList = XmlParse("english_welsh_astronomy");
				}
				break;
			case 5:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_bird");
				} else {
					returnList = XmlParse("english_welsh_bird");
				}
				break;
			case 6:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_boat");
				} else {
					returnList = XmlParse("english_welsh_boat");
				}
				break;
			case 7:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_building");
				} else {
					returnList = XmlParse("english_welsh_building");
				}
				break;
			case 8:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_business");
				} else {
					returnList = XmlParse("english_welsh_business");
				}
				break;
			case 9:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_car");
				} else {
					returnList = XmlParse("english_welsh_car");
				}
				break;
			case 10:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_cat");
				} else {
					returnList = XmlParse("english_welsh_cat");
				}
				break;
			case 11:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_chemical_element");
				} else {
					returnList = XmlParse("english_welsh_chemical_element");
				}
				break;
			case 12:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_chemical_compound");
				} else {
					returnList = XmlParse("english_welsh_chemical_compound");
				}
				break;
			case 13:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_city");
				} else {
					returnList = XmlParse("english_welsh_city");
				}
				break;
			case 14:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_clothes");
				} else {
					returnList = XmlParse("english_welsh_clothes");
				}
				break;
			case 15:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_computers");
				} else {
					returnList = XmlParse("english_welsh_computers");
				}
				break;
			case 16:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_container");
				} else {
					returnList = XmlParse("english_welsh_container");
				}
				break;
			case 17:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_dog");
				} else {
					returnList = XmlParse("english_welsh_dog");
				}
				break;
			case 18:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_device");
				} else {
					returnList = XmlParse("english_welsh_device");
				}
				break;
			case 19:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_drink");
				} else {
					returnList = XmlParse("english_welsh_drink");
				}
				break;
			case 20:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_electronics");
				} else {
					returnList = XmlParse("english_welsh_electronics");
				}
				break;
			case 21:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_fish");
				} else {
					returnList = XmlParse("english_welsh_fish");
				}
				break;
			case 22:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_flower");
				} else {
					returnList = XmlParse("english_welsh_flower");
				}
				break;
			case 23:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_food");
				} else {
					returnList = XmlParse("english_welsh_food");
				}
				break;
			case 24:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_fruit");
				} else {
					returnList = XmlParse("english_welsh_fruit");
				}
				break;
			case 25:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_furniture");
				} else {
					returnList = XmlParse("english_welsh_furniture");
				}
				break;
			case 26:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_geography");
				} else {
					returnList = XmlParse("english_welsh_geography");
				}
				break;
			case 27:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_geometry");
				} else {
					returnList = XmlParse("english_welsh_geometry");
				}
				break;
			case 28:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_house");
				} else {
					returnList = XmlParse("english_welsh_house");
				}
				break;
			case 29:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_insect");
				} else {
					returnList = XmlParse("english_welsh_insect");
				}
				break;
			case 30:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_jewelry");
				} else {
					returnList = XmlParse("english_welsh_jewelry");
				}
				break;
			case 31:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_kitchen");
				} else {
					returnList = XmlParse("english_welsh_kitchen");
				}
				break;
			case 32:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_material");
				} else {
					returnList = XmlParse("english_welsh_material");
				}
				break;
			case 33:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_measuring_device");
				} else {
					returnList = XmlParse("english_welsh_measuring_device");
				}
				break;
			case 34:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_metal");
				} else {
					returnList = XmlParse("english_welsh_metal");
				}
				break;
			case 35:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_military");
				} else {
					returnList = XmlParse("english_welsh_military");
				}
				break;
			case 36:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_mineral");
				} else {
					returnList = XmlParse("english_welsh_mineral");
				}
				break;
			case 37:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_music");
				} else {
					returnList = XmlParse("english_welsh_music");
				}
				break;
			case 38:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_mythology");
				} else {
					returnList = XmlParse("english_welsh_mythology");
				}
				break;
			case 39:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_physics");
				} else {
					returnList = XmlParse("english_welsh_physics");
				}
				break;
			case 40:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_plane");
				} else {
					returnList = XmlParse("english_welsh_plane");
				}
				break;
			case 41:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_plant");
				} else {
					returnList = XmlParse("english_welsh_plant");
				}
				break;
			case 42:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_profession");
				} else {
					returnList = XmlParse("english_welsh_profession");
				}
				break;
			case 43:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_raptor");
				} else {
					returnList = XmlParse("english_welsh_raptor");
				}
				break;
			case 44:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_reptile");
				} else {
					returnList = XmlParse("english_welsh_reptile");
				}
				break;
			case 45:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_science");
				} else {
					returnList = XmlParse("english_welsh_science");
				}
				break;
			case 46:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_sports");
				} else {
					returnList = XmlParse("english_welsh_sports");
				}
				break;
			case 47:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_tool");
				} else {
					returnList = XmlParse("english_welsh_tool");
				}
				break;
			case 48:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_tourism");
				} else {
					returnList = XmlParse("english_welsh_tourism");
				}
				break;
			case 49:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_transport");
				} else {
					returnList = XmlParse("english_welsh_transport");
				}
				break;
			case 50:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_tree");
				} else {
					returnList = XmlParse("english_welsh_tree");
				}
				break;
			case 51:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_vehicle");
				} else {
					returnList = XmlParse("english_welsh_vehicle");
				}
				break;
			case 52:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_vegetable");
				} else {
					returnList = XmlParse("english_welsh_vegetable");
				}
				break;
			case 53:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_weapon");
				} else {
					returnList = XmlParse("english_welsh_weapon");
				}
				break;
			case 54:
				if (engBoolean == false) {
					returnList = XmlParse("welsh_weather");
				} else {
					returnList = XmlParse("english_welsh_weather");
				}
				break;
			default:
			}
			break;
		default:
			returnList.add("error");
			break;
		}

		return returnList;

	}

	public ArrayList<String> XmlParse(String s) throws XmlPullParserException,
			IOException {
		boolean copy = true;
		ArrayList<String> returnAL = new ArrayList<String>();

		int eventType = -1;
		while (eventType != XmlResourceParser.END_DOCUMENT) {

			if (xrp.getName() != null) {
				if (xrp.getName().equals("string-array")) {
					if (xrp.getAttributeValue(null, "name") != null) {
						if (xrp.getAttributeValue(null, "name").equals(s)) {
							copy = true;
						} else {
							copy = false;
						}
					}
				}
				if (copy == true) {
					if (xrp.getName().equals("item")) {
						if (xrp.getAttributeValue(null, "text") != null) {
							returnAL.add(xrp.getAttributeValue(null, "text"));
						}
					}
				}
			}

			eventType = xrp.next();
		}
		return returnAL;
	}

	public Drawable getPicture(String s, Context context){
	    String uri = "drawable/" + s;

	    int imageResource = context.getResources().getIdentifier(uri, null, context.getPackageName());

	    Drawable image;
	    if(imageResource!=0){
	    image = context.getResources().getDrawable(imageResource);
	    }else{
	    	image = context.getResources().getDrawable(R.drawable.devilsquirrel);
	    }
		return image;
	}
}
