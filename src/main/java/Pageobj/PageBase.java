package Pageobj;

public class PageBase {
	public String getElement(String originalStr,String newValue){
		return String.format(originalStr, newValue);
	}

}
