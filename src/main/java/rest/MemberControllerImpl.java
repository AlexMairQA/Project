package rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

import service.MemberService;

@Path("/member")
public class MemberControllerImpl implements MemberController {

	@Inject
	MemberService memServ;

	@GET
	@Path("/getAll")
	public String getAllMembers() {
		// TODO Auto-generated method stub
		return this.memServ.getAllMembers();
	}

	@PUT
	@Path("/addMember")
	public String addMember(String member) {
		// TODO Auto-generated method stub
		return this.memServ.addMember(member);
	}

	@DELETE
	@Path("/deleteMember")
	public String deleteMember(Integer memId) {
		// TODO Auto-generated method stub
		return this.memServ.deleteMember(memId);
	}

	@POST
	@Path("/updateMember")
	public String updateMember(String member, Integer memId) {
		// TODO Auto-generated method stub
		return this.memServ.updateMember(member, memId);
	}

}
