package nosi.webapps.igrp.dao;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-09-18T11:51:13.849-0100")
@StaticMetamodel(Application.class)
public class Application_ {
	public static volatile SingularAttribute<Application, Integer> id;
	public static volatile SingularAttribute<Application, String> dad;
	public static volatile SingularAttribute<Application, String> name;
	public static volatile SingularAttribute<Application, String> img_src;
	public static volatile SingularAttribute<Application, String> description;
	public static volatile SingularAttribute<Application, Integer> status;
	public static volatile SingularAttribute<Application, Action> action;
	public static volatile ListAttribute<Application, Action> actions;
	public static volatile ListAttribute<Application, Config_env> configs;
	public static volatile ListAttribute<Application, Menu> menus;
	public static volatile ListAttribute<Application, ProfileType> profilesType;
	public static volatile ListAttribute<Application, Organization> organizations;
	public static volatile ListAttribute<Application, RepSource> repsources;
	public static volatile ListAttribute<Application, RepTemplate> repTemplates;
	public static volatile ListAttribute<Application, Transaction> transactions;
	public static volatile ListAttribute<Application, RepInstance> repinstances;
}
