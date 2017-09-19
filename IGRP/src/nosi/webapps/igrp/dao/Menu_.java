package nosi.webapps.igrp.dao;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-09-18T11:51:13.876-0100")
@StaticMetamodel(Menu.class)
public class Menu_ {
	public static volatile SingularAttribute<Menu, Integer> id;
	public static volatile SingularAttribute<Menu, String> descr;
	public static volatile SingularAttribute<Menu, Integer> orderby;
	public static volatile SingularAttribute<Menu, Integer> status;
	public static volatile SingularAttribute<Menu, Integer> flg_base;
	public static volatile SingularAttribute<Menu, String> target;
	public static volatile SingularAttribute<Menu, Action> action;
	public static volatile SingularAttribute<Menu, Application> application;
	public static volatile SingularAttribute<Menu, Menu> menu;
}
