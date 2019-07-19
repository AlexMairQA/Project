package persistence.repository;



import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.qa.util.JSONUtil;

import persistence.domain.Members;
@Default
public class MemberRepositoryImpl implements MemberRepository{

	@Inject
	Members member;
	
	@PersistenceContext
	EntityManager em;
	
	@Transactional(value=TxType.REQUIRED)
	public String getAllMembers() {
		// TODO Auto-generated method stub
		
		
		return "IT WORKED!";
	}

	@Transactional(value=TxType.REQUIRED)
	public String addMember(String member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(value=TxType.REQUIRED)
	public String deleteMember(Integer memId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Inject
private JSONUtil json;
	@Transactional(value=TxType.REQUIRED)
	public String updateMember(String member, Integer memId) {
		// TODO Auto-generated method stub
		Members updated=json.getObjectForJSON(member, Members.class);
		
		Members exists= em.find(Members.class, memId);
		
		exists.setFirstName(updated.getFirstName());
		exists.setLastName(updated.getLastName());
		exists.setEmail(updated.getEmail());
		exists.setMoniker(updated.getMoniker());
		exists.setShowRealName(updated.getShowRealName());
		exists.setPassword(updated.getPassword());
		
		return exists.toString();
		
	}

}
