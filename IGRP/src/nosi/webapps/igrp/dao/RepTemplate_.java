package nosi.webapps.igrp.dao;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-09-18T11:51:13.892-0100")
@StaticMetamodel(RepTemplate.class)
public class RepTemplate_ {
	public static volatile SingularAttribute<RepTemplate, Integer> id;
	public static volatile SingularAttribute<RepTemplate, String> code;
	public static volatile SingularAttribute<RepTemplate, String> name;
	public static volatile SingularAttribute<RepTemplate, Date> dt_created;
	public static volatile SingularAttribute<RepTemplate, Date> dt_updated;
	public static volatile SingularAttribute<RepTemplate, Integer> status;
	public static volatile SingularAttribute<RepTemplate, User> user_created;
	public static volatile SingularAttribute<RepTemplate, User> user_updated;
	public static volatile SingularAttribute<RepTemplate, Application> application;
	public static volatile SingularAttribute<RepTemplate, CLob> xml_content;
	public static volatile SingularAttribute<RepTemplate, CLob> xsl_content;
	public static volatile ListAttribute<RepTemplate, RepTemplateParam> params;
	public static volatile ListAttribute<RepTemplate, RepTemplateSource> reptemplatesources;
}
