package org.login;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Utilization extends Baseclass {

	
	@Parameters({"url","username","password"})
	@Test
	public void loginPage(String url, String username, String password) {
		
		launchDriver();
		launchUrl(url);
		LoginPage a = new LoginPage();
		enterText(a.getTxtUserName(), username);
		enterText(a.getTxtPassword(),password);
		btnclick(a.getBtnLogin());
	}
	
	@Parameters({"location","hotel","roomtype","roomno","datein","dateout","adult","cild"})
	@Test
	public void homepage(int location, int hotel, int roomtype, int roomno, String datein, String dateout, int adult, int cild) {
		launchDriver();
		HomePage b = new HomePage();
		selectByIndex(b.getLocation(), location);
		selectByIndex(b.getHotels(), hotel);
		selectByIndex(b.getRoom_type(), roomtype);
		selectByIndex(b.getRoom_nos(), roomno);
		enterText(b.getDatepick_in(), datein);
		enterText(b.getDatepick_out(), dateout);
		selectByIndex(b.getAdult_room(), adult);
		selectByIndex(b.getChild_room(), cild);
		btnclick(b.getSubmit());
		
		
	}
	
	@Test
	public void confirmation() {
		DetailsCheck c = new DetailsCheck();
		btnclick(c.getRadio());
		btnclick(c.getContinubtn());
	}
	@Parameters({"firstname","lastname","address","ccno","cctype","ccmon","ccyear","cvv"})
	@Test
	public void detailsPage(String firstname, String lastname, String address, String ccno, int cctype, int ccmon, int ccyear, String cvv) {
		DetailPage d = new DetailPage();
		enterText(d.getFirstName(), firstname);
		enterText(d.getLastName(), lastname);
		enterText(d.getAddress(), address);
		enterText(d.getCc_num(), ccno);
		selectByIndex(d.getCc_type(), cctype);
		selectByIndex(d.getCc_exp_month(), ccmon);
		selectByIndex(d.getCc_exp_year(), ccyear);
		enterText(d.getCc_cvv(), cvv);
	}
	
	@Test
	public void getConfirmationOrder() {
		OrderConfirmation d = new OrderConfirmation();
		String gettingText = gettingText(d.getOrderno());
		System.out.println(gettingText);
	}
	
	
}
