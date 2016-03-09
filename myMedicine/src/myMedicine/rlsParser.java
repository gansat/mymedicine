package myMedicine;

import java.net.ConnectException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public interface rlsParser {
	
	public static void ArrayListLinkToPharmacyCompilate() {
		Document documentListOfPharmacy = connect("http://www.rlsnet.ru/tn_alf_letter_1.htm");
		Elements elementsContent = documentListOfPharmacy.getElementsByClass("new_sub_slices");
		
		System.out.println("contains "+elementsContent.size());
	}
	
	public static Document connect(String href){
        try {
           return Jsoup.connect(href).get();
        } catch (Exception e){
            System.out.println("FUCK "+e.getMessage());
            return null;
        }
    }
}
