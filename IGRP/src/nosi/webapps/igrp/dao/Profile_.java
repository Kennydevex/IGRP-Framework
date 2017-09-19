package nosi.webapps.igrp.dao;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-09-18T11:51:13.885-0100")
@StaticMetamodel(Profile.class)
public class Profile_ {
	public static volatile SingularAttribute<Profile, Integer> id;
	public static volatile SingularAttribute<Profile, Integer> type_fk;
	public static volatile SingularAttribute<Profile, String> type;
	public static volatile SingularAttribute<Profile, ProfileType> profileType;
	public static volatile SingularAttribute<Profile, User> user;
	public static volatile SingularAttribute<Profile, Organization> organization;
}
