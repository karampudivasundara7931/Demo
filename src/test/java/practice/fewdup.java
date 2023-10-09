package practice;

import java.util.HashMap;
import java.util.Map;

public class fewdup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Manjunath";
        int mtemp=0,atemp=0,jtemp=0;
        HashMap<String,Integer> akey = new HashMap<>();
        char[] cstr = str.toCharArray();
        for (int i=0 ; i< cstr.length ; i++){
            if (cstr[i]=='m' || cstr[i]=='M'){
                mtemp = mtemp + 1;
                akey.put("m",mtemp);
            }
            else if (cstr[i]=='a' || cstr[i]=='A'){
                atemp = atemp + 1;
                akey.put("a",atemp);
            }
            else if (cstr[i]=='j' || cstr[i]=='J'){
                jtemp = jtemp + 1;
                akey.put("j",jtemp);
            }
        }
        System.out.println(akey);
    }

	}


