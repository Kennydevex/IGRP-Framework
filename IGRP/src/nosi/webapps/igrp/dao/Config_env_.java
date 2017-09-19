package nosi.webapps.igrp.dao;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-09-18T11:51:13.874-0100")
@StaticMetamodel(Config_env.class)
public class Config_env_ {
	public static volatile SingularAttribute<Config_env, Integer> id;
	public static volatile SingularAttribute<Config_env, Integer> port;
	public static volatile SingularAttribute<Config_env, String> type_db;
	public static volatile SingularAttribute<Config_env, String> host;
	public static volatile SingularAttribute<Config_env, String> name_db;
	public static volatile SingularAttribute<Config_env, String> username;
	public static volatile SingularAttribute<Config_env, String> password;
	public static volatile SingularAttribute<Config_env, String> charset;
	public static volatile SingularAttribute<Config_env, String> name;
	public static volatile SingularAttribute<Config_env, Application> application;
}
