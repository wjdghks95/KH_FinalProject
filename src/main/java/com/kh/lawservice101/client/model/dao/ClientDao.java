package com.kh.lawservice101.client.model.dao;

import com.kh.lawservice101.client.model.vo.ClientVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface ClientDao {

    ClientVo selectClient(Long clientNum);

    ArrayList<ClientVo> selectAllClients();


    ClientVo selectClientByEmail(String email);

    ClientVo selectClientByIdAndEmail(String id, String email);

    void updatePassword(String tempPwd, Long clientNum);
}
