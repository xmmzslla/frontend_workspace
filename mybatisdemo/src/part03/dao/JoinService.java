package part03.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import common.SqlSessionTemplate;
import part01.dto.EmpDTO;

public class JoinService {

	private JoinDAO dao;
	private SqlSessionFactory factory;
	
	public JoinService() {
	  dao = new JoinDAO();
	  factory = SqlSessionTemplate.setSqlSessionFactory();
	  
	}
	
	public List<EmpDTO> emp_deptProcess(){
		SqlSession sqlSession = null;
		sqlSession = factory.openSession(true);
		return dao.emp_deptMethod(sqlSession);
	}
	
}//c
