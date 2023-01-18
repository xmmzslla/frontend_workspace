package part03.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import part01.dto.EmpDTO;
import part03.dto.DeptDTO;

public class JoinDAO {

	public List<EmpDTO> emp_deptMethod(SqlSession sqlSession){
		return sqlSession.selectList("join.emp_dept");
	}
	
	public List<DeptDTO>dept_empMethod(SqlSession sqlSession){
		return sqlSession.selectList("join.dept_emp_list");
	}
}//c
