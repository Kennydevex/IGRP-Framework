package nosi.webapps.igrp.dao;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-09-18T11:51:13.909-0100")
@StaticMetamodel(Transaction.class)
public class Transaction_ {
	public static volatile SingularAttribute<Transaction, Integer> id;
	public static volatile SingularAttribute<Transaction, String> code;
	public static volatile SingularAttribute<Transaction, String> descr;
	public static volatile SingularAttribute<Transaction, Integer> status;
	public static volatile SingularAttribute<Transaction, Application> application;
}
