package nosi.webapps.igrp.dao;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-09-18T11:51:13.686-0100")
@StaticMetamodel(Action.class)
public class Action_ {
	public static volatile SingularAttribute<Action, Integer> id;
	public static volatile SingularAttribute<Action, String> page;
	public static volatile SingularAttribute<Action, String> action;
	public static volatile SingularAttribute<Action, String> package_name;
	public static volatile SingularAttribute<Action, String> xsl_src;
	public static volatile SingularAttribute<Action, String> page_descr;
	public static volatile SingularAttribute<Action, String> action_descr;
	public static volatile SingularAttribute<Action, String> version;
	public static volatile SingularAttribute<Action, Integer> status;
	public static volatile SingularAttribute<Action, Application> application;
}
