package com.hspedu.interface_;

public class Interface03 {
	public static void main(String[] args) {
		MysqlDB mysalDB = new MysqlDB();
		t(mysalDB);
		OracleDB oracleDB = new OracleDB();
		t(oracleDB);
	}
	
	public static void t(DBInterface db) {
		db.connect();
		db.close();
	}
}
