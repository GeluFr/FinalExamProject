package de.mobile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;
    public   static String ADVANCEDFORM_URL = "https://www.mobile.de/ro/c%C4%83utare-detaliat%C4%83/nou/vhc:car/pg:dspcar";
    public static String SAVESEARCH_URL = "https://www.mobile.de/ro";

    public static String CARVALUATION_URL = "https://www.mobile.de/verkaufen/a/fahrzeug/start?i=priceestimation&lang=en";
    public static String LANGUAGE_URL = "https://www.mobile.de/ro";
    public static String CURRENCY_URL = "https://www.mobile.de/ro/automobil/dacia-spring/vhc:car,cnt:de!ro,ms1:6600_25_,frn:2021,prx:15000,ful:electricity,mlx:150000";
    public static String LOGIN_URL = "https://id.mobile.de/login?service=https%3A%2F%2Fid.mobile.de%2Foauth2.0%2FcallbackAuthorize%3Fclient_id%3Dmobile_web_DL1WJUPw%26redirect_uri%3Dhttps%253A%252F%252Fwww.mobile.de%252Fapi%252Fauth%252FloginCallback%253F%26response_type%3Dcode%26response_mode%3Dquery%26client_name%3DCasOAuthClient&lang=en&state=eyJybmQiOiJVa2xuWTZ6ZDJ4ODRxNnZRdndObi13R1J5UVVCaDlhNnZDRlRTeW9pVDZrIiwic3JjIjoiaHR0cHM6Ly93d3cubW9iaWxlLmRlL3JvIn0%3D&nonce=ZsnFWKEeiiVQ9YcLjcvy9PsrrE_oj8avIH3sHyRLTMI&scope=openid";

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
