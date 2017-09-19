package nosi.webapps.igrp.dao;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-09-18T11:51:13.880-0100")
@StaticMetamodel(Organization.class)
public class Organization_ {
	public static volatile SingularAttribute<Organization, Integer> id;
	public static volatile SingularAttribute<Organization, String> code;
	public static volatile SingularAttribute<Organization, String> name;
	public static volatile SingularAttribute<Organization, Integer> status;
	public static volatile SingularAttribute<Organization, Application> application;
	public static volatile SingularAttribute<Organization, User> user;
	public static volatile SingularAttribute<Organization, Organization> organization;
	public static volatile ListAttribute<Organization, ProfileType> profilesType;
	public static volatile ListAttribute<Organization, Profile> profiles;
}
