package nosi.webapps.igrp.dao;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-09-18T11:51:13.855-0100")
@StaticMetamodel(CLob.class)
public class CLob_ {
	public static volatile SingularAttribute<CLob, Integer> id;
	public static volatile SingularAttribute<CLob, String> name;
	public static volatile SingularAttribute<CLob, String> mime_type;
	public static volatile SingularAttribute<CLob, String> c_lob_content;
	public static volatile SingularAttribute<CLob, Date> dt_created;
}
