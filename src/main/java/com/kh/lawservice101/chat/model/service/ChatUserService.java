package com.kh.lawservice101.chat.model.service;

import com.kh.lawservice101.chat.model.vo.ChatVo;
import com.kh.lawservice101.client.model.vo.ClientVo;
import com.kh.lawservice101.lawyer.model.vo.LawyerVo;

public interface ChatUserService {
    void saveChatUser(Long chatRoomNum);
    void addLawyer(Long chatRoomNum, LawyerVo lawyerVo);
    void addClient(Long chatRoomNum, ClientVo clientVo);

    void removeChatUser(ChatVo chatVo);

    void addChatUser(ChatVo chatVo);

}
