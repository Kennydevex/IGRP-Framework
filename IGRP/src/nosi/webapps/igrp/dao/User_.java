package nosi.webapps.igrp.dao;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-09-18T11:51:13.911-0100")
@StaticMetamodel(User.class)
public class User_ {
	public static volatile SingularAttribute<User, Integer> id;
	public static volatile SingularAttribute<User, String> name;
	public static volatile SingularAttribute<User, String> email;
	public static volatile SingularAttribute<User, String> pass_hash;
	public static volatile SingularAttribute<User, String> userProfile;
	public static volatile SingularAttribute<User, String> valid_until;
	public static volatile SingularAttribute<User, Integer> status;
	public static volatile SingularAttribute<User, String> remarks;
	public static volatile SingularAttribute<User, Integer> activation_key;
	public static volatile SingularAttribute<User, String> user_name;
	public static volatile SingularAttribute<User, String> photo_id;
	public static volatile SingularAttribute<User, String> signature_id;
	public static volatile SingularAttribute<User, String> mobile;
	public static volatile SingularAttribute<User, String> phone;
	public static volatile SingularAttribute<User, String> password_reset_token;
	public static volatile SingularAttribute<User, String> auth_key;
	public static volatile SingularAttribute<User, Long> created_at;
	public static volatile SingularAttribute<User, Long> updated_at;
}
