package maper;

import java.sql.Date;

import org.joda.time.DateTime;

public interface IDataMapper {
	Date map(DateTime date);
	DateTime map(Date date);
}
