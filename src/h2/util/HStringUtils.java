package h2.util;

import java.io.File;
import java.util.ArrayList;

public class HStringUtils {
	   public static String chageInitialChar(String s){
			String retStr="";
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if(i==0){
					if(c>='a' && c<='z') c = (char)(c+'A'-'a');
					else if(c>='A' && c<='Z') c = (char)(c+'a'-'A');
				}
				retStr = retStr + c;
			}
			return retStr;
		 }
			public static String getFileExtension(String fileFullName) {
				if (fileFullName != null && fileFullName.length() > 1) {
					int dotIndex = fileFullName.lastIndexOf('.');
					if ((dotIndex != -1) && (dotIndex != fileFullName.length() - 1)) {
						return fileFullName.substring(dotIndex + 1);
					}
				}
				return null;
			}

			public static String getFileName(String fileFullName) {
				if (fileFullName != null && fileFullName.length() > 1) {
					int dotIndex = fileFullName.lastIndexOf('.');
					if (dotIndex !=-1) {
						return fileFullName.substring(0,dotIndex);
					}
				}
				return fileFullName;
			}

			public static String getFileShortName(String fileFullName) {
				if (fileFullName != null && fileFullName.length() > 1) {

					int pathIndex = fileFullName.lastIndexOf(File.separatorChar);
					if (pathIndex !=-1) {
						return fileFullName.substring(pathIndex+1);
					}
					pathIndex = fileFullName.lastIndexOf('/');
					if (pathIndex !=-1) {
						return fileFullName.substring(pathIndex+1);
					}
				}
				return fileFullName;
			}

			public static String getNextString(String str) {
					if (str != null) {
						char[] souStr = str.trim().toCharArray();
						int length = str.length();
						char[] retStr = new char[length];
						boolean flag = false;
						String returnStr = "";
						for (int i = length - 1; i >= 0; i--) {
							if (i == length - 1)flag = true;
							if (flag) {
								if(souStr[i]=='Z'){
									retStr[i] =  'A';
									flag = true;
									if(i==0) returnStr="A";
								}
								else if(souStr[i]=='z') {
									retStr[i] =  'a';
									flag = true;
									if(i==0) returnStr="a";
								}
								else if(souStr[i]=='9'){
									retStr[i] =  '0';
									flag = true;
									if(i==0) returnStr="1";
								}
								else {
									retStr[i] = (char)(souStr[i]+1);
									flag = false;
								}
							} else {
								retStr[i] = souStr[i];
							}
						}

						for (int i = 0; i < length; i++) returnStr += retStr[i];
						return returnStr;
					} else return null;
				}

			   public static int getIndex(String[] strArray,String str){
				   if(strArray!=null && strArray.length>0){
					   for(int i=0;i<strArray.length;i++){
						   if(strArray[i].equalsIgnoreCase(str)) return i;
					   }
				   }
				   return -1;
			   }

			    public static String replaceFirst(String text, String repl, String with) {
			        return replace(text, repl, with, 1);
			    }
			    public static String replace(String text, String repl, String with) {
			        return replace(text, repl, with, -1);
			    }

			   public static String replace(String text, String repl, String with, int max) {
			        if (text == null || repl==null || repl.length()==0 || with == null || max == 0) {
			            return text;
			        }

			        StringBuffer buf = new StringBuffer(text.length());
			        int start = 0, end = 0;
			        while ((end = text.indexOf(repl, start)) != -1) {
			            buf.append(text.substring(start, end)).append(with);
			            start = end + repl.length();

			            if (--max == 0) {
			                break;
			            }
			        }
			        buf.append(text.substring(start));
			        return buf.toString();
			    }

			   public static String[] readWords(String str) {
					if (str != null) {
						return readWords(str,str.length());
					}
					return null;

			   }

			   public static String[] readWords(String str, int number) {
				if (str != null && number > 0) {
					str = str.trim();
					ArrayList al = new ArrayList();
					StringBuffer sb = new StringBuffer();
					int length = str.length();
					char c = 0;

					int i = 0, index = 0;
					while (index < length && i < number) {
						c = str.charAt(index);
						index++;
						if (c != '\n' && c != ' ' && c != '\t') {
							sb.append(c);
						} else {
							while (index < length) {
								c = str.charAt(index);
								if (c == '\n' || c == ' ' || c == '\t') {
									index++;
								} else {
									break;
								}
							}
							al.add(sb.toString());
							sb = new StringBuffer();
							i++;
						}
					}
					if(sb.length()>0) al.add(sb.toString());
					if(al.size()>0){
						String[] ret=new String[al.size()];
						for(int j=0;j<al.size();j++) ret[j]= (String)al.get(j);
						return ret;
					}
				}
				return null;
			}

			public static String getFirstLineString(String str){
				  if(str != null){
				  int index=str.indexOf('\n');
				  if(index>0) return str.substring(0,index-1);
				  else return str;
				  }
				  return "";
			  }
		 
}
