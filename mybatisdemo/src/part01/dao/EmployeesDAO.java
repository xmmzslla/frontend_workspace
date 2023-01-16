package part01.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

import part01.dto.EmpDTO;
public class EmployeesDAO {
	/*
	 * apache.org => iBatis => jdk1.4 이상
	 * google.com => myBatis => jdk1.5 이상 
	 */

	public int countMethod(SqlSession sqlsession) {
		                        //namespace.id
		return sqlsession.selectOne("emp.cnt");
		                                       //하나의 래코드면 selectOne, 여러개면 selectlist로
	}
	
	public List<EmpDTO> getAllListMethod(SqlSession sqlSession){
		return sqlSession.selectList("emp.list");
	}
	
	public List<EmpDTO>getSearchListMethod(SqlSession sqlSession, String data){
		return sqlSession.selectList("emp.searchList", data);
	}
}
