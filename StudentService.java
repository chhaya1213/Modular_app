package com.service;

import com.dao.StudentDao;

public class StudentService {
	public  void insertata() throws Exception {
		StudentDao sd=new StudentDao();
		sd.insertdata();
		}
	public void update()throws Exception {
		StudentDao sd=new StudentDao();
		sd.update();
		}
	
	public void fetchallRecord()throws Exception {
		StudentDao sd=new StudentDao();
		sd.fetchallRecord();
	}
	
	public void Delete()throws  Exception {
		StudentDao sd=new StudentDao();
		sd.Delete();
		
	}
    
}
