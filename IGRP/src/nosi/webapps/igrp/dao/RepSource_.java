package nosi.webapps.igrp.dao;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-09-18T11:51:13.890-0100")
@StaticMetamodel(RepSource.class)
public class RepSource_ {
	public static volatile SingularAttribute<RepSource, Integer> id;
	public static volatile SingularAttribute<RepSource, String> name;
	public static volatile SingularAttribute<RepSource, String> type;
	public static volatile SingularAttribute<RepSource, Integer> type_fk;
	public static volatile SingularAttribute<RepSource, String> type_name;
	public static volatile SingularAttribute<RepSource, String> type_query;
	public static volatile SingularAttribute<RepSource, Integer> status;
	public static volatile SingularAttribute<RepSource, Date> dt_created;
	public static volatile SingularAttribute<RepSource, Date> dt_updated;
	public static volatile SingularAttribute<RepSource, Application> application;
	public static volatile SingularAttribute<RepSource, Application> application_source;
	public static volatile SingularAttribute<RepSource, User> user_created;
	public static volatile SingularAttribute<RepSource, User> user_updated;
}
