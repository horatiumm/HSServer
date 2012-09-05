package h2.util;

import java.lang.reflect.Method;

public class HObjectUtils {
	public static Object getPropertyValue(Object pbObject,String propertyName){
		try {
			String methodName="get"+HStringUtils.chageInitialChar(propertyName);
			Method method = pbObject.getClass().getMethod(methodName,(Class[])null);
			if(method!=null) return method.invoke(pbObject,(Object[])null);
		} catch (NoSuchMethodException e) {
			try{
				String methodName="is"+HStringUtils.chageInitialChar(propertyName);
				Method method = pbObject.getClass().getMethod(methodName,(Class[])null);
				if(method!=null) return method.invoke(pbObject,(Object[])null);
			}
			catch (Exception e1){
			}
		} catch (Exception e) {
			
		} 
		return null;
   }

   public static void setPropertyValue(Object pbObject, String propertyName, Object value) {
		try {
			String methodName = "set" + HStringUtils.chageInitialChar(propertyName);
			Class[] paraTypes = {value==null ? null: value.getClass() };
			Object[] parameters = { value };
			Method method = pbObject.getClass()
					.getMethod(methodName, paraTypes);
			if(method!=null) method.invoke(pbObject, parameters);
		} catch (Exception e) {
			
		} 

	}

}
