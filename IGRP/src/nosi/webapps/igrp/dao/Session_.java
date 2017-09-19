package nosi.webapps.igrp.dao;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-09-18T11:51:13.903-0100")
@StaticMetamodel(Session.class)
public class Session_ {
	public static volatile SingularAttribute<Session, Integer> id;
	public static volatile SingularAttribute<Session, String> sessionId;
	public static volatile SingularAttribute<Session, Long> startTime;
	public static volatile SingularAttribute<Session, Long> endTime;
	public static volatile SingularAttribute<Session, String> ipAddress;
	public static volatile SingularAttribute<Session, String> userName;
	public static volatile SingularAttribute<Session, String> target;
	public static volatile SingularAttribute<Session, Integer> https;
	public static volatile SingularAttribute<Session, String> sessionOldId;
	public static volatile SingularAttribute<Session, String> host;
	public static volatile SingularAttribute<Session, String> hostName;
	public static volatile SingularAttribute<Session, String> mediaType;
	public static volatile SingularAttribute<Session, User> user;
	public static volatile SingularAttribute<Session, Application> application;
	public static volatile SingularAttribute<Session, ProfileType> profileType;
	public static volatile SingularAttribute<Session, Organization> organization;
}
