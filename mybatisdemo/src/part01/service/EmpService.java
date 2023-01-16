package part01.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import common.SqlSessionTemplate;
import part01.dao.EmployeesDAO;
import part01.dto.EmpDTO;

public class EmpService {
	
	private EmployeesDAO dao;
//	private SqlSession sqlSession;
	private SqlSessionFactory factory;
	
public EmpService() {
	dao = new EmployeesDAO();
	factory = SqlSessionTemplate.setSqlSessionFactory();
}

public int countProcess() {
	int chk = 0;
	SqlSession sqlSession = null;
	try {
		
//	sqlSession = SqlSessionTemplate.getSqlSession();
	sqlSession = factory.openSession(false); //true일때 쿼리문이 실행되면서 알아서 커밋됨
	chk = dao.countMethod(sqlSession);
	sqlSession.commit();
    }catch (Exception e) {
	e.printStackTrace();
	sqlSession.rollback();
    }finally {
    	sqlSession.close();
    }
	return chk;
}

public List<EmpDTO> getAllListProcess(){
	List<EmpDTO> aList = null;
	SqlSession sqlSession = null;
	try {
		sqlSession = factory.openSession(false); //오토커밋 해제
		aList = dao.getAllListMethod(sqlSession);
	}catch(Exception ex) {
		sqlSession.rollback();
	}finally {
		sqlSession.close();
	}
	return aList;
}

	public List<EmpDTO> getSearchListProcess(String data){
	List<EmpDTO> aList = null;
	SqlSession sqlSession = null;
	try {
		sqlSession = factory.openSession(false);
		aList = dao.getSearchListMethod(sqlSession,data);
		sqlSession.commit();
	}catch(Exception e) {
		e.printStackTrace();
		sqlSession.rollback();
	}finally {
		sqlSession.close();
	}
	return aList;
	}

}
