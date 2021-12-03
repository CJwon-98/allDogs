package com.bon.allDogs.member.dao;
 
import java.util.List;
 
import com.bon.allDogs.member.dto.MemberVO;
 
public interface MemberDAO {
    
    public List<MemberVO> selectMember() throws Exception;
}