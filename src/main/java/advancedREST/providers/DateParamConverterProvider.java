package advancedREST.providers;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

import advancedREST.model.Date;

@Provider
public class DateParamConverterProvider implements ParamConverterProvider{

	public <T> ParamConverter<T> getConverter(final Class<T> rawType, Type genericType, Annotation[] annotations) {
		return new ParamConverter<T>() {

			public T fromString(String value) {
				if (rawType == Date.class) {
					Date myDate = new Date();
					if("tomorrow".equals(value)) {
						myDate.setDate(21);
						myDate.setMonth(5);
						myDate.setYear(2018);
						
						return rawType.cast(myDate);
					}
				}
				
				return null;
			}

			public String toString(T value) {
				return value.toString();
			}
			
		};
	}
}