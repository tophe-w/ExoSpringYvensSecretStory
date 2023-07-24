package com.wildCodeSchool.ExoYvens.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wildCodeSchool.ExoYvens.entity.Participant;
import com.wildCodeSchool.ExoYvens.repository.ParticipantRepository;

@Controller
public class ParticipantController {

    @Autowired
    private ParticipantRepository participantRepository;

   

    @PostMapping("/participants")
        @ResponseBody
        public Participant createParticipant(@RequestBody Participant participant){
            return participantRepository.save(participant);
    }


    @GetMapping("/participants")
    @ResponseBody
    public List<Participant> getParticipants(){
        return participantRepository.findAll();
    }
}