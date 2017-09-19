package nosi.webapps.igrp.dao;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-09-18T11:51:13.886-0100")
@StaticMetamodel(ProfileType.class)
public class ProfileType_ {
	public static volatile SingularAttribute<ProfileType, Integer> id;
	public static volatile SingularAttribute<ProfileType, String> descr;
	public static volatile SingularAttribute<ProfileType, String> code;
	public static volatile SingularAttribute<ProfileType, Integer> status;
	public static volatile SingularAttribute<ProfileType, Organization> organization;
	public static volatile SingularAttribute<ProfileType, Application> application;
	public static volatile SingularAttribute<ProfileType, ProfileType> profiletype;
	public static volatile ListAttribute<ProfileType, Profile> profiles;
}
