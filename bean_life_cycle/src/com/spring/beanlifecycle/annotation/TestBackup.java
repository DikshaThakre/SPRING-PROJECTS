package com.spring.beanlifecycle.annotation;

import java.sql.SQLException;

public class TestBackup {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		StudentDAO dao = new StudentDAO();
		dao.selectAllRows();
		dao.deleteStudentRecord(4);
	}
}
