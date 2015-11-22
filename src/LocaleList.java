import java.util.*;
public class LocaleList
{
	public static void main(String[] args)
	{
		Locale[] LocaleList=Locale.getAvailableLocales();
		for(int i=0;i<LocaleList.length;i++)
		{
			System.out.println(LocaleList[i].getDisplayCountry()+"="+LocaleList[i].getCountry()+" "+LocaleList[i].getDisplayLanguage()+"="+LocaleList[i].getLanguage());
		}
	}
}
