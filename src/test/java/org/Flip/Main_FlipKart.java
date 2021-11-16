package org.Flip;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.base.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Main_FlipKart extends BaseClass{


	@BeforeClass
	private void before() {
		browserLaunch("chrome");
		driver.manage().window().maximize();
		get("https://www.flipkart.com/");
		timeWait(5);
	}



	@Test
	private void test() {


		FlipKart_Search sh=new FlipKart_Search();
		clickBtn(sh.getPopUp());
		sendValues(sh.getSearchBox(), "mobiles");
		clickBtn(sh.getSearch());
		timeWait(5);

		FlipKart_Mobiles mb=new FlipKart_Mobiles();

		for (int i = 0; i < mb.getAllMobilesText().size(); i++) {
			String mobilesText = getTheText(mb.getAllMobilesText().get(i));
			System.out.println(mobilesText);

			String mobilesPrice = getTheText(mb.getAllMobilesPrice().get(i));
			System.out.println(mobilesPrice);

		}	

		List<Integer> l1= new ArrayList<Integer>();

		for (int j = 0; j < mb.getAllMobilesPrice().size(); j++) {

			String text = getTheText(mb.getAllMobilesPrice().get(j));


			String rupeeChange = text.replace("\u20B9", "");
			String fin = rupeeChange.replace(",", "");

			int parseInt = Integer.parseInt(fin);
			l1.add(parseInt);
		}
		
		Collections.sort(l1);

		for (int l = 0; l < l1.size(); l++) {
			System.out.println(l1.get(l));

		}

		
		
		
		
		System.out.println("-------------Page 2-----------------");
		clickBtn(mb.getNextPage());
		timeWait(5);

		for (int i = 0; i < mb.getAllMobilesText().size(); i++) {

			String mobileName = getTheText(mb.getAllMobilesText().get(i));
			System.out.println(mobileName);

			String mobilePrice = getTheText(mb.getAllMobilesPrice().get(i));
			System.out.println(mobilePrice);
		}
		List<Integer> l2= new ArrayList<Integer>();

		for (int j = 0; j < mb.getAllMobilesPrice().size(); j++) {

			String text = getTheText(mb.getAllMobilesPrice().get(j));


			String rupeeChange = text.replace("\u20B9", "");
			String fin = rupeeChange.replace(",", "");

			int parseInt = Integer.parseInt(fin);
			l2.add(parseInt);
		}

		Collections.sort(l2);

		for (int l = 0; l < l2.size(); l++) {
			System.out.println(l2.get(l));

		}





		System.out.println("--------------Page 3----------------");
		clickBtn(mb.getNextPage());
		timeWait(5);

		for (int i = 0; i < mb.getAllMobilesText().size(); i++) {

			String mobileName = getTheText(mb.getAllMobilesText().get(i));
			System.out.println(mobileName);

			String mobilePrice = getTheText(mb.getAllMobilesPrice().get(i));
			System.out.println(mobilePrice);
		}

		List<Integer> l3= new ArrayList<Integer>();

		for (int j = 0; j < mb.getAllMobilesPrice().size(); j++) {

			String text = getTheText(mb.getAllMobilesPrice().get(j));


			String rupeeChange = text.replace("\u20B9", "");
			String fin = rupeeChange.replace(",", "");

			int parseInt = Integer.parseInt(fin);
			l3.add(parseInt);
		}

		Collections.sort(l3);

		for (int l = 0; l < l3.size(); l++) {
			System.out.println(l3.get(l));

		}



		//		Asscending the price using swap
		//		
		//		int obj[]=new int[li.size()];
		//		for (int i = 0; i < li.size(); i++) {
		//			obj[i]=li.get(i);	
		//		}
		//		for (int i = 0; i < obj.length; i++) {
		//
		//			for (int k = i+1; k < obj.length; k++) {
		//
		//				int temp=0;
		//
		//				if (obj[i]>obj[k]) {
		//
		//					temp=obj[i];
		//					obj[i]=obj[k];
		//					obj[k]=temp;
		//
		//				}
		//
		//
		//			}
		//		}
		//		
		//		System.out.println("After----------------");
		//		for (int f = 0; f < obj.length; f++) {
		//			System.out.println(obj[f]);
		//		}









	}

}


























