package com.bon.allDogs.member.service;
 
import java.util.List;
 
import com.bon.allDogs.member.dto.MemberVO;
 
public interface MemberService {
    
    public List<MemberVO> selectMember() throws Exception;
}