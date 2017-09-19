package nosi.webapps.igrp.dao;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-09-18T11:51:13.888-0100")
@StaticMetamodel(RepInstance.class)
public class RepInstance_ {
	public static volatile SingularAttribute<RepInstance, Integer> id;
	public static volatile SingularAttribute<RepInstance, RepTemplate> template;
	public static volatile SingularAttribute<RepInstance, String> contra_prova;
	public static volatile SingularAttribute<RepInstance, Date> dt_created;
	public static volatile SingularAttribute<RepInstance, String> reference;
	public static volatile SingularAttribute<RepInstance, Integer> ref_fk;
	public static volatile SingularAttribute<RepInstance, Application> application;
	public static volatile SingularAttribute<RepInstance, CLob> xml_content;
	public static volatile SingularAttribute<RepInstance, CLob> xsl_content;
	public static volatile SingularAttribute<RepInstance, User> user;
}
