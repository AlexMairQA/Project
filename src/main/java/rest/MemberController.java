package rest;

public interface MemberController {
	public String getAllMembers();
	public String addMember(String member);
	public String deleteMember(Integer memId);
	public String updateMember(String member, Integer memId);

}
